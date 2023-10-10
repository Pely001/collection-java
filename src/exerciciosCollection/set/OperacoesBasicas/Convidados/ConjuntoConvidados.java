package exerciciosCollection.set.OperacoesBasicas.Convidados;

import java.util.HashSet;
import java.util.Set;


public class ConjuntoConvidados {
    //Atributos
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados(Set<Convidado> convidadoSet) {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codConvite){
        convidadoSet.add(new Convidado(nome, codConvite));
    }

    public void removerConvidadoPorCodConvite(int codConvite){
        Convidado convidadoParaRemover = null;
        if(!convidadoSet.isEmpty()){
            for(Convidado c : convidadoSet){
                if(c.getCodConvite() == codConvite){
                    convidadoParaRemover = c;
                    break;
                }else{
                    throw new RuntimeException("Não existe convidado com esse código de convite");
                }
            }
            convidadoSet.remove(convidadoParaRemover);
        }else{
            throw new RuntimeException("A lista está vazia");
        }
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }
}
