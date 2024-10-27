package Set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public void exibirProdutosPorNome() {
        // Usando TreeSet para ordenar por nome
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        if (produtosPorNome.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            for (Produto produto : produtosPorNome) {
                System.out.println(produto);
            }
        }
    }

    public void exibirProdutosPorPreco() {
        // Usando TreeSet com Comparator para ordenar por preço
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);

        if (produtosPorPreco.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            for (Produto produto : produtosPorPreco) {
                System.out.println(produto);
            }
        }
    }

    public static void main(String[] args) {
        CadastroProdutos cadastro = new CadastroProdutos();
        cadastro.adicionarProduto(1, "Notebook", 2500.00, 10);
        cadastro.adicionarProduto(2, "Mouse", 50.00, 100);
        cadastro.adicionarProduto(3, "Teclado", 100.00, 50);
        cadastro.adicionarProduto(4, "Headset", 70.00, 30);

        System.out.println("Produtos por nome:");
        cadastro.exibirProdutosPorNome();

        System.out.println("\nProdutos por preço:");
        cadastro.exibirProdutosPorPreco();
    }
}
