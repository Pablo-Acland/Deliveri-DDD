package com.Sofka.Deliveri.orden.comands;

import co.com.sofka.domain.generic.Command;
import com.Sofka.Deliveri.orden.value.OrdenID;
import com.Sofka.Deliveri.orden.value.ProductoID;
import com.Sofka.Deliveri.orden.value.Receta;

public class UpdateReceta extends Command {
    private final OrdenID ordenID;
    private final ProductoID  productoID;
    private final Receta receta;


    public UpdateReceta(OrdenID ordenID, ProductoID productoID, Receta receta) {
        this.ordenID = ordenID;
        this.productoID = productoID;
        this.receta = receta;
    }

    public OrdenID getOrdenID() {
        return ordenID;
    }

    public ProductoID getProductoID() {
        return productoID;
    }

    public Receta getReceta() {
        return receta;
    }
}
