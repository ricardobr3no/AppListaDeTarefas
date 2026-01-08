import java.util.ArrayList;


public class Lista extends ArrayList<Tarefa> {

    public void adicionarTarefa(Tarefa tarefa) {
        this.add(tarefa);
    }

    public void removerTarefa(int index) {
        if (index >= 0 && index < this.size()) {
            this.remove(index);
        } else {
            System.out.println("Índice inválido!");
        }
    }

    public void alterarStatus(int index, AlterarStatusStrategy strategy) {
        if (index >= 0 && index < this.size()) {
            strategy.alterarStatus(this.get(index));
        } else {
            System.out.println("Índice inválido!");
        }
    }

    public void listarTarefas() {
        if (this.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
            return;
        }

        System.out.println("============================================================================");
        System.out.printf(" %-5s | %-20s | %-30s | %-10s \n", "INDEX", "NOME", "DESCRICAO", "STATUS");
        System.out.println("============================================================================");

        for (int idx = 0; idx < this.size(); idx++) {
            Tarefa t = this.get(idx);
            System.out.printf(
                    " %-5d | %-20s | %-30s | %-10s \n",
                    idx, t.getNome(), t.getDescricao(), t.getStatus()
            );
        }
        System.out.println("============================================================================");
    }
}
