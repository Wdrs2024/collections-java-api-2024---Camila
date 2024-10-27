package Set.OperaçãoBasica;

import java.util.Objects;

public class Convidado {
    // Atributos
    private String nome;
    private int codigoConvites;

    public Convidado(String nome,int codigoConvite) {
        this.nome = nome;
        this.codigoConvites = codigoConvite;
    }

    public String getNome() {
        return nome;
    }
    public int getCodigoConvite() {
        return codigoConvites;
    }

    //alt + insert equals code
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Convidado convidado = (Convidado) o;
        return codigoConvites == convidado.codigoConvites;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigoConvites);
    }

    public String toString() {
        return String.format("Nome: %s, Código do Convite: %d", nome, codigoConvites);
    }
}