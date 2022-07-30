package com.Sofka.Deliveri.pedido.value;

import co.com.sofka.domain.generic.Identity;

public class CocineroID extends Identity {

    public CocineroID(String uuid) {
        super(uuid);
    }

    public CocineroID() {
    }

    public static CocineroID of(String id) {
        return new CocineroID(id);
    }

}
