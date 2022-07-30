package com.Sofka.Deliveri.orden.comands;

import co.com.sofka.domain.generic.Command;
import com.Sofka.Deliveri.orden.value.Direccion;
import com.Sofka.Deliveri.orden.value.MetodoPago;
import com.Sofka.Deliveri.orden.value.NomCompletoCliente;
import com.Sofka.Deliveri.orden.value.OrdenID;

public class AddCliente extends Command {
    private final OrdenID ordenID;
    private final NomCompletoCliente nombre;
    private final Direccion dir;
    private final MetodoPago metodoPago;

    public AddCliente(OrdenID ordenID, NomCompletoCliente nombre, Direccion dir, MetodoPago metodoPago) {
        this.ordenID = ordenID;
        this.nombre = nombre;
        this.dir = dir;
        this.metodoPago = metodoPago;
    }

    public OrdenID getOrdenID() {
        return ordenID;
    }

    public NomCompletoCliente getNombre() {
        return nombre;
    }

    public Direccion getDir() {
        return dir;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }
}
