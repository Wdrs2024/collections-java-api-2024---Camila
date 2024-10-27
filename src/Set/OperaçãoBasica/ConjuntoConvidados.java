package Set.OperaçãoBasica;
import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
         Convidado convidado = new Convidado(nome, codigoConvite);
        convidadoSet.add(convidado);
        //método abaixo simplificado
        /*convidadoSet.add(new Convidado(nome, codigoConvite));*/
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for(Convidado C : convidadoSet){
            if(C.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = C;
                break;
            }
        }
        // pode ser feito conforme o método abaixo.
        /*convidadoSet.removeIf(convidado -> convidado.getCodigoConvite() == codigoConvite);
        */
        convidadoSet.remove(convidadoParaRemover);
    }


    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);

        //pode ser feito assim também
           /* if (convidadoSet.isEmpty()) {
            System.out.println("Nenhum convidado cadastrado.");
        } else {
            for (Convidado convidado : convidadoSet) {
                System.out.println(convidado);
            }*/

        }


    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem "+ conjuntoConvidados.contarConvidados() + " convidado dentro do Set convidados");


        conjuntoConvidados.adicionarConvidado("João", 101);
        conjuntoConvidados.adicionarConvidado("Maria", 102);
        conjuntoConvidados.adicionarConvidado("Joana", 103);
        conjuntoConvidados.adicionarConvidado("Gabriel", 103);

        System.out.println("Convidados:");
        conjuntoConvidados.exibirConvidados();

        System.out.println("\nTotal de convidados: " + conjuntoConvidados.contarConvidados());

        conjuntoConvidados.removerConvidadoPorCodigoConvite(102);
        System.out.println("\nApós remover o convidado com código 102:");
        conjuntoConvidados.exibirConvidados();

        System.out.println("\nTotal de convidados: " + conjuntoConvidados.contarConvidados());
    }
    }

