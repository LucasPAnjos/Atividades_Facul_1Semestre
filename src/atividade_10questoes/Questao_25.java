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
public class Questao_25 {
    
        //Algoritmo de Euclides recursivo
    public static int mdcRecursive(int a, int b){
        if(b == 0) return a;
        return mdcRecursive(b, a % b);
        
    }
    //Algoritmo de Euclides iterativo
    public static int mdcIterative(int a, int b){
        while(b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    public static void main(String[] args) {

                //Teste da versão recursiva
                int res = mdcRecursive(Integer.parseInt(JOptionPane.showInputDialog("Recussiva - Digite o primeiro valor")),
                Integer.parseInt(JOptionPane.showInputDialog("Recussiva - Digite o segundo valor")));
       
                       JOptionPane.showMessageDialog(null, "MDC - Versão Recussiva = "+res);
       
                       
                //Teste da versão iterativa
            int res_interativa = mdcIterative(Integer.parseInt(JOptionPane.showInputDialog("Interativa - Digie o primeiro valor")),
                Integer.parseInt(JOptionPane.showInputDialog("Interativa - Digite o segundo valor")));
        
            JOptionPane.showMessageDialog(null, "MDC - Versão Interativa = "+res_interativa);
        
        }
    
        
        
    }



