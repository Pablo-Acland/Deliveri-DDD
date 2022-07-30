package com.Sofka.Deliveri.orden.comands;

import co.com.sofka.domain.generic.Command;
import com.Sofka.Deliveri.orden.value.ClienteID;
import com.Sofka.Deliveri.orden.value.OrdenID;
import com.Sofka.Deliveri.orden.value.PrecioProducto;
import com.Sofka.Deliveri.orden.value.ProductoID;

public class UpdatePrecio extends Command {
    private final OrdenID ordenID;
    private final ProductoID productoID;
    private final PrecioProducto precioProducto;


    public UpdatePrecio(OrdenID ordenID, ProductoID productoID, PrecioProducto precioProducto) {
        this.ordenID = ordenID;
        this.productoID = productoID;
        this.precioProducto = precioProducto;
    }

    public OrdenID getOrdenID() {
        return ordenID;
    }

    public ProductoID getProductoID() {
        return productoID;
    }

    public PrecioProducto getPrecioProducto() {
        return precioProducto;
    }
}
