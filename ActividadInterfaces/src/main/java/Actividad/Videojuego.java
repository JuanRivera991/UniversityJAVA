/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividad;

/**
 *
 * @author JuanS
 */
public class Videojuego implements IEntregable {
    private String titulo;
    private int horasEstimadas = 10;
    private boolean entregado = false;
    private String genero;
    private String compañia;
    private int recomendada = 0;
    
    public Videojuego(String titulo, int horasEstimadas){
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }
    
    public Videojuego(String titulo, int horasEstimadas, String genero, String compañia){
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compañia = compañia;               
    }
    
    public String getTitulo(){
        return this.titulo;
    }
    
    public int getHorasEstimadas(){
        return this.horasEstimadas;
    }
    
    public String getGenero(){
        return this.genero;
    }
    
    public String getCompañia(){
        return this.compañia;
    }
    
    public int getRecomendada(){
        return this.recomendada;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public void setHorasEstimadas(int horasEstimadas){
        this.horasEstimadas = horasEstimadas;
    }
    
    public void setGenero(String genero){
        this.genero = genero;
    }
    
    public void setCompañia(String compañia){
        this.compañia = compañia;
    }
    
    public void setRecomendada(int recomendada){
        this.recomendada = recomendada;
    }
    
    @Override
    public String toString(){
        return "Titulo: " + this.titulo + " Horas Estimadas: " + this.horasEstimadas +
                " Entregado: " + this.entregado + " Genero: " + this.genero + 
                " Compañia :" + this.compañia + " Recomendada: " + this.recomendada;
    }

    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return this.entregado;
    }

    @Override
    public void recomendar() {
        this.recomendada = ++recomendada;
    }
}
