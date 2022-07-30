package com.Sofka.Deliveri.orden.value;


import co.com.sofka.domain.generic.Identity;

public class OrdenID extends Identity {
    public OrdenID() {
    }

    public OrdenID(String id) {
        super(id);
    }

    public static OrdenID of(String id) {
        return new OrdenID(id);
    }
}
