/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Modelo.Logica;
import Vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import avion.Avion;
import static javafx.application.Platform.exit;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.util.Calendar;
import java.util.Date;
/**
 *
 * @author DAT
 */

/*
Daniel Alarcón 1088333702 
Johanna Torres 1087559178
*/
public class Control implements ActionListener{
    
    Logica Process;
    MainUI UserInterface;
    AirPlaneFillStatus StatusUI;
    FormAddPassenger AddUI;
    FormFindPassenger FindUI;
    FormRemPassenger RemUI;
    FormSetReserva setUI;
    FormViewSeatPassengerInfo InfoUI;
    Promo1 Promo1_UI;
    Promo2 Promo2_UI;
    
    public Control(Logica Process, MainUI UserInterface, AirPlaneFillStatus StatusUI, FormAddPassenger AddUI, FormFindPassenger FindUI, FormRemPassenger RemUI, FormSetReserva setUI, FormViewSeatPassengerInfo InfoUI, Promo1 Promo1_UI, Promo2 Promo2_UI){
    
        this.Process = Process ;
        this.UserInterface = UserInterface ;
        this.AddUI = AddUI ;
        this.FindUI = FindUI ;
        this.RemUI = RemUI ;
        this.setUI = setUI ;
        this.InfoUI = InfoUI;
        this.Promo1_UI = Promo1_UI;
        this.Promo2_UI = Promo2_UI;
        
        //Main user interface
        this.UserInterface.addPassenger.addActionListener(this);
        this.UserInterface.findPassenger.addActionListener(this);
        this.UserInterface.remPassenger.addActionListener(this);
        this.UserInterface.passStatus.addActionListener(this);
        this.UserInterface.promo1.addActionListener(this);
        this.UserInterface.promo2.addActionListener(this);
        //Dialogs user interface
        this.AddUI.doAddPassenger.addActionListener(this);
        this.FindUI.doFindPassenger.addActionListener(this);
        this.InfoUI.InfoUIClose.addActionListener(this);
        this.RemUI.doUnsetReserva.addActionListener(this);
        this.Promo1_UI.doApplyPromo1.addActionListener(this);
        this.Promo2_UI.doApplyPromo2.addActionListener(this);
        //Buttons of seats 
        this.UserInterface.seat1.addActionListener(this);
        this.UserInterface.seat2.addActionListener(this);
        this.UserInterface.seat3.addActionListener(this);
        this.UserInterface.seat4.addActionListener(this);
        this.UserInterface.seat5.addActionListener(this);
        this.UserInterface.seat6.addActionListener(this);
        this.UserInterface.seat7.addActionListener(this);
        this.UserInterface.seat8.addActionListener(this);
        this.UserInterface.seat9.addActionListener(this);
        this.UserInterface.seat10.addActionListener(this);
        this.UserInterface.seat11.addActionListener(this);
        this.UserInterface.seat12.addActionListener(this);
        this.UserInterface.seat13.addActionListener(this);
        this.UserInterface.seat14.addActionListener(this);
        this.UserInterface.seat15.addActionListener(this);
        this.UserInterface.seat16.addActionListener(this);
        this.UserInterface.seat17.addActionListener(this);
        this.UserInterface.seat18.addActionListener(this);
        this.UserInterface.seat19.addActionListener(this);
        this.UserInterface.seat20.addActionListener(this);
        this.UserInterface.seat21.addActionListener(this);
        this.UserInterface.seat22.addActionListener(this);
        this.UserInterface.seat23.addActionListener(this);
        this.UserInterface.seat24.addActionListener(this);
        this.UserInterface.seat25.addActionListener(this);
        this.UserInterface.seat26.addActionListener(this);
        this.UserInterface.seat27.addActionListener(this);
        this.UserInterface.seat28.addActionListener(this);
        this.UserInterface.seat29.addActionListener(this);
        this.UserInterface.seat30.addActionListener(this);
        this.UserInterface.seat31.addActionListener(this);
        this.UserInterface.seat32.addActionListener(this);
        this.UserInterface.seat33.addActionListener(this);
        this.UserInterface.seat34.addActionListener(this);
        this.UserInterface.seat35.addActionListener(this);
        this.UserInterface.seat36.addActionListener(this);
        this.UserInterface.seat37.addActionListener(this);
        this.UserInterface.seat38.addActionListener(this);
        this.UserInterface.seat39.addActionListener(this);
        this.UserInterface.seat40.addActionListener(this);
        this.UserInterface.seat41.addActionListener(this);
        this.UserInterface.seat42.addActionListener(this);
        this.UserInterface.seat43.addActionListener(this);
        this.UserInterface.seat44.addActionListener(this);
        this.UserInterface.seat45.addActionListener(this);
        this.UserInterface.seat46.addActionListener(this);
        this.UserInterface.seat47.addActionListener(this);
        this.UserInterface.seat48.addActionListener(this);
        this.UserInterface.seat49.addActionListener(this);
        this.UserInterface.seat50.addActionListener(this);
        
        
    }
    //Iniciar todo esto
    public void iniciar(){
    
        UserInterface.setLocationRelativeTo(null);
        UserInterface.setTitle("Reserva de tiquetes");
    }
    
    
    //Cambiar los colores de los asientos
    public void setColorSeat(int seat, boolean status){
    
       switch(seat){
           case 1:
               if(status==true){
                   UserInterface.seat1.setBackground(Color.red);
               }
               else{
                   UserInterface.seat1.setBackground(new JButton().getBackground());
               }
           break;
               
           case 2:
               if(status==true){
                   UserInterface.seat2.setBackground(Color.red);
               }
               else{
                   UserInterface.seat2.setBackground(new JButton().getBackground());
               }
           break;
           
           case 3:
                if(status==true){
                    UserInterface.seat3.setBackground(Color.red);
                }
                else{
                    UserInterface.seat3.setBackground(new JButton().getBackground());
                }
             break;  


             case 4:
                if(status==true){
                    UserInterface.seat4.setBackground(Color.red);
                }
                else{
                    UserInterface.seat4.setBackground(new JButton().getBackground());
                }
             break;


             case 5:
                if(status==true){
                    UserInterface.seat5.setBackground(Color.red);
                }
                else{
                    UserInterface.seat5.setBackground(new JButton().getBackground());
                }
             break;


             case 6:
                if(status==true){
                    UserInterface.seat6.setBackground(Color.red);
                }
                else{
                    UserInterface.seat6.setBackground(new JButton().getBackground());
                }
             break;


             case 7:
                if(status==true){
                    UserInterface.seat7.setBackground(Color.red);
                }
                else{
                    UserInterface.seat7.setBackground(new JButton().getBackground());
                }
             break;


             case 8:
                if(status==true){
                    UserInterface.seat8.setBackground(Color.red);
                }
                else{
                    UserInterface.seat8.setBackground(new JButton().getBackground());
                }
             break;


             case 9:
                if(status==true){
                    UserInterface.seat9.setBackground(Color.red);
                }
                else{
                    UserInterface.seat9.setBackground(new JButton().getBackground());
                }
             break;
            
             case 10:
                if(status==true){
                    UserInterface.seat10.setBackground(Color.red);
                }
                else{
                    UserInterface.seat10.setBackground(new JButton().getBackground());
                }
             break;

             case 11:
                if(status==true){
                    UserInterface.seat11.setBackground(Color.red);
                }
                else{
                    UserInterface.seat11.setBackground(new JButton().getBackground());
                }
             break;

             case 12:
                if(status==true){
                    UserInterface.seat12.setBackground(Color.red);
                }
                else{
                    UserInterface.seat12.setBackground(new JButton().getBackground());
                }
             break;

             case 13:
                if(status==true){
                    UserInterface.seat13.setBackground(Color.red);
                }
                else{
                    UserInterface.seat13.setBackground(new JButton().getBackground());
                }
             break;

             case 14:
                if(status==true){
                    UserInterface.seat14.setBackground(Color.red);
                }
                else{
                    UserInterface.seat14.setBackground(new JButton().getBackground());
                }
             break;

             case 15:
                if(status==true){
                    UserInterface.seat15.setBackground(Color.red);
                }
                else{
                    UserInterface.seat15.setBackground(new JButton().getBackground());
                }
             break;

             case 16:
                if(status==true){
                    UserInterface.seat16.setBackground(Color.red);
                }
                else{
                    UserInterface.seat16.setBackground(new JButton().getBackground());
                }
             break;

             case 17:
                if(status==true){
                    UserInterface.seat17.setBackground(Color.red);
                }
                else{
                    UserInterface.seat17.setBackground(new JButton().getBackground());
                }
             break;

             case 18:
                if(status==true){
                    UserInterface.seat18.setBackground(Color.red);
                }
                else{
                    UserInterface.seat18.setBackground(new JButton().getBackground());
                }
             break;

             case 19:
                if(status==true){
                    UserInterface.seat19.setBackground(Color.red);
                }
                else{
                    UserInterface.seat19.setBackground(new JButton().getBackground());
                }
             break;
             
             case 20:
                if(status==true){
                    UserInterface.seat20.setBackground(Color.red);
                }
                else{
                    UserInterface.seat20.setBackground(new JButton().getBackground());
                }
             break;

             case 21:
                if(status==true){
                    UserInterface.seat21.setBackground(Color.red);
                }
                else{
                    UserInterface.seat21.setBackground(new JButton().getBackground());
                }
             break;

             case 22:
                if(status==true){
                    UserInterface.seat22.setBackground(Color.red);
                }
                else{
                    UserInterface.seat22.setBackground(new JButton().getBackground());
                }
             break;

             case 23:
                if(status==true){
                    UserInterface.seat23.setBackground(Color.red);
                }
                else{
                    UserInterface.seat23.setBackground(new JButton().getBackground());
                }
             break;

             case 24:
                if(status==true){
                    UserInterface.seat24.setBackground(Color.red);
                }
                else{
                    UserInterface.seat24.setBackground(new JButton().getBackground());
                }
             break;

             case 25:
                if(status==true){
                    UserInterface.seat25.setBackground(Color.red);
                }
                else{
                    UserInterface.seat25.setBackground(new JButton().getBackground());
                }
             break;

             case 26:
                if(status==true){
                    UserInterface.seat26.setBackground(Color.red);
                }
                else{
                    UserInterface.seat26.setBackground(new JButton().getBackground());
                }
             break;

             case 27:
                if(status==true){
                    UserInterface.seat27.setBackground(Color.red);
                }
                else{
                    UserInterface.seat27.setBackground(new JButton().getBackground());
                }
             break;

             case 28:
                if(status==true){
                    UserInterface.seat28.setBackground(Color.red);
                }
                else{
                    UserInterface.seat28.setBackground(new JButton().getBackground());
                }
             break;

             case 29:
                if(status==true){
                    UserInterface.seat29.setBackground(Color.red);
                }
                else{
                    UserInterface.seat29.setBackground(new JButton().getBackground());
                }
             break;
             
             case 30:
                if(status==true){
                    UserInterface.seat30.setBackground(Color.red);
                }
                else{
                    UserInterface.seat30.setBackground(new JButton().getBackground());
                }
             break;

             case 31:
                if(status==true){
                    UserInterface.seat31.setBackground(Color.red);
                }
                else{
                    UserInterface.seat31.setBackground(new JButton().getBackground());
                }
             break;

             case 32:
                if(status==true){
                    UserInterface.seat32.setBackground(Color.red);
                }
                else{
                    UserInterface.seat32.setBackground(new JButton().getBackground());
                }
             break;

             case 33:
                if(status==true){
                    UserInterface.seat33.setBackground(Color.red);
                }
                else{
                    UserInterface.seat33.setBackground(new JButton().getBackground());
                }
             break;

             case 34:
                if(status==true){
                    UserInterface.seat34.setBackground(Color.red);
                }
                else{
                    UserInterface.seat34.setBackground(new JButton().getBackground());
                }
             break;

             case 35:
                if(status==true){
                    UserInterface.seat35.setBackground(Color.red);
                }
                else{
                    UserInterface.seat35.setBackground(new JButton().getBackground());
                }
             break;

             case 36:
                if(status==true){
                    UserInterface.seat36.setBackground(Color.red);
                }
                else{
                    UserInterface.seat36.setBackground(new JButton().getBackground());
                }
             break;

             case 37:
                if(status==true){
                    UserInterface.seat37.setBackground(Color.red);
                }
                else{
                    UserInterface.seat37.setBackground(new JButton().getBackground());
                }
             break;

             case 38:
                if(status==true){
                    UserInterface.seat38.setBackground(Color.red);
                }
                else{
                    UserInterface.seat38.setBackground(new JButton().getBackground());
                }
             break;

             case 39:
                if(status==true){
                    UserInterface.seat39.setBackground(Color.red);
                }
                else{
                    UserInterface.seat39.setBackground(new JButton().getBackground());
                }
             break;
             
             case 40:
                if(status==true){
                    UserInterface.seat40.setBackground(Color.red);
                }
                else{
                    UserInterface.seat40.setBackground(new JButton().getBackground());
                }
             break;

             case 41:
                if(status==true){
                    UserInterface.seat41.setBackground(Color.red);
                }
                else{
                    UserInterface.seat41.setBackground(new JButton().getBackground());
                }
             break;

             case 42:
                if(status==true){
                    UserInterface.seat42.setBackground(Color.red);
                }
                else{
                    UserInterface.seat42.setBackground(new JButton().getBackground());
                }
             break;

             case 43:
                if(status==true){
                    UserInterface.seat43.setBackground(Color.red);
                }
                else{
                    UserInterface.seat43.setBackground(new JButton().getBackground());
                }
             break;

             case 44:
                if(status==true){
                    UserInterface.seat44.setBackground(Color.red);
                }
                else{
                    UserInterface.seat44.setBackground(new JButton().getBackground());
                }
             break;

             case 45:
                if(status==true){
                    UserInterface.seat45.setBackground(Color.red);
                }
                else{
                    UserInterface.seat45.setBackground(new JButton().getBackground());
                }
             break;

             case 46:
                if(status==true){
                    UserInterface.seat46.setBackground(Color.red);
                }
                else{
                    UserInterface.seat46.setBackground(new JButton().getBackground());
                }
             break;

             case 47:
                if(status==true){
                    UserInterface.seat47.setBackground(Color.red);
                }
                else{
                    UserInterface.seat47.setBackground(new JButton().getBackground());
                }
             break;

             case 48:
                if(status==true){
                    UserInterface.seat48.setBackground(Color.red);
                }
                else{
                    UserInterface.seat48.setBackground(new JButton().getBackground());
                }
             break;

             case 49:
                if(status==true){
                    UserInterface.seat49.setBackground(Color.red);
                }
                else{
                    UserInterface.seat49.setBackground(new JButton().getBackground());
                }
             break;
             
              case 50:
                if(status==true){
                    UserInterface.seat50.setBackground(Color.red);
                }
                else{
                    UserInterface.seat50.setBackground(new JButton().getBackground());
                }
             break;
             



           
       }    
    }
        
