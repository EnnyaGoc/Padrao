import java.util.ArrayList;
import java.util.List;

public class TarefaComposta implements Tarefa {
    private List<Tarefa> subtarefas = new ArrayList<>();

    public void adicionarSubtarefa(Tarefa tarefa) {
        subtarefas.add(tarefa);
    }

    public void concluir() {
        for (Tarefa tarefa : subtarefas) {
            tarefa.concluir();
        }
    }

    public void desfazer() {
        for (Tarefa tarefa : subtarefas) {
            tarefa.desfazer();
        }
    }

    public boolean concluida() {
        for (Tarefa tarefa : subtarefas) {
            if (!tarefa.concluida()) {
                return false;
            }
        }
        return true;
    }
}
