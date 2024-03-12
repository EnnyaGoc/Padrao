public class FabricaArqueiro extends FabricaPersonagem{
    public IPersonagens criaPersonagem(){
        return new Arqueiro();
    }
}