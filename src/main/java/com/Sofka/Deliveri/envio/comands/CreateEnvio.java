package com.Sofka.Deliveri.envio.comands;

import co.com.sofka.domain.generic.Command;
import com.Sofka.Deliveri.envio.value.EnvioID;
import com.Sofka.Deliveri.pedido.value.PedidoID;

public class CreateEnvio extends Command {
    private final EnvioID envioID;
    private final PedidoID pedidoID;

    public CreateEnvio(EnvioID envioID, PedidoID pedidoID) {
        this.envioID = envioID;
        this.pedidoID = pedidoID;
    }

    public EnvioID getEnvioID() {
        return envioID;
    }

    public PedidoID getPedidoID() {
        return pedidoID;
    }
}
