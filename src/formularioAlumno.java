
import javax.swing.JOptionPane;

public class formularioAlumno extends javax.swing.JDialog {

    public boolean banderaModificacion=false;
    public long DNI=0;
    
    public formularioAlumno(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    formularioAlumno() 
    {
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtMail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jbtnGuardar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jbtnCancelar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        lblnuevoAlumno = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        cmbNivel = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nuevo Alumno");
        setResizable(false);

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("DNI");

        txtDireccion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txtTelefono.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Dirección");

        txtCelular.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("Nivel Educativo");

        txtMail.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("Teléfono");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/if_user-group-new_23632.png"))); // NOI18N
        jLabel10.setText("jLabel10");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setText("Celular");

        jbtnGuardar.setText("Guardar");
        jbtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardarActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setText("Email");

        jbtnCancelar.setText("Cancelar");
        jbtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCancelarActionPerformed(evt);
            }
        });

        txtNombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        lblnuevoAlumno.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        lblnuevoAlumno.setText("Nuevo Alumno");

        txtApellido.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("Nombre");

        txtDni.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        cmbNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Secundario", "Terciario", "Universitario" }));
        cmbNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNivelActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Apellido");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblnuevoAlumno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jbtnGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtCelular)
                                    .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cmbNivel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(9, 9, 9)
                                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtNombre))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtApellido)
                                        .addComponent(txtDni)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblnuevoAlumno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnGuardar)
                    .addComponent(jbtnCancelar))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarActionPerformed

        //Debo validar que los campos de texto no esten vacios
        if(txtNombre.getText().isEmpty() || txtApellido.getText().isEmpty() || txtDni.getText().isEmpty() || txtDireccion.getText().isEmpty() || txtTelefono.getText().isEmpty() || txtCelular.getText().isEmpty() || txtMail.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos, no deben ir vacíos.", "Faltan completar", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        //Debo preguntar si es modificacion o un alumno nuevo
        if(banderaModificacion)
        {
            //Creo objeto alumno para guardar datos
            Alumno a = new Alumno();
            //Creo onjeto para interactura con la base de datos
            Database db = new Database();
            a.setNombre(txtNombre.getText());
            a.setApellido(txtApellido.getText());
            if(esNumero(txtDni.getText()))
            {
                a.setDni(Long.parseLong(txtDni.getText()));
            }
            else
            {
                JOptionPane.showMessageDialog(null, "El campo DNI debe ser solo números.", "Fallido", JOptionPane.WARNING_MESSAGE);
                return;
            }
            a.setNivelEducacion(cmbNivel.getSelectedItem().toString());
            a.setDireccion(txtDireccion.getText());
            if(esNumero(txtTelefono.getText()))
            {
               a.setTelefono(Long.parseLong(txtTelefono.getText()));
            }
            else
            {
                JOptionPane.showMessageDialog(null, "El campo Teléfono debe ser solo números.", "Fallido", JOptionPane.WARNING_MESSAGE);
                return;
            }

            if(esNumero(txtCelular.getText()))
            {
               a.setCelular(Long.parseLong(txtCelular.getText()));
            }
            else
            {
                JOptionPane.showMessageDialog(null, "El campo Celular debe ser solo números.", "Fallido", JOptionPane.WARNING_MESSAGE);
                return;
            }  
            a.setMail(txtMail.getText());
            
            if(db.modificarAlumno(a))
            {
                JOptionPane.showMessageDialog(null, "Los cambios se han guardado correctamente.", "Exitoso", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                return;
            }
            else
            {
                JOptionPane.showMessageDialog(null, "No se pudo guardar los datos.", "Fallido", JOptionPane.WARNING_MESSAGE);
                return;
            }
        }        
        
        //Creo objeto alumno para guardar datos
        Alumno a = new Alumno();
        //Creo onjeto para interactura con la base de datos
        Database db = new Database();
        a.setNombre(txtNombre.getText());
        a.setApellido(txtApellido.getText());
        
        if(esNumero(txtDni.getText()))
        {
            a.setDni(Long.parseLong(txtDni.getText()));
        }
        else
        {
            JOptionPane.showMessageDialog(null, "El campo DNI debe ser solo números.", "Fallido", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        a.setNivelEducacion(cmbNivel.getSelectedItem().toString());
        a.setDireccion(txtDireccion.getText());
        
        if(esNumero(txtTelefono.getText()))
        {
           a.setTelefono(Long.parseLong(txtTelefono.getText()));
        }
        else
        {
            JOptionPane.showMessageDialog(null, "El campo Teléfono debe ser solo números.", "Fallido", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if(esNumero(txtCelular.getText()))
        {
           a.setCelular(Long.parseLong(txtCelular.getText()));
        }
        else
        {
            JOptionPane.showMessageDialog(null, "El campo Celular debe ser solo números.", "Fallido", JOptionPane.WARNING_MESSAGE);
            return;
        }       
        
        a.setMail(txtMail.getText());

        
        //Verifico si existe ese DNI en la base de datos ya que no debe estar duplicado.
        if(db.existeDNI(a.getDni())>=1)
        {
            JOptionPane.showMessageDialog(null, "Ya existe ese DNI en el sistema. \nPor favor reintente nuevamente..", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        //Verifica si la condicion se cumple o no segun el resultado que haya devuelto.
        if(db.guardarAlumno(a))
        {
            JOptionPane.showMessageDialog(null, "Los datos se han guardado correctamente.", "Exitoso", JOptionPane.INFORMATION_MESSAGE);
            resetearValores();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "No se pudo guardar los datos.", "Fallido", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_jbtnGuardarActionPerformed

    private void jbtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbtnCancelarActionPerformed

    private void cmbNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbNivelActionPerformed

    public void consultarModificacionAlumno()
    {
            //Llamo a la base de datos para obtener datos de ese alumno a partir de su DNI
            Database db = new Database();
            //Creo Objeto Alumno para guardar datos.
            Alumno a = new Alumno();
            a= db.obtenerDatosAlumno(DNI);
            //Asigno los datos obtenidos a los textbox del formulario
            txtNombre.setText(a.getNombre());
            txtApellido.setText(a.getApellido());
            txtDni.setText(String.valueOf(a.getDni()));
            txtDireccion.setText(a.getDireccion());
            txtTelefono.setText(String.valueOf(a.getTelefono()));
            txtCelular.setText(String.valueOf(a.getCelular()));
            txtMail.setText(a.getMail());
            cmbNivel.setSelectedItem(a.getNivelEducacion());           
        
    }
    
    private void resetearValores()
    {
        txtNombre.setText("");
        txtApellido.setText("");
        txtDni.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        txtCelular.setText("");
        txtMail.setText("");
    }
    
    private boolean esNumero(String texto)
    {
        long num;
        try
        {
            num = Long.parseLong(texto);
            return true;
        }         
        catch (Exception e)
        {
            //Dará error porque contiene caracteres.
            return false;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbNivel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jbtnCancelar;
    private javax.swing.JButton jbtnGuardar;
    public static javax.swing.JLabel lblnuevoAlumno;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtDireccion;
    public static javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
