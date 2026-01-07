public class StatusFeita implements AlterarStatusStrategy {

    @Override
    public void alterarStatus(Tarefa tarefa) {
        tarefa.setStatus(Status.FEITA);
    }
}

