/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author anton
 */
public class Corretora {
    //No mesmo projeto Aula03 crie uma nova classe chamada Corretora e
    //faça as seguinte operações. Crie os atributos: número(int), agencia (string), titular (string) e agencia (string) e saldo (double)

    public int Numero;
    public String Agencia;
    public String Titular;
    public double Saldo;

    public void depositar(double valor) {
        this.Saldo = this.Saldo + valor;
        this.imprimir();
    }

    public void sacar(double valor) {

        if (this.Saldo > valor) {
            this.Saldo = this.Saldo - valor;
        } else {
            System.out.println("Saldo insuficiente!!!" + this.Saldo);
        }
        this.imprimir();
    }

    public void investir() {
        this.Saldo = (this.Saldo * 1.05);
       this.imprimir();
    }

    public void imprimir() {

        System.out.println("Agencia: " + this.Agencia);
        System.out.println("Numero: " + this.Numero);

        System.out.println("Titular: " + this.Titular);
        System.out.println("Saldo: " + this.Saldo);
        System.out.println("-----------------------");
    }

    /*
    a) depositar: recebe o parâmetro valor e incrementa o valor do atributo saldo.
b)sacar: recebe o parâmetro valor e decrementa o valor do atributo saldo (se não houver saldo suficiente para o saque, imprima a mensagem “saldo insuficiente para o saque”.
c)investir: não recebe argumento e altera o valor do atributo saldo, multiplicado por 5%.
d)imprimir: o método deve imprimir o valor de todos atributos depois de cada operação de depósito, saque e investimento.
     */
}
