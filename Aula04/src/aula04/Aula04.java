/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula04;

/**
 *
 * @author anton
 */
public class Aula04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conta c1 = new Conta();
        c1.saldo = 1500;
        c1.depositar(800);
        c1.sacar(750);       
        
        System.out.println("------------------");
        
        for (int i = 0; i < 100000; i++) {
                Conta c2 = new Conta();
                c2.saldo = (200 + i) * 2;
                c2.depositar(500 - i);
                c2.sacar(800 + i);
        }
      
       
        

    }

}
