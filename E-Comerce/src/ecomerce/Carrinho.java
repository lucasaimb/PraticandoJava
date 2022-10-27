package ecomerce;

import java.util.*;

public class Carrinho {
    ArrayList<String> listaProduto = new ArrayList<String>();

    public Carrinho() {
        
    }
    
      public double fazValorTotal(Produto p){
          double valorT = p.quantidadeNoCarrinho * p.valor;
          return valorT;
    }
    
    public void adicionarItem(Produto p){
      p.pedeQuantidadeNoCarrinho(0);
      listaProduto.add(p.nome);
        System.out.println("O valor total e de: "+this.fazValorTotal(p));
      System.out.println("Foram adicionados "+p.quantidadeNoCarrinho+" "+p.nome+" no seu carrinho!");
      p.retirarDoEstoque();
    }
    
    public void visualizarCarrinho(){
        System.out.println("Produtos: "+this.listaProduto);
    }
    
}
