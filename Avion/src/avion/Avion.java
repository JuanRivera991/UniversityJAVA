/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avion;


/*
Daniel Alarcón 1088333702 
Johanna Torres 1087559178
*/
import Vista.*;
import Modelo.Logica;
import Controlador.Control;
/**
 *
 * @author DAT
 */
public class Avion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Passenger List 
        //Array [][] likes PassengerNumber][PassengersNumber_x.data like 0 = name 1 = id 2 = seat 3 = ticket price
        //String[][] PassengersList = new String[49][3];
        MainUI UserInterface = new MainUI();
        Logica Process = new Logica();
        AirPlaneFillStatus StatusUI = new AirPlaneFillStatus();
        FormAddPassenger AddUI = new FormAddPassenger();
        FormFindPassenger FindUI = new FormFindPassenger();
        FormRemPassenger RemUI = new FormRemPassenger();
        FormSetReserva setUI = new FormSetReserva();
        FormViewSeatPassengerInfo InfoUI = new FormViewSeatPassengerInfo();
        Promo1 Promo1_UI = new Promo1();
        Promo2 Promo2_UI = new Promo2();
        Control Ctr = new Control(Process, UserInterface, StatusUI, AddUI, FindUI, RemUI, setUI, InfoUI, Promo1_UI, Promo2_UI);
        
        
       Ctr.iniciar();
        UserInterface.setVisible(true);
        
        
        
    }
    
}
