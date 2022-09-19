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
public class television extends electrodomesticos {
    protected int resolucion;
    protected boolean tdt;
    
    public television(){
        super();
        this.resolucion = 20;
        this.tdt = false;
    }
    
    public television(int precio, int peso){
        super();
        this.peso = peso;
        this.precioBase = precio;
        this.resolucion = 20;
        this.tdt = false;
    }
    
    public television (int resolucion, boolean tdt){
        super();
        this.resolucion = resolucion;
        this.tdt = tdt;
    }
    
    public int getResolucion(){
        return this.resolucion;
    }
    
    public boolean getTdt(){
        return this.tdt;
    }
    
    public void setResolucion(int resolucion){
        this.resolucion = resolucion;
    }
    
    public void setTdt(boolean tdt){
        this.tdt = tdt;
    }
    
    public double precioFinalTV(){
        int precio = this.precioFinal();
        
        if(this.resolucion > 40 && this.tdt != false){
            double precioF = (precio*0.3) + precio + 50;
            return precioF;
        }else if (this.resolucion > 40 && this.tdt != true){
            double precioF = (precio*0.3) + precio;
            return precioF;
        }else if(this.resolucion <= 40 && this.tdt != false){
            double precioF = (int) precio + 50;
            return precioF;
        }else{
            double precioF = precio;
            return precioF;
        }
    }
    
    @Override
    public String toString(){
         return "Precio base: " + this.precioBase + " Color: " + this.color +
                 " Consumo: " + this.consumo + " Peso: "+ this.peso + 
                 " Resolucion : " + this.resolucion + " pulgadas " + " TDT: "
                 + this.tdt  + " Precio Final: " + this.precioFinalTV();
    }
}
