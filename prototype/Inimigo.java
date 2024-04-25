public class Inimigo implements Cloneable {
    private String tipo;
    private int vida;
    private int ataque;

    public Inimigo(String tipo, int vida, int ataque) {
        this.tipo = tipo;
        this.vida = vida;
        this.ataque = ataque;
    }

    public Inimigo clone() {
        try {
            return (Inimigo) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public String getTipo() {
        return tipo;
    }

    public int getVida() {
        return vida;
    }
    
    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
}
