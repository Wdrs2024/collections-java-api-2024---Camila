package Main.java.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String... nomes) {
        for (String nome : nomes) {
            itens.removeIf(item -> item.getNome().equalsIgnoreCase(nome));
        }
    }

    public double calcularValorTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.calcularValor();
        }
        return total;
    }

    public void exibirItens() {
        if (itens.isEmpty()) {
            System.out.println("O carrinho está vazio.");
        } else {
            for (Item item : itens) {
                System.out.println(item);
            }
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Cadeira de Roda", 850.00, 2);
        carrinho.adicionarItem("Cama Hospitalar", 1400.00, 6);
        carrinho.adicionarItem("Luva de Latex", 30.00, 60);
        carrinho.adicionarItem("Bengala", 70.00, 9);

        System.out.println("Itens no carrinho:");
        carrinho.exibirItens();

        System.out.printf("Valor total: %.2f\n", carrinho.calcularValorTotal());

        // Remover múltiplos itens
        carrinho.removerItem("Cadeira de Roda", "Bengala");
        System.out.println("\nApós remoção do Cadeira de Roda e Bengala:");
        carrinho.exibirItens();
        System.out.printf("Valor total: %.2f\n", carrinho.calcularValorTotal());
    }
}
