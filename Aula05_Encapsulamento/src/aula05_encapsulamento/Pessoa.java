/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05_encapsulamento;

/**
 *
 * @author anton
 */
public class Pessoa {
    
    private String Nome;
    private String Endereco;
    private String Telefone;
    
    
    public void setNome(String value){
        this.Nome = "Nome da Pessoa: " +  value;
    }
    public String getNome(){
        return this.Nome;
    }
}
