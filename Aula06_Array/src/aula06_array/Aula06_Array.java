/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula06_array;

/**
 *
 * @author anton
 */
public class Aula06_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       /* int[] notas = new int[8];
        notas[0] = 1;
        notas[1] = 8;
        notas[2] = 9;
        notas[3] = 10;
        notas[4] = 4;*/
       
       int[] notas = {44,55,3,4,22,74,37,34,758,57,135};       
      
       //int maior = notas[0];
       
       int media = 0;
       for (int n : notas) {
           media = media + n;
        }
       
       
       int total = media / notas.length;
       
        System.out.println("A média é: " + total);

    }

}
