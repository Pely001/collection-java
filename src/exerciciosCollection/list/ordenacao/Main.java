package exerciciosCollection.list.ordenacao;

public class Main {
    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adicionarPessoa("Pedro", 29, 1.74);
        ordenacaoPessoas.adicionarPessoa("Tatiana", 30, 1.60);
        ordenacaoPessoas.adicionarPessoa("Dannilo", 32, 1.72);
        ordenacaoPessoas.adicionarPessoa("Rogerio", 29, 1.76);

        // System.out.println(ordenacaoPessoas.ordenarPorAltura());
        System.out.println(ordenacaoPessoas.ordernarPorIdade());
    }
}
