//Ênnya Gomes Oliveira Campos
public class Cliente{
    public static void main(String[] args){
        FabricaPersonagem arqueiro = new FabricaArqueiro();
        arqueiro.jogar();
      
        FabricaPersonagem guerreiro = new FabricaGuerreiro();
        guerreiro.jogar();

        FabricaPersonagem mago = new FabricaMago();
        mago.jogar();

        
    }
}