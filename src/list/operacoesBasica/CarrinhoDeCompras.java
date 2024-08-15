package list.operacoesBasica;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> items;     

    public CarrinhoDeCompras() {
        this.items = new ArrayList<>();
    }

    public void adicionarItem(Item item){

        items.add(item);
    }

    public void removerItem(String nome){

        List<Item> itemAremover = new ArrayList<>();
        for(Item t : items){
            if(t.getNome().equalsIgnoreCase(nome)){
                itemAremover.add(t);
            }
        }
        items.removeAll(itemAremover);        

    }

    public void calcularValorTotal(){

        Double total = 0.0D;

        if(!items.isEmpty()){    
            for(Item it: items){
                    total += it.getPreco() * it.getQuatidade();
            }
        }
        System.out.println(total);
      
    }

    public void exibirItens(){

        System.out.println(items);
    }
  
    
    public static void main(String[] args) {

        CarrinhoDeCompras cdc = new CarrinhoDeCompras();

        Item it = new Item("Nome do primeiro item do carrinho",1.0D, 10);
        Item it2 = new Item("Nome do segundo do carrinho",2.0D, 6);

        cdc.adicionarItem(it);
        cdc.adicionarItem(it2);

        cdc.exibirItens();
        System.out.println("###################################################"); 
        cdc.calcularValorTotal() ;      
    
        System.out.println("###################################################"); 

        cdc.removerItem("Nome do primeiro item do carrinho");
        cdc.exibirItens();
        cdc.calcularValorTotal() ;  

        String ver1 = "true";
        String ver2 = "true";
        boolean resultado;

        System.out.println("-------------------------");
        System.out.println(ver1 == ver2 ? "Veradeiro": "Falso");

    }



    

    
}
