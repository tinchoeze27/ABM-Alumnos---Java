

public class Alumno {
    
    //Declaracion de variables para el modelo de alumno
    private String nombre,apellido,direccion,mail, nivelEducacion;
    private long dni, telefono, celular;

    //Creo un constructor vacio
    public Alumno()
    {
    
    }
    
    //Creo constructor con datos
    public Alumno(String nombrex, String apellidox, String direccionx, String mailx, String nivelEducacionx, long dnix, long telefonox, long celularx)
    {
        this.nombre = nombrex;
        this.apellido= apellidox;
        this.direccion = direccionx;
        this.mail = mailx;
        this.nivelEducacion = nivelEducacionx;
        this.dni = dnix;
        this.telefono = telefonox;
        this.celular = celularx;
    }
    
    //Creo los metodos para gets y sets para obtener o establecer informacion segun el valor que corresponda.
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * @param mail the mail to set
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * @return the nivelEducacion
     */
    public String getNivelEducacion() {
        return nivelEducacion;
    }

    /**
     * @param nivelEducacion the nivelEducacion to set
     */
    public void setNivelEducacion(String nivelEducacion) {
        this.nivelEducacion = nivelEducacion;
    }

    /**
     * @return the dni
     */
    public long getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(long dni) {
        this.dni = dni;
    }

    /**
     * @return the telefono
     */
    public long getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the celular
     */
    public long getCelular() {
        return celular;
    }

    /**
     * @param celular the celular to set
     */
    public void setCelular(long celular) {
        this.celular = celular;
    } 
}

