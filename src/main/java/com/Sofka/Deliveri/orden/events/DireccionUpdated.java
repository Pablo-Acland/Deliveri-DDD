package com.Sofka.Deliveri.orden.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.Sofka.Deliveri.orden.value.ClienteID;
import com.Sofka.Deliveri.orden.value.DireccionCliente;

public class DireccionUpdated extends DomainEvent {
    private final ClienteID clienteID;
    private final DireccionCliente dir;


    public DireccionUpdated(ClienteID clienteID, DireccionCliente dir) {
        super("com.sofka.deliveri.orden.direccionupdated");
        this.clienteID = clienteID;
        this.dir = dir;
    }

    public ClienteID getClienteID() {
        return clienteID;
    }

    public DireccionCliente getDir() {
        return dir;
    }
}
