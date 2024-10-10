/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula10.polimorfismo;

/**
 *
 * @author anton
 */
public class Aula10Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Funcionario f1 = new Funcionario();
        f1.setSalario(1000);
        f1.aumentarSalario(80);

        Gerente g1 = new Gerente();
        g1.setSalario(1000);
        g1.aumentarSalario(80);
        
        
        Supervisor s1 = new Supervisor();
        s1.setSalario(1000);
        s1.aumentarSalario(80);

    }

}
