package Modelo;

/**
 *
 * @author JuanS
 */
public class LibroFisico extends Libro {
    //Atributos 
    protected boolean empastado;

    //Constructores
    public LibroFisico() {}

    public LibroFisico(boolean empastado, int cantidadEjemplares, String titulo,
            String autor, String editorial, int numPaginas, String fechaIngreso,
            String fechaTitulo, String ISBN, String genero, String referencias) {
        
        super(titulo, autor, editorial, numPaginas, fechaIngreso, fechaTitulo, ISBN, genero, referencias);
        this.empastado = empastado;
        this.cantidadEjemplares = cantidadEjemplares;
        this.cantidadPrestados = 0;
    }
    
    //Metodos get, set y toString.

    public boolean isEmpastado() {
        return empastado;
    }

    public void setEmpastado(boolean empastado) {
        this.empastado = empastado;
    }

    @Override
    public String toString() {
        return "Titulo: "+ this.titulo +  " |Autor: " + this.autor + " |Editorial: " + this.editorial 
                + " |Genero: " + this.genero + " |Fecha de Ingreso: " + this.fechaIngreso 
                + " |Fecha de Titulo: " + this.fechaTitulo +  " |Codigo ISBN: " + this.ISBN + 
                " |Empastado: " + this.empastado + " |Cantidad de Ejemplares: "+  this.cantidadEjemplares;
    }
    
    @Override
    public String mostrarInfobasica(){
        return "Titulo: " + this.titulo + "| Autor: " + this.autor + "| Editorial: " + this.editorial + "| ISBN: " +
                this.ISBN + "| Cantidad: " + this.cantidadEjemplares;
    }

    @Override
    public String mostrarInfoClientes() {
        return "Titulo: " + this.titulo + "| Autor: " + this.autor + "| Editorial: " + this.editorial + "| ISBN: " +
                this.ISBN;
    }
    
}
