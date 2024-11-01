/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author anton
 */
public class Endereco {

 
    private String Logradouro;
    private String Bairro;
    private String Cidade;
    private String Uf;
    private String Cep;
    private String Numero;
    private String Complemento;   
 
       public Endereco(String Logradouro, String Bairro, String Cidade, String Uf, String Cep, String Numero, String Complemento) {
        this.Logradouro = Logradouro;
        this.Bairro = Bairro;
        this.Cidade = Cidade;
        this.Uf = Uf;
        this.Cep = Cep;
        this.Numero = Numero;
        this.Complemento = Complemento;
    }
    
}
