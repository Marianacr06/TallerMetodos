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
public class Ejercicio5Test {
    
    public Ejercicio5Test() {
    }

    /**
     * Test of ConvertirSegundos method, of class Ejercicio5.
     */
    @Test
    public void testConvertirSegundos() {
        System.out.println("ConvertirSegundos");
        int horas = 5;
        int segundos = 60;
        int dias = 1;
        int minutos = 60;
        Ejercicio5 instance = new Ejercicio5();
        int expResult = 108000;
        int result = instance.ConvertirSegundos(horas, segundos, dias, minutos);
        assertEquals(expResult, result);
    }
    @Test
    public void testConvertirSegundos2() {
        System.out.println("ConvertirSegundos");
        int horas = 9;
        int segundos = 50;
        int dias = 2;
        int minutos = 40;
        Ejercicio5 instance = new Ejercicio5();
        int expResult = 207600;
        int result = instance.ConvertirSegundos(horas, segundos, dias, minutos);
        assertEquals(expResult, result);
    }
    
}
