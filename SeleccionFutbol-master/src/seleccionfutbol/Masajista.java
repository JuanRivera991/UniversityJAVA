/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleccionfutbol;

public class Masajista extends PersonaFutbol{
    private String titulo;
    private int aniosExperiencia;
    
    public Masajista() {
    }

    public Masajista(String titulo, int aniosExperiencia, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.titulo = titulo;
        this.aniosExperiencia = aniosExperiencia;
    }

    public Masajista(String titulo, int aniosExperiencia) {
        super();
        this.titulo = titulo;
        this.aniosExperiencia = aniosExperiencia;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public void darMasaje(){
        System.out.println("La persona quien da el masaje es  "+ this.nombre + this.apellidos);
    }
    
}
