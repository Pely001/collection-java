package exerciciosCollection.set.OperacoesBasicas.PalavrasUnicas;

import java.util.Set;

public class ConjuntoPalavrasUnicas {
    //Atributos
    private Set<String> palavrasSet;

    //Construtor
    public ConjuntoPalavrasUnicas(Set<String> palavrasSet) {
        this.palavrasSet = palavrasSet;
    }

    //Getter
    public Set<String> getPalavrasSet() {
        return palavrasSet;
    }

    //Métodos
    public void adcionarPalavra(String palavra){
        palavrasSet.add(palavra);
    }
    public void removerPalavra(String palavra){
        if(!palavrasSet.isEmpty()){
            if(palavrasSet.contains(palavra)){
                palavrasSet.remove(palavra);
            }else{
                throw new RuntimeException("Palavra não localizada");
            }
        }else{
            throw new RuntimeException("Conjunto está vazio");
        }
    }

    public boolean verificarPalavra(String palavra){
        return palavrasSet.contains(palavra);
    }
    public void exibirPalavras(){
        if(!palavrasSet.isEmpty()){
            System.out.println(palavrasSet);
        }else{
            throw new RuntimeException("Conjunto está vazio");
        }
    }

    @Override
    public String toString() {
        return "ConjuntoPalavrasUnicas [palavrasSet=" + palavrasSet + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((palavrasSet == null) ? 0 : palavrasSet.hashCode());
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
        ConjuntoPalavrasUnicas other = (ConjuntoPalavrasUnicas) obj;
        if (palavrasSet == null) {
            if (other.palavrasSet != null)
                return false;
        } else if (!palavrasSet.equals(other.palavrasSet))
            return false;
        return true;
    }
    
}
