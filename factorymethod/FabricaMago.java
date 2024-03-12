public class FabricaMago extends FabricaPersonagem{
    public IPersonagens criaPersonagem(){
        return new Mago();
    }
}