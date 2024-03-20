/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller;

/**
 *
 * @author mac
 */
public class Ejercicio2 {
    
    public double Rectangulo (double ladoA,double ladoB, int calcular){
        double perimetro;
        double area;
        
        if(calcular== 1){
            perimetro= (ladoA*2)+(ladoB*2);
            return perimetro;
            
        }else{
            area=ladoA*ladoB;
            return area;
        }
        
        
        
        
        
    }
    
    
    
}
