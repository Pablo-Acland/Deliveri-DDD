package com.Sofka.Deliveri.pedido.entities;

import co.com.sofka.domain.generic.Entity;
import com.Sofka.Deliveri.pedido.value.Descripcion;
import com.Sofka.Deliveri.pedido.value.PaqueteID;

public class Paquete extends Entity<PaqueteID> {
    private Descripcion descripcion;


    public Paquete(PaqueteID entityId, Descripcion descripcion) {
        super(entityId);
        this.descripcion= descripcion;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(Descripcion descripcion) {
        this.descripcion = descripcion;
    }
}
