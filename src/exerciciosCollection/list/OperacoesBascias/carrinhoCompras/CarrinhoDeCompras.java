package exerciciosCollection.list.OperacoesBascias.carrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras(){
        this.itemList = new ArrayList<>();
    }
    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
        this.itemList.add(item);
    }
    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        if(!itemList.isEmpty()){
            for(Item i : itemList){
                if(i.getNome().equalsIgnoreCase(nome)){
                    itensParaRemover.add(i);
                }
            }
            itemList.removeAll(itensParaRemover);
        }else{
            System.out.println("Lista Vazia");
        }
    }
    public double calcularValorTotal(){
        double valorTotal = 0;
        if(!itemList.isEmpty()){
            for (Item item : itemList){
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;
            }
             return valorTotal;
        }else{
            throw new RuntimeException("A lista está vazia.");
        }
       
    }
    public void exibirItens(){
        if(!itemList.isEmpty()){
            System.out.println(this.itemList);
        }else{
            System.out.println("A lista está vazia");
        }
    }
    @Override
    public String toString() {
        return "CarrinhoDeCompras [itemList=" + itemList + "]";
    }
    
    

}
