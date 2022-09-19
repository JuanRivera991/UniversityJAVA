package Modelo;

/**
 *
 * @author JuanS
 */
abstract public class Libro {
    //Atributos
    protected String titulo;
    protected String autor;
    protected String editorial;
    protected int numPaginas;
    protected String fechaIngreso;
    protected String fechaTitulo;
    protected String ISBN;
    protected String genero;
    protected String referencias;
    protected int visualizaciones = 0;
    protected int cantidadEjemplares;
    protected int cantidadPrestados;
    
    //Constructores
    public Libro(){}

    public Libro(String titulo, String autor, String editorial, int numPaginas,
            String fechaIngreso, String fechaTitulo, String ISBN, String genero, String referencias) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.numPaginas = numPaginas;
        this.fechaIngreso = fechaIngreso;
        this.fechaTitulo = fechaTitulo;
        this.ISBN = ISBN;
        this.genero = genero;
        this.referencias = referencias;
    }

    //Metodos get, set y toString.
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public String getFechaTitulo() {
        return fechaTitulo;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getGenero() {
        return genero;
    }

    public String getReferencias() {
        return referencias;
    }

    public int getVisualizaciones() {
        return visualizaciones;
    }

    public int getCantidadEjemplares() {
        return cantidadEjemplares;
    }

    public int getCantidadPrestados() {
        return cantidadPrestados;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public void setFechaTitulo(String fechaTitulo) {
        this.fechaTitulo = fechaTitulo;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setReferencias(String referencias) {
        this.referencias = referencias;
    }

    public void setVisualizaciones(int visualizaciones) {
        this.visualizaciones = visualizaciones;
    }

    public void setCantidadEjemplares(int cantidadEjemplares) {
        this.cantidadEjemplares = cantidadEjemplares;
    }

    public void setCantidadPrestados(int cantidadPrestados) {
        this.cantidadPrestados = cantidadPrestados;
    }
    
    @Override
    public abstract String toString();
    
    public abstract String mostrarInfobasica();
    
    public abstract String mostrarInfoClientes();
    
}
