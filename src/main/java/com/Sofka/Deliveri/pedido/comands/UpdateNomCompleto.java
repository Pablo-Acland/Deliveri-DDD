package com.Sofka.Deliveri.pedido.comands;

import co.com.sofka.domain.generic.Command;
import com.Sofka.Deliveri.pedido.value.CocineroID;
import com.Sofka.Deliveri.pedido.value.NomCompletoCocinero;
import com.Sofka.Deliveri.pedido.value.PedidoID;

public class UpdateNomCompleto extends Command {
    private final PedidoID pedidoID;
    private final CocineroID cocineroID;
    private final NomCompletoCocinero nomCompletoCocinero;

    public UpdateNomCompleto(PedidoID pedidoID, CocineroID cocineroID, NomCompletoCocinero nomCompletoCocinero) {
        this.pedidoID = pedidoID;
        this.cocineroID = cocineroID;
        this.nomCompletoCocinero = nomCompletoCocinero;
    }

    public PedidoID getPedidoID() {
        return pedidoID;
    }

    public CocineroID getCocineroID() {
        return cocineroID;
    }

    public NomCompletoCocinero getNomCompletoCocinero() {
        return nomCompletoCocinero;
    }
}
