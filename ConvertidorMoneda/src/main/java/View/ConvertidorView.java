/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ConvertidorController;
import java.awt.event.ActionEvent;
import java.util.Scanner;

public class ConvertidorView implements InterfazView{
    private ConvertidorController controlador;
    //private BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private Scanner sc = new Scanner(System.in);

    public ConvertidorView() {
    }
    
    private int leeOpción() {
        String s = null;
        try {
            s = sc.nextLine();
            return Integer.parseInt(s);
        } catch (Exception e) {
            operaciónIncorrecta();
            return 0;
        }
    }

    private double leeCantidad() {
        String s = null;
        try {
            System.out.println("Ingrese cantidad: ");
            s = sc.nextLine();
            return Double.parseDouble(s);
        } catch (Exception e) {
            System.out.println("Error en formato del número, tiene que ser 99.99: ");
            return leeCantidad();
        }
    }
    
    private void solicitaOperación() {
        System.out.println("Indica la operación que quiere realizar:");
        System.out.println("1: convertir dolares a pesos");
        System.out.println("2: convertir pesos a dolaress");
        System.out.println("0: salir");
    }

    private void procesaNuevaOperacion() {
        int operacion;
        solicitaOperación();
        operacion = leeOpción();
        if (operacion == 0) {
            System.out.println("Adiós.");
            System.exit(0);
        }
        if (operacion == 1) {
            ActionEvent act = new ActionEvent(this, operacion, APESOS);
            controlador.actionPerformed(act);
        }
        if (operacion == 2) {
            controlador.actionPerformed(new ActionEvent(this, operacion, ADOLAR));
        }
        operaciónIncorrecta();
    }

    private void operaciónIncorrecta() {
        System.out.print("Operación incorrecta. ");
        procesaNuevaOperacion();
    }

    @Override
    public void setControlador(ConvertidorController c) {
        this.controlador = c;
    }

    @Override
    public void arranca() {
        procesaNuevaOperacion();
    }

    @Override
    public double getCantidad() {
        System.out.print("Cantidad a convertir (formato 99.99): ");
        return leeCantidad();    
    }

    @Override
    public void escribeCambio(String s) {
        // escribe el resultado:
        System.out.println(s);
        // y vuelve a solicitar al usuario una operación:
        procesaNuevaOperacion();
    }

}
