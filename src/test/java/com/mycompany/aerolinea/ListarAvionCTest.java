/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aerolinea;

import com.mycompany.aerolineaJD.ListarAvion;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JDMorrigan
 */
public class ListarAvionCTest {
    
    public ListarAvionCTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

   

    /**
     * Test of eliminarSilla method, of class ListarAvionC.
     */
    @Test
       public void testEliminarSilla() {
        System.out.println("eliminarSilla");
        int posicion = 0;
        ListarAvion instance = new ListarAvion();
        boolean expResult = true;
        boolean result = instance.eliminarSilla(posicion);
        assertEquals(expResult,result);
        // TODO review the generated test code and remove the default call to fail.
        
        if(result != expResult){
        fail("The test case is a prototype.");
        }
    }
    
}
