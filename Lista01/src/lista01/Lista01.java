/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista01;

import java.util.Scanner;

/**
 *
 * @author Talita
 */
public class Lista01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // Exercício 1
        
        String nome_usuario;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Exercício 1");
        
        System.out.println("Olá! Digite seu nome: ");
        nome_usuario = teclado.next();
        
        System.out.println("Seu nome é "+nome_usuario+".");
        
        // Exercício 2
        
        String nome_aluno;
        int nota_1, nota_2, nota_3, nota_4, media;
        
        System.out.println("Exercício 2");
        
        System.out.println("Digite seu nome: ");
        nome_aluno = teclado.next();
        
        System.out.println("Digite sua primeira nota: ");
        nota_1 = teclado.nextInt();
        
        System.out.println("Digite sua segunda nota: ");
        nota_2 = teclado.nextInt();
        
        System.out.println("Digite sua terceira nota: ");
        nota_3 = teclado.nextInt();
        
        System.out.println("Digite sua quarta nota: ");
        nota_4  = teclado.nextInt();
        
        media = (nota_1 + nota_2 + nota_3 + nota_4) / 4 ;
        
        System.out.println("Seu nome é "+nome_aluno+" e sua média em matemática é de "+media+".");
        
        // Exercício 3
        
        int numero, tabuada1, tabuada2, tabuada3, tabuada4, tabuada5, tabuada6, tabuada7, tabuada8, tabuada9, tabuada10;
        
        System.out.println("Exercício 3");
        
        System.out.println("Digite um número de 1 a 10: ");
        numero = teclado.nextInt();
        
        tabuada1 = numero * 1;
        tabuada2 = numero * 2;
        tabuada3 = numero * 3;
        tabuada4 = numero * 4;
        tabuada5 = numero * 5;
        tabuada6 = numero * 6;
        tabuada7 = numero * 7;
        tabuada8 = numero * 8;
        tabuada9 = numero * 9;
        tabuada10 = numero * 10;
        
        System.out.println("Tabuada do número "+numero+":");
        
        System.out.println("1x"+numero+"="+tabuada1);
        System.out.println("2x"+numero+"="+tabuada2);
        System.out.println("3x"+numero+"="+tabuada3);
        System.out.println("4x"+numero+"="+tabuada4);
        System.out.println("5x"+numero+"="+tabuada5);
        System.out.println("6x"+numero+"="+tabuada6);
        System.out.println("7x"+numero+"="+tabuada7);
        System.out.println("8x"+numero+"="+tabuada8);
        System.out.println("9x"+numero+"="+tabuada9);
        System.out.println("10x"+numero+"="+tabuada10);
        
        // Exercício 4 a
        
        double A, b, h, A2, l;
        
        System.out.println("Exercício 4a");
        
        System.out.println("Digite o valor da base do triângulo: ");
        b = teclado.nextDouble();
        
        System.out.println("Digite o valor da altura do triângulo: ");
        h = teclado.nextDouble();
        
        A = (b * h) / 2;
        
        System.out.println("O valor da área do triângulo é "+A);
        
        System.out.println("Agora, digite o valor do lado do quadrado: ");
        l = teclado.nextDouble();
        
        A2 = l * l;
        
        System.out.println("O valor da área do quadrado é "+A2);
        
        //Exercício 4b
        
        double imc, peso, altura;
        
        System.out.println("Exercício 4b");
        
        System.out.println("Digite seu peso em quilos: ");
        peso = teclado.nextDouble();
        
        System.out.println("Digite sua altura em metros: ");
        altura = teclado.nextDouble();
        
        imc = peso / (altura * altura);
        
        System.out.println("Seu IMC é de: "+imc);
        
        //Exercício 5 (tá escrito 4 na lista ??)
        
        double milhas, km;
        
        System.out.println("Exercício 5");
        
        System.out.println("Digite o número de km: ");
        km = teclado.nextDouble();
        
        milhas = km / 1.60934;
        
        System.out.println("O valor informado em km, é "+milhas+" em milhas.");
        
        //Exercício 6 (que está 5 na lista)
        
        int meses, dias;
        
        System.out.println("Exercício 6");
        
        System.out.println("Digite o número de meses: ");
        meses = teclado.nextInt();
        
        dias = meses * 30;
        
        System.out.println("O número informado de meses dá um total aproximado de "+dias+" dias.");
        
    }
    
}
