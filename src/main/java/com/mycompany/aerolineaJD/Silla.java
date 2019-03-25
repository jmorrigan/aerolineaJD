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
public class Silla {
    private int numero;
    private int clase;
    private Persona persona;
    private int precio;

    /**
     * Constructor de la clase
     * @param numero
     * @param clase
     * @param p
     * @param precio
     */
    public Silla(int numero, int clase, Persona p, int precio) {
        this.numero = numero;
        this.clase = clase;
        this.persona = null;
        this.precio = precio;
    }

    /**
     *
     * @return
     */
    public int getPrecio() {
        return precio;
    }

    /**
     *
     * @param precio
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     *
     * @return
     */
    public int getClase() {
        return clase;
    }

    /**
     *
     * @param clase
     */
    public void setClase(int clase) {
        this.clase = clase;
    }
    
    /**
     *
     * @return
     */
    public int getNumero() {
        return numero;
    }

    /**
     *
     * @param numero
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     *
     * @return
     */
    public Persona getPersona() {
        return persona;
    }

    /**
     *
     * @param persona
     */
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
}
