package list.operacoesBasica;

public class ExecutorCodigo {

    public static void main(String[] args) {


        Catalogo catalogo = new Catalogo();
        catalogo.adicionarLivro("Titulo um 2019", "Author um", 2019);
        catalogo.adicionarLivro("Titulo dois 2020", "Author dois 1", 2020);
        catalogo.adicionarLivro("Titulo dois 2020", "Author dois 2", 2021);
        catalogo.adicionarLivro("Titulo livro ", "Author tres", 2021);
       
        // System.out.println("Livro novo:"  + catalogo);
        //  System.out.println(catalogo.pesquisaLivroPorIntervaloAnos(2019,2021));

        System.out.println(catalogo.pesquisaLivroPorFirstTitulo("Titulo dois 2020"));






    }
    
}
