package com.Sofka.Deliveri.pedido.entities;

import co.com.sofka.domain.generic.Entity;
import com.Sofka.Deliveri.pedido.value.CocineroID;
import com.Sofka.Deliveri.pedido.value.NomCompletoCocinero;

public class Cocinero extends Entity<CocineroID> {
    private NomCompletoCocinero nomCompletoCocinero;

    public Cocinero(CocineroID entityId, NomCompletoCocinero nomCompletoCocinero) {
        super(entityId);
        this.nomCompletoCocinero=nomCompletoCocinero;
    }

    public NomCompletoCocinero getNomCompletoCocinero() {
        return nomCompletoCocinero;
    }

    public void setNomCompletoCocinero(NomCompletoCocinero nomCompletoCocinero) {
        this.nomCompletoCocinero = nomCompletoCocinero;
    }
}
