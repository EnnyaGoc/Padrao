package state;

public class Cliente {
    public static void main(String[] args) {
        CentraldePedidos cp = new CentraldePedidos();

        cp.confirmarRestaurante();
        cp.iniciarPreparo();
        cp.pedidoPronto();
        cp.sairParaEntrega();
        cp.pedidoEntregue();
    }
}
