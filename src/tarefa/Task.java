package tarefa;

public class Task {

    private String descricao;

    

    public Task() {
    }
    

    public Task(String descricao) {
        this.descricao = descricao;
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    @Override
    public String toString() {
        return "Task [descricao=" + descricao + "]";
    }    
    
}
