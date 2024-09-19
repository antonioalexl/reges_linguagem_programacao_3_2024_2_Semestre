/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula06_exercicio;

/**
 *
 * @author anton
 */
public class CalculadoraMedia {
    
    
    public double encontarMedia(double[] input) {

        double soma = 0;

        for (int i = 0; i < input.length; i++) {
            soma = soma + input[0];
        }
        return soma / input.length;

    }
}
