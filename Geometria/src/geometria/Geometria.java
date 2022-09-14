/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

import geometria.entidades.Circulo;
import geometria.entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author MegaTecnologia
 */
public class Geometria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        Circulo a1 = new Circulo();
        Rectangulo a2 = new Rectangulo();
        
        System.out.println("Ingrese los datos del círculo");
        
        System.out.println("Radio:");
        a1.setRadio(leer.nextDouble());
        
        System.out.println("Diámetro:");
        a1.setDiametro(leer.nextDouble());
        
        System.out.println("");
        System.out.println("Se calculará el área del círculo");
        System.out.println("");
        a1.area();
        System.out.println("");
        System.out.println("Se calculará el perímetro del círculo");
        a1.perimetro();
        System.out.println("");
        
        System.out.println("Ingrese los datos del rectángulo");
        
        System.out.println("Base");
        a2.setBase(leer.nextDouble());
        
        System.out.println("Altura");
        a2.setAltura(leer.nextDouble());
        
        System.out.println("");
        System.out.println("Se calculará el área del rectángulo");
        a2.area();
        System.out.println("");
        System.out.println("Se calculará el perímetro del rectángulo");
        a2.perimetro();
        System.out.println("");
        
        
        
    }
    
}
