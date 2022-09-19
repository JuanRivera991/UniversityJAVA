/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase;

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
        /*
        FiguraGeometrica fg1 = new Cuadrado(4,"azul");
        FiguraGeometrica fg2 = new Triangulo(4,2,"verde");
        FiguraGeometrica fg3 = new Circulo(4,"rojo");
        
        System.out.println("El area del cuadrado es: " + fg1.calcularArea());
        System.out.println("El area del triangulo es: " + fg2.calcularArea());
        System.out.println("El area del circulo es: " + fg3.calcularArea());
        
        System.out.println("El perimetro del cuadrado es: " + fg1.calcularPerimetro());
        System.out.println("El perimetro del triangulo es: " + fg2.calcularPerimetro());
        System.out.println("El perimetro del circulo  es: " + fg3.calcularPerimetro());
        */
        
        ArrayList<FiguraGeometrica> figuras = new ArrayList<FiguraGeometrica>();
                
        Scanner ent = new Scanner(System.in);
        int opc;
        
        do{
            System.out.println("|-------MENU-------|");
            System.out.println("|1.Crear Cuadrado  |");
            System.out.println("|2.Crear Triangulo |");
            System.out.println("|3.Crear Circulo   |");
            System.out.println("|4.Ver Cuadradros  |");
            System.out.println("|5.Ver Triangulos  |");
            System.out.println("|6.Ver Circulos    |");
            System.out.println("|7.Salir           |");
            System.out.println("|------------------|");
            System.out.println("Ingrese una opcion: ");
            opc = ent.nextInt();
            
            switch(opc){
                case 1:{
                    double lado;
                    String color;
                    
                    System.out.println("Ingrese un valor para el lado: ");
                    lado = ent.nextDouble();
                    System.out.println("Ingrese un color para el cuadrado: ");
                    color = ent.next();
                    
                    Cuadrado cuadrado = new Cuadrado(lado,color);
                    figuras.add(cuadrado);
                    break;
                }
                
                case 2:{
                    double base, altura;
                    String color;
                    
                    System.out.println("Ingrese un valor para el base: ");
                    base = ent.nextDouble();
                    System.out.println("Ingrese un valor para la altura: ");
                    altura = ent.nextDouble();
                    System.out.println("Ingrese un color para el triangulo: ");
                    color = ent.next();
                    
                    Triangulo triangulo = new Triangulo(base, altura, color);
                    figuras.add(triangulo);
                    break;
                }
                
                case 3:{
                    double radio;
                    String color;
                    
                    System.out.println("Ingrese un valor para el radio: ");
                    radio = ent.nextDouble();
                    System.out.println("Ingrese un color para el circulo: ");
                    color = ent.next();
                    
                    Circulo circulo = new Circulo(radio,color);
                    figuras.add(circulo);
                    break;
                }
                
                case 4:{
                    for(FiguraGeometrica figura: figuras){
                        if(figura instanceof Cuadrado){
                            System.out.println(((Cuadrado) figura).toString());
                        }
                    }
                   break;
                }
                
                case 5:{
                    for(FiguraGeometrica figura: figuras){
                        if(figura instanceof Triangulo){
                            System.out.println(((Triangulo) figura).toString());
                        }
                    }
                    break;
                }
                
                case 6:{
                    for(FiguraGeometrica figura: figuras){
                        if(figura instanceof Circulo){
                            System.out.println(((Circulo) figura).toString());
                        }
                    }
                    break;
                }
                
                case 7:{
                    System.out.println("Gracias por utilizar el programa.");
                    System.exit(0);
                    break;
                }
                
                default:System.out.println("Opcion no valida");
            
        }
                    
        }while(opc > 0 || opc < 8);
    }
    
}
