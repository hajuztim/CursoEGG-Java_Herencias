/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electrodomésticos;

import electrodomésticos.entidades.Electrodoméstico;
import electrodomésticos.entidades.Lavadora;
import electrodomésticos.entidades.Televisor;
import java.util.ArrayList;

/**
 *
 * @author MegaTecnologia
 */
public class Electrodomésticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Electrodoméstico> electrodomestico = new ArrayList();
        double sumatv = 0.0;
        double sumalv = 0.0;
        
        Lavadora a1 = new Lavadora();
        Televisor a2 = new Televisor();
        
        int num=0;
        
        //Métodos de la lavadora
        
        System.out.println("Lavadora:");
        System.out.println("");
        
        do {
            
            
            a1.crearLavadora();
            a1.precioFinalLavadora();
            
            
            electrodomestico.add(a1);
            num++;
            
        } while (num <= 1);
            
            
        
        
        System.out.println("");
        
        // Métodos del televisor
        
        System.out.println("Televisor:");
        System.out.println("");
        num=0;
        
        do {
            
            a2.crearTelevisor();
            a2.precioFinalTelevisor();
            
            electrodomestico.add(a2);
            num++;
            
        } while (num <= 1);
        
        
        System.out.println("");
        
        for (Electrodoméstico aux : electrodomestico) {
            if (aux instanceof Televisor) {
                sumatv = sumatv+aux.getPrecio();
            }
        }
        
        System.out.println(sumatv);
        
        for (Electrodoméstico aux : electrodomestico) {
            if (aux instanceof Lavadora) {
                sumalv = sumalv+aux.getPrecio();
            }
        }
        
        System.out.println(sumalv);
        
        System.out.println("Suma total de los electrodomésticos.");
        
        System.out.println(sumatv+sumalv);
        
        
    }
    
}
