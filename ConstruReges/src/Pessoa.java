
import java.util.Calendar;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author anton
 */
public abstract class Pessoa { 
    
    

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

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNomeCompleto() {
        return NomeCompleto;
    }

    public void setNomeCompleto(String NomeCompleto) {
        this.NomeCompleto = NomeCompleto;
    }

    public String getNomeTratamento() {
        return NomeTratamento;
    }

    public void setNomeTratamento(String NomeTratamento) {
        this.NomeTratamento = NomeTratamento;
    }

    public String getDocumento() {
        return Documento;
    }

    public void setDocumento(String Documento) {
        this.Documento = Documento;
    }

    public String getInscEstadualRg() {
        return InscEstadualRg;
    }

    public void setInscEstadualRg(String InscEstadualRg) {
        this.InscEstadualRg = InscEstadualRg;
    }

    public Calendar getDataNasFund() {
        return DataNasFund;
    }

    public void setDataNasFund(Calendar DataNasFund) {
        this.DataNasFund = DataNasFund;
    }

    public Calendar getDataCadastro() {
        return DataCadastro;
    }

    public void setDataCadastro(Calendar DataCadastro) {
        this.DataCadastro = DataCadastro;
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

    public Endereco getEndereco() {
        return Endereco;
    }

    //somente para ser herdada.
    public void setEndereco(Endereco Endereco) {
        this.Endereco = Endereco;
    }

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
