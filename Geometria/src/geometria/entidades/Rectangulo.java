/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria.entidades;

import geometria.interfaces.Datos;

/**
 *
 * @author MegaTecnologia
 */
public class Rectangulo implements Datos {

    private double altura;
    private double base;

    public Rectangulo() {
    }

    public Rectangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
     
    
    @Override
    public void area() {
        System.out.println(base*altura);
    }

    @Override
    public void perimetro() {
        System.out.println((base+altura)*2);
    }
    
}
