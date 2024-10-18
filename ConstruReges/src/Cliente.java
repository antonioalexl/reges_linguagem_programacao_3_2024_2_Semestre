
import java.util.Calendar;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author anton
 */
public class Cliente extends Pessoa {

    private String NumeroCartaoFidelidade;

    public Cliente(String nomeCompleto) {
        super(nomeCompleto);
    }

    public Cliente(String nomeCompleto, String numeroCartaoFidelidade) {
        super(nomeCompleto);
        this.NumeroCartaoFidelidade = numeroCartaoFidelidade;

    }

    public Cliente(String nomeCompleto, String nomeTratamento, String documento) {
        super(nomeCompleto, nomeTratamento, documento);
         

    }

    public Cliente(String nomeCompleto, String nomeTratamento, String documento, String inscEstadualRg) {
        super(nomeCompleto, nomeTratamento, documento, inscEstadualRg);
       

    }

    public Cliente(String nomeCompleto, String nomeTratamento, String documento, String inscEstadualRg, Calendar dataNasFund) {
        super(nomeCompleto, nomeTratamento, documento, inscEstadualRg, dataNasFund);
       

    }

    public Cliente(String nomeCompleto, String nomeTratamento, String documento, String inscEstadualRg, Calendar dataNasFund, String telefone) {
        super(nomeCompleto, nomeTratamento, documento, inscEstadualRg, dataNasFund, telefone);
       
    }

    public Cliente(String nomeCompleto, String nomeTratamento, String documento, String inscEstadualRg, Calendar dataNasFund, String telefone, String email) {

        super(nomeCompleto, nomeTratamento, documento, inscEstadualRg, dataNasFund, telefone, email);
        
    }

    public Cliente(String nomeCompleto, String nomeTratamento, String documento, String inscEstadualRg, Calendar dataNasFund, String telefone, String email, Endereco endereco) {
        super(nomeCompleto, nomeTratamento, documento, inscEstadualRg, dataNasFund, telefone, email, endereco);
        
    }

}
