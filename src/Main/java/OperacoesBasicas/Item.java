package Main.java.OperacoesBasicas;

public class Item {
    private String nome;
    private double preco;
    private int quantidade;

    public Item(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double calcularValor() {
        return preco * quantidade;
    }

    @Override
    public String toString() {
        return String.format("Item: %s, Preço: %.2f, Quantidade: %d", nome, preco, quantidade);
    }
}


