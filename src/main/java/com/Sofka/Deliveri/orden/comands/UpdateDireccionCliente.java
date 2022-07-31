package com.Sofka.Deliveri.orden.comands;

import co.com.sofka.domain.generic.Command;
import com.Sofka.Deliveri.orden.value.ClienteID;
import com.Sofka.Deliveri.orden.value.DireccionCliente;
import com.Sofka.Deliveri.orden.value.OrdenID;

public class UpdateDireccionCliente extends Command {
    private final OrdenID ordenID;
    private final ClienteID clienteID;
    private final DireccionCliente dir;

    public UpdateDireccionCliente(OrdenID ordenID, ClienteID clienteID, DireccionCliente dir) {
        this.ordenID = ordenID;
        this.clienteID = clienteID;
        this.dir = dir;
    }

    public OrdenID getOrdenID() {
        return ordenID;
    }

    public ClienteID getClienteID() {
        return clienteID;
    }

    public DireccionCliente getDir() {
        return dir;
    }
}
