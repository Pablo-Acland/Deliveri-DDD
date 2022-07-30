package com.Sofka.Deliveri.pedido.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.Sofka.Deliveri.pedido.value.CocineroID;
import com.Sofka.Deliveri.pedido.value.NomCompletoCocinero;

public class NomCompletoCocineroUpdated extends DomainEvent {
    private final CocineroID cocineroID;
    private final NomCompletoCocinero nomCompletoCocinero;

    public NomCompletoCocineroUpdated(CocineroID cocineroID, NomCompletoCocinero nomCompletoCocinero) {
        super("com.sofka.deliveri.pedido.nomcompletococineroupdated");
        this.cocineroID = cocineroID;
        this.nomCompletoCocinero = nomCompletoCocinero;
    }

    public CocineroID getCocineroID() {
        return cocineroID;
    }

    public NomCompletoCocinero getNomCompletoCocinero() {
        return nomCompletoCocinero;
    }
}
