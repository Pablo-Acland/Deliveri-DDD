package com.Sofka.Deliveri.orden.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.Sofka.Deliveri.orden.value.PrecioProducto;
import com.Sofka.Deliveri.orden.value.ProductoID;

public class PrecioUpdated extends DomainEvent {
    private final ProductoID productoID;
    private final PrecioProducto precioProducto;

    public PrecioUpdated(ProductoID productoID, PrecioProducto precioProducto) {
        super("com.sofka.deliveri.orden.precioupdated");
        this.productoID = productoID;
        this.precioProducto = precioProducto;
    }

    public ProductoID getProductoID() {
        return productoID;
    }

    public PrecioProducto getPrecioProducto() {
        return precioProducto;
    }
}
