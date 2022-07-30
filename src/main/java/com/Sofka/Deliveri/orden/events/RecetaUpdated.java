package com.Sofka.Deliveri.orden.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.Sofka.Deliveri.orden.value.ProductoID;
import com.Sofka.Deliveri.orden.value.Receta;

public class RecetaUpdated extends DomainEvent {
    private final ProductoID productoID;
    private final Receta receta;

    public RecetaUpdated(ProductoID productoID, Receta receta) {
        super("com.sofka.deliveri.orden.recetaupdated");
        this.productoID = productoID;
        this.receta = receta;
    }

    public ProductoID getProductoID() {
        return productoID;
    }

    public Receta getReceta() {
        return receta;
    }
}