    //Obtener informacion del pasajero segun su asiento
    public void getPassengerInfo(int seat, FormViewSeatPassengerInfo asiento){
    
        String Id, Name, seatLocation, ticketPrice, OutDate, ArrDate, Dest;
                    
                    String[][] PackData = Process.getPassengersList();
                    
                    if((PackData[seat-1][0] == null) && PackData[seat-1][1] == null){
                        //Asiento vacío
                        Id = "Información no disponible. - Asiento libre";
                        Name = "Información no disponible. - Asiento libre";
                        seatLocation = Process.DeterminarCabina(seat);
                        ticketPrice = Process.PrecioTiquete(seat);
                        OutDate = Process.getFechaSalida();
                        ArrDate = Process.getFechaLlegada();
                        Dest = Process.getDestino();
                        asiento.NamePassenger.setText(Name);
                        asiento.IdPassenger.setText(Id);
                        asiento.seatLocationPassenger.setText(seatLocation);
                        asiento.ticketPricePassenger.setText(ticketPrice);
                        asiento.OutDatePassenger.setText(OutDate);
                        asiento.ArriveDatePassenger.setText(ArrDate);
                        asiento.destinationPassenger.setText(Dest);
                        
                    }
                    else{
                        //Llenar los datos porque si hay datos
                        asiento.NamePassenger.setText(String.valueOf(PackData[seat-1][0]));
                        asiento.IdPassenger.setText(String.valueOf(PackData[seat-1][1]));
                        asiento.seatLocationPassenger.setText(String.valueOf(PackData[seat-1][2]));
                        asiento.ticketPricePassenger.setText(String.valueOf(PackData[seat-1][3]));
                        asiento.OutDatePassenger.setText(Process.getFechaSalida());
                        asiento.ArriveDatePassenger.setText(Process.getFechaLlegada());
                        asiento.destinationPassenger.setText(Process.getDestino());
                    }
                    
                    
                    
    
    }
    
