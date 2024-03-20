/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.taller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author mac
 */
public class Ejercicio3Test {
    /**
     * Test of CambioMoneda method, of class Ejercicio3.
     */
    @Test
    public void testCambioMoneda() {
        System.out.println("CambioMoneda");
        double numerodolar = 15;
        Ejercicio3 instance = new Ejercicio3();
        double expResult = 11.25703564727955;
        double result = instance.CambioMoneda(numerodolar);
        assertEquals(expResult, result, 0);
        
    }

    @Test
    public void testCambioMoneda2() {
        System.out.println("CambioMoneda");
        double numerodolar = 45;
        Ejercicio3 instance = new Ejercicio3();
        double expResult = 33.771106941838646;
        double result = instance.CambioMoneda(numerodolar);
        assertEquals(expResult, result, 0);
       
    }
}