package state;

public class Entregue implements PedidoState {
    public void confirmarRestaurante(){
        System.out.println("O pedido ja foi entregue");
    }

    public void iniciarPreparo(){
        System.out.println("O pedido ja foi entregue");
    }

    public void pedidoPronto(){
        System.out.println("O pedido ja foi entregue");
    }

    public void sairParaEntrega(){
        System.out.println("O pedido ja foi entregue");
    }

    public void pedidoEntregue(){
        System.out.println("O pedido ja foi entregue");
    }
    
}
