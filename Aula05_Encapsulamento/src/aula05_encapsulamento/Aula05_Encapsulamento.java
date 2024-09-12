/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula05_encapsulamento;

/**
 *
 * @author anton
 */
public class Aula05_Encapsulamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa p1 = new Pessoa();
        p1.setNome( "Steve Rogers");        
        System.out.println("Nome: " + p1.getNome());
        
        
        Pessoa p2 = new Pessoa();
        p2.setNome("Batman");
        System.out.println("Nome: " + p2.getNome());
    }
    
}
