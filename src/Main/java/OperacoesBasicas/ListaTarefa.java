package Main.java.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo
    private List<Tarefas> tarefasList;

    public ListaTarefa() {
        this.tarefasList = new ArrayList<>();

    }

    public void adicionarTarefa(String descricao) {
        tarefasList.add(new Tarefas(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefas> tarefasParaRemover = new ArrayList<>();
        for(Tarefas t : tarefasList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);

            }
        }
        tarefasList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefasList.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefasList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefas = new ListaTarefa();

        System.out.println("O número de elementos na lista é:" + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 2");
        System.out.println("O número de elementos na lista é:" + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.removerTarefa("Tarefa 2");
        System.out.println("O número de elementos na lista é:" + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.obterDescricoesTarefas();


    }
}
