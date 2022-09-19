/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author JuanS
 */
public class ConvertidorController implements ActionListener {
    private Modelo modelo;
    private InterfazView vista;
    private double a, b;
    
    
    public ConvertidorController(Modelo modelo, InterfazView vista){
        this.modelo = modelo;
        this.vista = vista;
    }
    
    @Override
    public void actionPerformed(ActionEvent evento){
        a = vista.getA();
        b = vista.getB();
        if(evento.getActionCommand().equals(InterfazView.SUMA)){
            modelo.setA(a);
            modelo.setB(b);
            modelo.suma();
            vista.escribeResultado(a + " + " + b + " = " + modelo.getResultado());
        }
        else if(evento.getActionCommand().equals(InterfazView.RESTA)){
            modelo.setA(a);
            modelo.setB(b);
            modelo.resta();
            vista.escribeResultado(a + " - " + b + " = " + modelo.getResultado());
        }
        else if(evento.getActionCommand().equals(InterfazView.MULTI)){
            modelo.setA(a);
            modelo.setB(b);
            modelo.multiplicacion();
            vista.escribeResultado(a + " * " + b + " = " + modelo.getResultado());
        }
        else if(evento.getActionCommand().equals(InterfazView.DIVI)){
            modelo.setA(a);
            modelo.setB(b);
            modelo.division();
            vista.escribeResultado(a + " / " + b + " = " + modelo.getResultado());
        }
        else if(evento.getActionCommand().equals(InterfazView.POTEN)){
            modelo.setA(a);
            modelo.setB(b);
            modelo.potenciacion();
            vista.escribeResultado(a + " ^ " + b + " = " + modelo.getResultado());
        }
        else if(evento.getActionCommand().equals(InterfazView.RADI)){
            modelo.setA(a);
            modelo.setB(b);
            modelo.radicacion();
            vista.escribeResultado("Raiz " + b + " de " + a + " = " + modelo.getResultado());
        }
        else
            vista.escribeResultado("ERROR");
    }
}
