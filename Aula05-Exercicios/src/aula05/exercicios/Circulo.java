/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05.exercicios;

/**
 *
 * @author anton
 */
public class Circulo {

    // Atributos
    private double raio; // Atributo privado


    public double getRaio() {
        return this.raio;
    }

    public void setRaio(double raio) {
        
         this.raio = raio;
        
    }

    public double calcularArea() {
        return Math.PI * Math.pow(this.raio, 2);
    }

    public double calcularPerimetro() {
        
        return 2 * Math.PI * this.raio;
    }
}
