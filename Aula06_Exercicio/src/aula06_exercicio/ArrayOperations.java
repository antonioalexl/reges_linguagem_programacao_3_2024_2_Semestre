/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula06_exercicio;

/**
 *
 * @author anton
 */
public class ArrayOperations {

    public int[] inverterValor(int[] input) {

        int[] temp = new int[input.length];

        int count = 0;
        for (int i = input.length - 1; i >= 0; i--) {
            temp[count] = input[i];
            count = count + 1;
        }

        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);
        }
        return temp;
    }

    public int somaValor(int[] input) {

        int soma = 0;
        for (int i = 0; i < input.length; i++) {
            soma = soma + input[i];

        }
        return soma;
    }

    public boolean verificarContem(int[] input, int valor) {

        boolean contem = false;
        for (int i = 0; i < input.length; i++) {
            if (input[i] == valor) {
                contem = true;
                break;
            }

        }
        return contem;
    }
}
