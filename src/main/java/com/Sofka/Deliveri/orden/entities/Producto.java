package com.Sofka.Deliveri.orden.entities;

import co.com.sofka.domain.generic.Entity;
import com.Sofka.Deliveri.orden.value.PrecioProducto;
import com.Sofka.Deliveri.orden.value.ProductoID;
import com.Sofka.Deliveri.orden.value.Receta;

import java.util.Objects;

public class Producto extends Entity<ProductoID> {

    private Receta receta;
    private PrecioProducto precio;

    public Producto(ProductoID entityId, Receta receta, PrecioProducto precio) {
        super(entityId);
        this.precio= precio;
        this.receta= receta;
    }

    public Receta getReceta() {
        return receta;
    }

    public void setReceta(Receta receta) {
        this.receta = Objects.requireNonNull(receta) ;
    }

    public PrecioProducto getPrecio() {
        return precio;
    }

    public void setPrecio(PrecioProducto precio) {
        this.precio = Objects.requireNonNull(precio) ;
    }
}
