package state;

public interface PedidoState {
    void confirmarRestaurante();
    void iniciarPreparo();
    void pedidoPronto();
    void sairParaEntrega();
    void pedidoEntregue();
    
}