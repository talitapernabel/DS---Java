/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetores02;

import java.util.Scanner;

/**
 *
 * @author Talita
 */
public class Vetores02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        // 1- crie um vetor para armazenar o nome de 5 pessoas, preenchido através do usuário e imprima esses dados
            
            String nomes[] = new String[5];
            
            for (int i = 0; i < nomes.length; i++) {           
                System.out.println("Informe o nome da posição ["+i+"]: ");
                nomes[i] = ler.next();               
            }
            
            for (int i = 0; i < nomes.length; i++) {
                System.out.println("O nome inserido na posição ["+i+"] é "+nomes[i]);
            }
            
            System.out.println("---------------------------------------------------------");

        // 2- Crie um vetor de tamanho 10 onde o usuário informe os dados e que esses números sejam impresso
        
            String nomes_2[] = new String[10];
            
            for (int x = 0; x < nomes_2.length; x++) {           
                System.out.println("Informe o nome da posição ["+x+"]: ");
                nomes_2[x] = ler.next();               
            }
            
            for (int x = 0; x < nomes_2.length; x++) {
                System.out.println("O nome inserido na posição ["+x+"] é "+nomes_2[x]);
            }
        
    }   
    
}
