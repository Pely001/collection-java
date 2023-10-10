package exerciciosCollection.set.Ordenacao;

import java.util.Comparator;

public class Produto implements Comparable<Produto> {
    //Atributos
    private long cod;
    private String nome; 
    private double preco;
    private int quant;

    //Construtor
    public Produto(long cod, String nome, double preco, int quant) {
        this.cod = cod;
        this.nome = nome;
        this.preco = preco;
        this.quant = quant;
    }

    public long getCod() {
        return cod;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuant() {
        return quant;
    }

    @Override
    public String toString() {
        return "Produto [cod=" + cod + ", nome=" + nome + ", preco=" + preco + ", quant=" + quant + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (cod ^ (cod >>> 32));
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
        Produto other = (Produto) obj;
        if (cod != other.cod)
            return false;
        return true;
    }

    @Override
    public int compareTo(Produto p) {
      return nome.compareToIgnoreCase(p.getNome());
    }

    class ComparatorPorPreco implements Comparator<Produto>{

        @Override
        public int compare(Produto p1, Produto p2) {
            return Double.compare(p1.getPreco(), p2.getPreco());

        }
    
    }
}
