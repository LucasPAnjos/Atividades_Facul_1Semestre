/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade_10questoes;

import javax.swing.JOptionPane;

/**
 *
 * @author Lucas Pinheiro dos Anjos - IFBA - 1º Semestre
 */
public class Questao_26 {
    
    public static void main(String[] args) {
        // TODO code application logic here
    
    int numero = Integer.parseInt(JOptionPane.showInputDialog("Para verificar se é primo, Digite um número inteiro"));
    
        if ((numero == 0) || (numero == 1)){
             JOptionPane.showMessageDialog(null, "Número não é primo");
    }else{
           int i=0, fim;
           
           fim = (int)Math.sqrt(numero);
           
                
               if((numero%2)==0){
                   JOptionPane.showMessageDialog(null, "Número não é primo");
                    
               }else{
                   JOptionPane.showMessageDialog(null, "Número é primo");
                    
                        }
               
                 
  }
   
        }
        
    
            }
