package map;

public class Produto {
    private String nome;
    private Double preco;
    private int qtd;

    public Produto(String nome, Double preco, int qtd) {
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public int getQtd() {
        return qtd;
    }

    @Override
    public String toString() {
        return "nome=" + nome + ", preco=" + preco + ", qtd=" + qtd + "";
    }
}
