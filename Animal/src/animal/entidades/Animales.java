/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal.entidades;

import animal.interfaces.Alimentarse;



/**
 *
 * @author MegaTecnologia
 */
public class Animales implements Alimentarse  {

    @Override
    public void comer(int g) {
        System.out.println("El animal se alimentó con "+g+" gramos de alimento.");
    }
    
    
    
    
    
}

