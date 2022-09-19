/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Electrodomesticos;

import java.util.ArrayList;

/**
 *
 * @author JuanS
 */
public class Main {

    public static ArrayList<electrodomesticos> electrodomesticos = new ArrayList<electrodomesticos>();
    
    public static void main(String[] args) {
        television tv1 = new television();
        television tv2 = new television();
        lavadora lv1 = new lavadora();
        lavadora lv2 = new lavadora();
        
        lv1.setConsumo("A");
        lv2.setConsumo("E");
        tv1.setConsumo("C");
        tv2.setConsumo("D");
        
        electrodomesticos.add(lv1);
        electrodomesticos.add(lv2);
        electrodomesticos.add(tv1);
        electrodomesticos.add(tv2);
        
        for(electrodomesticos electrodomestico : electrodomesticos){
            System.out.println(electrodomestico.toString());
        }
    }
}
