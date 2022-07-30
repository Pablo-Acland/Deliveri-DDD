package com.Sofka.Deliveri.orden.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.Sofka.Deliveri.orden.value.PrecioProducto;
import com.Sofka.Deliveri.orden.value.ProductoID;
import com.Sofka.Deliveri.orden.value.Receta;

public class ProductoAdded extends DomainEvent {
    private final ProductoID productoID;
    private final PrecioProducto precioProducto;
    private final Receta receta;

    public ProductoAdded(ProductoID productoID, PrecioProducto precioProducto, Receta receta) {
        super("com.sofka.deliveri.orden.productoadded");
        this.productoID = productoID;
        this.precioProducto = precioProducto;
        this.receta = receta;
    }

    public ProductoID getProductoID() {
        return productoID;
    }

    public PrecioProducto getPrecioProducto() {
        return precioProducto;
    }

    public Receta getReceta() {
        return receta;
    }
}
