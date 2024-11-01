/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author anton
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cliente cliente = new Cliente("Steve Rogers");
        Funcionario funcionario = new Funcionario("Tony Stark", "Home de Ferro", "12121");
        
        //Criar o cadastro de produto
        Produto cimento = new Produto("Cimento", "789", 500, 15,20);
        Produto tijolo = new Produto("Tijolo", "98787778", 200, 1, 2);
        Produto telha = new Produto("Telha Portuguesa", "98787778", 1500000, 2,4);
        Produto areia = new Produto("Areia Grossa", "87878787", 5000, 15,25);
        Produto pedra = new Produto("Pedra", "9999777", 98888,5,10);
        
        Venda venda = new Venda(cliente, funcionario);
        venda.adicionarItemVenda(cimento, 600);
        venda.adicionarItemVenda(tijolo, 50);
        venda.adicionarItemVenda(pedra, 25);
        
        System.out.println("-------------------------");
        venda.imprimirCupomFiscal();
       
        
        
        
        
    }
    
}
