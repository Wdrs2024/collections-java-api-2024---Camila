package Main.java.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoas;

    public OrdenacaoPessoas() {
        this.pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoas.add(new Pessoa(nome, idade, altura));
    }

    public void ordenarPorIdade() {
        Collections.sort(pessoas);
    }

    public void ordenarPorAltura() {
        Collections.sort(pessoas, new Comparator<Pessoa>() {
            @Override
            public int compare(Pessoa p1, Pessoa p2) {
                return Double.compare(p1.getAltura(), p2.getAltura());
            }
        });
    }

    public void exibirPessoas() {
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
    }

    public static void main(String[] args) {
        OrdenacaoPessoas listaPessoas = new OrdenacaoPessoas();
        listaPessoas.adicionarPessoa("Alice", 30, 1.65);
        listaPessoas.adicionarPessoa("Bruno", 25, 1.80);
        listaPessoas.adicionarPessoa("Carla", 22, 1.70);
        listaPessoas.adicionarPessoa("Daniel", 30, 1.75);

        System.out.println("Pessoas ordenadas por idade:");
        listaPessoas.ordenarPorIdade();
        listaPessoas.exibirPessoas();

        System.out.println("\nPessoas ordenadas por altura:");
        listaPessoas.ordenarPorAltura();
        listaPessoas.exibirPessoas();
    }
}

