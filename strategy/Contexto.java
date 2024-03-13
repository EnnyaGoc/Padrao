public class Contexto{
    IEstrategia estrategia;

    public Contexto(IEstrategia estrategia){
        this.estrategia = estrategia;
    }

    public void setEstrategia(IEstrategia estrategia){
        this.estrategia = estrategia;
    }

    public void Acao(){
        estrategia.executar();
    }
}