package proyectobiblioteca;

public class Cliente {
    private String nombre;
    private String numId;
    private String apellidos;
    private String tipoId;
    private int edad;
    private String contraseña;
    private String direccion;

    public Cliente() {
    }

    
    public Cliente(String numId, String nombre, String apellidos, String tipoId, int edad, String contraseña, String direccion) {
        this.nombre = nombre;
        this.numId = numId;
        this.apellidos = apellidos;
        this.tipoId = tipoId;
        this.edad = edad;
        this.contraseña = contraseña;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNumId() {
        return numId;
    }

    public String getTipoId() {
        return tipoId;
    }

    public int getEdad() {
        return edad;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getDireccion() {
        return direccion;
    }
    
    

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumId(String numId) {
        this.numId = numId;
    }

    public void setTipoId(String tipoId) {
        this.tipoId = tipoId;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    

    public void infoCliente(){
        System.out.println(this.numId + this.nombre);
    }
    
    
    
}
