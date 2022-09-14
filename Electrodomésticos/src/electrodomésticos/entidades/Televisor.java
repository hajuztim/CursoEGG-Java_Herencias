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
public class Televisor extends Electrodoméstico {
    
    protected int resolucion;
    protected boolean TDT;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean TDT) {
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    public Televisor(int resolucion, boolean TDT, double precio, String color, char consumoEnergetico, Integer peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.TDT = TDT;
    }
    
    
    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    @Override
    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    @Override
    public Integer getPeso() {
        return peso;
    }

    @Override
    public void setPeso(Integer peso) {
        this.peso = peso;
    }
    
    
    // Métodos
    
    public void crearTelevisor(){
        
        Scanner leer = new Scanner(System.in);
        
        crearElectrodomestico();
        
        System.out.println("Ingrese las pulgadas del televisor");
        resolucion = leer.nextInt();
        
        System.out.println("La televisión tiene una resolución de "+resolucion+" pulgadas.");
        
        
        System.out.println("¿La televisión tiene un sintonizador TDT? (s/n)");
        char respuesta;
        respuesta = leer.next().charAt(0);
        
        if (respuesta=='s') {
            TDT = true;
            System.out.println("Posee un sintonizador TDT");
        } else {
            TDT = false;
            System.out.println("No posee un sintonizador TDT");
        }
        
    }
    
    public void precioFinalTelevisor(){
        
        precioFinal();
        
        if (resolucion > 40){
            precio = precio+((precio*30)/100);
        } else {
            precio = precio;
        }
        
        if (TDT = true){
            precio = precio+500.00;
        } else {
            precio = precio;
        }
        
        System.out.println("El precio final del televisor es de "+precio+" pesos.");
        
    }
    
    
    
}
