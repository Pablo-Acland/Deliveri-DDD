package com.Sofka.Deliveri.pedido.value;

import co.com.sofka.domain.generic.Identity;

public class PaqueteID extends Identity {
    public PaqueteID() {
    }

    public PaqueteID(String uuid) {
        super(uuid);
    }

    public static PaqueteID of(String id) {
        return new PaqueteID(id);
    }

}
