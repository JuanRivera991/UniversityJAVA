/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Electrodomesticos;

/**
 *
 * @author JuanS
 */
public class electrodomesticos {
    protected int precioBase;
    protected String color;
    protected String consumo;
    protected int peso;
    
    public electrodomesticos(){
        this.color = "Blanco";
        this.precioBase = 100;
        this.consumo = "F";
        this.peso = 5;   
    }
    
    public electrodomesticos(int precio, int peso){
        this.precioBase = precio;
        this.color = "blanco";
        this.consumo = "F";
        this.peso = peso;
    }
    
    public electrodomesticos (int precio, String color, String consumo, int peso){
        this.precioBase = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }
    
    public int getPrecioBase(){
        return this.precioBase;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public String getConsumo(){
        return this.consumo;
    }
    
    public int getPeso(){
        return this.peso;
    }
    
    public void setPrecioBase(int precio){
        this.precioBase = precio;
    }
    
    public void setColor (String color){
        this.color = color;
    }
    
    public void setConsumo(String consumo){
        this.consumo = consumo;
    }
    
    public void setPeso(int peso){
        this.peso = peso;
    }
    
    public void comprobarConsumoEnergetico(String letra){
        switch (letra) {
            case "A":
                this.consumo = "A";
                break;
            case "B":
                this.consumo = "B";
                break;
            case "C":
                this.consumo = "C";
                break;
            case "D":
                this.consumo = "D";
                break;
            case "E":
                this.consumo = "E";
                break;
            case "F":
                this.consumo = "F";
                break;
            default:
                this.consumo = "F";
                break;
        }
    }
    
    public void comprobarColor(String color){
        switch (color){
            case "blanco":
                this.color = "Blanco";
                break;
            case "BLANCO":
                this.color = "Blanco";
                break;
            case "negro":
                this.color = "Negro";
                break;
            case "NEGRO":
                this.color = "Negro";
                break;
            case "rojo":
                this.color = "Rojo";
                break;
            case "ROJO":
                this.color = "Rojo";
                break;
            case "azul":
                this.color = "Azul";
                break;
            case "AZUL":
                this.color = "Azul";
                break;
            case "gris":
                this.color = "Gris";
                break;
            case "GRIS":
                this.color = "Gris";
                break;
            default:
                this.color = "Blanco";
                break;
        }
    }
    
    public int precioFinal(){
        int precioF = this.precioBase;
        
        if(this.consumo.equals("A")){
            precioF = precioF + 100;
        }else if (this.consumo.equals("B")){
            precioF = precioF + 80;
        }else if (this.consumo.equals("C")){
            precioF= precioF + 60;
        }else if (this.consumo.equals("D")){
            precioF= precioF + 50;
        }else if (this.consumo.equals("E")){
            precioF= precioF + 30;
        }else if (this.consumo.equals("F")){
            precioF= precioF + 10;
        }
        
        if(this.peso >= 0 && this.peso < 20){
            precioF = precioF + 10;
        }else if (this.peso >= 20 && this.peso <50){
            precioF = precioF + 50;
        }
        else if (this.peso >= 50 && this.peso <80){
            precioF = precioF + 80;
        }else if (this.peso >= 80){
            precioF = precioF + 100;
        }
        
        return precioF;
    }
}
