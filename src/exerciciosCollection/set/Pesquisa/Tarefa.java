package exerciciosCollection.set.Pesquisa;

public class Tarefa {

    //Atributos
    private String descricao;
    private boolean concluido;

    //Construtor
    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluido = false;
    }
    //Getters e Setters
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public boolean isConcluido() {
        return concluido;
    }
    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }
    @Override
    public String toString() {
        return "Tarefa [descricao=" + descricao + ", concluido=" + concluido + "]";
    }
    
}
