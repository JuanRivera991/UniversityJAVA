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
public class lavadora extends electrodomesticos{
    protected int carga;
    
    public lavadora(){
        super();
        this.carga = 5;
    }
    
    public lavadora(int precio, int peso){
        this.precioBase = precio;
        this.peso = peso;
        this.carga = 5;
        this.color = "Blanco";
        this.consumo = "F";
    }
    
    public lavadora(int carga){
        super();
        this.carga = carga;
    }
    
    public int getCarga(){
        return this.carga;
    }
    
    public void setCarga(int carga){
        this.carga = carga;
    }
    
    public int precioFinalLava(){
        int precioF = this.precioFinal();
        if(this.carga > 30){
            return precioF = precioF + 50;
        }else{
            return precioF;
        }
    }
    
    @Override
    public String toString(){
         return "Precio base: " + this.precioBase + " Color: " + this.color +
                 " Consumo: " + this.consumo + " Peso: "+ this.peso + 
                 " Carga: " + this.carga + " Precio Final: " + this.precioFinalLava();
    }
}
