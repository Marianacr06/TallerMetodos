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
     * Test of Rectangulo method, of class Ejercicio2.
     */
    @Test
    public void testRectangulo() {
        System.out.println("Rectangulo");
        double ladoA = 9;
        double ladoB = 8.5;
        int calcular = 33;
        Ejercicio2 instance = new Ejercicio2();
        double expResult = 76.5;
        double result = instance.Rectangulo(ladoA, ladoB, calcular);
        assertEquals(expResult, result, 0);
    }
   @Test
    public void testRectangulo2() {
        System.out.println("Rectangulo");
        double ladoA = 50;
        double ladoB = 30;
        int calcular = 6;
        Ejercicio2 instance = new Ejercicio2();
        double expResult = 1500;
        double result = instance.Rectangulo(ladoA, ladoB, calcular);
        assertEquals(expResult, result, 0);
    }
}