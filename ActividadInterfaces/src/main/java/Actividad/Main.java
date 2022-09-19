/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividad;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author JuanS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        
        Serie s1 = new Serie("Breaking Bad", "Vince Gilligan", 5, "Drama y crimen");
        Serie s2 = new Serie("Casa de papel", "Alex Pina", 4, "Drama y accion");
        Serie s3 = new Serie("Better call Saul", "Vince Gilligan", 5, "Drama y crimen");
        Serie s4 = new Serie("Rick and Morty", "Dan Harmon", 4, "Ciencia Ficcion y comedia");
        Serie s5 = new Serie("Lucifer", "Tom Kapinos", 4, "Drama y fantasia");
        Novela n1 = new Novela("Jesus", "Tom Kapinos", 4, "Drama y fantasia", 10);
        
        Videojuego v1 = new Videojuego("League of Legends", 1000, "Estrategia", "Riot Games");
        Videojuego v2 = new Videojuego("GTA V", 250, "Estrategia y crimen", "RockStar");
        Videojuego v3 = new Videojuego("FIFA 20", 120, "Estrategia y deportes", "Electronic Arts");
        Videojuego v4 = new Videojuego("Fornite", 700, "Disparos", "Epic Games");
        Videojuego v5 = new Videojuego("Far cry 5", 200, "Disparos", "Ubisoft");
        
        tienda.agregarSerie(s1);
        tienda.agregarSerie(s2);
        tienda.agregarSerie(s3);
        tienda.agregarSerie(s4);
        tienda.agregarSerie(s5);
        tienda.agregarSerie(n1);
        
        tienda.agregarJuego(v1);
        tienda.agregarJuego(v2);
        tienda.agregarJuego(v3);
        tienda.agregarJuego(v4);
        tienda.agregarJuego(v5);
        
        Scanner ent = new Scanner(System.in);
        int opc;
        do{
            System.out.println("|--------------MENU-------------|");
            System.out.println("|1.Entregar Videojuegos         |");
            System.out.println("|2.Entregar Series              |");
            System.out.println("|3.Devolver Videojuegos         |");
            System.out.println("|4.Devolver Series              |");
            System.out.println("|5.Recomendar Videojuegos       |");
            System.out.println("|6.Recomendar Series            |");
            System.out.println("|7.Ver videojuego con mas horas |");
            System.out.println("|8.Ver Serie con mas temporadas |");
            System.out.println("|9.Sugerir Serie y/o Novela     |");
            System.out.println("|10.Salir                       |");
            System.out.println("|-------------------------------|");
            System.out.println("Eliga una opcion: ");
            opc = ent.nextInt();
            ent.nextLine();
            
            switch(opc){
                case 1:{
                    tienda.mostrarVideojuegos();
                    System.out.println("Ingrese una opcion: ");
                    int id = ent.nextInt();
                    ent.nextLine();
                    tienda.EntregarVideojuego(id);
                    break;
                }
                
                case 2:{
                    tienda.mostrarSeries();
                    System.out.println("Ingrese una opcion: ");
                    int id = ent.nextInt();
                    ent.nextLine();
                    tienda.EntregarSerie(id);
                    break;
                }
                
                case 3:{
                    tienda.mostrarVideojuegos();
                    System.out.println("Ingrese una opcion: ");
                    int id = ent.nextInt();
                    ent.nextLine();
                    tienda.DevolverVideojuego(id);
                    break;
                }
                
                case 4:{
                    tienda.mostrarSeries();
                    System.out.println("Ingrese una opcion: ");
                    int id = ent.nextInt();
                    ent.nextLine();
                    tienda.DevolverSerie(id);
                    break;
                }
                
                case 5:{
                    tienda.mostrarVideojuegos();
                    System.out.println("Ingrese una opcion: ");
                    int id = ent.nextInt();
                    ent.nextLine();
                    tienda.RecomendarVideojuego(id);
                    break;
                }
                
                case 6:{
                    tienda.mostrarSeries();
                    System.out.println("Ingrese una opcion: ");
                    int id = ent.nextInt();
                    ent.nextLine();
                    tienda.RecomendarSerie(id);
                    break;
                }
                case 7:{
                    tienda.videojuegoConMasHoras();
                    break;
                }
                
                case 8:{
                    tienda.serieConMasTemporadas();
                    break;
                }
                
                case 9:{
                    System.out.println("Ingrese el genero que desea ver: ");
                    String genero = ent.nextLine();
                    tienda.sugerirSeries(genero);
                    break;
                }
                
                case 10:System.exit(0); 
                
                default: System.out.println("Esa opcion no esta disponible.");
                
            }
            
        }while(opc>0 || opc <11);
    }
    
}
