
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author anton
 */
public class Venda {

    private int Id;
    private float ValorTotalVenda;
    private Cliente Cliente;
    private float ValorImposto;
    private float ValorFrete;
    private Funcionario Funcionario;
    private LocalDate DataVenda;
    private List<ItemVenda> Itens;

    public Venda(Cliente cliente, Funcionario funcionario) {
       
        this.Id = (int)(Math.random() * 101);
        this.Cliente = cliente;
        this.Funcionario = funcionario;
        //PEGA A DATA DO SISTEMA OPERACIONAL

        LocalDate currDate = LocalDate.now();
        this.DataVenda = currDate;
    }

    public void adicionarItemVenda(Produto produto, float qtd) {

        ItemVenda item = new ItemVenda(produto, qtd);

        //TESTA A QUANTIDADE, SE A QUANTIDADE DO ESTOQUE DO PRODUTO FOR MAIOR, DEIXA VENDA, CASO CONTRARIO, RETORNA FALSO
        if (produto.getQuantidade() > qtd) {
            //SE A LISTA ESTIVER NULA, ADICIONA UMA REFERENCIA
            if (this.Itens == null) {
                this.Itens = new ArrayList<>();
            }
            this.Itens.add(item);
           
        }
        else{
            System.out.println("Quantidade em estoque do produto: " + produto.getDescricao()  + " insuficiente");
            System.out.println("A quantidade disponivel e: " + produto.getQuantidade());
        
        }
    }

    public void imprimirCupomFiscal() {

         System.out.println("Numero da Venda " + this.Id);
         System.out.println("Cliente: " + this.Cliente.getNomeCompleto());
         System.out.println("Vendedor: " + this.Funcionario.getNomeCompleto());

        DateTimeFormatter formatPattern = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Data da Venda: " + this.DataVenda.format(formatPattern));

        System.out.println("------------------------------------------------");
        System.out.println("--------------Itens da Venda-------------------");

        //Para cada item da lista de itens
        float totalVenda = 0;
        for (ItemVenda item : this.Itens) {

            totalVenda = totalVenda + item.getSubTotal();
            System.out.println(item.getProduto().getCodigoBarra() + "-" + item.getProduto().getDescricao() + " - " + item.getQuantidade() + " x " + item.getValorVenda() + " = " + item.getSubTotal());

        }
         System.out.println("--------------------------------------------");
        System.out.println("Valor Total: " + totalVenda);
        System.out.println("--------------------------------------------");
    }

}
