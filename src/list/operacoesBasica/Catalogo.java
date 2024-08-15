package list.operacoesBasica;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {

    private  List<Livro> catalogo;

    public Catalogo() {
        this.catalogo = new ArrayList<>();
    }

    public Livro adicionarLivro(String titulo, String author, Integer anoLancamento){

        Livro livro = new Livro(titulo, author, anoLancamento);

        catalogo.add(livro);

        return livro;

    }

    public List<Livro> pesquisaLivroPorNome(String nomeAuthor){

        List<Livro> listaPesquisa = new ArrayList<>();

        if(!nomeAuthor.isEmpty()){
            if(!catalogo.isEmpty()){
                for(Livro livro: catalogo){
                     if(livro.getAuthor().equalsIgnoreCase(nomeAuthor)){
                            listaPesquisa.add(livro);
                     }
                }
            } else {
                    throw new RuntimeException("O catalogo nao tem nenhum livro");
            }
        } else{
            throw new RuntimeException("O nome do Auhtor está vazio");

        }   
        return listaPesquisa;
    } 
    
    public List<Livro> pesquisaLivroPorIntervaloAnos(Integer anoPublicacaoIni, Integer anoPublicacaoFim){

        List<Livro> resultadoPesquisa = new ArrayList<>();     
        
        for(Livro livro: catalogo){
            if(livro.getAno() >= anoPublicacaoIni && livro.getAno() <= anoPublicacaoFim){
                resultadoPesquisa.add(livro);
            }
        }        

        return resultadoPesquisa;
    }

    public Livro pesquisaLivroPorFirstTitulo(String titulo){

        if(!titulo.isEmpty()){
            if(!catalogo.isEmpty()){
                for(Livro livro: catalogo){
                     if(livro.getTitulo().equalsIgnoreCase(titulo)){
                            return livro;
                     }
                }
            } else {
                    throw new RuntimeException("O catalogo nao tem nenhum livro");
            }
        } else{
            throw new RuntimeException("O nome do Titulo está vazio");

        }  
        throw new RuntimeException(" Zero livros com este titulo");      
    } 


    @Override
    public String toString() {
        return "Catalogo [catalogo=" + catalogo + "]";
    }




}
    
