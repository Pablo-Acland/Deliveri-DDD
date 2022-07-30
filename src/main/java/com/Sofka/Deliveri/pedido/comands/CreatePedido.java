package com.Sofka.Deliveri.pedido.comands;

import co.com.sofka.domain.generic.Command;
import com.Sofka.Deliveri.orden.value.OrdenID;
import com.Sofka.Deliveri.pedido.value.PedidoID;

public class CreatePedido extends Command {
    private final PedidoID pedidoID;
    private final OrdenID ordenID;

    public CreatePedido(PedidoID pedidoID, OrdenID ordenID) {
        this.pedidoID = pedidoID;
        this.ordenID = ordenID;
    }

    public PedidoID getPedidoID() {
        return pedidoID;
    }

    public OrdenID getOrdenID() {
        return ordenID;
    }
}
