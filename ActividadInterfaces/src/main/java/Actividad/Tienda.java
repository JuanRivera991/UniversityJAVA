/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividad;

import java.util.ArrayList;

/**
 *
 * @author JuanS
 */
public class Tienda {
    ArrayList<Serie> series = new ArrayList<Serie>();
    ArrayList<Videojuego> videojuegos = new ArrayList<Videojuego>();
    
    public Tienda(){}
    
    public void agregarJuego(Videojuego j){
        videojuegos.add(j);
    }
    
    public void agregarSerie(Serie e){
        series.add(e);
    }
    
    public void mostrarSeries(){
        int i = 1;
        for(Serie serie:series){
            System.out.println(i + "." + serie.toString() );
            i++;
        }
    }
    
    public void mostrarVideojuegos(){
        int i = 1;
        for(Videojuego videojuego:videojuegos){
            System.out.println(i + "." + videojuego.toString() );
            i++;
        }
    }
    
    public void EntregarSerie(int id){
        id = id-1;
        series.get(id).entregar();
                    System.out.println("La serie " + series.get(id).getTitulo() + 
                            " ha sido entregado " + series.get(id).isEntregado());
    }
    
    public void EntregarVideojuego(int id){
        id = id-1;
        videojuegos.get(id).entregar();
        System.out.println("El videojuego " + videojuegos.get(id).getTitulo() + 
                            " ha sido entregado " + videojuegos.get(id).isEntregado());
    }
    
    public void DevolverSerie(int id){
        id = id-1;
        series.get(id).devolver();
                    System.out.println("La serie " + series.get(id).getTitulo() + 
                            " ha sido devuelto " + series.get(id).isEntregado());
        
    }
    
    public void DevolverVideojuego(int id){
        videojuegos.get(id).devolver();
                    System.out.println("El videojuego " + videojuegos.get(id).getTitulo() + 
                            " ha sido devuelto " + videojuegos.get(id).isEntregado());
    }
    
    public void RecomendarSerie(int id){
        id = id-1;
        series.get(id).recomendar();
                    System.out.println("La serie " + series.get(id).getTitulo() + 
                            " ha sido recomendada " + series.get(id).getRecomendada()+ 
                            " veces.");
    }
    
    public void RecomendarVideojuego(int id){
        id = id-1;
        videojuegos.get(id).recomendar();
                    System.out.println("El videojuego " + videojuegos.get(id).getTitulo() + 
                            " ha sido recomendado " + videojuegos.get(id).getRecomendada() + 
                            " veces.");
    }
    
    public void videojuegoConMasHoras(){
        int aux = videojuegos.get(0).getHorasEstimadas();
        int aux2;
        int i=0;
        int j=0;
        for(Videojuego videojuego:videojuegos){
            aux2=videojuego.getHorasEstimadas();
            if(aux2 > aux){
                aux = aux2;
                j=i;
            }
            i++;
        }
                    
        System.out.println("El videojuego con mas horas estimadas es " + 
                videojuegos.get(j).getTitulo() + " con un total de "+
                videojuegos.get(j).getHorasEstimadas() + " horas.");
    }
    
    public void serieConMasTemporadas(){
        int aux = series.get(0).getNumTemporadas();
        int aux2;
        int i=0;
        int j=0;
        for(Serie serie:series){
            aux2=serie.getNumTemporadas();
            if(aux2 > aux){
                aux = aux2;
                j=i;
            }
            i++;
        }
                    
        System.out.println("La serie con mas temporadas es " + 
                    series.get(j).getTitulo() + " con un total de "+
                    series.get(j).getNumTemporadas()+ " temporadas.");
        
    }
    
    public void sugerirSeries(String genero){
        for(Serie serie:series){
            if(serie.getGenero().equals(genero)){
                System.out.println("Recomendacion: " + serie.getTitulo());
            }
        }
    }
}
