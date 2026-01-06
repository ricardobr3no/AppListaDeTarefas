
import java.util.ArrayList;

enum Status {
	DISPONIVEL,
	FAZENDO,
	FEITA
}


class Tarefa {
	private String nome, descricao;
	private Status status;

	public Tarefa(String nome, String descricao, Status status) {
		// Constructor
		this.nome = nome;
		this.descricao = descricao;
		this.status = status;
	}
	
	public String getNome() {
		return this.nome;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setNome(String newNome) {
		this.nome = newNome;
	}

	public void setDescricao(String newDescricao) {
		this.descricao = newDescricao;
	}

	public Status getStatus() {
		return this.status;
	}

	public void setStatus(Status newStatus) {
		this.status = newStatus;
	}

}


class Lista {
	private ArrayList<Tarefa> tarefasLista;

	public Lista() {
		this.tarefasLista = tarefasLista = new ArrayList<>();
	}

	public void adicionarTarefa(Tarefa newTarefa) {
		this.tarefasLista.add(newTarefa);
		//System.out.println("Adicionado!");
	}

	public void atualizarStatusTarefaByIndex(int idxTarefa, Status newTarefaStatus) {
		Tarefa tarefaSelecionada = this.tarefasLista.get(idxTarefa);
		tarefaSelecionada.setStatus(newTarefaStatus);
		//System.out.printf("Status da Tarefa %d atualizado!\n", idxTarefa);
	}

	public void removerTarefaByIndex(int idxTarefa) {
		this.tarefasLista.remove(idxTarefa);
		//System.out.println("Removido!");
	}


	public void listarTarefas() {
		System.out.println("======================================================");
		System.out.println(" INDEX  | TAREFA     | DESCRICAO            | STATUS ");
		System.out.println("======================================================");
		for (Tarefa tarefa: this.tarefasLista) {
			String saida = String.format(
				" %-6s | %-10s | %-20s | %-10s" , 
				this.tarefasLista.indexOf(tarefa), tarefa.getNome(),
				tarefa.getDescricao(), tarefa.getStatus());
			System.out.println(saida);
		}
		System.out.println("======================================================");
	}
	
}

public class ListaTarefas {
	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		Lista listaDeTarefas = new Lista();

		Tarefa t1 = new Tarefa("tcc", "meu Tcc", Status.FAZENDO);
		Tarefa t2 = new Tarefa("megasena", "jogar na megasena", Status.FAZENDO);
		System.out.println("tarefa criada");

		listaDeTarefas.adicionarTarefa(t1);
		listaDeTarefas.adicionarTarefa(t2);

		listaDeTarefas.listarTarefas();
		listaDeTarefas.removerTarefaByIndex(0);
		listaDeTarefas.listarTarefas();
		listaDeTarefas.atualizarStatusTarefaByIndex(0, Status.FEITA);
		listaDeTarefas.listarTarefas();

	}
	
}
