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
public class Questao_22 {
    
    public static void main(String[] args) {
        // TODO code application logic here
    
     Double [] salario = new Double[100];
     int [] filhos = new int[100];
     
     Double Total_salario=0.0, media=0.0,maior_salario=0.0,menor_200=0.0;
     String saida = "", saida_pessoas="";
     
     
     int Total_filhos=0,media_filhos=0;
     
     int array = 0;
     
     
     while(saida.equalsIgnoreCase("#") == false){
       
          saida = JOptionPane.showInputDialog("Digite o salario R$ ");
            
         
               if(saida.equalsIgnoreCase("#")==false){
                    
            saida_pessoas = JOptionPane.showInputDialog("Digite quantidade de filhos");          
          
            salario[array] = Double.parseDouble(saida);
               filhos[array] = Integer.parseInt(saida_pessoas);
          
                 array++;
                
                }
                
    }
     
     //Média de salário da população
     for(int cont=0; cont < array; cont++ ){
            
           //Media num. de filhos 
            Total_filhos = Total_filhos+filhos[cont];
                //Media salarios    
                Total_salario = Total_salario+salario[cont];
                            
            if(maior_salario < salario[cont]){
                        
                    maior_salario = salario[cont];
                    
                   }
                
                if(salario[cont] <=200.00){
                    menor_200++;
                }
     
     }
        media_filhos = Total_filhos/array;
          media = Total_salario/array;
     
        JOptionPane.showMessageDialog(null,"Media do salario da populacao R$ "+media+"\n"
                +"Media num. de filhos "+media_filhos+"\n"
                        +"Maior salario R$ "+maior_salario+"\n"
                                +"Percentual salario de ate duzenos reais "+(menor_200/array)*100+"%");
        
     
     
     
    }
}
