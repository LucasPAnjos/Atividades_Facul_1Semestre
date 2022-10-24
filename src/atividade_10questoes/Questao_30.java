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
public class Questao_30 {
   
     public static void main(String[] args) {
        // TODO code application logic here
   
    
    int numero = 0;
    
    for(int cont=0; cont<=1000;cont++){
    
        if ((numero == 0) || (numero == 1)){
             System.out.println(numero+" Nao e primo");
    }else{
           int i=0, fim;
           
           fim = (int)Math.sqrt(numero);
           
                
               if((numero%2)==0){
                   System.out.println(numero+" Nao e primo");
                    
               }else{
                   System.out.println(numero+" E primo");
                    
                        }
               
                 
        }
   
     
        
                numero++;
        
    }
        
    
     }
}
