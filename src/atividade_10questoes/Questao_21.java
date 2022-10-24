/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade_10questoes;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Workstation
 */
public class Questao_21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //quantidade de letras "A" e "Z"
        
        ArrayList<String> lista = new ArrayList<String>();
        String cond = "";
               
       int cont_A=0, maiorLetra=0, cont_maiorLetra=-1, cont_Z=0, cont_Consoantes=-1,cont_Caracteres=-1,cont_Exclamacao=0;
        char convert='a';
       while(cond.equals("#") == false){
           
           cond = JOptionPane.showInputDialog("Digite o Caractere");
           
           lista.add(cond);
           
       }    
            for(String string: lista){
                if(string.equalsIgnoreCase("A")){
                   cont_A++;   
                
                }if(string.equalsIgnoreCase("Z")){
                   cont_Z++;
                
                }if(string.equals("A")==false && string.equals("E")==false
                       && string.equals("I")==false && string.equals("O")==false
                       &&string.equals("U")==false){
                   cont_Consoantes++;
                
                }if(string.equals("")==false){
                    cont_Caracteres++; //Não considerar o "#" 
                
                }if(string.equalsIgnoreCase("!")){
                    cont_Exclamacao++;
                }
                
                 
                    char ch = string.charAt(0);
                    maiorLetra = ch;
                    
                if(cont_maiorLetra < maiorLetra){
                        cont_maiorLetra = maiorLetra;
                        
                        convert = (char)maiorLetra;
                }

            }
            
        
            
       JOptionPane.showMessageDialog(null, "Quantidade letra A="+cont_A+"\n"+
                                                        "Quantidade letra Z="+cont_Z+"\n"+
                                                        "Quantidade de Consoantes="+cont_Consoantes+"\n"+
                                                        "Quanidade de caracteres="+cont_Caracteres+"\n"+
                                                        "Quanidade de Exclamação="+cont_Exclamacao+"\n"+
                                                        "Maior letra-Considerando a ordem alfabética= "+convert);
       
    }
    
}
