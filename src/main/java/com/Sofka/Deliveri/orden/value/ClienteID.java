package com.Sofka.Deliveri.orden.value;

import co.com.sofka.domain.generic.Identity;

public class ClienteID extends Identity {


    public ClienteID(String id) {
        super(id);
    }

    public ClienteID() {
    }

    public static ClienteID of(String id) {
        return new ClienteID(id);
    }
}
