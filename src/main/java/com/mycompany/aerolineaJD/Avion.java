/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aerolineaJD;

/**
 *
 * @author JDMorrigan
 * @author Juan David Ojeda Bernal, Tatiana Almansa 
 */
public class Avion {
    private Silla silla;
    
    /**
     * Constructor de la clase
     * @param silla
     */
    public Avion(Silla silla) {
        this.silla = silla;
    }

    /**
     *
     * @return
     */
    public Silla getSilla() {
        return silla;
    }

    /**
     *
     * @param silla
     */
    public void setSilla(Silla silla) {
        this.silla = silla;
    }
 
    
}
