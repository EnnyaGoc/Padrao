package state;

public class AguardandoConfirmacao implements PedidoState {
    public void confirmarRestaurante(){
        System.out.println("Restaurante confirmou: Preparando pedido!");
    }

    public void iniciarPreparo(){
        System.out.println("O restaurante ainda não confirmou o pedido");
    }

    public void pedidoPronto(){
        System.out.println("O restaurante ainda não confirmou o pedido");
    }

    public void sairParaEntrega(){
        System.out.println("O restaurante ainda não confirmou o pedido");
    }

    public void pedidoEntregue(){
        System.out.println("O restaurante ainda não confirmou o pedido");
    }

}
