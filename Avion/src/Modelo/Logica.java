/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import Controlador.Control;

import java.awt.Color;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import static jdk.nashorn.internal.objects.NativeString.concat;

/**
 *
 * @author DAT
 */

/*
Daniel Alarcón 1088333702 
Johanna Torres 1087559178
*/
public class Logica {
    
    
    //Vars
    Date fecha = new Date();
    Calendar calendario = Calendar.getInstance();
    int hora;
    String name, id, price, seatFind_Auxiliar;
    int seat = 0;
    int TotalSeats = 50;
    int BusySeats = 0;
    String PrecioEconomica ="2.110.000";
    String PrecioPrivada = "3.350.000";
    //Array [][] likes PassengerNumber][PassengersNumber_x.data like 0 = name 1 = id 2 = seat 3 = ticket price
    public String[][] PassengersList = new String[50][4];
    String fechaSalida = String.valueOf(fecha);
    String fechaLlegada = "Thu Dec 12 20:30:30 COT 2019";
    String Destino = "Alfonso Barajas - Madrid - España (MAD)";

    public String getPrecioEconomica() {
        return PrecioEconomica;
    }

    public void setPrecioEconomica(String PrecioEconomica) {
        this.PrecioEconomica = PrecioEconomica;
    }

    public String getPrecioPrivada() {
        return PrecioPrivada;
    }

    public void setPrecioPrivada(String PrecioPrivada) {
        this.PrecioPrivada = PrecioPrivada;
    }

    
    
    
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    
    
    public String getDestino() {
        return Destino;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(String fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }
    

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public String[][] getPassengersList() {
        return PassengersList;
    }

    public String getSeatFind_Auxiliar() {
        return seatFind_Auxiliar;
    }

    public void setSeatFind_Auxiliar(String seatFind_Auxiliar) {
        this.seatFind_Auxiliar = seatFind_Auxiliar;
    }

    public void setPassengersList(String[][] PassengersList) {
        this.PassengersList = PassengersList;
    }

    public int getTotalSeats() {
        return TotalSeats;
    }

    public void setTotalSeats(int TotalSeats) {
        this.TotalSeats = TotalSeats;
    }

    public int getBusySeats() {
        return BusySeats;
    }

    public void setBusySeats(int BusySeats) {
        this.BusySeats = BusySeats;
    }
    
    
    
    
    
    
    public String PrecioTiquete(int Seat){
    String Precio ;
        if(Seat <= 8){
        //Seat is located on Private class
            Precio = "3.350.000";
        }else{
            Precio = "2.110.000";
        }
        
        return Precio;
    }
    
    public String DeterminarCabina(int Seat){
        String Cabina ;
        if(Seat <= 8){
        //Seat is located on Private class
            Cabina = Seat + " :: Privada Primera Clase";
        }else{
            Cabina = Seat + " :: Clase Económica";
        }
        
        return Cabina;
    }
    
    public int Porcentaje(int busy){
        
        int porcentaje = busy * 2 ;
        
        return porcentaje;
    }
    
    public void addPassenger(int Seat){
        //To add passengers
        //Seat = Seat - 1;
        //Add data passenger in its respectly seat
        this.PassengersList[Seat-1][0] = this.name;
        this.PassengersList[Seat-1][1] = this.id;
        this.PassengersList[Seat-1][2] = DeterminarCabina(Seat); // String.valueOf(Seat) +DeterminarCabina(Seat); //Integer.toString(Seat+1);
        //Get ticker price
        this.PassengersList[Seat-1][3] = "$"+this.PrecioTiquete(Seat);
        //Add + 1 to busy seats        
        this.BusySeats++;
        
       //Call function to change seat's button background color, empty seat to busy seat (default to red or FF0000)
    }
    
    public void addPassengerProm(int Seat, int Prom){
        String precioPromocional ;
        if(Prom==1){
            precioPromocional = this.getPrecioEconomica();
        }else{
            precioPromocional = "1.055.000";
        }
        //To add passengers with promotion
        this.PassengersList[Seat-1][0] = this.name;
        this.PassengersList[Seat-1][1] = this.id;
        this.PassengersList[Seat-1][2] = DeterminarCabina(Seat); // String.valueOf(Seat) +DeterminarCabina(Seat); //Integer.toString(Seat+1);
        //Get ticker price
        this.PassengersList[Seat-1][3] = "$"+precioPromocional;
        //Add + 1 to busy seats
        this.BusySeats++;
        
    }
    
    public void remPassenger(int Seat){
        //To Rem passengers
        this.PassengersList[Seat-1][0] = null ;
        this.PassengersList[Seat-1][1] = null ;
        this.PassengersList[Seat-1][2] = null ;
        this.PassengersList[Seat-1][3] = null ;
        this.BusySeats--;
    }
    
   
    public boolean findExistence(String Id){
        boolean existe = false;
        for(int i=0; i<=(this.getPassengersList().length-1); i++){
            if(Id == null ? this.PassengersList[i][1] == null : Id.equals(this.PassengersList[i][1])){
                existe = true;
                //Indicate position where the passenger is located
                this.seatFind_Auxiliar = String.valueOf(i+1);
            }
        }
        return existe;
    }
    
}
