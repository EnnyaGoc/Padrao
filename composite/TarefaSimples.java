public class TarefaSimples implements Tarefa {
    private boolean concluida = false;

    public void concluir() {
        concluida = true;
    }

    public void desfazer() {
        concluida = false;
    }

    public boolean concluida() {
        return concluida;
    }
}
