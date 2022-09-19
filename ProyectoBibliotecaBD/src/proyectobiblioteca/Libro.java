package proyectobiblioteca;

public class Libro {
    private String titulo;
    private String ISBN;
    private String editorial;
    private String autor;

    public Libro(String titulo, String ISBN, String editorial, String autor) {
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.editorial = editorial;
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String mostrarInfoLibros(){
        return  "ISBN: " + this.ISBN + "| Titulo: " + this.titulo + "| Autor: " + this.autor + "\n";
    }
    
    
}
