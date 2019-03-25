/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aerolineaJD;

import java.util.Date;

/**
 *
 * @author JDMorrigan
 * @author Juan David Ojeda Bernal, Tatiana Almansa 
 */
public class Persona {
    private int cedula;
    private Date fecha;
    private String nombre;
    private String apellido; 

    /**
     * Constructor de la clase
     * @param cedula
     * @param fecha
     * @param nombre
     * @param apellido
     */
    public Persona(int cedula, Date fecha, String nombre, String apellido) {
        this.cedula = cedula;
        this.fecha = fecha;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    /**
     *
     * @return
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     *
     * @param fecha
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     *
     * @return
     */
    public int getCedula() {
        return cedula;
    }

    /**
     *
     * @param cedula
     */
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public String getApellido() {
        return apellido;
    }

    /**
     *
     * @param apellido
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    
}
