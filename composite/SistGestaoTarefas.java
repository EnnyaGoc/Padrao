// Classe principal para testar o sistema de gestão de tarefas
public class SistemaGestaoTarefas {
    public static void main(String[] args) {
        // Criando a árvore de tarefas
        TarefaComposta tarefa1 = new TarefaComposta();
        TarefaComposta tarefa2 = new TarefaComposta();
        TarefaComposta tarefa3 = new TarefaComposta();
        TarefaComposta tarefa4 = new TarefaComposta();
        TarefaSimples tarefa5 = new TarefaSimples();
        TarefaSimples tarefa6 = new TarefaSimples();
        TarefaSimples tarefa7 = new TarefaSimples();
        TarefaSimples tarefa8 = new TarefaSimples();
        TarefaSimples tarefa9 = new TarefaSimples();
        TarefaSimples tarefa10 = new TarefaSimples();
        TarefaSimples tarefa11 = new TarefaSimples();
        TarefaSimples tarefa12 = new TarefaSimples();

        // Construindo a árvore de tarefas
        tarefa4.adicionarSubtarefa(tarefa9);
        tarefa4.adicionarSubtarefa(tarefa10);
        tarefa5.concluir();
        tarefa6.concluir();
        tarefa8.concluir();
        tarefa9.concluir();
        tarefa10.concluir();

        tarefa1.adicionarSubtarefa(tarefa2);
        tarefa1.adicionarSubtarefa(tarefa3);
        tarefa1.adicionarSubtarefa(tarefa4);
        tarefa2.adicionarSubtarefa(tarefa5);
        tarefa2.adicionarSubtarefa(tarefa6);
        tarefa3.adicionarSubtarefa(tarefa7);
        tarefa3.adicionarSubtarefa(tarefa8);
        tarefa4.adicionarSubtarefa(tarefa9);
        tarefa4.adicionarSubtarefa(tarefa10);
        tarefa5.adicionarSubtarefa(tarefa11);
        tarefa6.adicionarSubtarefa(tarefa12);

        // Testando operações
        System.out.println("Estado inicial:");
        System.out.println("Tarefa 1 concluída? " + tarefa1.estaConcluida());
        System.out.println("Tarefa 2 concluída? " + tarefa2.estaConcluida());
        System.out.println("Tarefa 3 concluída? " + tarefa3.estaConcluida());
        System.out.println("Tarefa 4 concluída? " + tarefa4.estaConcluida());

        tarefa5.desfazerConclusao();
        tarefa6.desfazerConclusao();

        System.out.println("\nApós desfazer conclusão de tarefas 5 e 6:");
        System.out.println("Tarefa 1 concluída? " + tarefa1.estaConcluida());
        System.out.println("Tarefa 2 concluída? " + tarefa2.estaConcluida());
        System.out.println("Tarefa 3 concluída? " + tarefa3.estaConcluida());
        System.out.println("Tarefa 4 concluída? " + tarefa4.estaConcluida());

        tarefa5.concluir();
        tarefa6.concluir();

        System.out.println("\nApós concluir tarefas 5 e 6 novamente:");
        System.out.println("Tarefa 1 concluída? " + tarefa1.estaConcluida());
        System.out.println("Tarefa 2 concluída? " + tarefa2.estaConcluida());
        System.out.println("Tarefa 3 concluída? " + tarefa3.estaConcluida());
        System.out.println("Tarefa 4 concluída? " + tarefa4.estaConcluida());
    }
}
