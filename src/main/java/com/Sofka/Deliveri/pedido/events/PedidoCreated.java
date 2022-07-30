package com.Sofka.Deliveri.pedido.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.Sofka.Deliveri.orden.value.OrdenID;

public class PedidoCreated extends DomainEvent {

    private final OrdenID ordenID;


    public PedidoCreated(OrdenID ordenID) {
        super("com.sofka.deliveri.pedido.pedidocreated");
        this.ordenID = ordenID;
    }

    public OrdenID getOrdenID() {
        return ordenID;
    }
}
