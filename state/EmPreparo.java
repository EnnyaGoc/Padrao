package state;

public class EmPreparo implements PedidoState {
    public void confirmarRestaurante(){
        System.out.println("O pedido ja esta sendo preparado");
    }

    public void iniciarPreparo(){
        System.out.println("Pedido sendo preparado");
    }

    public void pedidoPronto(){
        System.out.println("Pedido esta pronto para entrega");
    }

    public void sairParaEntrega(){
        System.out.println("Pedido ainda esta sendo preparado");
    }

    public void pedidoEntregue(){
        System.out.println("Pedido ainda esta sendo preparado");
    }

}
