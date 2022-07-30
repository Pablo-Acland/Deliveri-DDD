package com.Sofka.Deliveri.orden.comands;

import co.com.sofka.domain.generic.Command;
import com.Sofka.Deliveri.orden.value.OrdenID;

public class CreateOrden extends Command {
    private final OrdenID entityId;
    private final boolean creada;

    public CreateOrden(OrdenID entityId) {
        this.entityId = entityId;
        this.creada = true;
    }

    public OrdenID getEntityId() {
        return entityId;
    }

    public boolean isCreada() {
        return creada;
    }
}
