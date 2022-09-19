
package Clase;

//Clase padre
abstract public class FiguraGeometrica {
    private String color;
    
    public FiguraGeometrica(String color){
        this.color = color;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
     
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
}
