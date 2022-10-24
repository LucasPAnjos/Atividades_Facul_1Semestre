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
public class Questao_23 {
    
    public static void main(String[] args) {
        // TODO code application logic here
    
    
        Double [] respostas = new Double [100];
            String respostas_s = "";
            Double saida = 0.0, resposas_array=0.0;
            int array = 0, de_0_25=0, de_26_50=0, de_51_75=0, de_76_100=0;
            
    
            while(saida >= 0){
            
                respostas_s = JOptionPane.showInputDialog("Digite a nota!");
                
                saida = Double.parseDouble(respostas_s);
                
                if(saida >=0){
                
                    respostas[array] = saida;
                    
                        
                    if((respostas[array] >=0) && (respostas[array] <=25)){
                    de_0_25++;
                }
                    if((respostas[array] >=26) && (respostas[array] <=50)){
                        de_26_50++;
                    }
                        if((respostas[array] >=51) && (respostas[array] <=75)){
                            de_51_75++;
                        }
                            if((respostas[array] >=76) && (respostas[array] <=100)){
                            de_76_100++;
                        }
                    
                    
                  array++;
                    
                  }
                
                
             
                
            }   
            
         
            
            JOptionPane.showMessageDialog(null, "Quantidade de candidatos acertos [0-25] = "+de_0_25+"\n"+
                    "Quantidade de candidatos acertos [26-50] = "+de_26_50+"\n"+
                    "Quantidade de candidatos acertos [51-75] = "+de_51_75+"\n"+
                    "Quantidade de candidatos acertos [76-100] = "+de_76_100);
            
    }
}
