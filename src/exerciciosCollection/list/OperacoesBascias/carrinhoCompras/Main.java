package exerciciosCollection.list.OperacoesBascias.carrinhoCompras;

public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        // Adicionar

        carrinhoDeCompras.adicionarItem("Mouse", 9.99, 1);
        carrinhoDeCompras.adicionarItem("Cabo USB", 2.0, 10);
        carrinhoDeCompras.adicionarItem("Teclado", 29.99, 1);
        carrinhoDeCompras.adicionarItem("Imã de Geladeira", 1.0, 1);

        // Exibir

        carrinhoDeCompras.exibirItens();

        // Remover
        carrinhoDeCompras.removerItem("Imã de Geladeira");

        // Valor Total
        System.out.println("O valor total da compra é: " + carrinhoDeCompras.calcularValorTotal());
        
    }
}
