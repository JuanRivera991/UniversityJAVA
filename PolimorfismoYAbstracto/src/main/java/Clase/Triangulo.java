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
public class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;
    
    public double getBase(){
        return this.base;
    }
    
    public double getAltura(){
        return this.altura;
    }
    
    public void setBase(double base){
        this.base = base;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    public Triangulo(double base, double altura, String color){
        super(color);
        this.altura = altura;
        this.base = base;
    }
    
    @Override
    public double calcularArea(){
        return this.base * this.altura;
    }
    
    @Override
    public double calcularPerimetro(){
        return Math.hypot(base, altura) + this.altura + this.base;
    }
    
    @Override
    public String toString(){
        return "El triangulo de color " +this.getColor() + "tiene una base de: " 
                + this.getBase() + " Una altura de: " + this.getAltura() +
                " Un area de: " + this.calcularArea() + " y un perimetro de: " + 
                this.calcularPerimetro();
    }
}
