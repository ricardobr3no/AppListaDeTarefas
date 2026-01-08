import java.util.ArrayList;
import java.util.List;

public class Lista {

    private static Lista instancia;
    private List<Tarefa> tarefas;

    private Lista() {
        tarefas = new ArrayList<>();
    }

    public static Lista getInstancia() {
        if (instancia == null) {
            instancia = new Lista();
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

        System.out.println("=================================================");
        System.out.println("INDEX | NOME       | DESCRIÇÃO       | STATUS");
        System.out.println("=================================================");

        for (int i = 0; i < tarefas.size(); i++) {
            Tarefa t = tarefas.get(i);
            System.out.printf(
                    "%-5d | %-10s | %-15s | %-10s%n",
                    i, t.getNome(), t.getDescricao(), t.getStatus()
            );
        }
        System.out.println("=================================================");
    }
}
