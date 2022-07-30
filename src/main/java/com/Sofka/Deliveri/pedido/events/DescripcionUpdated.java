package com.Sofka.Deliveri.pedido.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.Sofka.Deliveri.pedido.value.Descripcion;
import com.Sofka.Deliveri.pedido.value.PaqueteID;

public class DescripcionUpdated extends DomainEvent {
    private final PaqueteID paqueteID;
    private final Descripcion descripcion;

    public DescripcionUpdated(PaqueteID paqueteID, Descripcion descripcion) {
        super("com.sofka.deliveri.pedido.descripcionupdated");
        this.paqueteID = paqueteID;
        this.descripcion = descripcion;
    }

    public PaqueteID getPaqueteID() {
        return paqueteID;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
