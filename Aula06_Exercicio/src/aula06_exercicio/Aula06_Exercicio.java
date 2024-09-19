/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula06_exercicio;

/**
 *
 * @author anton
 */

/* 1)Crie uma classe chamada ArrayManipulator que tenha um método público encontrarMaiorValor que receba um array de inteiros e retorne o maior valor encontrado no array. 

a)A classe também deve ter um método público encontrarMenorValor que receba o mesmo array de inteiros e retorne o menor valor encontrado no array.

b)Por fim, a classe deve ter um método público calcularMedia que receba o mesmo array de inteiros e retorne a média dos valores no array.

c)Na classe principal do programa, crie um array de inteiros com valores de sua escolha e use os métodos públicos da classe ArrayManipulator para encontrar o maior valor, o menor valor e a média dos valores no array.

Utilize o array int[] numeros = {12, 5, 8, 21, 9, 13, 19};*/

 /*2)Crie uma classe chamada ArrayOperations que contenha os seguintes métodos:

a)public int[] inverterArray(int[] array):

Recebe um array de inteiros e retorna um novo array com os elementos na ordem inversa.

b)public int somarValores(int[] array):

Recebe um array de inteiros e retorna a soma de todos os valores contidos nele.

c)public boolean verificarContem(int[] array, int valor):

Recebe um array de inteiros e um valor inteiro. Retorna true se o valor estiver presente no array e false caso contrário.

Utilize o array       int[] numeros = {7, 2, 9, 4, 6, 18, 20,24,28,1,5};*/

 /*3)Crie uma classe chamada CalculadoraMedia que tenha o seguinte método:

public double calcularMedia(double[] array):

Esse método deve receber um array de double e retornar a média dos valores contidos nele.

Na classe principal do programa, crie um array de double com valores de sua escolha e use o método calcularMedia da classe CalculadoraMedia para calcular e imprimir a média dos valores do array.

Use o array    double[] numeros = {12.5, 8.3, 7.9, 10.0, 15.7};*/
public class Aula06_Exercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* ArrayManipulator a1 = new ArrayManipulator();
        int[] numeros = {12, 5, 8, 21, 9, 13, 19};
        System.out.println("Maior Valor: " + a1.encontarMaiorValor(numeros));
        System.out.println("Menor Valor: " + a1.encontarMenorValor(numeros));
        System.out.println("Media: " + a1.encontarMedia(numeros));*/
       
       ArrayOperations arr = new ArrayOperations();
        int[] input = {7, 2, 9, 4, 6, 18, 20,24,28,1,5};
       arr.inverterValor(input);
       
       

    }

}
