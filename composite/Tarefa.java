public interface Tarefa {
    void concluir();
    void desfazerConclusao();
    boolean estaConcluida();
}

O PROBLEMA
Imagine um sistema de gestão de tarefas em uma empresa, onde as tarefas são organizadas
 em uma estrutura hierárquica, com tarefas 
 principais contendo subtarefas, que também podem conter subtarefas.

Cada tarefa deve ter um atributo indicando se ela 
está concluída ou não.  Sempre que uma tarefa é criada seu estado inicial é “não-concluída”. 
Uma tarefa só pode ser considerada concluída se todas as suas subtarefas também estão concluídas. Deve existir uma operação para marcar a 
tarefa como concluída e outra para desfazer.

Construa um sistema que permita a representação
 e o gerenciamento eficiente dessa estrutura hierárquica de tarefas, permitindo concluir tarefas, desfazer a conclusão, e consultar de forma fácil o estado de todas as tarefas.
Sua solução deve utilizar o padrão de design Composite para
 modelar a estrutura hierárquica de tarefas,
  lembrando que uma tarefa pode ser simples ou composta (possui subtarefas).
Para testar sua estrutura, em um método main() crie uma 
árvore com pelo menos 12 tarefas, 4 níveis de altura e teste todas as operações.