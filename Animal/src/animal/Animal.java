/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

import animal.entidades.Caballo;
import animal.entidades.Gato;
import animal.entidades.Perro;
import java.util.ArrayList;

/**
 *
 * @author MegaTecnologia
 */
public class Animal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declaración del objeto PERRO
        Perro p = new Perro("Juan", "Carne", 5, "Caniche");
        
        System.out.println("");
        System.out.println(p);
        System.out.println("");
        
        p.comer(100);
    
        //Declaración del objeto GATO
        Gato g = new Gato("Michifus", "Galletas", 10, "Siamés");
        
        System.out.println("");
        System.out.println(g);
        System.out.println("");
        
        g.comer(50);
        
        //Declaración del objeto CABALLO
        System.out.println("");
        Caballo c = new Caballo("Light", "Pasto", 2, "Fino");
        
        System.out.println(c);
        System.out.println("");
        
        c.comer(500);
        
        System.out.println("");
        
    }
    
}
