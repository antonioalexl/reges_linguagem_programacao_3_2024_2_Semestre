
import java.util.Calendar;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author anton
 */
public class Fornecedor extends Pessoa {

    private String NichoMercado;

    public Fornecedor(String nomeCompleto, String nichoMercado) {
        super(nomeCompleto);
        this.NichoMercado = nichoMercado;
    }

    public Fornecedor(String nomeCompleto, String nomeTratamento, String documento) {
        super(nomeCompleto, nomeTratamento, documento);

    }

    public Fornecedor(String nomeCompleto, String nomeTratamento, String documento, String inscEstadualRg) {
        super(nomeCompleto, nomeTratamento, documento, inscEstadualRg);

    }

    public Fornecedor(String nomeCompleto, String nomeTratamento, String documento, String inscEstadualRg, Calendar dataNasFund) {
        super(nomeCompleto, nomeTratamento, documento, inscEstadualRg, dataNasFund);

    }

    public Fornecedor(String nomeCompleto, String nomeTratamento, String documento, String inscEstadualRg, Calendar dataNasFund, String telefone) {
        super(nomeCompleto, nomeTratamento, documento, inscEstadualRg, dataNasFund, telefone);

    }

    public Fornecedor(String nomeCompleto, String nomeTratamento, String documento, String inscEstadualRg, Calendar dataNasFund, String telefone, String email) {

        super(nomeCompleto, nomeTratamento, documento, inscEstadualRg, dataNasFund, telefone, email);

    }

    public Fornecedor(String nomeCompleto, String nomeTratamento, String documento, String inscEstadualRg, Calendar dataNasFund, String telefone, String email, Endereco endereco) {
        super(nomeCompleto, nomeTratamento, documento, inscEstadualRg, dataNasFund, telefone, email, endereco);

    }

}
