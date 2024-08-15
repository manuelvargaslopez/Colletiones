package set;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() {

        this.contatoSet = new HashSet<>();

    }

    public void adicionarContato(String nome, Integer numero){
        
            contatoSet.add(new Contato(nome, numero));  
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNomeContato(String nome){
        Set<Contato> pesquisaContato = new HashSet<>();

        for(Contato t : contatoSet){
            if(t.getNome().startsWith(nome)){
                pesquisaContato.add(t);
            }
        }
        return pesquisaContato;
    }

    public void atualizarNumeroContato(String nome, Integer numero){
        
        for(Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(numero);
            }
        }
    }
    
    
}
