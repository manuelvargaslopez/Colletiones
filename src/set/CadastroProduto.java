package set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {

    private Set<Produto> listaProdutos;

    public CadastroProduto() {
        this.listaProdutos = new HashSet<>();        
    }

    public void adicionarProduto(long codigo, String nome, long preco, int qtdade){
        listaProdutos.add(new Produto(codigo, nome, preco, qtdade));
    }

    public Set<Produto> exibirProdutosPorNome(){

        Set<Produto> produtosPorNome = new TreeSet<>(listaProdutos);
        return produtosPorNome;      
    }


    
}
