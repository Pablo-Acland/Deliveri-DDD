package com.Sofka.Deliveri.orden.comands;

import co.com.sofka.domain.generic.Command;
import com.Sofka.Deliveri.orden.value.ClienteID;
import com.Sofka.Deliveri.orden.value.NomCompletoCliente;
import com.Sofka.Deliveri.orden.value.OrdenID;

public class UpdateNomCompletoCliente extends Command {
    private final OrdenID ordenID;
    private final ClienteID clienteID;
    private final NomCompletoCliente nomCompletoCliente;

    public UpdateNomCompletoCliente(OrdenID ordenID, ClienteID clienteID, NomCompletoCliente nomCompletoCliente) {
        this.ordenID = ordenID;
        this.clienteID = clienteID;
        this.nomCompletoCliente = nomCompletoCliente;
    }

    public OrdenID getOrdenID() {
        return ordenID;
    }

    public ClienteID getClienteID() {
        return clienteID;
    }

    public NomCompletoCliente getNomCompletoCliente() {
        return nomCompletoCliente;
    }
}
