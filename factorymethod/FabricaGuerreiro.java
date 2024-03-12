public class FabricaGuerreiro extends FabricaPersonagem{
    public IPersonagens criaPersonagem(){
        return new Guerreiro();
    }
}