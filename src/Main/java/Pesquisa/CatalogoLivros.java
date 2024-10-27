package Main.java.Pesquisa;

import java.util.ArrayList;
import java.util.List;


public class CatalogoLivros {
    // Attribute
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> resultado = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro livro : livroList) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    resultado.add(livro);
                }
            }
        }
        return resultado;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livroPorIntervalo = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro livro : livroList) {
                if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
                    livroPorIntervalo.add(livro);
                }
            }
        }
        return livroPorIntervalo;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro livro : livroList) {
                if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = livro;
                    break;
                }
            }
        }
        return livroPorTitulo;  // Retorna null se não encontrar
    }

    public void exibirLivros() {
        if (livroList.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
        } else {
            for (Livro livro : livroList) {
                System.out.println(livro);
            }
        }
    }

    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();
        catalogo.adicionarLivro("Livro 1", "Autor 1", 1954);
        catalogo.adicionarLivro("Livro 2", "Autor 2", 1960);
        catalogo.adicionarLivro("Livro 3", "Autor 3", 1974);
        catalogo.adicionarLivro("Livro 4", "Autor 4", 1983);
        catalogo.adicionarLivro("Livro 5", "Autor 2", 1956);

        System.out.println("Catálogo de Livros:");
        catalogo.exibirLivros();

        System.out.println("\nLivros do Autor 2:");
        for (Livro livro : catalogo.pesquisarPorAutor("Autor 2")) {
            System.out.println(livro);
        }

        System.out.println("\nLivros publicados entre 1950 e 1960:");
        for (Livro livro : catalogo.pesquisarPorIntervaloAnos(1950, 1960)) {
            System.out.println(livro);
        }

        System.out.println("\nPesquisando livro pelo título 'Livro 1':");
        Livro livroEncontrado = catalogo.pesquisarPorTitulo("Livro 1");
        System.out.println(livroEncontrado != null ? livroEncontrado : "Livro não encontrado.");
    }
}
