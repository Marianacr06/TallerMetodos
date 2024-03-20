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
public class Ejercicio6Test {
    
    public Ejercicio6Test() {
    }

    /**
     * Test of ConvertirDias method, of class Ejercicio6.
     */
    @Test
    public void testConvertirDias() {
        System.out.println("ConvertirDias");
        double segundos = 30.0;
        String tipo = "dias";
        Ejercicio6 instance = new Ejercicio6();
        double expResult = 0.0035714285714285713;
        double result = instance.ConvertirDias(segundos, tipo);
        assertEquals(expResult, result, 0);
    }
    @Test
    public void testConvertirDias2() {
        System.out.println("ConvertirDias");
        double segundos = 60.0;
        String tipo = "dias";
        Ejercicio6 instance = new Ejercicio6();
        double expResult = 0.00714285714285713;
        double result = instance.ConvertirDias(segundos, tipo);
        assertEquals(expResult, result, 0);
    }
}
