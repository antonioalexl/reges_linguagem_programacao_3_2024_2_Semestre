/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05.exercicios;

/**
 *
 * @author anton
 */
public class Agenda {

    /* 2)Crie uma classe agenda com os seguintes atributos privados: Nome, telefone, e-mail e endereço.
    Crie os métodos sets e gets
    Faça testes criando 5 objetos do tipo Agenda*/
    private String Nome;
    private String Telefone;
    private String Email;
    private String Endereco;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

   
}
