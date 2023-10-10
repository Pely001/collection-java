package exerciciosCollection.list.OperacoesBascias.listaTarefas;

public class Main {
    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 3");
        listaTarefa.adicionarTarefa("Tarefa 4");
        listaTarefa.adicionarTarefa("Tarefa 5");

        System.out.println("Número total de elementos na lista é: " + listaTarefa.oberNumeroTotalTarefas());

        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("Número total de elementos na lista é: " + listaTarefa.oberNumeroTotalTarefas());

        listaTarefa.oberDescricoesTarefas();
        
    }
}
