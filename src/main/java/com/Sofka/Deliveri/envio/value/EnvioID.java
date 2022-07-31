package com.Sofka.Deliveri.envio.value;

import co.com.sofka.domain.generic.Identity;

public class EnvioID extends Identity {

    public EnvioID(String uuid) {
        super(uuid);
    }

    public EnvioID() {
    }

    public static EnvioID of(String id) {
        return new EnvioID(id);
    }

}
