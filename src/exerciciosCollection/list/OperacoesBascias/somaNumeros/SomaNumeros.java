package exerciciosCollection.list.OperacoesBascias.somaNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    // Atributos
    private List<Integer> numeros;

    // Construtor
    public SomaNumeros(List<Integer> numeros) {
        this.numeros = new ArrayList<>();
    }
    
    public void adicionarNumero(int numero){
        this.numeros.add(numero);
    }

    public int caucularSoma() {
        int soma = 0;
        for(Integer numero : numeros){
            soma += numero;
        }
        return soma;
        
    }

    public int econtrarMaiorNumero(){
        int maiorNumero = Integer.MIN_VALUE;
        if(!numeros.isEmpty()){
            for(Integer numero : numeros){
                if (numero >= maiorNumero){
                    maiorNumero = numero;
                }
            }
            return maiorNumero;
        }else{
            throw new RuntimeException("A lista está vazia");
        }
    }
    
    public int econtrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        if(!numeros.isEmpty()){
            for(Integer numero : numeros){
                if (numero <= menorNumero){
                    menorNumero = numero;
                }
            }
            return menorNumero;
        }else{
            throw new RuntimeException("A lista está vazia");
        }
    }
     public void exibirNumeros(){
        if(!numeros.isEmpty()){
            System.out.println(this.numeros);
        }else{
            System.out.println("A lista está vazia");
        }
     }

    @Override
    public String toString() {
        return "SomaNumeros [numeros=" + numeros + "]";
    }
    
}
