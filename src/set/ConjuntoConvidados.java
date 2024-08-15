package set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigo){

        convidadoSet.add(new Convidado(nome, codigo));

    }

    public void removerConvidadoPeloCodigo(int codigo){
        for(Convidado c: convidadoSet){
            if(c.getCodigoConvite() == codigo){
                convidadoSet.remove(c);
                break;
            }
        }
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }


    public static void main(String[] args) {
        
        ConjuntoConvidados cjconv = new ConjuntoConvidados();
        System.out.println("Há " + cjconv.contarConvidados() + " comvidados No SET");

        cjconv.adicionarConvidado("Convidado 4", 1234);
        cjconv.adicionarConvidado("5 Convidado", 2235);
        cjconv.adicionarConvidado("Convidado 6", 1236);
        cjconv.adicionarConvidado("Convidado 7", 1237);
        cjconv.adicionarConvidado("Convidado 5", 12346);

        System.out.println("########################################################");
        System.out.println("Há " + cjconv.contarConvidados() + " comvidados No SET");
        System.out.println("########################################################");
        cjconv.exibirConvidados() ;
        System.out.println("########################################################");
       cjconv.removerConvidadoPeloCodigo(12346);
       cjconv.exibirConvidados() ;

       System.out.println("########################################################");
       System.out.println("Há " + cjconv.contarConvidados() + " comvidados No SET");

    }
    
}
