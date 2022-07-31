package com.Sofka.Deliveri.orden.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.Sofka.Deliveri.orden.value.ClienteID;
import com.Sofka.Deliveri.orden.value.DireccionCliente;
import com.Sofka.Deliveri.orden.value.MetodoPago;
import com.Sofka.Deliveri.orden.value.NomCompletoCliente;

public class ClienteAdded extends DomainEvent {
    private final ClienteID clienteID;
    private final DireccionCliente dir;
    private final NomCompletoCliente nomCompletoCliente;
    private final MetodoPago metodoPago;


    public ClienteAdded(ClienteID clienteID, DireccionCliente dir, NomCompletoCliente nomCompletoCliente, MetodoPago metodoPago) {
        super("com.sofka.deliveri.orden.clienteadded");
        this.clienteID = clienteID;
        this.dir = dir;
        this.nomCompletoCliente = nomCompletoCliente;
        this.metodoPago = metodoPago;
    }

    public ClienteID getClienteID() {
        return clienteID;
    }

    public DireccionCliente getDir() {
        return dir;
    }

    public NomCompletoCliente getNomCompletoCliente() {
        return nomCompletoCliente;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }
}
