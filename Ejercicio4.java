/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller;

import static java.lang.Math.pow;

/**
 *
 * @author mac
 */
public class Ejercicio4 {
    
    public double Perimetro (double radio, String tipocalculo){
        
        switch (tipocalculo) {
            case "Area":
                return 3.1416*pow(radio,2);
                
            case "perimetro":
                return 2*(3.1416* radio);
                
            case "vloumen":
                return (4*3.1416*pow(radio,3))/3;
                
            default:
                System.out.println("Esta mal");
                return 0;
        }
       
        
        
    }
    
}
