/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleccionfutbol;

/**
 *
 * @author sebastian hoyos
 */
public class Futbolista extends PersonaFutbol{
    private int dorsal;
    private String posicion;
    private String pieDominante;
    
    public Futbolista (){
        super();
    }

    public Futbolista(int dorsal, String posicion, String pieDominante) {
        this.dorsal = dorsal;
        this.posicion = posicion;
        this.pieDominante = pieDominante;
    }

    public Futbolista(int dorsal, String posicion, String pieDominante, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.posicion = posicion;
        this.pieDominante = pieDominante;
    }

    public int getDorsal() {
        return dorsal;
    }

    public String getPieDominante() {
        return pieDominante;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public void setPieDominante(String pieDominante) {
        this.pieDominante = pieDominante;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    
    public void jugarPartido(){
        System.out.println("Hoy juega partido "+ this.nombre + this.apellidos);
    }
    
    public void entrenar(){
        System.out.println("Hoy entrena "+ this.nombre + this.apellidos);
    }
        
}
