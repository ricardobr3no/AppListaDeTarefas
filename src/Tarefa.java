public class Tarefa {

    private String nome;
    private String descricao;
    private Status status;

    public Tarefa(String nome, String descricao) {
        this.nome = nome.toUpperCase();
        this.descricao = descricao;
        this.status = Status.DISPONIVEL;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}

