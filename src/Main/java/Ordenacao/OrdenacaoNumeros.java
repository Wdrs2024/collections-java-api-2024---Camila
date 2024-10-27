package Main.java.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numeros;

    public OrdenacaoNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public void ordenarAscendente() {
        Collections.sort(numeros); // Ordena em ordem ascendente
    }

    public void ordenarDescendente() {
        Collections.sort(numeros, new Comparator<Integer>() {
            @Override
            public int compare(Integer n1, Integer n2) {
                return n2.compareTo(n1); // Ordena em ordem descendente
            }
        });
    }

    public void exibirNumeros() {
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }

    public static void main(String[] args) {
        OrdenacaoNumeros listaNumeros = new OrdenacaoNumeros();
        listaNumeros.adicionarNumero(5);
        listaNumeros.adicionarNumero(3);
        listaNumeros.adicionarNumero(8);
        listaNumeros.adicionarNumero(1);
        listaNumeros.adicionarNumero(4);

        System.out.println("Números em ordem ascendente:");
        listaNumeros.ordenarAscendente();
        listaNumeros.exibirNumeros();

        System.out.println("\nNúmeros em ordem descendente:");
        listaNumeros.ordenarDescendente();
        listaNumeros.exibirNumeros();
    }
}

