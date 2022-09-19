/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ConvertidorModel;
import View.ConvertidorView;
import View.InterfazView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConvertidorController implements ActionListener {

    private ConvertidorModel modelo;
    private InterfazView vista;
    private Double cantidad;

    public ConvertidorController(ConvertidorModel modelo, InterfazView vista) {
        this.modelo = modelo;
        this.vista = vista;
    }
    public void prueba(){
        System.out.println("Entro a controller");
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) {
        System.out.println("Entro controller");
        double cantidad = vista.getCantidad();
        if (evento.getActionCommand().equals(InterfazView.APESOS)) {
            modelo.setCantidad(cantidad);
            modelo.setMoneda(3900.00);
            modelo.convetirDolarAPeso();
            vista.escribeCambio(cantidad + " dolares son: "
            + modelo.getResultado() + " pesos");
        }
        else if (evento.getActionCommand().equals(InterfazView.ADOLAR)) {
            modelo.setCantidad(cantidad);
            modelo.setMoneda(0.00025);
            modelo.convetirDolarAPeso();
            vista.escribeCambio(cantidad + " pesos son: "
            + modelo.getResultado() + " dolares");
        }
        else
        vista.escribeCambio("ERROR");
    }

}
