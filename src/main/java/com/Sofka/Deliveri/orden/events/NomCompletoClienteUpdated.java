package com.Sofka.Deliveri.orden.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.Sofka.Deliveri.orden.value.ClienteID;
import com.Sofka.Deliveri.orden.value.NomCompletoCliente;

public class NomCompletoClienteUpdated extends DomainEvent {
    private final ClienteID clienteID;
    private final NomCompletoCliente nomCompletoCliente;


    public NomCompletoClienteUpdated(ClienteID clienteID, NomCompletoCliente nomCompletoCliente) {
        super("com.sofka.deliveri.orden.nomcompletoclienteupdated");
        this.clienteID = clienteID;
        this.nomCompletoCliente = nomCompletoCliente;
    }

    public ClienteID getClienteID() {
        return clienteID;
    }

    public NomCompletoCliente getNomCompletoCliente() {
        return nomCompletoCliente;
    }
}
