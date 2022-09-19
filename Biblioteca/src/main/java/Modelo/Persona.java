package Modelo;

/**
 *
 * @author JuanS
 */
abstract public class Persona {
    //Atributos
    protected String nombre;
    protected String tipoIdentificacion;
    protected String numIdentificacion;
    protected String direccionResidencia;
    protected String telefono;
    protected String numCelular;
    protected String cargo;
    protected String fechaNacimiento;
    protected ListaEnlazada listaLibrosFisicos = new ListaEnlazada();
    protected ListaEnlazada listaLibrosElectronicos = new ListaEnlazada();
    protected ListaEnlazada listaLibros = new ListaEnlazada();

    //Construtores
    public Persona() {}

    public Persona(String nombre, String tipoIdentificacion, String numIdentificacion,
            String direccionResidencia, String telefono, String numCelular,
            String cargo, String fechaNacimiento) {
        this.nombre = nombre;
        this.tipoIdentificacion = tipoIdentificacion;
        this.numIdentificacion = numIdentificacion;
        this.direccionResidencia = direccionResidencia;
        this.telefono = telefono;
        this.numCelular = numCelular;
        this.cargo = cargo;
        this.fechaNacimiento = fechaNacimiento;
    }

    //Metodos get, set y to String
    public String getNombre() {
        return nombre;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public String getNumIdentificacion() {
        return numIdentificacion;
    }

    public String getDireccionResidencia() {
        return direccionResidencia;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getNumCelular() {
        return numCelular;
    }

    public String getCargo() {
        return cargo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public ListaEnlazada getListaLibrosFisicos() {
        return listaLibrosFisicos;
    }

    public ListaEnlazada getListaLibrosElectronicos() {
        return listaLibrosElectronicos;
    }

    public ListaEnlazada getListaLibros() {
        return listaLibros;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public void setNumIdentificacion(String numIdentificacion) {
        this.numIdentificacion = numIdentificacion;
    }

    public void setDireccionResidencia(String direccionResidencia) {
        this.direccionResidencia = direccionResidencia;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setNumCelular(String numCelular) {
        this.numCelular = numCelular;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setListaLibros(ListaEnlazada listaLibros) {
        this.listaLibros = listaLibros;
    }
    
    public void setListaLibrosFisicos(ListaEnlazada listaLibrosFisicos) {
        this.listaLibrosFisicos = listaLibrosFisicos;
    }

    public void setListaLibrosElectronicos(ListaEnlazada listaLibrosElectronicos) {
        this.listaLibrosElectronicos = listaLibrosElectronicos;
    }
    
    public void agregarLibroPrestadoFisico(Libro libro){
        listaLibrosFisicos.addInicioListaLibro(libro);
    }
    
    public void eliminarLibroPrestadoFisicos(String ISBN){
        listaLibrosFisicos.removerLibro(ISBN);
    }
    
    public void agregarLibroPrestadoElectronico(Libro libro){
        listaLibrosElectronicos.addInicioListaLibro(libro);
    }
    
    public void eliminarLibroPrestadoElectronico(String ISBN){
        listaLibrosElectronicos.removerLibro(ISBN);
    }
    
    public void agregarLibroPrestado(Libro libro){
        listaLibros.addInicioListaLibro(libro);
    }
    
    public void eliminarLibroPrestado(String ISBN){
        listaLibros.removerLibro(ISBN);
    }
    
    @Override
    public abstract String toString();
    
    public String mostrarInfoBasica(){
        return "Nombre: " + this.nombre + " |Numero de identificacion: " + this.numIdentificacion;
    }
}
