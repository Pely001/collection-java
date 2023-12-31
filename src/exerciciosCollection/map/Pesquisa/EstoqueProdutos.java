package exerciciosCollection.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    //Atriburos
   private Map<Long, Produto> estoqueProdutosMap;

public EstoqueProdutos() {
    this.estoqueProdutosMap = new HashMap<>();
}
public void adcionarProduto(long cod, String nome, int quantidade, double preco){
    estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
}
public void exibirProdutos(){
    System.out.println(estoqueProdutosMap);
}
public double caucularTotalEstoque(){
    double valorTotalEstoque = 0;
    if(!estoqueProdutosMap.isEmpty()){
        for(Produto p : estoqueProdutosMap.values()){
            valorTotalEstoque += p.getQuantidade() * p.getPreco();
        }
    }
    return valorTotalEstoque;
}
public Produto obterProdutoMaisCaro(){
    Produto produtoMaisCaro = null;
    double maiorPreco = Double.MIN_VALUE;
    if(!estoqueProdutosMap.isEmpty()){
        for(Produto p : estoqueProdutosMap.values()){
           if(p.getPreco()>maiorPreco) {
            produtoMaisCaro = p;
           }
        }
    }
    return produtoMaisCaro;
}
   
}
