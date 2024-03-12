public class Cliente{
    public static void main(String[] args){
        Contexto exercito = new Contexto(new Estrategia1());

        exercito.setEstrategia(new Estrategia2());

        exercito.setEstrategia(new Estrategia3());
    }
}