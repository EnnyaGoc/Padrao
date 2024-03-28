package state;

public class CentraldePedidos {
    private PedidoState state;

    public CentraldePedidos(){
        this.state = new AguardandoConfirmacao();
    }

    public void setEstado(PedidoState estado){
        this.state = estado;
    }

    public void confirmarRestaurante(){
        state.confirmarRestaurante();
        setEstado(new EmPreparo());
    }

    public void iniciarPreparo(){
        state.iniciarPreparo();
        setEstado(new EmPreparo());
    }

    public void pedidoPronto(){
        state.pedidoPronto();
        setEstado(new ProntoPraEntrega());
    }

    public void sairParaEntrega(){
        state.sairParaEntrega();
        setEstado(new SaiuPraEntrega());
    }

    public void pedidoEntregue(){
        state.pedidoEntregue();
    }


    
}