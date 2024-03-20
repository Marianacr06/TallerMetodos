/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller;

/**
 *
 * @author mac
 */
public class Ejercicio5 {
    
    public int ConvertirSegundos (int horas, int segundos, int dias, int minutos ){
        
        int segundosdias= 24*60*60;
        int segundoshoras= 60*60;
        int segundosminutos= 60;
        
        
        int totalseconds =(dias*segundosdias)+(horas*segundoshoras)+(minutos*segundosminutos);
                return totalseconds;
        
        
        
        
    }
    
  
}
