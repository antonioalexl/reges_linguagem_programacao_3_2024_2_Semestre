/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula04;

/**
 *
 * @author anton
 */
public class Conta {

    double saldo;

    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
    }

    public void sacar(double valor) {
    if (this.saldo >= valor) {
        this.saldo = this.saldo - valor;
        System.out.println("Saque concluido: Novo valor" + this.saldo);

    } else {
        System.out.println("Saque nao concluido: Saldo insuficiente" + this.saldo);

    }

    }

}
