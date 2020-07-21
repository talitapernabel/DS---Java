/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetores01;

import java.util.Scanner;

/**
 *
 * @author Talita
 */
public class Vetores01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        
        // 1- Crie um vetor de tamanho 10 do tipo inteiro
            
            Scanner ler = new Scanner(System.in);
            
            int vetorzinho[] = new int[10];
            
        // 2- Preencha esse vetor com numeros pares a sua escolha
            
            vetorzinho [0] = 10;
            vetorzinho [1] = 8;
            vetorzinho [2] = 6;
            vetorzinho [3] = 4;
            vetorzinho [4] = 2;
            vetorzinho [5] = 12;
            vetorzinho [6] = 14;
            vetorzinho [7] = 16;
            vetorzinho [8] = 18;
            vetorzinho [9] = 20;    
            
        // 3- Imprima esse vetor
        
            for (int i = 0; i < vetorzinho.length; i++) {
                    System.out.println("O valor inserido na posição "+i+" do vetor é "+vetorzinho[i]);
                }
            
            System.out.println("---------------------------------------------------------");
            
        // 4- Troque o numero na 5º posição para 87
        
            vetorzinho [4] = 87;
        
        // 5- Troque o numero na 3º posição para 57
        
            vetorzinho [2] = 57;
        
        // 6- Imprima as posiçoes que foram alteradas acima
        
            System.out.println(+vetorzinho[4]);
            System.out.println(+vetorzinho[2]);
        
    }
    
}
