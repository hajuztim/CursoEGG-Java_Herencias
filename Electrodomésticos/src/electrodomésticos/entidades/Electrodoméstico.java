/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electrodomésticos.entidades;

import java.util.Scanner;

/**
 *
 * @author MegaTecnologia
 */
public class Electrodoméstico {
    
    protected double precio;
    protected String color;
    protected char consumoEnergetico;
    protected Integer peso;
    

    public Electrodoméstico() {
    }

    public Electrodoméstico(double precio, String color, char consumoEnergetico, Integer peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    
    // Métodos
    
    public void comprobarConsumoEnergetico(char consumoEnergetico) {
        
        if (consumoEnergetico == 'A' || consumoEnergetico == 'B' || consumoEnergetico == 'C'|| consumoEnergetico == 'D' || consumoEnergetico == 'E' || consumoEnergetico == 'F'){
            System.out.println("El consumo energético del electrodoméstico es: "+consumoEnergetico);
        } else {
            System.out.println("No se encontró ningún valor válido. El consumo energético del electrodoméstico se establecerá por defecto a: F");
        }
        
    }
    
    public void comprobarColor(String color) {
        
        
        if(color.equals("blanco") || color.equals("negro") || color.equals("rojo") || color.equals("azul") || color.equals("gris")){
            System.out.println("El color del electrodoméstico es: "+color);
        } else {
            System.out.println("No se encontró ningún color válido. El color del electrodoméstico se establecerá por defecto a blanco.");
        }
        
    }
    
    public void crearElectrodomestico() {
        
        Scanner leer = new Scanner(System.in);
        
        
        System.out.println("El precio base del electrodoméstico es de 1000$");
        precio = 1000;
        
        System.out.println("Ingrese el color del electrodoméstico (son admitidos los siguientes colores: blanco, negro, rojo, azul y gris.)");
        color = leer.next();
        
        comprobarColor(color);
                
        System.out.println("Ingrese el consumo energético del electrodoméstico.");
        consumoEnergetico = leer.next().charAt(0);
        
        comprobarConsumoEnergetico(consumoEnergetico);
        
    }
    
    public double precioFinal() {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Según el consumo energético y su tamaño, aumentará el valor del precio.");
        
        // Consumo energético del electrodoméstico
        
        if (consumoEnergetico == 'A') {
            precio = precio + 1000;
        }
        
        if (consumoEnergetico == 'B') {
            precio = precio + 800;
        }
        
        if (consumoEnergetico == 'C') {
            precio = precio + 600;
        }
        
        if (consumoEnergetico == 'D') {
            precio = precio + 500;
        }
        
        if (consumoEnergetico == 'E') {
            precio = precio + 300;
        }
        
        if (consumoEnergetico == 'F') {
            precio = precio + 100;
        }
        
        // Peso del electrodoméstico
        
        System.out.println("Ingrese el peso del electrodoméstico en kilogramos");
        
        int peso;
        peso = leer.nextInt();
        
        if (peso >= 1 || peso <= 19) {
            precio = precio + 100;
        }
        
        if (peso >= 20 || peso <= 49) {
            precio = precio + 500;
        }
        
        if (peso >= 50 || peso <= 79) {
            precio = precio + 800;
        }
        
        if (peso >= 80) {
            precio = precio + 1000;
        }
        
        return precio;
    }
    
    
}
