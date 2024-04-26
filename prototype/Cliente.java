//Ênnya Gomes Oliveira Campos
public class Cliente {
    public static void main(String[] args) {
        Inimigo dragao1 = FabricaInimigo.getInimigo("dragao");
        Inimigo dragao2 = FabricaInimigo.getInimigo("dragao");
        Inimigo esqueleto1 = FabricaInimigo.getInimigo("esqueleto");

        System.out.println("dragao 1:");
        dragao1.ataque();

        System.out.println("dragao 2:");
        dragao2.ataque();

        System.out.println("esqueleto 1:");
        esqueleto1.ataque();
    }
}

//Esse padrao Prototype permite criar facilmente novos tipos de inimigos só adicionando uma nova classe de inimigo e registrando na classe FrabricaInimigo.

