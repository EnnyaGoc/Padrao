public abstract class FabricaPersonagem{
    public abstract IPersonagens criaPersonagem();

    public void jogar(){
        IPersonagens p = criaPersonagem();
        p.lutando();
        p.habilidade();
        p.equipamento();
    }
}