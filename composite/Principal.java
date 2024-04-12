//Ênnya Gomes Oliveira Campos
public class Principal {
    public static void main(String[] args) {
        TarefaComposta tarefa1 = new TarefaComposta();
        TarefaComposta tarefa2 = new TarefaComposta();
        TarefaComposta tarefa3 = new TarefaComposta();
        TarefaComposta tarefa4 = new TarefaComposta();
        TarefaComposta tarefa5 = new TarefaComposta();
        TarefaComposta tarefa6 = new TarefaComposta();

        TarefaSimples tarefa7 = new TarefaSimples();
        TarefaSimples tarefa8 = new TarefaSimples();
        TarefaSimples tarefa9 = new TarefaSimples();
        TarefaSimples tarefa10 = new TarefaSimples();
        TarefaSimples tarefa11 = new TarefaSimples();
        TarefaSimples tarefa12 = new TarefaSimples();

        tarefa1.adicionarSubtarefa(tarefa2);
        tarefa1.adicionarSubtarefa(tarefa3);

        tarefa2.adicionarSubtarefa(tarefa4);
        tarefa2.adicionarSubtarefa(tarefa5);
        tarefa3.adicionarSubtarefa(tarefa6);
        tarefa3.adicionarSubtarefa(tarefa7);

        tarefa4.adicionarSubtarefa(tarefa8);
        tarefa4.adicionarSubtarefa(tarefa9);
        tarefa5.adicionarSubtarefa(tarefa10);
        tarefa5.adicionarSubtarefa(tarefa11);
        tarefa6.adicionarSubtarefa(tarefa12);

        tarefa7.concluir();
        tarefa8.concluir();
        tarefa9.concluir();
        tarefa10.concluir();
        tarefa11.concluir();
        tarefa12.concluir();
        
        System.out.println("Tarefa 4 concluída? " + tarefa4.concluida()); 
        System.out.println("Tarefa 5 concluída? " + tarefa5.concluida());
        System.out.println("Tarefa 6 concluída? " + tarefa6.concluida());
        System.out.println("Tarefa 3 concluída? " + tarefa3.concluida());
        System.out.println("Tarefa 2 concluída? " + tarefa2.concluida()); 
        System.out.println("Tarefa 1 concluída? " + tarefa1.concluida()); 

        
        tarefa5.concluir();
     
        System.out.println("Tarefa 2 concluída? " + tarefa2.concluida());
        System.out.println("Tarefa 1 concluída? " + tarefa1.concluida()); 

        tarefa5.desfazer();
        System.out.println("Tarefa 5 concluída após desfazer? " + tarefa5.concluida());
        System.out.println("Tarefa 2 concluída após desfazer tarefa5? " + tarefa2.concluida());
        System.out.println("Tarefa 1 concluída após desfazer tarefa5? " + tarefa1.concluida());
    }
}
