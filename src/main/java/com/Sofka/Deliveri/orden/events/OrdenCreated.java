package com.Sofka.Deliveri.orden.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.Sofka.Deliveri.orden.value.OrdenID;

public class OrdenCreated extends DomainEvent {
    private boolean creada = false;

    public OrdenCreated(boolean creada) {
        super("com.sofka.deliveri.orden.ordencreated");
        this.creada= creada;
    }

    public boolean getId() {
        return creada;
    }
}
