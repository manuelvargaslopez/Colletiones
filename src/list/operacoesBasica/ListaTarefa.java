package list.operacoesBasica;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefalist;

    public ListaTarefa() {
        this.tarefalist = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){

        tarefalist.add( new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        for(Tarefa t : tarefalist ){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }          
        }

        tarefalist.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {

        return tarefalist.size();
    }

    public void obterDescricoesTarefas() {
        
        System.out.println(tarefalist);
    
    }

    public static void main(String[] args) {
        System.out.println("Oia");

        ListaTarefa listatarefa = new ListaTarefa();
        System.out.println(listatarefa.obterNumeroTotalTarefas());

        listatarefa.adicionarTarefa("Tarefa um");
        listatarefa.adicionarTarefa("Tarefa um");
        listatarefa.adicionarTarefa("Tarefa dois");
        System.out.println(listatarefa.obterNumeroTotalTarefas());

       // listatarefa.removerTarefa("Tarefa dois");
        System.out.println(listatarefa.obterNumeroTotalTarefas());

        listatarefa.obterDescricoesTarefas();



    }
    
}
