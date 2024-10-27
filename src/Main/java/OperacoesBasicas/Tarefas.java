package Main.java.OperacoesBasicas;

public class Tarefas {
    //atributo
    private String descricao;

    public Tarefas(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;

    }
}

