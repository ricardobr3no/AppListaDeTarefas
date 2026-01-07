public class StatusDisponivel implements AlterarStatusStrategy {

    @Override
    public void alterarStatus(Tarefa tarefa) {
        tarefa.setStatus(Status.DISPONIVEL);
    }
}
