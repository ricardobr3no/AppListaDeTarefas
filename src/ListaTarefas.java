import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private static ListaTarefas instancia;
    private List<Tarefa> tarefas;

    private ListaTarefas() {
        tarefas = new ArrayList<Tarefa>();
    }

    public static ListaTarefas getInstancia() {
        if (instancia == null) {
            instancia = new ListaTarefas();
        }
        return instancia;
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public void removerTarefa(int index) {
        if (index >= 0 && index < tarefas.size()) {
            tarefas.remove(index);
        } else {
            System.out.println("Índice inválido!");
        }
    }

    public void alterarStatus(int index, AlterarStatusStrategy strategy) {
        if (index >= 0 && index < tarefas.size()) {
            strategy.alterarStatus(tarefas.get(index));
        } else {
            System.out.println("Índice inválido!");
        }
    }

    public void listarTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
            return;
        }

        System.out.println("============================================================================");
        System.out.printf(" %-5s | %-20s | %-30s | %-15s \n", "INDEX", "NOME", "DESCRIÇÃO", "STATUS");
        System.out.println("============================================================================");

        for (int idx = 0; idx < tarefas.size(); idx++) {
            Tarefa t = tarefas.get(idx);
            System.out.printf(" %-5d | %-20s | %-30s | %-15s \n", idx, t.getNome(), t.getDescricao(), t.getStatus());
        }
        System.out.println("============================================================================");
    }
}
