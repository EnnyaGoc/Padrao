//Ênnya Gomes Oliveira Campos
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Prod1", "A", 19.9));
        produtos.add(new Produto("Prod2", "B", 29.9));
        produtos.add(new Produto("Prod3", "A", 39.9));
        produtos.add(new Produto("Prod4", "C", 49.9));
        produtos.add(new Produto("Prod5", "A", 59.9));
        produtos.add(new Produto("Prod6", "B", 69.9));
        produtos.add(new Produto("Prod7", "C", 79.9));
        produtos.add(new Produto("Prod8", "A", 89.9));
        produtos.add(new Produto("Prod9", "B", 99.9));
        produtos.add(new Produto("Prod10", "C", 109.9));

        IteratorProdutos iterador = new IteratorProdutos(produtos);
        System.out.println("Iterando sobre os produtos:");
        while (iterador.hasNext()) {
            Produto produto = iterador.next();
            System.out.println("Produto: " + produto.getNome() + ", Categoria: " + produto.getCategoria() + ", Valor: " + produto.getValor());
        }
    }
}
