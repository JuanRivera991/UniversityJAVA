/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase;

import static java.lang.Math.pow;

/**
 *
 * @author JuanS
 */
public class Circulo extends FiguraGeometrica{
    private double radio;
    
    public double getRadio(){
        return this.radio;
    }
    
    public void setRadio(double radio){
        this.radio = radio;
    }
    public Circulo(double radio, String color){
        super(color);
        this.radio = radio;
    }
    
    @Override
    public double calcularArea(){
    return pow(2,this.radio) * Math.PI;
} 
    
    @Override
    public double calcularPerimetro(){
        return 2 * Math.PI * this.radio;
    }
    
    @Override
    public String toString(){
        return "El circulo de color " + this.getColor() + " tiene un radio de: " + this.getRadio() + 
                " Un area de: " + this.calcularArea() + " y un perimetro de: " + 
                this.calcularPerimetro();
    }
}
