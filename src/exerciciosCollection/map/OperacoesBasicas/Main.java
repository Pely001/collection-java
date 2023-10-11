package exerciciosCollection.map.OperacoesBasicas;

public class Main {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adcionarContato("Pedro", 1111111);  
        agendaContatos.adcionarContato("Tati", 2222222);
        agendaContatos.adcionarContato("Rogerio", 33333333);
        agendaContatos.adcionarContato("Dannilo", 444444444);

        agendaContatos.removerContato("Pedro");


        agendaContatos.exibirContato();
    }
}
