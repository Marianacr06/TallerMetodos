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
public class Ejercicio1Test {
    
    public Ejercicio1Test() {
    }

    @Test
    public void testPrecioDescuento() {
        System.out.println("PrecioDescuento");
        double precio = 300;
        double descuento = 20;
        Ejercicio1 instance = new Ejercicio1();
        double expResult = 240;
        double result = instance.PrecioDescuento(precio, descuento);
        assertEquals(expResult, result, 0);
    }

 @Test
    public void testPrecioDescuento2() {
        System.out.println("PrecioDescuento");
        double precio = 350;
        double descuento = 30;
        Ejercicio1 instance = new Ejercicio1();
        double expResult = 245;
        double result = instance.PrecioDescuento(precio, descuento);
        assertEquals(expResult, result, 0);
    }
}
