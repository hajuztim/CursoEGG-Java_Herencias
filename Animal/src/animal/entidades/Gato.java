/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal.entidades;

/**
 *
 * @author MegaTecnologia
 */
public class Gato extends Animales {
    
    protected String nombre;
    protected String alimento;
    protected int edad;
    protected String raza;

    public Gato() {
    }

    public Gato(String nombre, String alimento, int edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Gato{" + "nombre=" + nombre + ", alimento=" + alimento + ", edad=" + edad + ", raza=" + raza + '}';
    }
    
    
    
    
}
