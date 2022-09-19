/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

import static java.lang.Math.pow;

/**
 *
 * @author JuanS
 */
public class Modelo {
    private double resultado;
    private double a;
    private double b;
    
    public Modelo(){}

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getResultado() {
        return resultado;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }
    
    public void suma(){
        resultado = a + b;
    }
    
    public void resta(){
        resultado = a - b;
    }
    
    public void multiplicacion(){
        resultado = a * b;
    }
    
    public void division(){
        resultado = a/b;
    }
    
    public void potenciacion(){
        resultado = 1;
        for (int i = 1; i<=b; i++ ){
            resultado = resultado * a;
        }
    }
    
    public void radicacion(){
       resultado = pow((double)a, (double)1/b);
    }
}
