package Modelo;

/**
 *
 * @author JuanS
 */
public class NodoListaEnlazada {
    private Persona persona;
    private Libro libro;
    private NodoListaEnlazada siguientePersona;
    private NodoListaEnlazada siguienteLibro;

    public NodoListaEnlazada() {
        this.persona = null;
        this.siguientePersona = null;
        this.siguienteLibro = null;
        this.libro = null;
    }

    public Persona getPersona() {
        return persona;
    }
    
    public Libro getLibro(){
        return libro;
    }

    public NodoListaEnlazada getSiguientePersona() {
        return siguientePersona;
    }
    
    public NodoListaEnlazada getSiguienteLibro() {
        return siguienteLibro;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    public void setLibro(Libro libro){
        this.libro = libro;
    }
    
    public void setSiguientePersona(NodoListaEnlazada siguientePersona) {
        this.siguientePersona = siguientePersona;
    }
    
    public void setSiguienteLibro(NodoListaEnlazada siguienteLibro) {
        this.siguienteLibro = siguienteLibro;
    }
}
