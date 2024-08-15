package set;

public class Produto implements Comparable<Produto>{

    private long codigo;
    private String nome;
    private Long preco;
    private int quanty;


    public Produto() {        
    }

    public Produto(long codigo, String nome, Long preco, int quanty) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quanty = quanty;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getPreco() {
        return preco;
    }

    public void setPreco(Long preco) {
        this.preco = preco;
    }

    public int getQuanty() {
        return quanty;
    }

    public void setQuanty(int quanty) {
        this.quanty = quanty;
    }

    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (codigo ^ (codigo >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produto other = (Produto) obj;
        if (codigo != other.codigo)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Produto [codigo=" + codigo + ", nome=" + nome + ", preco=" + preco + ", quanty=" + quanty + "]";
    }

    @Override
    public int compareTo(Produto p) {
       return nome.compareToIgnoreCase(nome);
    }

    

    

    


    
}
