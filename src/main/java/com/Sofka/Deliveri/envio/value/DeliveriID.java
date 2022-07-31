package com.Sofka.Deliveri.envio.value;

import co.com.sofka.domain.generic.Identity;

public class DeliveriID extends Identity {
    public DeliveriID(String uuid) {
        super(uuid);
    }

    public DeliveriID() {
    }

    public static DeliveriID of(String id) {
        return new DeliveriID(id);
    }

}
