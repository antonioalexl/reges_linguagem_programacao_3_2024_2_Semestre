/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author anton
 */
public class ItemVenda {

     private Produto Produto;
    private float Quantidade;
    private float ValorVenda;
    private float SubTotal;

    public ItemVenda(Produto produto, float quantidade) {
        this.Produto = produto;
        this.Quantidade = quantidade;
        this.ValorVenda = Produto.getValorVenda();
        this.SubTotal = quantidade * Produto.getValorVenda();
    }

    public float getSubTotal() {
        return SubTotal;
    }

    public void setSubTotal(float SubTotal) {
        this.SubTotal = SubTotal;
    }
    
    public Produto getProduto() {
        return Produto;
    }

    public float getQuantidade() {
        return Quantidade;
    }

    public float getValorVenda() {
        return ValorVenda;
    }

   

}
