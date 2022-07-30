package com.Sofka.Deliveri.pedido.value;

import co.com.sofka.domain.generic.Identity;

public class PedidoID extends Identity {

    public PedidoID(String uuid) {
        super(uuid);
    }

    public PedidoID() {
    }

    public static PedidoID of(String id) {
        return new PedidoID(id);
    }

}
