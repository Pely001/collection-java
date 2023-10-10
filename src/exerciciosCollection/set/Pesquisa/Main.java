package exerciciosCollection.set.Pesquisa;

public class Main {
    public static void main(String[] args) {
        AgendaContato agendaContato = new AgendaContato();
        agendaContato.exibirContato();

        agendaContato.adicionarContato("Pedro", 11111);
        agendaContato.adicionarContato("Tatiana", 22222);
        agendaContato.exibirContato();
        agendaContato.adicionarContato("Pedro", 0);
        agendaContato.exibirContato();

        System.out.println(agendaContato.pesquisarPorNome("Pedro"));
        System.out.println(agendaContato.atualizaNumeroContato("Tatiana", 444444));
    }
}
