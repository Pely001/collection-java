package exerciciosCollection.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
//Atributos
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }
    public void adicionarProduto(long cod, String nome, double preco, int quant){
        produtoSet.add(new Produto(cod, nome, preco, quant));
    }
    public Set<Produto> exibirProdutosPorNome(){
         Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
         return produtosPorNome;
    }
    public Set<Produto> exibirPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtoSet.addAll(produtoSet);
        return produtosPorPreco;
    }
}
