
import java.util.Calendar;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author anton
 */
public class Funcionario extends Pessoa {

    private Calendar DataContratacao;
    private Calendar DataDemissao;
    private String Cargo;
    private int HoraJornada;
    private float Salario;
    private int Numero;

    public Funcionario(String nomeCompleto, String nichoMercado) {
        super(nomeCompleto);
    }

    public Funcionario(String nomeCompleto, String nomeTratamento, String documento) {
        super(nomeCompleto, nomeTratamento, documento);

    }

    public Funcionario(String nomeCompleto, String nomeTratamento, String documento, String inscEstadualRg) {
        super(nomeCompleto, nomeTratamento, documento, inscEstadualRg);

    }

    public Funcionario(String nomeCompleto, String nomeTratamento, String documento, String inscEstadualRg, Calendar dataNasFund) {
        super(nomeCompleto, nomeTratamento, documento, inscEstadualRg, dataNasFund);

    }

    public Funcionario(String nomeCompleto, String nomeTratamento, String documento, String inscEstadualRg, Calendar dataNasFund, String telefone) {
        super(nomeCompleto, nomeTratamento, documento, inscEstadualRg, dataNasFund, telefone);

    }

    public Funcionario(String nomeCompleto, String nomeTratamento, String documento, String inscEstadualRg, Calendar dataNasFund, String telefone, String email) {

        super(nomeCompleto, nomeTratamento, documento, inscEstadualRg, dataNasFund, telefone, email);

    }

    public Funcionario(String nomeCompleto, String nomeTratamento, String documento, String inscEstadualRg, Calendar dataNasFund, String telefone, String email, Endereco endereco) {
        super(nomeCompleto, nomeTratamento, documento, inscEstadualRg, dataNasFund, telefone, email, endereco);

    }

}
