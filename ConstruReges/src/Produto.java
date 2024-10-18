/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author anton
 */
public class Produto {

    private int Id;
    private String Descricao;
    private String CodigoBarra;
    private float Quantidade;

    private float ValorVenda;
    private float ValorCusto;
    private String Grupo;
    private String Marca;
    private String UnidadeMedida;
    private String Ncm;

    private Produto(String descricao, String codigoBarra, float quantidade){
        this.Descricao = descricao;
        this.CodigoBarra = codigoBarra;
        this.Quantidade = quantidade;
    }
    
}
