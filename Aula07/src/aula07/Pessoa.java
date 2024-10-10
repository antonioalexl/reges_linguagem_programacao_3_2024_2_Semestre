/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula07;

/**
 *
 * @author anton
 */
public class Pessoa {

    private String nome;
    private String cpf;
    private String telefone;

     public Pessoa() {
      
    }

    
    
    public Pessoa(String pNome) {
        this.nome = pNome;
    }

    public Pessoa(String abatace, String pTelefone) {
        this.nome = abatace;
        this.telefone = pTelefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
