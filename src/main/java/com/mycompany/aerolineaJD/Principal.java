/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aerolineaJD;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author JDMorrigan
 * @author Juan David Ojeda Bernal, Tatiana Almansa 
 */
public class Principal {
    ListarAvion listar = new ListarAvion();
    ListarAvionB listarB = new ListarAvionB();
    ListarAvionC listarC = new ListarAvionC();
    private Avion avion;
    private Silla sillas;
    int opcion, opcion1;
    int c = 1, fila , columna;
    int[][] sillaA = new int[2][20];
    int[][] sillaB = new int[6][6];
    int[][] sillaC = new int[2][6];
    static Scanner leer = new Scanner(System.in);
    
    public Principal(){
        menúGeneral();
    }
    
    public void menúGeneral(){
        System.out.println("QUE AVION DESEA ABORDAR: \n1. Preferencial-Economico\n2. Economico\n3. Preferencial");
        opcion1 = leer.nextInt();
        switch(opcion1){
            case 1:
            AvionA();
            break;
   
            case 2:
            AvionB();
            break;
            
            case 3:
            AvionC();
            break;
            
            default:
                System.out.println("Disfrute su viaje");
                break;
        }
    }
    
    
    
    
    public void AvionA(){
        
        System.out.println("QUE ACCION DESEA EJECUTAR: \n1. Agregar pasajeros\n2. Ver asignados\n3. Despegar\n4. Eliminar\n5. Menú Principal");
        opcion = leer.nextInt();
        switch(opcion){
            case 1:
                AgregarA();
                AvionA();
                break;
            case 2:
                listar.imprimirAvion();
                AvionA();
                break;
            case 3:
                listar.despacharAvion();
                AvionA();
                break;
            case 4:
                System.out.println("Ingrese el asiento a cancelar");
                int chair = leer.nextInt();
                listar.eliminarSilla(chair);
                AvionA();
                break;
            case 5:
                menúGeneral();    
                
            default:
                    System.out.println("opcion no valida");
                    AvionA();
                    break;
        }
    }
 
    public void AvionB(){
        System.out.println("********************************************");
        System.out.println("QUE ACCION DESEA EJECUTAR: \n1. Agregar pasajeros\n2. Ver asignados\n3. Despegar\n4. Eliminar\n5. Menu principal");
        opcion = leer.nextInt();
        switch(opcion){
            case 1:
                AgregarB();
                AvionB();
                break;
            case 2:
                listarB.imprimirAvion();
                AvionB();
                break;
            case 3:
                listarB.despacharAvion();
                AvionB();
                break;
            case 4:
                System.out.println("Ingrese el asiento a cancelar");
                int chair = leer.nextInt();
                listarB.eliminarSilla(chair);
                AvionB();
                break;    
            case 5:
                menúGeneral();
                default:
                    System.out.println("opcion no valida");
                    AvionB();
                    break;
        }
    }
    
    public void AvionC(){
        System.out.println("QUE ACCION DESEA EJECUTAR: \n1. Agregar pasajeros\n2. Ver asignados\n3. Despegar\n4. Eliminar\n5. Menu principal");
        opcion = leer.nextInt();
        switch(opcion){
            case 1:
                AgregarC();
                AvionC();
                break;
            case 2:
                listarC.imprimirAvion();
                AvionC();
                break;
            case 3:
                listarC.despacharAvion();
                AvionC();
                break;
            case 4:
                System.out.println("Ingrese el asiento a cancelar");
                int chair = leer.nextInt();
                listarC.eliminarSilla(chair);
                AvionC();
                break;    
            case 5:
                menúGeneral();
                default:
                    System.out.println("opcion no valida");
                    AvionC();
                    break;
        }
    }
    
    public void AgregarA(){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaDate = null;
        boolean nom;
        
        try{
            int precio;
            leer.skip("\n");
            System.out.println("Ingrese su fecha de nacimiento(dd/MM/yyyy)");
            String fecha = leer.nextLine();
            fechaDate = formato.parse(fecha);
            System.out.println("Ingrese su numero de cedula");
            int cedula = leer.nextInt();
            leer.skip("\n");
            System.out.println("Ingrese su nombre");
            String nombre = leer.nextLine();
            System.out.println("Ingrese su apellido");
            String apellido = leer.nextLine();
            System.out.println("Ingrese la categoria en la que desea viajar: 1.Ejecutiva  2.Economica");
            fila = leer.nextInt();
            System.out.println("Ingrese el asiento en el que desea viajar:");
            columna = leer.nextInt();
            
            
            Persona p = new Persona(cedula,fechaDate, nombre, apellido);
            
            if(sillaA[fila -1][columna-1] == 0){
                sillaA[fila -1][columna-1] = 1;
                c = c + 1;
                if(fila ==1){
                    precio = 250000;
                }else{
                    precio = 100000;
                }
                
                System.out.println("reservado correctamente");
                Silla puesto = new Silla(fila, columna, p, precio);
                puesto.setClase(fila);
                puesto.setNumero(columna);
                puesto.setPersona(p);
                listar.incluirAvion(puesto);
               
            }else{
                System.out.println("Asiento ocupado");
            }
            System.out.println("                               ^");
            System.out.println("                             ////");
            System.out.println("                            /////");
            System.out.println("                           //////");
            System.out.println("                          ///////");
            System.out.println("*********************************");
            System.out.println("*********************************");
            for(int i=0; i < sillaA.length; i++){
                for(int j=0; j <sillaA[i].length; j++){
                    System.out.print(""+sillaA[i][j]);
                    
                }
                
                 System.out.println();
                 System.out.println("*********************************");
            }
            
        
        
        }catch(InputMismatchException e){
            leer.next();
            System.out.println("El dato ingresado no es correspondiente a la estructura de una cedula");
        }catch(ParseException ex){
            System.out.println("El formato ingresado de la fecha no es correcto");    
        }catch(ArrayIndexOutOfBoundsException exe){
            System.out.println("El valor ingresado no existe");
        } 
    }
     
