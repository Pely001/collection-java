package exerciciosCollection.list.OperacoesBascias.somaNumeros;

public class Main {
    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros(null);

        // Adicionando números
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(-5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(0);

        // Números adicionados
        System.out.println("Números adicionados: ");
        somaNumeros.exibirNumeros();

        // Soma
        System.out.println("Soma dos números: " + somaNumeros.caucularSoma());

        // Encontrando números

        System.out.println("Número maior da lista: " + somaNumeros.econtrarMaiorNumero());
        System.out.println("Número menor da lista: " + somaNumeros.econtrarMenorNumero());
    }
}
