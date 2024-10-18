/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula10.polimorfismo;

/**
 *
 * @author anton
 */
public class Gerente extends Funcionario {

    @Override
    public void aumentarSalario(double pValor) {
        this.Salario = (this.Salario + pValor) * 1.20;
        System.out.println("O novo salário do gerente  é: " + this.Salario);
    }
}
