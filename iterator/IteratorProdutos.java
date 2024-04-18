import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class IteratorProdutos implements Iterator<Produto> {
    private List<Produto> produtos;
    private int index;

    public IteratorProdutos(List<Produto> produtos) {
        this.produtos = produtos;
        this.produtos.sort(Comparator.comparing(Produto::getCategoria).thenComparing(Produto::getValor));
        this.index = 0;
    }

    public boolean hasNext() {
        return index < produtos.size();
    }

    public Produto next() {
        if (hasNext()) {
            return produtos.get(index++);
        } else {
            throw new IndexOutOfBoundsException("Não tem mais elementos para iterar.");
        }
    }
}
