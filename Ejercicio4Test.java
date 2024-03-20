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
public class Ejercicio4Test {
    
    public Ejercicio4Test() {
    }

    /**
     * Test of Perimetro method, of class Ejercicio4.
     */
    @Test
    public void testPerimetro() {
        System.out.println("Perimetro");
        double radio = 5;
        String tipocalculo = "perimetro";
        Ejercicio4 instance = new Ejercicio4();
        double expResult = 31.416;
        double result = instance.Perimetro(radio, tipocalculo);
        assertEquals(expResult, result, 0);
        
    }
     @Test
    public void testPerimetro2() {
        System.out.println("Perimetro");
        double radio = 9;
        String tipocalculo = "volumen";
        Ejercicio4 instance = new Ejercicio4();
        double expResult = 33053.635;
        double result = instance.Perimetro(radio, tipocalculo);
        assertEquals(expResult, result, 0);
}
}