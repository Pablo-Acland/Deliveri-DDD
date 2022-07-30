package com.Sofka.Deliveri.pedido.comands;

import co.com.sofka.domain.generic.Command;
import com.Sofka.Deliveri.pedido.value.Descripcion;
import com.Sofka.Deliveri.pedido.value.PaqueteID;
import com.Sofka.Deliveri.pedido.value.PedidoID;

public class UpdateDescripcion extends Command {
    private final PedidoID pedidoID;
    private final PaqueteID paqueteID;
    private final Descripcion descripcion;

    public UpdateDescripcion(PedidoID pedidoID, PaqueteID paqueteID, Descripcion descripcion) {
        this.pedidoID = pedidoID;
        this.paqueteID = paqueteID;
        this.descripcion = descripcion;
    }

    public PedidoID getPedidoID() {
        return pedidoID;
    }

    public PaqueteID getPaqueteID() {
        return paqueteID;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
