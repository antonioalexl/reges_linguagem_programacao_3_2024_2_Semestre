/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula02_exercicios;

import java.util.Scanner;

/**
 *
 * @author anton
 */
public class Aula02_Exercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*
        
        1)Faça o programa CalcularFaturamento.java. Este programa deve possuir  quatro variáveis: 
        faturamentoJaneiro, faturamentoFevereiro,  faturamentoMarco e faturamentoTrimestre . 
        As primeiras três variáveis,  devem ter os valores: 1500, 4500, 9800. 
        A variável faturamentoTrimestre deve receber a soma das três variáveis e o resultado deve ser impresso  no console.

         */
        int faturamentoJaneiro = 1500;
        int faturamentoFevereiro = 4500;
        int faturamentoMarco = 9800;
        int faturamentoTrimestre = faturamentoJaneiro + faturamentoFevereiro + faturamentoMarco;

        System.out.println("O Faturamento é " + faturamentoTrimestre);

        /*2)Escreva um programa que verifica se um número é par ou ímpar e imprime o resultado.
         */
 /*Scanner scann = new Scanner(System.in);
        System.out.println("Digite um numero");
        int valor = scann.nextInt();

        if (valor % 2 == 0) {
            System.out.println("O número é par!");

        } else {
            System.out.println("O número é impar!");

        }*/
 /*3)Crie uma calculadora básica que solicita ao usuário 
        que insira dois números e escolha uma operação
        (adição, subtração, multiplicação ou divisão) 
        usando um menu com switch case.
         */

 /*Scanner scann1 = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int n1 = scann1.nextInt();
        System.out.println("Digite o segundo numero: ");
        int n2 = scann1.nextInt();
        int operacao = 0;      
        int resultado = 0;
        
        System.out.println("Escolha a operacao: 1 - soma, 2 - subtracao, 3 - divisao, 4 - multiplicacao");
        operacao =scann1.nextInt();
        
        switch (operacao) {
            case 1:
                
                resultado = n1 + n2; 
                break;
            case 2:
               resultado = n1 - n2;
                break;
            case 3:
               resultado = n1 / n2;
                break;
            case 4:
                 resultado = n1 * n2;
                break;

        }
        
        System.out.println("O Resultado e " + resultado);*/
        //4)Use um loop for para imprimir os números de 1 a 10.
        for (int i = 0; i < 10; i++) {
            System.out.println("O valor e " + i);
        }

//5)Use um loop while para imprimir os números pares de 1 a 20. Utilize o operador mod %(resto). Ex:
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                System.out.println("O valor" + i + "e par");
            } else {
                System.out.println("O valor" + i + "impar");
            }
        }

//6) Escreva um programa que pede ao usuário para inserir três números e determina o maior deles usando instruções if e else.
        /*Scanner scann1 = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int n1 = scann1.nextInt();
        System.out.println("Digite o segundo numero: ");
        int n2 = scann1.nextInt();        
        System.out.println("Digite o terceiro numero: ");
        int n3 = scann1.nextInt();
        
         int maior = n1;
        //Primeira solucao
       
        System.out.println("Primeira solucao");
       if (n2 > n1){
            maior = n2;
        }
        if(n3 > maior){
            maior = n3;
        }
       System.out.println("O maior numero é " + maior);
        
        System.out.println("segunda solucao");           
        if(n1 >= n2 && n1 >= n3){
          maior = n1;
        }
        else if(n2 >= n1 && n2 >= n3){
         maior = n2;
        }
        else{maior = n3;}
        
        System.out.println("O maior numero é " + maior);
        
         */
//7)Peça ao usuário para inserir um número e imprima a tabuada de multiplicação desse número de 1 a 10 usando um loop for.
        /*  Scanner scann1 = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int n = scann1.nextInt();
           System.out.println("Tabuada do " + n);
        for (int i = 0; i <= 10; i++) {
            System.out.println(n + " x "  + i + "= " +  (n * i));
        }*/
//8)Escreva um programa que verifica se uma letra inserida pelo usuário é uma vogal ou consoante usando instruções if e else.
        /*Scanner scann2 = new Scanner(System.in);
        System.out.println("Digite uma letra: ");
        String letra = scann2.next();
         
        
        switch (letra.toLowerCase()) {

            case "a":                
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("E uma vogal");
                break;
            default:
                 System.out.println("E uma consoante");
                break;

        }*/
//9)Crie um programa que faz uma contagem regressiva de 10 a 1 usando um loop for.
        for (int i = 10; i > 0; i--) {
            System.out.println("O valor e " + i);
        }

//10)Faça um algoritmo que recebe como entrada do usuário o preço da gasolina e do etanol, 
//faça o cálculo e retorne se é mais vantajoso abastecer com etanol ou gasolina. 
//Para a regra de cálculo, considere que é mais vantajoso abastecer com etanol quando o preço do litro for menor que 70% do valor da gasolina.

        /*Scanner scann1 = new Scanner(System.in);
        System.out.println("Digite o valor do etanol: ");
        float etanol = scann1.nextFloat();
        
        System.out.println("Digite o valor da gasolina: ");
        float gasolina = scann1.nextFloat();   

        if((etanol / gasolina)<= 0.7 )
        {
            System.out.println("Abasteça com Etanol");
        }
        else{
         System.out.println("Abasteça com Gasolina");
        }
            */
        
    //11)Desenvolva um algoritmo que crie três variáveis do tipo double (altura, peso e total). A altura e peso deverá ser solicitada ao usuário e o total é o cálculo do IMC. Após o cálculo, o valor deverá ser impresso no console.
        /*Obs.: Fórmula de cálculo do IMC



        IMC = Peso ÷ (Altura × Altura)
        //Exercicio 01
    
    
    }*/
        Scanner scann1 = new Scanner(System.in);
        System.out.println("Digite a altura: ");
        float altura = scann1.nextFloat();
        
        System.out.println("Digite o peso: ");
        float peso = scann1.nextFloat(); 
        
        float imc = peso / ( altura * altura);
        
        System.out.println("O imc e " + imc);
        
    }
}