    //Ejecutores de acciones
    public void InfoSeat(String nameButton){
        int seatSelected = 0 ;
        //Use default because we know all our methods and create one by one for the seats its so silly
                    //Crear objeto vista adicion
                    FormViewSeatPassengerInfo asiento = new FormViewSeatPassengerInfo();
                    asiento.setLocationRelativeTo(UserInterface);
                    seatSelected = Integer.parseInt(nameButton);
                    getPassengerInfo(seatSelected, asiento);
                    asiento.setTitle("Información de asiento/reserva");
                    asiento.setVisible(true);
    }
    public void addPassenger(){
        
        //Crear objeto vista adicion
                    FormAddPassenger entrada = new FormAddPassenger();
                    entrada.setLocationRelativeTo(UserInterface);
                    //Si ya existia pues apuntar el actual al nuevo
                    if(this.AddUI!=null){
                        this.AddUI.doAddPassenger.removeActionListener(this);
                    }
                    //Ahora ejecutar
                    this.AddUI=  entrada;
                    this.AddUI.doAddPassenger.addActionListener(this);
                    //Hacer visible el formulario
                    entrada.setTitle("Realizar reserva");
                    entrada.setVisible(true);
    
    }
    public void doAddPassenger(){
                    int SeatSelected = Integer.parseInt(AddUI.SeatPassenger.getText());
                    Process.setName(AddUI.PassengerName.getText());
                    Process.setId(AddUI.PassengerId.getText());
                    Process.setSeat(Integer.parseInt(AddUI.SeatPassenger.getText()));
                    setColorSeat(SeatSelected,true);
                    Process.addPassenger(SeatSelected);
                    AddUI.setVisible(false);
        
    }
    public void remPassenger(){
        
        //Crear objeto vista remocion
                    FormRemPassenger cancelar = new FormRemPassenger();
                    cancelar.setLocationRelativeTo(UserInterface);
                    //Si ya existia pues apuntar el actual al nuevo
                    if(this.RemUI!=null){
                        this.RemUI.doUnsetReserva.removeActionListener(this);
                    }
                    //Ahora ejecutar
                    this.RemUI=  cancelar;
                    this.RemUI.doUnsetReserva.addActionListener(this);
                    //Hacer visible el formulario
                    cancelar.setTitle("Cancelar reserva");
                    cancelar.setVisible(true);
        
    }
    public void doUnsetReserva(){
        int SeatToRem = Integer.parseInt(RemUI.seatToRem.getText());
                    Process.remPassenger(SeatToRem);
                    setColorSeat(SeatToRem,false);
                    RemUI.setVisible(false);
    }
    public void findPassenger(){
        //Crear objeto vista remocion
                    FormFindPassenger buscar = new FormFindPassenger();
                    buscar.setLocationRelativeTo(UserInterface);
                    //Si ya existia pues apuntar el actual al nuevo
                    if(this.FindUI!=null){
                        this.FindUI.doFindPassenger.removeActionListener(this);
                    }
                    //Ahora ejecutar
                    this.FindUI=  buscar;
                    this.FindUI.doFindPassenger.addActionListener(this);
                    //Hacer visible el formulario
                    buscar.setTitle("Buscar reserva de cliente");
                    buscar.setVisible(true);
    }
    public void passStatus(){
         Process.getTotalSeats();
                    AirPlaneFillStatus estado = new AirPlaneFillStatus();
                    estado.setTitle("Estado de reservas del avión");
                    estado.setLocationRelativeTo(UserInterface);
                    estado.setVisible(true);
                    
                    estado.State_BusySeats.setText(String.valueOf(Process.getBusySeats()));
                    int count = Process.getTotalSeats()-Process.getBusySeats();
                    estado.State_EmptySeats.setText(String.valueOf(count));
                    estado.State_Percentage.setText(String.valueOf(Process.Porcentaje(Process.getBusySeats()))+"%");
                    //
    }
    public void doFindPassenger(){
        //Find id in passengers list
        String Id=FindUI.PassengerId.getText();
        boolean Exists = Process.findExistence(Id);
        if(Exists==true){
            FindUI.NoFinded.setText("");
            InfoSeat(Process.getSeatFind_Auxiliar());
        }else{
            FindUI.NoFinded.setText("Pasajero con esa identificación no existe.");
        }
        
    }
    public void Promo1(){
    
        Calendar calendario = Calendar.getInstance();
        Process.setHora(calendario.get(Calendar.HOUR_OF_DAY));
        
        //Crear objeto vista adicion
                    Promo1 promo1 = new Promo1();
                    promo1.setLocationRelativeTo(UserInterface);
                    //Si ya existia pues apuntar el actual al nuevo
                    if(this.Promo1_UI!=null){
                        this.Promo1_UI.doApplyPromo1.removeActionListener(this);
                    }
                    //Ahora ejecutar
                    this.Promo1_UI=  promo1;
                    this.Promo1_UI.doApplyPromo1.addActionListener(this);
                    if((Process.getHora()>=8) && (Process.getHora()<=10)){
                        //Esta en la hora promoción
                    }else{
                        Promo1_UI.availableLabel.setText("Promoción no aplicable por el momento.");
                        Promo1_UI.doApplyPromo1.setEnabled(false);
                    }
                    //Hacer visible el formulario
                    promo1.setTitle("Promoción 1");
                    promo1.setVisible(true);
    }
    public void Promo2(){
    
        Calendar calendario = Calendar.getInstance();
        Process.setHora(calendario.get(Calendar.HOUR_OF_DAY));
        
        //Crear objeto vista adicion
                    Promo2 promo2 = new Promo2();
                    promo2.setLocationRelativeTo(UserInterface);
                    //Si ya existia pues apuntar el actual al nuevo
                    if(this.Promo2_UI!=null){
                        this.Promo2_UI.doApplyPromo2.removeActionListener(this);
                    }
                    //Ahora ejecutar
                    this.Promo2_UI =  promo2;
                    this.Promo2_UI.doApplyPromo2.addActionListener(this);
                    if((Process.getHora()>=19) && (Process.getHora()<=23)){
                        //Esta en la hora promoción
                    }else{
                        Promo2_UI.availableLabel.setText("Promoción no aplicable por el momento.");
                        Promo2_UI.doApplyPromo2.setEnabled(false);
                    }
                    //Hacer visible el formulario
                    promo2.setTitle("Promoción 2");
                    promo2.setVisible(true);
    }
    public void doPromo1(){
        int SeatSelected = Integer.parseInt(Promo1_UI.seatSelectedPassengerProm.getText());
        Process.setName(Promo1_UI.PassengerName.getText());
        Process.setId(Promo1_UI.PassengerId.getText());
        Process.setSeat(Integer.parseInt(Promo1_UI.seatSelectedPassengerProm.getText()));
        setColorSeat(SeatSelected,true);
        Process.addPassengerProm(SeatSelected, 1);
        Promo1_UI.setVisible(false);
    }
    public void doPromo2(){
        int SeatSelected = Integer.parseInt(Promo2_UI.seatSelectedPassengerProm.getText());
        Process.setName(Promo2_UI.PassengerName.getText());
        Process.setId(Promo2_UI.PassengerId.getText());
        Process.setSeat(Integer.parseInt(Promo2_UI.seatSelectedPassengerProm.getText()));
        setColorSeat(SeatSelected,true);
        Process.addPassengerProm(SeatSelected, 2);
        Promo2_UI.setVisible(false);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        JButton actionSelected = (JButton) ae.getSource();
        String nameButton = actionSelected.getName();
        
            switch(nameButton){
                 
                default:
                    InfoSeat(nameButton);
                break;
                //FinishInfo
                
                case "addPassenger":
                    addPassenger();
                break;

                case "doAddPassenger":
                    doAddPassenger();
                break;
                //Finish ADD
               

                case "remPassenger":
                    remPassenger();
                break;
                
                 case "doUnsetReserva":
                    doUnsetReserva();
                break;
                //Finish REM

                case "findPassenger":
                    findPassenger();
                break;
                
                case "doFindPassenger":
                    doFindPassenger();
                break;
                //Finish FIND

                case "passStatus":
                    passStatus();
                break;
                //Finish STATUS

                case "promo1":
                    Promo1();
                break;
                
                case "doApplyPromo1":
                    doPromo1();
                break;

                case "promo2":
                    Promo2();
                break;
                
                case "doApplyPromo2":
                    doPromo2();
                break;

            }

    }

}
