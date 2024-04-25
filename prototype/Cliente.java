import java.util.HashMap;
import java.util.Map;

public class Cliente {
    public static void main(String[] args) {
        Inimigo prototipo1 = new Inimigo("Dragao", 50, 10);
        Inimigo prototipo2 = new Inimigo("Esqueleto", 40, 15);

        Map<String, Inimigo> inimigos = new HashMap<>();

        for (int i = 1; i <= 5; i++) {
            Inimigo novoInimigo = prototipo1.clone();
            novoInimigo.setVida(novoInimigo.getVida() + i * 10);
            inimigos.put("Goblin " + i, novoInimigo);
        }

        for (int i = 1; i <= 3; i++) {
            Inimigo novoInimigo = prototipo2.clone();
            novoInimigo.setAtaque(novoInimigo.getAtaque() + i * 5);
            inimigos.put("Esqueleto " + i, novoInimigo);
        }

        for (Map.Entry<String, Inimigo> entry : inimigos.entrySet()) {
            String nome = entry.getKey();
            Inimigo inimigo = entry.getValue();
            System.out.println(nome + ": Tipo -> " + inimigo.getTipo() + ", Vida -> " + inimigo.getVida() + ", Ataque -> " + inimigo.getAtaque());
        }
    }
}
