package Modelo;

/**
 *
 * @author JuanS
 */
public class LibroElectronico extends Libro{

    //Constructores
    public LibroElectronico() {}
    
    public LibroElectronico(String titulo, String autor, 
            String editorial, int numPaginas, String fechaIngreso,
            String fechaTitulo, String ISBN, String genero, String referencias) {
        
        super(titulo, autor, editorial, numPaginas, fechaIngreso, fechaTitulo, ISBN, genero, referencias);
    }
    
    //Metodos toString.

    
    @Override
    public String toString() {
        return "Titulo: "+ this.titulo +  "| Autor: " + this.autor + "| Editorial: " + this.editorial 
                + "| Genero: " + this.genero + "| Fecha de Ingreso: " + this.fechaIngreso 
                + "| Fecha de Titulo: " + this.fechaTitulo +  "| Codigo ISBN: " + this.ISBN + 
                "| Visualizaciones: " + this.visualizaciones;
    }
    
    @Override
    public String mostrarInfobasica() {
        return "Titulo: " + this.titulo + "| Autor: " + this.autor + "| Editorial: " + this.editorial + "| ISBN: " +
                this.ISBN + "| Visualizaciones: " + this.visualizaciones;
    }

    @Override
    public String mostrarInfoClientes() {
        return "Titulo: " + this.titulo + "| Autor: " + this.autor + "| Editorial: " + this.editorial + "| ISBN: " +
                this.ISBN;
    }
}
