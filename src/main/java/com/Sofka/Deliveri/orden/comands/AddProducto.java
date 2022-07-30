package com.Sofka.Deliveri.orden.comands;

import co.com.sofka.domain.generic.Command;
import com.Sofka.Deliveri.orden.value.OrdenID;
import com.Sofka.Deliveri.orden.value.PrecioProducto;
import com.Sofka.Deliveri.orden.value.Receta;

public class AddProducto extends Command {
    private final OrdenID ordenID;
    private final PrecioProducto precioProducto;
    private final Receta receta;

    public AddProducto(OrdenID ordenID, PrecioProducto precioProducto, Receta receta) {
        this.ordenID = ordenID;
        this.precioProducto = precioProducto;
        this.receta = receta;
    }

    public OrdenID getOrdenID() {
        return ordenID;
    }

    public PrecioProducto getPrecioProducto() {
        return precioProducto;
    }

    public Receta getReceta() {
        return receta;
    }
}
