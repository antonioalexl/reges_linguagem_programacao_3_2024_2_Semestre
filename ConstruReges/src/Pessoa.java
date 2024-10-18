
import java.util.Calendar;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author anton
 */
public abstract class Pessoa { //somente para ser herdada.

    protected int Id;
    protected String NomeCompleto;
    protected String NomeTratamento;
    protected String Documento;
    protected String InscEstadualRg;
    protected Calendar DataNasFund;

    protected Calendar DataCadastro;
    protected String Telefone;
    protected String Email;
    protected Endereco Endereco;

    public Pessoa(String nomeCompleto) {
        this.NomeCompleto = nomeCompleto;
        this.DataCadastro = Calendar.getInstance(); //Data Atual

    }

    public Pessoa(String nomeCompleto, String nomeTratamento) {
        this.NomeCompleto = nomeCompleto;
        this.NomeTratamento = nomeTratamento;
        this.DataCadastro = Calendar.getInstance(); //Data Atual

    }

    public Pessoa(String nomeCompleto, String nomeTratamento, String documento) {
        this.NomeCompleto = nomeCompleto;
        this.NomeTratamento = nomeTratamento;
        this.Documento = documento;
        this.DataCadastro = Calendar.getInstance(); //Data Atual        

    }

    public Pessoa(String nomeCompleto, String nomeTratamento, String documento, String inscEstadualRg) {
        this.NomeCompleto = nomeCompleto;
        this.NomeTratamento = nomeTratamento;
        this.Documento = documento;
        this.DataCadastro = Calendar.getInstance(); //Data Atual        
        this.InscEstadualRg = inscEstadualRg;

    }

    public Pessoa(String nomeCompleto, String nomeTratamento, String documento, String inscEstadualRg, Calendar dataNasFund) {
        this.NomeCompleto = nomeCompleto;
        this.NomeTratamento = nomeTratamento;
        this.Documento = documento;
        this.DataCadastro = Calendar.getInstance(); //Data Atual        
        this.InscEstadualRg = inscEstadualRg;
        this.DataNasFund = dataNasFund;

    }

    public Pessoa(String nomeCompleto, String nomeTratamento, String documento, String inscEstadualRg, Calendar dataNasFund, String telefone) {
        this.NomeCompleto = nomeCompleto;
        this.NomeTratamento = nomeTratamento;
        this.Documento = documento;
        this.DataCadastro = Calendar.getInstance(); //Data Atual        
        this.InscEstadualRg = inscEstadualRg;
        this.DataNasFund = dataNasFund;
        this.Telefone = telefone;
    }
    
        public Pessoa(String nomeCompleto, String nomeTratamento, String documento, String inscEstadualRg, Calendar dataNasFund, String telefone, String email) {
        this.NomeCompleto = nomeCompleto;
        this.NomeTratamento = nomeTratamento;
        this.Documento = documento;
        this.DataCadastro = Calendar.getInstance(); //Data Atual        
        this.InscEstadualRg = inscEstadualRg;
        this.DataNasFund = dataNasFund;
        this.Telefone = telefone;
        this.Email = email;
    }

        
               public Pessoa(String nomeCompleto, String nomeTratamento, String documento, String inscEstadualRg, Calendar dataNasFund, String telefone, String email, Endereco endereco) {
        this.NomeCompleto = nomeCompleto;
        this.NomeTratamento = nomeTratamento;
        this.Documento = documento;
        this.DataCadastro = Calendar.getInstance(); //Data Atual        
        this.InscEstadualRg = inscEstadualRg;
        this.DataNasFund = dataNasFund;
        this.Telefone = telefone;
        this.Email = email;
        this.Endereco = endereco;
    }
    /*
    Id 
NomeCompleto (Razão Social ou Nome)
NomeTramento (Nome Fantasia)
Documento (Cpf ou Cnpj)
InscEstadualRg 
DataNascFund (Data Nascimento ou Fundacao)
DataCadastro
Telefone
Email
Endereco
     */
}
