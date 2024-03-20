/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller;

/**
 *
 * @author mac
 */
public class Ejercicio6 {
    
   public double  ConvertirDias (double segundos, String tipo) {
        double resultado = 0;
        
        switch (tipo.toLowerCase()) {
            case "Dias":
                resultado = segundos / 8400.0;
                break;
            case "Horas":
                resultado = segundos / 3600.0;
                break;
            case "Minutos":
                resultado = segundos / 60.0;
                break;
        }
        
        return resultado;
    }
}

    
    

