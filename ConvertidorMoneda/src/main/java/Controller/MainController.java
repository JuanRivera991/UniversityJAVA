/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ConvertidorModel;
import View.ConvertidorView;
import View.ConvertidorViewSwing;

/**
 *
 * @author sebas
 */
public class MainController {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConvertidorModel modelo = new ConvertidorModel();
       //ConvertidorView vista = new ConvertidorView();
        ConvertidorViewSwing vista = new ConvertidorViewSwing();
        ConvertidorController controlador = new ConvertidorController(modelo, vista);
        vista.setControlador(controlador);
        vista.arranca();
    }
    
}
