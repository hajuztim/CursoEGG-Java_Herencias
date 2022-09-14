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
public class Lavadora extends Electrodoméstico {
    
    protected int carga;

    public Lavadora() {
    }

    public Lavadora(int carga) {
        this.carga = carga;
    }

    public Lavadora(int carga, double precio, String color, char consumoEnergetico, Integer peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
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
    public String getColor () {
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
    
    public void crearLavadora(){
        
        Scanner leer = new Scanner(System.in);
        
        crearElectrodomestico();
        
        System.out.println("Introduzca la carga que soporta la lavadora (debe ser en libras)");
        carga = leer.nextInt();
        
        System.out.println("La carga que soporta la lavadora son: "+carga+" lb.");
        
    }
    
    public void precioFinalLavadora(){
          
        precioFinal();
        
        if (carga > 30){
            precio = precio+500;
        } else {
            precio = precio;
        }
               
        System.out.println("El precio final de la lavadora es de "+precio+" pesos.");
      
    }
    
}
