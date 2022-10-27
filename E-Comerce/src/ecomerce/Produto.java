package ecomerce;

import java.util.*;

public class Produto {
    String nome;
    double valor;
    int produtoEstocado;
    int quantidadeNoCarrinho;
   
    Scanner sc =  new Scanner(System.in);
    
    
    
    public Produto(String nome, double valor, int produtoEstocado ) {
        this.nome = nome;
        this.valor = valor;
        this.produtoEstocado = produtoEstocado;
    }

    public String getNome() {
        return nome;
    }
    
    public void visualizarProduto(){
        System.out.println("==============="+this.nome+"===============");
        System.out.println("Valor: "+this.valor);
        System.out.println("Estoque: "+this.produtoEstocado);
        System.out.println("=============================================");
    }
    
    public void pedeQuantidadeNoCarrinho(int qtd){
        System.out.println("Digite a quantidade do produto: ");
        qtd = sc.nextInt();
        this.quantidadeNoCarrinho = qtd; 
    }
    
    public void retirarDoEstoque(){
        this.produtoEstocado = produtoEstocado - this.quantidadeNoCarrinho;
    }
    
    public void acrescentarAoEstoque(int quantidade){
        this.produtoEstocado = produtoEstocado + this.quantidadeNoCarrinho;
    }
    
    
}
