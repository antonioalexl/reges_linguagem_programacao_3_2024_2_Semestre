/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula03;

/**
 *
 * @author anton
 */
public class Aula03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conta c1 = new Conta();
        c1.Agencia = "123";
        c1.Numero = "456";
        c1.Saldo = 39000000;
        
        
        c1.Imprimir();
        
        System.out.println("-------------");
          Conta c2 = new Conta();
        c2.Agencia = "123";
        c2.Numero = "456";
        c2.Saldo = 39000000;
        
        
        c2.Imprimir();
        
        
        System.out.println(c1.Agencia == c2.Agencia);
    }
    
}
