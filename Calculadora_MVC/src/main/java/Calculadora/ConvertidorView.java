/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

import java.awt.event.ActionEvent;
import java.util.Scanner;

/**
 *
 * @author JuanS
 */
public class ConvertidorView implements InterfazView{
    private ConvertidorController controlador;
    private Scanner ent = new Scanner(System.in);
    
    public ConvertidorView(){}
    
    public void solicitaOperacion(){
        System.out.println("|-------MENU-------|");
        System.out.println("|1. Suma           |");
        System.out.println("|2. Resta          |");
        System.out.println("|3. Multiplicación |");
        System.out.println("|4. División       |");
        System.out.println("|5. Potenciación   |");
        System.out.println("|6. Radicación     |");
        System.out.println("|7. Salir          |");
        System.out.println("|------------------|");
        System.out.println("Elija una opción: ");
    }
    
    private int leeOpcion() {
        String s = null;
        try {
            s = ent.nextLine();
            return Integer.parseInt(s);
        } catch (Exception e) {
            operaciónIncorrecta();
            return 0;
        }
    }
    
    private double leeA(){
        String s = null;
        try {
            s = ent.nextLine();
            if(s.equals("Pi")){
                return Double.parseDouble("3.1416");
            }else if(s.equals("E")){
                return Double.parseDouble("2.7182");
            }
            return Double.parseDouble(s);
        } catch (Exception e) {
            System.out.println("Error en formato del número, tiene que ser 99.99: ");
            return leeA();
        }
    }
    
    private double leeB(){
        String s = null;
        try {
            s = ent.nextLine();
            if(s.equals("Pi")){
                return Double.parseDouble("3.1416");
            }else if(s.equals("E")){
                return Double.parseDouble("2.7182");
            }
            return Double.parseDouble(s);
        } catch (Exception e) {
            System.out.println("Error en formato del número, tiene que ser 99.99: ");
            return leeB();
        }
    }
    
    private void procesaNuevaOperacion(){
        int operacion;
        solicitaOperacion();
        operacion = leeOpcion();
        
        if(operacion == 1){
            controlador.actionPerformed(new ActionEvent(this, operacion, SUMA));
        }
        if(operacion == 2){
            controlador.actionPerformed(new ActionEvent(this, operacion, RESTA));
        }
        if(operacion == 3){
            controlador.actionPerformed(new ActionEvent(this, operacion, MULTI));
        }
        if(operacion == 4){
            controlador.actionPerformed(new ActionEvent(this, operacion, DIVI));
        }
        if(operacion == 5){
            controlador.actionPerformed(new ActionEvent(this, operacion, POTEN));
        }
        if(operacion == 6){
            controlador.actionPerformed(new ActionEvent(this, operacion, RADI));
        }
        if(operacion == 7){
            System.out.println("Gracias por usar el programa!!");
            System.exit(0);
        }
    }
    
    private void operaciónIncorrecta() {
        System.out.println("Operación incorrecta. ");
        procesaNuevaOperacion();
    }
    
    @Override
    public void setControlador(ConvertidorController c){
        this.controlador = c;
    }
    
    @Override
    public void arranca(){
        procesaNuevaOperacion();
    }
    
    @Override
    public double getA(){
        System.out.println("Digite un numero (formato 99.99): ");
        return leeA();
    }
    
    @Override
    public double getB(){
        System.out.println("Digite un numero (formato 99.99): ");
        return leeB();
    }
    
    @Override
    public void escribeResultado(String s){
        System.out.println(s);
        procesaNuevaOperacion();
    }
}
