/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

/**
 *
 * @author JuanS
 */
public interface InterfazView {
    void setControlador(ConvertidorController c);
    void arranca();
    double getA();
    double getB();
    void escribeResultado(String s);
    
    static final String SUMA = "Suma";
    static final String RESTA = "Resta";
    static final String MULTI = "Multiplicación";
    static final String DIVI = "División";
    static final String POTEN = "Potenciación";
    static final String RADI = "Radicación";
}
