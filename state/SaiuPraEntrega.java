package state;

public class SaiuPraEntrega implements PedidoState {
    public void confirmarRestaurante(){
        System.out.println("Pedido ja saiu para entrega");
    }

    public void iniciarPreparo(){
        System.out.println("Pedido ja saiu pronto para entrega");
    }

    public void pedidoPronto(){
        System.out.println("Pedido ja saiu pronto para entrega");
    }

    public void sairParaEntrega(){
        System.out.println("Pedido ja saiu para entrega");
    }

    public void pedidoEntregue(){
        System.out.println("Pedido foi entregue");
    }
    
}
