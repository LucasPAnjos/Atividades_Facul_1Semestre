/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade_10questoes;

import javax.swing.JOptionPane;

/**
 *
 * @author Workstation
 */
public class Questao_27 {
    
    public static void main(String[] args) {
        // TODO code application logic here
     
        Double [] cel = {25.0,30.0,32.0,34.0,42.1};
        Double [] fah = new Double [100];
        Double [] kel = new Double [100];
        
          int array=0;  
                Double cel_s, fah_s, kel_s;
        
        for(int cont=0; cont <cel.length; cont++){
           
            fah[array] = (cel[array]*1.8)+32;
            
            kel[array] = cel[array]+273.15;
          
            System.out.println("Celsius"+" "+cel[array]+ "Fahreinheit "+fah[array]+" Kelvin "+kel[array]);
            
           array++;
            
            
        }
        
     
        
    }
}
