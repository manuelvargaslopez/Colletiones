package map;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    Map<Long , Produto> estoqueProdutos;

    public EstoqueProdutos() {
        this.estoqueProdutos = new HashMap<>();
    }

    public void adicionarProduto(Long cod, String nome, Double preco, int qtd ){

        Produto prod = new Produto(nome, preco, qtd);
        estoqueProdutos.put(cod, prod);
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutos);

    }

    public Double calculaValorTotal(){

        Double valorTotalEstoque=0D;

        if(!estoqueProdutos.isEmpty()) 
            for(Produto p : estoqueProdutos.values())
                 valorTotalEstoque += p.getPreco() * p.getQtd();

        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        
        Produto produtoMaisCaro = null;
        Double maiorPreco = Double.MIN_VALUE;

        if(!estoqueProdutos.isEmpty())
            for(Produto p: estoqueProdutos.values())
                if(p.getPreco() > maiorPreco)
                    produtoMaisCaro = p;

        return produtoMaisCaro ;
    }   



    public static void main(String[] args) {

        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.exibirProdutos();

        estoque.adicionarProduto(1L, "Produto A", 5.0, 10);
        estoque.adicionarProduto(2L, "Produto B", 10.0, 5);
        estoque.adicionarProduto(3L, "Produto C", 15.0, 2);
        estoque.adicionarProduto(3L, "Produto D", 20.0, 2);

        estoque.exibirProdutos();

        System.out.println(estoque.calculaValorTotal());
        System.out.println("------------------------------------------");

        System.out.println(estoque.obterProdutoMaisCaro());

    }
}
