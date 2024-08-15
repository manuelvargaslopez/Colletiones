package map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {

        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer fone){
        agendaContatoMap.put(nome, fone);
    }

    public void removerContato(String nome){
        if(!nome.isEmpty())  agendaContatoMap.remove(nome);
    }

    public void exibirContatos(){

        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        if(!nome.isEmpty()) return agendaContatoMap.get(nome);
        return null;
    }

    




public static void main(String[] args) {

    AgendaContatos agContatos = new AgendaContatos();

    System.out.println(agContatos);

    agContatos.adicionarContato("Manuel", 12345);
    agContatos.adicionarContato("Manuel", 11111);
    agContatos.adicionarContato("Glaucia", 54321);
    agContatos.adicionarContato("Tilma", 67890);

    //System.out.println(agContatos);

    //agContatos.removerContato("Tilma");
    
   // System.out.println(agContatos);

   System.out.println("%$%¨¨&%$##");

    agContatos.put;
    
    //System.out.println(agContatos.pesquisarPorNome("Glauci"));
}


    

    
}
