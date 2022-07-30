package com.Sofka.Deliveri.orden.comands;

import co.com.sofka.domain.generic.Command;
import com.Sofka.Deliveri.orden.value.ClienteID;
import com.Sofka.Deliveri.orden.value.Direccion;
import com.Sofka.Deliveri.orden.value.OrdenID;

public class UpdateDireccion extends Command {
    private final OrdenID ordenID;
    private final ClienteID clienteID;
    private final Direccion dir;

    public UpdateDireccion(OrdenID ordenID, ClienteID clienteID, Direccion dir) {
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

    public Direccion getDir() {
        return dir;
    }
}
