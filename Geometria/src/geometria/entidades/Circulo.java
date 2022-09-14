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
public class Circulo implements Datos{

    private double radio;
    private double diametro;

    public Circulo() {
    }
    
    public Circulo(double radio, double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }
    
    @Override
    public void area() {
        System.out.println(Math.PI * Math.pow(radio, 2));
                
    }

    @Override
    public void perimetro() {
        System.out.println(Math.PI * diametro);
    }
    
    
    
    
}
