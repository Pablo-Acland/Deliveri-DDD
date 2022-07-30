package com.Sofka.Deliveri.orden.value;

import co.com.sofka.domain.generic.Identity;

public class ProductoID extends Identity  {

    public ProductoID(String id) {
        super(id);
    }

    public ProductoID() {
    }

    public static ProductoID of(String id) {
        return new ProductoID(id);
    }
}
