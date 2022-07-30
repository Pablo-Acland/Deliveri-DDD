package com.Sofka.Deliveri.pedido.comands;

import co.com.sofka.domain.generic.Command;
import com.Sofka.Deliveri.pedido.value.Descripcion;
import com.Sofka.Deliveri.pedido.value.PedidoID;

public class AddPaquete extends Command {
    private final PedidoID pedidoID;
    private final Descripcion descripcion;

    public AddPaquete(PedidoID pedidoID, Descripcion descripcion) {
        this.pedidoID = pedidoID;
        this.descripcion = descripcion;
    }

    public PedidoID getPedidoID() {
        return pedidoID;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
