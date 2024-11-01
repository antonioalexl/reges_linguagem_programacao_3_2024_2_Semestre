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

    public Produto(String descricao, String codigoBarra, float quantidade, float valorCusto, float valorVenda) {
        this.Descricao = descricao;
        this.CodigoBarra = codigoBarra;
        this.Quantidade = quantidade;
        this.ValorCusto = valorCusto;
        this.ValorVenda = valorVenda;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public String getCodigoBarra() {
        return CodigoBarra;
    }

    public void setCodigoBarra(String CodigoBarra) {
        this.CodigoBarra = CodigoBarra;
    }

    public float getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(float Quantidade) {
        this.Quantidade = Quantidade;
    }

    public float getValorVenda() {
        return ValorVenda;
    }

    public void setValorVenda(float ValorVenda) {
        this.ValorVenda = ValorVenda;
    }

    public float getValorCusto() {
        return ValorCusto;
    }

    public void setValorCusto(float ValorCusto) {
        this.ValorCusto = ValorCusto;
    }

    public String getGrupo() {
        return Grupo;
    }

    public void setGrupo(String Grupo) {
        this.Grupo = Grupo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getUnidadeMedida() {
        return UnidadeMedida;
    }

    public void setUnidadeMedida(String UnidadeMedida) {
        this.UnidadeMedida = UnidadeMedida;
    }

    public String getNcm() {
        return Ncm;
    }

    public void setNcm(String Ncm) {
        this.Ncm = Ncm;
    }
   
    
    

}
