package Set.pequisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        Contato contato = new Contato(nome, numero);
        contatoSet.add(contato);
    }

    public void exibirContatos() {
        if (contatoSet.isEmpty()) {
            System.out.println("Nenhum contato cadastrado.");
        } else {
            for (Contato contato : contatoSet) {
                System.out.println(contato);
            }
        }
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatoPorNomes = new HashSet<>();
        for (Contato contato : contatoSet) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contatoPorNomes.add(contato);
            }
        }
        return contatoPorNomes;
    }

    public void atualizarNumeroContato(String nome, int novoNumero) {
        for (Contato contato : contatoSet) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contato.setNumero(novoNumero);
                System.out.println("Número atualizado para: " + contato);
                return;
            }
        }
        System.out.println("Contato não encontrado.");
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();
        agenda.adicionarContato("João", 123456789);
        agenda.adicionarContato("Maria", 987654321);
        agenda.adicionarContato("Joana", 123123123);
        agenda.adicionarContato("Joana", 123123129);

        System.out.println("Contatos na agenda:");
        agenda.exibirContatos();

        System.out.println("\nPesquisando por 'Maria':");
        Set<Contato> contatosEncontrados = agenda.pesquisarPorNome("Maria");
        for (Contato contato : contatosEncontrados) {
            System.out.println(contato);
        }

        System.out.println("\nAtualizando o número de 'João':");
        agenda.atualizarNumeroContato("João", 111222333);

        System.out.println("\nContatos na agenda após atualização:");
        agenda.exibirContatos();
    }
}


