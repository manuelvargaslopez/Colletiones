package list.operacoesBasica;

public class Item {

    private String nome;
    private Double preco;
    private int quatidade;

    public Item() {
    }

    

    public Item(String nome, Double preco, int quatidade) {
        this.nome = nome;
        this.preco = preco;
        this.quatidade = quatidade;
    }



    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }
    public int getQuatidade() {
        return quatidade;
    }
    public void setQuatidade(int quatidade) {
        this.quatidade = quatidade;
    }

    @Override
    public String toString() {
        return "Item [nome=" + nome + ", preco=" + preco + ", quatidade=" + quatidade + "]";
    }    
}
