package Main.java.Ordenacao;

public class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public int compareTo(Pessoa outra) {
        return Integer.compare(this.idade, outra.idade);
    }

    @Override
    public String toString() {
        return String.format("Nome: %s, Idade: %d, Altura: %.2f", nome, idade, altura);
    }
}
