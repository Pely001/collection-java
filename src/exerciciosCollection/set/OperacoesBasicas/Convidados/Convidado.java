package exerciciosCollection.set.OperacoesBasicas.Convidados;

public class Convidado {
    //Atributos
    private String nome;
    private int codConvite;

    //Construtor
    public Convidado(String nome, int codConvite) {
        this.nome = nome;
        this.codConvite = codConvite;
    }
    //Getters
    public String getNome() {
        return nome;
    }

    public int getCodConvite() {
        return codConvite;
    }
    
    @Override
    public String toString() {
        return "Convidado [nome=" + nome + ", codConvite=" + codConvite + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codConvite;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Convidado other = (Convidado) obj;
        if (codConvite != other.codConvite)
            return false;
        return true;
    }
    
    
    
}
