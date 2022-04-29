
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Database {
    
    //Declaro el lugar donde esta el archivo de la base de datos con SQLite
    String ruta = "alumnosDB.db";
    
    //Declaro esta variable para poder hacer la conexion con la base de datos.
    Connection connect;
    
    
 //Declaro el metodo de conexion para abrir la base de datos
 // También utilizare los try y catch para capturar errores en este caso Excepciones.
 public void abrir()
 {
   
    try 
    {
        connect = DriverManager.getConnection("jdbc:sqlite:" + ruta);
        if (connect!=null) 
        {
            System.out.println("Conectado a la bd correctamente.");
        }
    }
    catch (SQLException ex) 
    {
        System.out.println("Se produjo un error al cerrar la base de datos. "+ ex.getMessage());
    }
}
 
 //Declaro el metodo para cerrar la conexión con la base de datos
 public void cerrar()
 {
        try 
        {
            connect.close();
            System.out.println("Se cerro la base de datos correctamente.");
        } 
        catch (SQLException ex) 
        {
            System.out.println("Se produjo un error al cerrar la base de datos." + ex.getMessage());
        }
 }
 
 public int existeDNI(long dnix )
 {
     ResultSet resultado;
     int valor=0;
     try 
     {
         //Abro la base de datos
            abrir();
            //Para ver en consola
            System.out.println("Leyendo alumnos de la tabla");
            PreparedStatement st = connect.prepareStatement("select count() from alumnos where dni=" + dnix);
            resultado = st.executeQuery();
            
            while (resultado.next()) 
            {                
                //Creo objeto para cada alumno ya que cada uno tiene sus datos particulares y luego lo agrego a la lista.
                valor=resultado.getInt(1);
            }
            
            return valor;
     } 
     catch (SQLException ex) 
     {
         System.out.println("Se produjo un error al leer el dni devuelto en la base de datos." + ex.getMessage());         
         return -1;
     }
     
     
 }
 
 public List<Alumno> leerAlumnos()
 {   
     //Crear una lista donde pueda guardar datos de los alumnos obtenidos
     List<Alumno> lista = new ArrayList<Alumno>();
     ResultSet resultado = null;
        try 
        {
            //Abro la base de datos
            abrir();
            //Para ver en consola
            System.out.println("Leyendo alumnos de la tabla");
            PreparedStatement st = connect.prepareStatement("select * from alumnos");
            resultado = st.executeQuery();
            while (resultado.next()) 
            {                
                //Creo objeto para cada alumno ya que cada uno tiene sus datos particulares y luego lo agrego a la lista.
                Alumno x = new Alumno();
                x.setNombre(resultado.getString("nombre"));
                x.setApellido(resultado.getString("apellido"));
                x.setDni(resultado.getLong("dni"));
                x.setNivelEducacion(resultado.getString("nivel"));
                x.setDireccion(resultado.getString("direccion"));
                x.setTelefono(resultado.getLong("telefono"));
                x.setCelular(resultado.getLong("celular"));
                x.setMail(resultado.getString("mail"));
                lista.add(x);
            }
            //Cierro la bd
            cerrar();
            
            //Retorno los resultados obtenidos de esa lista.
            return lista;
        } 
        catch (SQLException ex) 
        {
            System.out.println("Se produjo un error al leer alumnos en la base de datos." + ex.getMessage());
            return null;
        }
 }
 
 public Alumno obtenerDatosAlumno(long dni)
 {
     Alumno x = new Alumno();
     ResultSet resultado;
        try 
        {
            //Abro la base de datos
            abrir();
            //Para ver en consola
            System.out.println("Obteniendo datos del Alumno.");
            PreparedStatement st = connect.prepareStatement("select nombre,apellido,dni,direccion,nivel,telefono,celular,mail from alumnos where dni= " + dni);
            resultado = st.executeQuery();
                //Creo objeto para cada alumno ya que cada uno tiene sus datos particulares y luego lo agrego a la lista.
                x.setNombre(resultado.getString("nombre"));
                x.setApellido(resultado.getString("apellido"));
                x.setDni(resultado.getLong("dni"));
                x.setNivelEducacion(resultado.getString("nivel"));
                x.setDireccion(resultado.getString("direccion"));
                x.setTelefono(resultado.getLong("telefono"));
                x.setCelular(resultado.getLong("celular"));
                x.setMail(resultado.getString("mail"));
            
            //Cierro la bd
            cerrar();
            
            //Retorno los resultados obtenidos de esa lista.
            return x;
        } 
        catch (SQLException ex) 
        {
            System.out.println("Se produjo un error al leer alumnos en la base de datos." + ex.getMessage());
            return null;
        }
 }
 
 public Boolean guardarAlumno(Alumno alumno)
 {
     try {
         
         //Abro conexion a la bd
         abrir();
         
         //Seteo valores para guardar.
            PreparedStatement st = connect.prepareStatement("insert into alumnos (nombre,apellido,dni,nivel,direccion,telefono,celular,mail) values (?,?,?,?,?,?,?,?)");
            st.setString(1, alumno.getNombre());
            st.setString(2, alumno.getApellido());
            st.setLong(3, alumno.getDni());
            st.setString(4, alumno.getNivelEducacion());
            st.setString(5, alumno.getDireccion());
            st.setLong(6, alumno.getTelefono());
            st.setLong(7, alumno.getCelular());
            st.setString(8, alumno.getMail());         
            st.execute();
            System.out.println("Los datos de nuevo alumno han sido guardados correctamente.");
            
            //Cierro la coxexion con la bd.
            cerrar();
            return true;
        
        } 
     catch (SQLException ex) 
     {
        System.out.println("Se produjo un error al guardar datos de nuevo alumno. " + ex.getMessage());
        return false;
     }
 }
 
 public boolean modificarAlumno(Alumno alumno)
 {
     try {
         
         //Abro conexion a la bd
         abrir();
         
         //Seteo valores para guardar.
            PreparedStatement st = connect.prepareStatement("update alumnos set nombre=?, apellido=?,dni=?,nivel=?,direccion=?,telefono=?,celular=?,mail=? where dni= " + alumno.getDni());
            st.setString(1, alumno.getNombre());
            st.setString(2, alumno.getApellido());
            st.setLong(3, alumno.getDni());
            st.setString(4, alumno.getNivelEducacion());
            st.setString(5, alumno.getDireccion());
            st.setLong(6, alumno.getTelefono());
            st.setLong(7, alumno.getCelular());
            st.setString(8, alumno.getMail());         
            st.execute();
            System.out.println("Datos modificados del alumno correctamente.");
            
            //Cierro la coxexion con la bd.
            cerrar();
            return true;
        
        } 
     catch (SQLException ex) 
     {
        System.out.println("Se produjo un error al guardar datos modificados del alumno. " + ex.getMessage());
        return false;
     }
 }
 
 public boolean eliminarAlumno(long DNI)
 {
    try {

            //Abro conexion a la bd
            abrir();

            //Seteo valores para guardar.
               PreparedStatement st = connect.prepareStatement("delete from alumnos where dni= " + DNI);
               st.execute();
               System.out.println("Se elimino el alumno de la base de datos.");

               //Cierro la coxexion con la bd.
               cerrar();
               return true;

           } 
        catch (SQLException ex) 
        {
           System.out.println("Se produjo un error al eliminar datos del alumno. " + ex.getMessage());
           return false;
        }
 }
}
