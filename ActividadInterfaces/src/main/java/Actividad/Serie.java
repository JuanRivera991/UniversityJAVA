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
public class Serie implements IEntregable {
    private String titulo;
    private int numTemporadas = 3;
    private boolean entregado = false;
    private String genero;
    private String creador;
    private int recomendada = 0;
    
    public Serie(){
        this.titulo = null;
        this.genero = null;
        this.creador = null;
    }
    
    public Serie(String titulo, String creador){
        this.titulo = titulo;
        this.creador = creador;
        this.genero = null;
    }
    
    public Serie(String titulo, String creador, int numTemporadas, String genero){
        this.titulo = titulo;
        this.creador = creador;
        this.numTemporadas = numTemporadas;
        this.genero = genero;
    }
    
    public String getTitulo(){
        return this.titulo;
    }
    
    public String getCreador(){
        return this.creador;
    }
    
    public int getNumTemporadas(){
        return this.numTemporadas;
    }
    
    public int getRecomendada(){
        return this.recomendada;
    }
    
    public String getGenero(){
        return this.genero;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public void setCreador(String creador){
        this.creador = creador;
    }
    
    public void setNumTemporadas(int numTemporadas){
        this.numTemporadas = numTemporadas;
    }
    
    public void setRecomendada(int recomendada){
        this.recomendada = recomendada;
    }
    
    public void setGenero(String genero){
        this.genero = genero;
    }
    
    @Override
    public String toString(){
        return "Titulo: " + this.titulo + " Num de temporadas: " + this.numTemporadas +
                " Entregado : " + this.entregado + " Genero: " + this.genero + 
                " Creador: " + this.creador + " Recomendada: " + this.recomendada;
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
