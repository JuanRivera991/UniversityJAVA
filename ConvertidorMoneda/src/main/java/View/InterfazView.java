/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ConvertidorController;

public interface InterfazView {
    void setControlador(ConvertidorController c);
    void arranca(); // comienza la visualización
    double getCantidad(); // cantidad a convertir
    void escribeCambio(String s); //texto con la conversión
    
    // Constantes que definen las posibles operaciones:
    static final String APESOS ="Convertir a Pesos";
    static final String ADOLAR ="Convertir a Dolares";
}
