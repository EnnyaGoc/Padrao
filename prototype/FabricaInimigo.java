import java.util.HashMap;
import java.util.Map;

public class FabricaInimigo {
    private static Map<String, Inimigo> mapaInimigo = new HashMap<>();

    static {
        mapaInimigo.put("dragao", new Dragao());
        mapaInimigo.put("esqueleto", new Esqueleto());
    }

    public static Inimigo getInimigo(String type) {
        return mapaInimigo.get(type).inimigoclone();
    }
}