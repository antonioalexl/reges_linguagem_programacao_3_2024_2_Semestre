/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author anton
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*1)Crie o projeto Aula03 e crie uma classe Contato com os seguinte atributos: nome, telefone, email e endereco (string) e faça os itens abaixo: 

a) Crie uma classe chamada Principal e dentro dela faça o método main para usar seus objetos. Ex.: public static void main(String[] args) {   //SEU CÓDIGO AQUI       }

b) No método main, crie 4 objetos do tipo Contato, onde cada objeto deve guardar os dados de 4 contatos seu.

c)Também no método main, exiba todos os dados de todos os 4 contatos criados no console.*/
       /* Contato c1 = new Contato();
        c1.Nome = "João";
        c1.Email = "joao@reges.edu.br";
        c1.Endereco = "Rua da Reges";
        c1.Telefone = "32141111";

        System.out.println("Nome: " + c1.Nome);
        System.out.println("Email: " + c1.Email);
        System.out.println("Endereco: " + c1.Endereco);
        System.out.println("Telefone: " + c1.Telefone);

        System.out.println("---------------------");

        Contato c2 = new Contato();
        c2.Nome = "Manoel";
        c2.Email = "manoel@reges.edu.br";
        c2.Endereco = "Avenida Wladimir Meireles";
        c2.Telefone = "23232";

        System.out.println("Nome: " + c2.Nome);
        System.out.println("Email: " + c2.Email);
        System.out.println("Endereco: " + c2.Endereco);
        System.out.println("Telefone: " + c2.Telefone);

        System.out.println("---------------------");

        Contato c3 = new Contato();
        c3.Nome = "Sebastião";
        c3.Email = "sebastiao@reges.edu.br";
        c3.Endereco = "Avenida João Fiusa";
        c3.Telefone = "323232";

        System.out.println("Nome: " + c3.Nome);
        System.out.println("Email: " + c3.Email);
        System.out.println("Endereco: " + c3.Endereco);
        System.out.println("Telefone: " + c3.Telefone);

        System.out.println("---------------------");

        Contato c4 = new Contato();
        c4.Nome = "Jose";
        c4.Email = "ose@reges.edu.br";
        c4.Endereco = "Rua do Jose";
        c4.Telefone = "2323232";

        System.out.println("Nome: " + c4.Nome);
        System.out.println("Email: " + c4.Email);
        System.out.println("Endereco: " + c4.Endereco);
        System.out.println("Telefone: " + c4.Telefone);*/


        /*2)No mesmo projeto Aula03 crie uma nova classe chamada Corretora e faça as seguinte operações. Crie os atributos: número(int), agencia (string), titular (string) e agencia (string) e saldo (double). Implemente os métodos:

a) depositar: recebe o parâmetro valor e incrementa o valor do atributo saldo. 

b)sacar: recebe o parâmetro valor e decrementa o valor do atributo saldo (se não houver saldo suficiente para o saque, imprima a mensagem “saldo insuficiente para o saque”.

c)investir: não recebe argumento e altera o valor do atributo saldo, multiplicado por 5%.

d)imprimir: o método deve imprimir o valor de todos atributos depois de cada operação de depósito, saque e investimento.

Faça testes no método main da classe principal, criando vários objetos e realizando operações de saque, depósito e impressão.*/
   
    Corretora cor1 = new Corretora();
    cor1.Titular = "Peter Parker";
    cor1.Agencia = "001";
    cor1.Saldo = 100;
    
    cor1.imprimir();
    cor1.depositar(10);
    cor1.imprimir();
    
    
    cor1.sacar(25);
    cor1.imprimir();
    
    
    }

}
