package com.Sofka.Deliveri.pedido.comands;

import co.com.sofka.domain.generic.Command;
import com.Sofka.Deliveri.pedido.value.NomCompletoCocinero;
import com.Sofka.Deliveri.pedido.value.PedidoID;

public class AddCocinero extends Command {
    private final PedidoID pedidoID;
    private final NomCompletoCocinero nomCompletoCocinero;

    public AddCocinero(PedidoID pedidoID, NomCompletoCocinero nomCompletoCocinero) {
        this.pedidoID = pedidoID;
        this.nomCompletoCocinero = nomCompletoCocinero;
    }

    public PedidoID getPedidoID() {
        return pedidoID;
    }

    public NomCompletoCocinero getNomCompletoCocinero() {
        return nomCompletoCocinero;
    }
}
