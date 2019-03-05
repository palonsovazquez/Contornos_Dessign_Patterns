/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. V 0.1
 */
package lpcod;

import java.util.GregorianCalendar;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author: Pablo Alonso Vazquez
 * @version: 0.8 Controla las entradas de numeros por teclado 
 * añado opcion grafica con joptionpanels
 *
 */
public abstract class Peticiones implements InterfacePeticiones {

    public  Peticiones Crear(Tipo tipo) {
       Peticiones res =null;
        switch(tipo){
            case VENTANA:{
            res = new PeticionesGraficas();
            break;}
            case CONSOLA:{
            res = new PeticionesConsola();
            
            break;}
        
        }
        
   return res; }

   
   
    

    
}
