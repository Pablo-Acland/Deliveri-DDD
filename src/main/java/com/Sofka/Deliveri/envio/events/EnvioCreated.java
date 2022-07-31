package com.Sofka.Deliveri.envio.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.Sofka.Deliveri.pedido.value.PedidoID;

public class EnvioCreated extends DomainEvent {
    private final PedidoID pedidoID;

    public EnvioCreated(PedidoID pedidoID) {
        super("com.sofka.deliveri.envio.enviocreated");
        this.pedidoID = pedidoID;
    }

    public PedidoID getPedidoID() {
        return pedidoID;
    }
}
