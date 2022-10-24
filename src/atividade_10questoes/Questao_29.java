/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade_10questoes;

/**
 *
 * @author Workstation
 */
public class Questao_29 {
    
    public static void main(String[] args) {
        // TODO code application logic here
    
        
        int posicao, t;
	posicao = 6;
	t = 1;// qtd de asteristico
	for (int i = 1; i <= 8; i++) {// for externo conta qtd de linhas de
		// asteristico
		//i = 6;
		for (int j = 0; j <= 10; j++)
			if (j == posicao)// se j for igual posicao condicao true
			{
				for (int i2 = 1; i2 <= t; i2++)//for para qtd de asteristicos por linha
				
					System.out.print("*");// imprime

				t = t + 2;// contagem de asteristico, exem: imprime 1
				// asteristico na segunda volta t e 1 * +2 que da = 3 na segunda linha
				 posicao--;// posicao decrementa 
				

			} else {
				System.out.print(" ");
				// System.out.println("||");

			}
		System.out.println();//pula para baixo, para nao ficar na mesma linha 
		
		//for(int x=0;x<=1;x++){
			//System.out.println(" \t ||");
		//}
        
        }
    
    }
    
}
