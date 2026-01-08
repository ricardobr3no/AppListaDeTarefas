import java.util.Scanner;

public class ListaTarefas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Lista lista = new Lista();
        int opcao;

        do {
            System.out.println("\n==== MENU ====");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Listar tarefas");
            System.out.println("3 - Remover tarefa");
            System.out.println("4 - Alterar status da tarefa");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // limpa buffer

            switch (opcao) {

                case 1:
                    System.out.print("Nome da tarefa: ");
                    String nome = scanner.nextLine();

                    System.out.print("Descrição da tarefa: ");
                    String descricao = scanner.nextLine();

                    lista.adicionarTarefa(new Tarefa(nome, descricao));
                    System.out.println("Tarefa adicionada com sucesso!");
                    break;

                case 2:
                    lista.listarTarefas();
                    break;

                case 3:
                    lista.listarTarefas();
                    System.out.print("Informe o índice da tarefa a remover: ");
                    int idxRemover = scanner.nextInt();
                    lista.removerTarefa(idxRemover);
                    break;

                case 4:
                    lista.listarTarefas();
                    System.out.print("Informe o índice da tarefa: ");
                    int idx = scanner.nextInt();

                    System.out.println("Novo status:");
                    System.out.println("1 - DISPONIVEL");
                    System.out.println("2 - FAZENDO");
                    System.out.println("3 - FEITA");

                    int statusOpcao = scanner.nextInt();
                    AlterarStatusStrategy strategy = null;

                    if (statusOpcao == 1) strategy = new StatusDisponivel();
                    else if (statusOpcao == 2) strategy = new StatusFazendo();
                    else if (statusOpcao == 3) strategy = new StatusFeita();
                    else {
                        System.out.println("Status inválido!");
                        break;
                    }

                    lista.alterarStatus(idx, strategy);
                    System.out.println("Status atualizado!");
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
