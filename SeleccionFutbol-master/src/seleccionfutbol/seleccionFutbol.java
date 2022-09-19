/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleccionfutbol;

import java.util.ArrayList;

/**
 *
 * @author JuanS
 */
public class seleccionFutbol {
    private String idFederacion;
    private Entrenador tecnico;
    private Masajista masajista;
    private ArrayList<Futbolista> jugadores = new ArrayList<Futbolista>();
 
    public seleccionFutbol(){}
    
    public seleccionFutbol(String idFederacion, Entrenador tecnico, Masajista masajista){
        this.idFederacion = idFederacion;
        this.tecnico = tecnico;
        this.masajista = masajista;
    }
    
    public String getIdFederacion(){
        return this.idFederacion;
    }
    
    public Entrenador getTecnico(){
        return this.tecnico;
    }
    
    public Masajista getMasajista(){
        return this.masajista;
    }
    
    public void setIdFederacion(String idFederacion){
        this.idFederacion = idFederacion;
    }
    
    public void setTecnico(Entrenador tecnico){
        this.tecnico = tecnico;
    }
    
    public void setMasajista(Masajista masajista){
        this.masajista = masajista;
    }
    
    public void agregarJugador(Futbolista jugador){
        jugadores.add(jugador);
    }
    
    public void generarFormacion(String formacion){
        int []pos = new int[3];
        int cont=0;
        formacion = formacion.replace(",", "");
        for(int i = 0; i<3;i++){
            pos[i]= Integer.parseInt(String.valueOf(formacion.charAt(i)));
            
        }
        for(Futbolista jugador:jugadores){
            if(jugador.getPosicion().equals("df")){
                System.out.println(jugador.getDorsal() + " defensa");
            }else if(jugador.getPosicion().equals("md")){
                System.out.println(jugador.getDorsal() + " medio");
            }else if(jugador.getPosicion().equals("dd")){
                System.out.println(jugador.getDorsal()+" delantero");
            }
        }

    }
}
