package com.Sofka.Deliveri.orden.comands;

import co.com.sofka.domain.generic.Command;
import com.Sofka.Deliveri.orden.value.ClienteID;
import com.Sofka.Deliveri.orden.value.MetodoPago;
import com.Sofka.Deliveri.orden.value.OrdenID;

public class UpdateMetodoPago extends Command {
    private final OrdenID ordenID;
    private final ClienteID clienteID;
    private final MetodoPago metodoPago;

    public UpdateMetodoPago(OrdenID ordenID, ClienteID clienteID, MetodoPago metodoPago) {
        this.ordenID = ordenID;
        this.clienteID = clienteID;
        this.metodoPago = metodoPago;
    }

    public OrdenID getOrdenID() {
        return ordenID;
    }

    public ClienteID getClienteID() {
        return clienteID;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }
}
