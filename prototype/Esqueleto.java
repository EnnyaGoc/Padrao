public class Esqueleto implements Inimigo {
    @Override
    public Inimigo inimigoclone() {
        try {
            return (Esqueleto) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone do inimigo não suportado");
            return null;
        }
    }

    @Override
    public void ataque() {
        System.out.println("Ataque do esqueleto!");
    }
}