    public void AgregarB(){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaDate = null;
        boolean nom;
        
        try{
            int precio;
            leer.skip("\n");
            System.out.println("Ingrese su fecha de nacimiento(dd/MM/yyyy)");
            String fecha = leer.nextLine();
            fechaDate = formato.parse(fecha);
            System.out.println("Ingrese su numero de cedula");
            int cedula = leer.nextInt();
            leer.skip("\n");
            System.out.println("Ingrese su nombre");
            String nombre = leer.nextLine();
            System.out.println("Ingrese su apellido");
            String apellido = leer.nextLine();
            System.out.println("Que fila desea ocupar: 1.A  2.B  3.C  4.D  5.E  6.F");
            int fila = leer.nextInt();
            System.out.println("Ingrese el asiento en el que desea viajar:");
            columna = leer.nextInt();
            
            
            Persona pe = new Persona(cedula,fechaDate, nombre, apellido);
            
            if(sillaB[fila -1][columna-1] == 0){
                sillaB[fila -1][columna-1] = 1;
                c = c + 1;
                precio = 100000;
                
                
                System.out.println("reservado correctamente");
                Silla puesto = new Silla(fila, columna, pe, precio);
                puesto.setClase(fila);
                puesto.setNumero(columna);
                puesto.setPersona(pe);
                listarB.incluirAvion(puesto);
               
            }else{
                System.out.println("Asiento ocupado");
            }
            System.out.println("                                          ^");
            System.out.println("                                        ////");
            System.out.println("                                       /////");
            System.out.println("                                      //////");
            System.out.println("                                     ///////");
            System.out.println("********************************************");
            System.out.println("********************************************");
            System.out.println("********************************************");
            for(int i=0; i < sillaB.length; i++){
                for(int j=0; j <sillaB[i].length; j++){
                    System.out.print(""+sillaB[i][j]+"\t");
                    
                }
                
                 System.out.println();
            }
            
        
        
        }catch(InputMismatchException e){
            leer.next();
            System.out.println("El dato ingresado no es correspondiente a la estructura de una cedula");
        }catch(ParseException ex){
            System.out.println("El formato ingresado de la fecha no es correcto");    
        }catch(ArrayIndexOutOfBoundsException exe){
            System.out.println("El valor ingresado no existe");
        } 
    }
    
    public void AgregarC(){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaDate = null;
        try{
            int precio;
            leer.skip("\n");
            System.out.println("Ingrese su fecha de nacimiento(dd/MM/yyyy)");
            String fecha = leer.nextLine();
            fechaDate = formato.parse(fecha);
            System.out.println("Ingrese su numero de cedula");
            int cedula = leer.nextInt();
            leer.skip("\n");
            System.out.println("Ingrese su nombre");
            String nombre = leer.nextLine();
            System.out.println("Ingrese su apellido");
            String apellido = leer.nextLine();
            System.out.println("Que fila desea ocupar: 1.A  2.B ");
            int fila = leer.nextInt();
            System.out.println("Ingrese el asiento en el que desea viajar:");
            columna = leer.nextInt();
            
            
            Persona per = new Persona(cedula,fechaDate, nombre, apellido);
            
            if(sillaC[fila -1][columna-1] == 0){
                sillaC[fila -1][columna-1] = 1;
                c = c + 1;
                precio = 250000;
                
                
                System.out.println("reservado correctamente");
                Silla puesto = new Silla(fila, columna, per, precio);
                puesto.setClase(fila);
                puesto.setNumero(columna);
                puesto.setPersona(per);
                listarC.incluirAvion(puesto);
               
            }else{
                System.out.println("Asiento ocupado");
            }
            System.out.println("                                      ^");
            System.out.println("                                    ////");
            System.out.println("                                   /////");
            System.out.println("                                  //////");
            System.out.println("                                 ///////");
            System.out.println("****************************************");
            System.out.println("****************************************");
            System.out.println("****************************************");
            for(int i=0; i < sillaC.length; i++){
                for(int j=0; j <sillaC[i].length; j++){
                    System.out.print(""+sillaC[i][j]+"\t");
                    
                }
                
                 System.out.println();
            }
            
        
        
        }catch(InputMismatchException e){
            leer.next();
            System.out.println("El dato ingresado no es correspondiente a la estructura de una cedula");
        }catch(ParseException ex){
            System.out.println("El formato ingresado de la fecha no es correcto");    
        }catch(ArrayIndexOutOfBoundsException exe){
            System.out.println("El valor ingresado no existe");
        } 
    }

}

    
    
    
    
    
    
   

