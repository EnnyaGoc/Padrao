package state;

public class ProntoPraEntrega implements PedidoState {
    public void confirmarRestaurante(){
        System.out.println("Pedido ja esta pronto para entrega");
    }

    public void iniciarPreparo(){
        System.out.println("Pedido ja esta pronto para entrega");
    }

    public void pedidoPronto(){
        System.out.println("Pedido ja esta pronto para entrega");
    }

    public void sairParaEntrega(){
        System.out.println("Pedido saiu para entrega");
    }

    public void pedidoEntregue(){
        System.out.println("Pedido ainda nao foi entregue");
    }
 
}
