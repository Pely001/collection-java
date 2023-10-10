package exerciciosCollection.set.OperacoesBasicas.Convidados;

public class Main {
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados(null);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + 
        " convidados dentro do Set de convidados");

        conjuntoConvidados.adicionarConvidado("Pedro", 123); 
        conjuntoConvidados.adicionarConvidado("Pedro", 123); 
        conjuntoConvidados.adicionarConvidado("Pedro", 125); 
        conjuntoConvidados.adicionarConvidado("Pedro", 124); 
        
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + 
        " convidados dentro do Set de convidados");
        
        conjuntoConvidados.removerConvidadoPorCodConvite(123);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + 
        " convidados dentro do Set de convidados");

        conjuntoConvidados.exibirConvidados();
    }
}
