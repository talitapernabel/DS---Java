/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista02;

import java.util.Scanner;

/**
 *
 * @author Talita
 */
public class Lista02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        // Exercício 1
        
        int numero_usuario, resto;
        
        System.out.println("Exercício 1");
        
        System.out.println("Digite um número: ");
        numero_usuario = entrada.nextInt();
        
        resto = numero_usuario % 2;
        
        if (resto == 0) {
            System.out.println("O número "+numero_usuario+" é par.");
        }else{
            System.out.println("O número "+numero_usuario+" é ímpar.");
        }
        
        // Exercício 2
        
        int ano_usuario;
        
        System.out.println("Exercício 2");
        
        System.out.println("Digite um ano: ");
        ano_usuario = entrada.nextInt();
        
        if (ano_usuario < 2020) {
            System.out.println("O ano de "+ano_usuario+" é do passado.");
        }else{
            if (ano_usuario > 2020) {
                System.out.println("O ano de "+ano_usuario+" é do futuro.");
            }else{
                System.out.println("O ano de "+ano_usuario+" é o ano atual.");
            }
        }
        
        // Exercício 3
        
        double nota1, nota2, media, reprovacao, recuperacao;
        String nome_aluno;
        
        System.out.println("Exercício 3");
        
        System.out.println("Digite seu nome: ");
        nome_aluno = entrada.next();
        
        System.out.println("Digite sua primeira nota: ");
        nota1 = entrada.nextDouble();
        
        System.out.println("Digite sua segunda nota: ");
        nota2 = entrada.nextDouble();
        
        media = (nota1 + nota2) / 2;
        reprovacao = 3.99;
        recuperacao = 5.99;
        
        if (media <= reprovacao) {
            System.out.println("Nome: "+nome_aluno);
            System.out.println("Média: "+media);
            System.out.println("Status: Reprovado");
        }else{
            if (media > reprovacao && media <= recuperacao) {
                System.out.println("Nome: "+nome_aluno);
                System.out.println("Média: "+media);
                System.out.println("Status: Recuperação");
            }else{
               System.out.println("Nome: ");
                System.out.println("Média: "+media);
                System.out.println("Status: Aprovado");
            }
        }
        
    }
    
}
