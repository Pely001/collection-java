package exerciciosCollection.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefasSet;

    public ListaTarefas() {
        this.tarefasSet = new HashSet<>();
    }
    public void adicionarTarefa(String descricao) {
        tarefasSet.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        Tarefa tarefaParaRemover = null;
        if(!tarefasSet.isEmpty()){
            for(Tarefa t : tarefasSet){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefaParaRemover = t;
                    break;
                }
            }
            tarefasSet.remove(tarefaParaRemover);
        }else{
            throw new RuntimeException("A Lista de Tarefas está vazia");
        }
        if (tarefaParaRemover == null){
            System.out.println("Não encontrado");
        }
    }
    public void exibirTarefa(){
        if(!tarefasSet.isEmpty()){
            System.out.println(tarefasSet);
        }else{
            throw new RuntimeException("Tarefa não encontrada");
        }
    }
    public int contarTarefas() {
        return tarefasSet.size();
      }
    
      public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : tarefasSet) {
          if (t.isConcluido()) {
            tarefasConcluidas.add(t);
          }
        }
        return tarefasConcluidas;
      }
    
      public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasNaoConcluidas = new HashSet<>();
        for (Tarefa t : tarefasSet) {
          if (!t.isConcluido()) {
            tarefasNaoConcluidas.add(t);
          }
        }
        return tarefasNaoConcluidas;
      }
    
      public void marcarTarefaConcluida(String descricao) {
        for (Tarefa t : tarefasSet) {
          if (t.getDescricao().equalsIgnoreCase(descricao)) {
            t.setConcluido(true);
          }
        }
      }
    
      public void marcarTarefaPendente(String descricao) {
        Tarefa tarefaParaMarcarComoPendente = null;
        for (Tarefa t : tarefasSet) {
          if (t.getDescricao().equalsIgnoreCase(descricao)) {
            tarefaParaMarcarComoPendente = t;
            break;
          }
        }
    
        if (tarefaParaMarcarComoPendente != null) {
          if(tarefaParaMarcarComoPendente.isConcluido()) {
            tarefaParaMarcarComoPendente.setConcluido(false);
          }
        } else {
          System.out.println("Tarefa não encontrada na lista.");
        }
      }
    
      public void limparListaTarefas() {
        if(tarefasSet.isEmpty()) {
          System.out.println("A lista já está vazia!");
        } else {
          tarefasSet.clear();
        }
      }
    
    
}
