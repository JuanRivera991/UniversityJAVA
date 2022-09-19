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
public class Novela extends Serie {
    private int numHoras;
    
    public Novela(){
        super();
    }
    
    public Novela(String titulo, String creador, int numTemporadas, String genero,int numHoras){
        super(titulo,creador, numTemporadas, genero);
        this.numHoras = numHoras;
    }
    
    public int getNumHoras(){
        return this.numHoras;
    }
    
    public void setNumHoras(int numHoras){
        this.numHoras= numHoras;
    }
    
    @Override
    public String toString(){
        return "Titulo: " + this.getTitulo() + " Num de temporadas: " + this.getNumTemporadas() +
                " Entregado : " + this.isEntregado() + " Genero: " + this.getGenero() + 
                " Creador: " + this.getCreador() + " Recomendada: " + this.getRecomendada() +
                " Numero de horas: " + this.numHoras;
    }
    
}
