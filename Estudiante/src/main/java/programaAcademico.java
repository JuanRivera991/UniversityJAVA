/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author utp
 */
public class programaAcademico {
    //Atributos
    private String id;
    private String nombre;
    private int creditos;
    private int numSemestres;
    private int costo;
    
    //Constructor
    public programaAcademico(){}
    
    public programaAcademico(String id, String nombre, int creditos, int numSemestres, int costo){
        this.id = id;
        this.nombre= nombre;
        this.creditos = creditos;
        this.numSemestres = numSemestres;
        this.costo=costo;
    }
    
    //Métodos
    
    public String getId(){
        return this.id;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public int getCreditos(){
        return this.creditos;
    }
    
    public int getNumSemestres(){
        return this.numSemestres;
    }
    
    public int getCosto(){
        return this.costo;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setCreditos(int creditos){
        this.creditos = creditos;
    }
    
    public void setNumSemestre(int numSemestres){
        this.numSemestres = numSemestres;
    }
    
    public void setCosto(int costo){
        this.costo = costo;
    }

}