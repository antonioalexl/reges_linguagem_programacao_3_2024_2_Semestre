/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula05.exercicios;

/**
 *
 * @author anton
 */
public class Aula05Exercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Circulo c1 = new Circulo();
        c1.setRaio(5000);
        System.out.println("Perimetro: " + c1.calcularPerimetro());
        System.out.println("Área: " + c1.calcularArea());

    }

}
