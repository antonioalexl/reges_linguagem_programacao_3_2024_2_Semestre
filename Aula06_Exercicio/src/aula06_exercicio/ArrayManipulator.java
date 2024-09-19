/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula06_exercicio;

/**
 *
 * @author anton
 */
public class ArrayManipulator {

    public int encontarMaiorValor(int[] input) {

        int maior = input[0];

        for (int i = 0; i < input.length; i++) {

            if(maior < input[i]){
                maior = input[i];
            }
        }
        return maior;

    }
    
    public int encontarMenorValor(int[] input) {

        int menor = input[0];

        for (int i = 0; i < input.length; i++) {

            if(menor > input[i]){
                menor = input[i];
            }
        }
        return menor;

    }
    
     public int encontarMedia(int[] input) {

        int soma = 0;

        for (int i = 0; i < input.length; i++) {
            soma = soma + input[0];
        }
        return soma / input.length;

    }
}
