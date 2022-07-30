package com.Sofka.Deliveri.orden.value;

import co.com.sofka.domain.generic.Identity;

public class TelefonistaID extends Identity {
    public TelefonistaID(String uuid) {
        super(uuid);
    }

    public TelefonistaID() {
    }

    public static TelefonistaID of(String id) {
        return new TelefonistaID(id);
    }
}
