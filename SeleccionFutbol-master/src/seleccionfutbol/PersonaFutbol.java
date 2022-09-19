/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleccionfutbol;

public class PersonaFutbol {
    protected int id;
    protected String nombre;
    protected String apellidos;
    protected int edad;
            
    public PersonaFutbol() {
    }

    public PersonaFutbol(int id, String nombre, String apellidos, int edad) {
            this.id = id;
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.edad = edad;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void concentrarse (){
        System.out.println("Concentrarse");
    }
    
    public void viajar (){
        System.out.println("Viajar");
    }
}
