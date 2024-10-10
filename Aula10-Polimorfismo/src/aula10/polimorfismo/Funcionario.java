/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula10.polimorfismo;

/**
 *
 * @author anton
 */
public class Funcionario {
    public String Nome;
    public String Endereco;
    public String Email;
    public double Salario;

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }
    
    
    public void aumentarSalario(double pValor){
        this.Salario = this.Salario + pValor;
        System.out.println("O novo salário do funcionário é: " + this.Salario);
    }
}
