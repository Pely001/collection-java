package exerciciosCollection.map.Pesquisa;

public class Main {
    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        estoqueProdutos.exibirProdutos();

        estoqueProdutos.adcionarProduto(1, "Produto A", 10, 5.0);
        estoqueProdutos.adcionarProduto(2, "Produto B", 5, 10.0);
        estoqueProdutos.adcionarProduto(3, "Produto C", 2, 15.0);
        estoqueProdutos.exibirProdutos();

        System.out.println("Valor total do estoque: R$" + estoqueProdutos.caucularTotalEstoque());
        System.out.println("Produto mais caro: " + estoqueProdutos.obterProdutoMaisCaro());
    }
}
