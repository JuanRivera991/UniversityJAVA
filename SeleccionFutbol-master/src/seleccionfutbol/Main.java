/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleccionfutbol;

import java.util.ArrayList;

public class Main {
    
    public static ArrayList<PersonaFutbol> integrantes = new ArrayList<PersonaFutbol>();

    public static void main(String[] args) {
        // TODO code application logic here
        
        Entrenador delBosque = new Entrenador(1,"acd123",001, "Vicente", "Del Bosque", 60);
        Futbolista iniesta = new Futbolista(8,"MedioCampo","derecho",002, "Andres", "Iniesta", 29);
        Masajista raulMartinez = new Masajista("Terapeuta",3,003,"Raúl", "Martinez",41);
        Futbolista james = new Futbolista(10, "MedioCampo", "Izquierdo",003, "James", "Rodriguez", 27);

        integrantes.add(delBosque);
        integrantes.add(iniesta);
        integrantes.add(raulMartinez);
        integrantes.add(james);

        // CONCENTRACION
        System.out.println("Todos los integrantes comienzan una concentracion. (Todos ejecutan el mismo método)");
        for (PersonaFutbol integrante : integrantes) {
                System.out.print(integrante.getNombre()+" "+integrante.getApellidos()+" -> ");
                integrante.concentrarse();
        }
        
        // VIAJE
        System.out.println("nTodos los integrantes viajan para jugar un partido. (Todos ejecutan el mismo método)");
        for (PersonaFutbol integrante : integrantes) {
                System.out.print(integrante.getNombre()+" "+integrante.getApellidos()+" -> ");
                integrante.viajar();
        }
        //PARTIDO DE FUTBOL
        System.out.println("Partido de Fútbol: Solamente el entrenador y el futbolista tiene metodos para el partido de fútbol:");
        System.out.print(delBosque.getNombre()+" "+delBosque.getApellidos()+" -> ");
        delBosque.dirigirPartido();
        System.out.print(iniesta.getNombre()+" "+iniesta.getApellidos()+" -> ");
        iniesta.jugarPartido();
        
        seleccionFutbol f = new seleccionFutbol();
        
        f.generarFormacion("4,3,3");
        
        
                
              
                
    }
    
}
