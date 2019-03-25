/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aerolineaJD;

import java.util.ArrayList;

/**
 *
 * @author JDMorrigan
 * @author Juan David Ojeda Bernal, Tatiana Almansa 
 */
public class ListarAvionC {
    ArrayList<Silla> sillas = new ArrayList();
    private Persona person;

    /**
     *Constructor de la clase que recibe como parametro el arraylist de silla para añadirla al correspondiente avion
     * @param sillas
     */
    public ListarAvionC(ArrayList<Silla> sillas) {
        this.sillas = sillas;
    }
    
    /**
     *Constructor vacío
     */
    public ListarAvionC(){
        
    }
    
    /**
     *metodo para imprimir todas los ocupantes del avion
     */
    public void imprimirAvion(){

          if (sillas != null) {
            for (Silla opc : sillas) {
            System.out.println("Fila:"+opc.getClase()+" Silla:"+opc.getNumero()+" Cedula:"+opc.getPersona().getCedula()+" Fecha:"+opc.getPersona().getFecha()+" Nombre:"+opc.getPersona().getNombre()+" Apellido:"+opc.getPersona().getApellido()+" Pagó:"+opc.getPrecio());    
            }
            }
          else {
            System.out.println("No hay Ocupantes para mostrar");
        }
          
    }
    
    public boolean eliminarSilla(int posicion){
         boolean encontrado = false;
         int i = 0;
         while(encontrado == false && i<sillas.size()){
             if(sillas.get(i).getNumero()==posicion ){
                 encontrado = true;
             }else{
                 i++;
             }
         }
             if(encontrado){
             sillas.remove(i);
             return false;
         }else{
             System.out.println("la silla no está ocupada");
             return true;
         }
         
    }
    
    /**
     *metodo para obtener la cantidad de dinero recogida por la aerolinea despues de despegar el avion
     */
    public void despacharAvion(){
       int precioTotal = sillas.stream().mapToInt(o -> o.getPrecio()).sum();
       System.out.println("Avion despegando, Total en caja: "+"$"+precioTotal);
    }
    
    /**
     * metodo que agrega la silla al avion
     * @param c
     */
    public void incluirAvion(Silla c){
        this.sillas.add(c);
    }
}
