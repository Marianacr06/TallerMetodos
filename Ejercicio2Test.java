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
public class Ejercicio2Test {
    
    public Ejercicio2Test() {
    }

    /**
     * Test of Perimetro method, of class Ejercicio2.
     */
    @Test
    public void testPerimetro() {
        System.out.println("Perimetro");
        double ladoA = 5.5;
        double ladoB = 6.0;
        String Tipocalculo = "perimetro";
        Ejercicio2 instance = new Ejercicio2();
        double expResult = 23.0;
        double result = instance.Perimetro(ladoA, ladoB, Tipocalculo);
        assertEquals(expResult, result, 0);
       
    }
     @Test
    public void testPerimetro2() {
        System.out.println("area");
        double ladoA = 26;
        double ladoB = 25;
        String Tipocalculo = "area";
        Ejercicio2 instance = new Ejercicio2();
        double expResult = 650.0;
        double result = instance.Perimetro(ladoA, ladoB, Tipocalculo);
        assertEquals(expResult, result, 0);
       
    }
}
