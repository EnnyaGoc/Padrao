/* Ênnya Gomes Oliveira Campos

Para incluir uma nova estratégia, eu precisaria criar uma nova classe
 com uma nova estratégia, com o método executar e que implemente a interface IEstrategia.
 Além disso, seria necessario instanciar o Contexto com a nova estrategia na classe Cliente.

*/

public class Cliente{
    public static void main(String[] args){
        Contexto exercito = new Contexto(new Estrategia1());

        exercito.Acao();

        exercito.setEstrategia(new Estrategia2());
        exercito.Acao();

        exercito.setEstrategia(new Estrategia3());
        exercito.Acao();
    }
}