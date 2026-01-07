public class StatusFazendo implements AlterarStatusStrategy {

    @Override
    public void alterarStatus(Tarefa tarefa) {
        tarefa.setStatus(Status.FAZENDO);
    }
}

