package ecomerce;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Carrinho carrinho1 = new Carrinho();
        Produto chapeu1 = new Produto("chapeu", 15, 30);
        
        chapeu1.visualizarProduto();
        
        
        carrinho1.adicionarItem(chapeu1);
        
        carrinho1.visualizarCarrinho();
        //System.out.println(carrinho1.listaProduto);
        
        System.out.println("O estoque e de: "+chapeu1.produtoEstocado);
        //System.out.println(carrinho1.fazValorTotal(chapeu1));
        System.out.println("Quantidade do produto "+chapeu1.nome+" no carrinho: "+chapeu1.quantidadeNoCarrinho);
        chapeu1.visualizarProduto();
        
    }
    
}
