package com.Sofka.Deliveri.envio.value;

import co.com.sofka.domain.generic.Identity;

public class VeiculoID extends Identity {
    public VeiculoID(String uuid) {
        super(uuid);
    }

    public VeiculoID() {
    }

    public static VeiculoID of(String id) {
        return new VeiculoID(id);
    }
}
