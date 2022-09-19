/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase;

/**
 *
 * @author JuanS
 */
public class Cuadrado extends FiguraGeometrica {
    private double lado;
    
    public double getLado(){
        return this.lado;
    }
    
    public void setLado(double lado){
        this.lado = lado;
    }
    
    public Cuadrado(double lado, String color){
        super(color);
        this.lado = lado;
    }
    
    @Override
    public double calcularArea(){
        return this.lado * this.lado;
    }
    
    @Override
    public double calcularPerimetro(){
        return 4*this.lado;
    }
    
    @Override
    public String toString(){
        return "El cuadrado de color: "+ this.getColor() +" tiene 4 lados de longitud: " + this.getLado() + 
                " Un area de: " + this.calcularArea() + " y un perimetro de: " + 
                this.calcularPerimetro();
    }
}
