/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author utp
 */
public class Estudiante {
    //Atributos
    private String id;
    private String nombre;
    private String apellido;
    private String correo;
    private String direccion;
    private programaAcademico programaAcademico = new programaAcademico();
    private boolean  esBecado;
    
    //Constructor

    public Estudiante() {} //Por defecto

    public Estudiante(String id, String nombre, String apellido, String correo) { //Constructor con parametros
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
    }
 public Estudiante(Estudiante e){//Constructor copia
    this.nombre = e.nombre;
    this.apellido = e.apellido;
    this.correo = e.correo;
    this.direccion = e.direccion;  
 }
 
    //Metodos
    String getId(){
        return this.id;
    }
    
    String getNombre(){
        return this.nombre;
    }
    
    String getApellido(){
        return this.apellido;
    }
    
    String getCorreo(){
        return this.correo;
    }
    
    String getDireccion(){
        return this.direccion;
    }
    
    
    boolean getEsBecado(){
     return this.esBecado;
}
    
    public void setId(String id) {
        this.id = id;
    }
    
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    

    public void setEsBecado(boolean esBecado) {
        this.esBecado = esBecado;
    }
    
    public void agregarProgramaAcademico(programaAcademico pa){
        this.programaAcademico.setNombre(pa.getNombre());
        this.programaAcademico.setId(pa.getId());
    }
            
    
    @Override
    public String toString(){
        return "El estudiante "+ this.getNombre() +" " + this.getApellido() + " es becado: " + this.getEsBecado()+ " " + this.programaAcademico.getNombre();
        
    }
    public void Imprimir(){
        System.out.println("El estudiante "+ this.getNombre() +" " + this.getApellido() + " es becado: " + this.getEsBecado());
    }
    
    
 
}
