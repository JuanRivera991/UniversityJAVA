/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleccionfutbol;


public class Entrenador extends PersonaFutbol {
    private int idFederacion;
    private String tarjetaProfesional;

    public Entrenador() {
    }

    public Entrenador(int idFederacion, String tarjetaProfesional) {
        this.idFederacion = idFederacion;
        this.tarjetaProfesional = tarjetaProfesional;
    }

    public Entrenador(int idFederacion, String tarjetaProfesional, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
        this.tarjetaProfesional = tarjetaProfesional;
    }

    public int getIdFederacion() {
        return idFederacion;
    }

    public String getTarjetaProfesional() {
        return tarjetaProfesional;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }

    public void setTarjetaProfesional(String tarjetaProfesional) {
        this.tarjetaProfesional = tarjetaProfesional;
    }
    
    public void dirigirPartido(){
        System.out.println("Hoy dirige partido "+ this.nombre + this.apellidos);
    }
    
    public void dirigirEntrenamiento(){
        System.out.println("Hoy dirige entrenamiento "+ this.nombre + this.apellidos);
    }   
    
}
