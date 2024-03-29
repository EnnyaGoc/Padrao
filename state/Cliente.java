//Ênnya Gomes Oliveira Campos
package state;

public class Cliente {
    public static void main(String[] args) {
        CentraldePedidos cp = new CentraldePedidos();

        cp.confirmarRestaurante();
        //Aguardando Confirmação do Restaurante -> Em Preparo
        cp.iniciarPreparo();
        //Em Preparo -> Pronto para Entrega
        cp.pedidoPronto();
        //Pronto para Entrega -> Saiu para Entrega
        cp.sairParaEntrega();
        //Saiu para Entrega -> Pedido Entregue
        cp.pedidoEntregue();
        //Pedido Entregue
    }
}


