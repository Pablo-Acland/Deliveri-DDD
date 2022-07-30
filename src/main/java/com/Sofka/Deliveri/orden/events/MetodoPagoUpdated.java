package com.Sofka.Deliveri.orden.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.Sofka.Deliveri.orden.value.ClienteID;
import com.Sofka.Deliveri.orden.value.MetodoPago;

public class MetodoPagoUpdated extends DomainEvent {
    private final ClienteID clienteID;
    private final MetodoPago metodoPago;

    public MetodoPagoUpdated(ClienteID clienteID, MetodoPago metodoPago) {
        super("com.sofka.deliveri.orden.metodopagoupdated");
        this.clienteID = clienteID;
        this.metodoPago = metodoPago;
    }

    public ClienteID getClienteID() {
        return clienteID;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }
}
