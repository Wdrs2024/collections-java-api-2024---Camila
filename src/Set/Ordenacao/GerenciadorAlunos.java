package Set.Gerenciador;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunos;

    public GerenciadorAlunos() {
        this.alunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media) {
        alunos.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(Long matricula) {
        alunos.removeIf(aluno -> aluno.getMatricula().equals(matricula));
    }

    public void exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>((a1, a2) -> a1.getNome().compareToIgnoreCase(a2.getNome()));
        alunosPorNome.addAll(alunos);
        alunosPorNome.forEach(System.out::println);
    }

    public void exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>((a1, a2) -> Double.compare(a1.getMedia(), a2.getMedia()));
        alunosPorNota.addAll(alunos);
        alunosPorNota.forEach(System.out::println);
    }

    public void exibirAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            alunos.forEach(System.out::println);
        }
    }

    public double calcularMediaNotas() {
        if (alunos.isEmpty()) return 0;

        double soma = 0;
        for (Aluno aluno : alunos) {
            soma += aluno.getMedia();
        }
        return soma / alunos.size(); // Calcula a média
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciador = new GerenciadorAlunos();
        gerenciador.adicionarAluno("Alice", 12345L, 8.5);
        gerenciador.adicionarAluno("Bob", 12346L, 7.0);
        gerenciador.adicionarAluno("Charlie", 12347L, 9.2);
        gerenciador.adicionarAluno("Gabriel", 12348L, 6.5);

        System.out.println("Alunos por nome:");
        gerenciador.exibirAlunosPorNome();

        System.out.println("\nAlunos por nota:");
        gerenciador.exibirAlunosPorNota();

        System.out.println("\nTodos os alunos:");
        gerenciador.exibirAlunos();

        // Calculando e exibindo a média das notas dos alunos
        double media = gerenciador.calcularMediaNotas();
        System.out.printf("\nMédia das notas dos alunos: %.2f\n", media);
    }
}
