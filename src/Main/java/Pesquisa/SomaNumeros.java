
package Main.java.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        return soma;
    }

    public Integer encontrarMaiorNumero() {
        if (numeros.isEmpty()) {
            return null;  // Retorna null se a lista estiver vazia
        }
        int maior = numeros.get(0);
        for (int numero : numeros) {
            if (numero > maior) {
                maior = numero;
            }
        }
        return maior;
    }

    public Integer encontrarMenorNumero() {
        if (numeros.isEmpty()) {
            return null;  // Retorna null se a lista estiver vazia
        }
        int menor = numeros.get(0);
        for (int numero : numeros) {
            if (numero < menor) {
                menor = numero;
            }
        }
        return menor;
    }

    public List<Integer> exibirNumeros() {
        return new ArrayList<>(numeros);
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(8);

        System.out.println("Números: " + somaNumeros.exibirNumeros());
        System.out.println("Soma total: " + somaNumeros.calcularSoma());
        System.out.println("Maior número: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("Menor número: " + somaNumeros.encontrarMenorNumero());
    }
}
