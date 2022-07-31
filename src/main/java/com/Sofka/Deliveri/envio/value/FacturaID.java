package com.Sofka.Deliveri.envio.value;

import co.com.sofka.domain.generic.Identity;

public class FacturaID extends Identity {

    public FacturaID(String uuid) {
        super(uuid);
    }

    public FacturaID() {
    }

    public static FacturaID of(String id) {
        return new FacturaID(id);
    }
}
