
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class formularioPrincipal extends javax.swing.JFrame {

    public formularioPrincipal() {
        initComponents();
        cargarAlumnos();
    }
    

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtnNuevo = new javax.swing.JButton();
        jbtnModificar = new javax.swing.JButton();
        jbtnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        gridviewAlumnos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Formulario Principal - Escuela Superior de Comercio Manuel Belgrano");

        jbtnNuevo.setText("Nuevo");
        jbtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNuevoActionPerformed(evt);
            }
        });

        jbtnModificar.setText("Modificar");
        jbtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnModificarActionPerformed(evt);
            }
        });

        jbtnEliminar.setText("Eliminar");
        jbtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarActionPerformed(evt);
            }
        });

        gridviewAlumnos = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex)
            {
                return false;
            }
        };
        gridviewAlumnos.getTableHeader().setReorderingAllowed(false);
        gridviewAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "DNI", "Nivel Educativo", "Direccion", "Telefono", "Celular", "Mail"
            }
        ));
        gridviewAlumnos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        gridviewAlumnos.setEditingRow(1);
        jScrollPane1.setViewportView(gridviewAlumnos);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoabmalumnos.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 904, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtnNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnEliminar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnNuevo)
                    .addComponent(jbtnModificar)
                    .addComponent(jbtnEliminar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Llamo al formulario nuevoAlumno tipo Jdialog para que cuando cierre el formulario se cargue el metodo cargarAlumnos y llene nuevamente la grilla.
    private void jbtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNuevoActionPerformed
       formularioAlumno na = new formularioAlumno(this,true);
       na.setVisible(true);       
       cargarAlumnos();
    }//GEN-LAST:event_jbtnNuevoActionPerformed

    private void jbtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModificarActionPerformed
        
        // Obtengo la fila seleccionada de la tabla
        int row = gridviewAlumnos.getSelectedRow();
        
        // Debo validar si selecciono o no en la tabla algun alumno a modificar.
        if(row<0)
        {
         JOptionPane.showMessageDialog(null, "Debe elegir un alumno de la tabla para modificar datos.", "Error", JOptionPane.WARNING_MESSAGE);
         return;
        }
        
        //Llamo al formulario formularioAlumno, le cambio el titulo de la ventana y al label para saber que será una modificacion de los datos y levanto bandera.
        // Obtengo el DNI del alumno de la tabla seleccionada.
        formularioAlumno ma = new formularioAlumno(this, true);
        ma.DNI = Long.parseLong(gridviewAlumnos.getModel().getValueAt(row, 2).toString());
        
        //Levanto una bandera indicando que es de modificacion.
        ma.banderaModificacion=true;
        ma.setTitle("Modificar Alumno");
        formularioAlumno.lblnuevoAlumno.setText("Modificación");  
        //El DNI es unico y le bloque para evitar la modificacion una vez que ya esta guardado en la bd.
        formularioAlumno.txtDni.setEditable(false);
        ma.consultarModificacionAlumno();
        ma.setVisible(true);
        cargarAlumnos();
        
    }//GEN-LAST:event_jbtnModificarActionPerformed

    private void jbtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarActionPerformed
        
        // Obtengo la fila seleccionada de la tabla
        int row = gridviewAlumnos.getSelectedRow();
        
        // Debo validar si selecciono o no en la tabla algún alumno a modificar.
        if(row<0)
        {
         JOptionPane.showMessageDialog(null, "Debe elegir un alumno de la tabla para eliminar datos.", "Error", JOptionPane.WARNING_MESSAGE);
         return;
        }
        
        //Creo y llamo al metodo para eliminar desde la base de datos
        Database db = new Database();
        if(db.eliminarAlumno(Long.parseLong(gridviewAlumnos.getModel().getValueAt(row, 2).toString())))
        {
            JOptionPane.showMessageDialog(null, "Alumno eliminado correctamente.", "Consulta ejecutada", JOptionPane.INFORMATION_MESSAGE );
            cargarAlumnos();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "No se ha podido eliminar el alumno o no existe en la bd.", "Error", JOptionPane.WARNING_MESSAGE);
            cargarAlumnos();
        }
    }//GEN-LAST:event_jbtnEliminarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(formularioPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formularioPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formularioPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formularioPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formularioPrincipal().setVisible(true);
            }
        });
    }

    private void cargarAlumnos()
    {
      //Creo objeto para poder leer contenido en la base de datos.
      Database db = new Database();
      //Se crea una tabla generica para añadir datos en la grilla
      DefaultTableModel tablaAlumnos = (DefaultTableModel) gridviewAlumnos.getModel();
      tablaAlumnos.setRowCount(0);
      //Recorro la lista de alumnos que estan guardados en la tabla.
      for(Alumno a: db.leerAlumnos())
      {
         //Creo un objeto row para poder agregar datos a la fila de la tabla o gridview.
         Object[] row = {a.getNombre(),a.getApellido(),a.getDni(),a.getNivelEducacion(),a.getDireccion(),a.getTelefono(), a.getCelular(),a.getMail()};
         tablaAlumnos.addRow(row);
      }
      
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable gridviewAlumnos;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnEliminar;
    private javax.swing.JButton jbtnModificar;
    private javax.swing.JButton jbtnNuevo;
    // End of variables declaration//GEN-END:variables
}
