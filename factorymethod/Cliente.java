public class Cliente{
    public static void main(Sring[] args){
        FabricaPersonagemogo arqueiro = new FabricaArqueiro();
        arqueiro.jogar();
      
        FabricaPersonagem guerreiro = new FabricaGuerreiro();
        guerreiro.jogar();

        FabricaPersonagem mago = new FabricaMago();
        mago.jogar();

        
    }
}