package com.Sofka.Deliveri.orden.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.Sofka.Deliveri.orden.value.NomCompletoTel;
import com.Sofka.Deliveri.orden.value.TelefonistaID;

public class NomCompletoTelUpdated extends DomainEvent {
    private final TelefonistaID telefonistaID;
    private final NomCompletoTel nomCompletoTel;


    public NomCompletoTelUpdated(TelefonistaID telefonistaID, NomCompletoTel nomCompletoTel) {
        super("com.sofka.deliveri.orden.nomcompletotelupdated");
        this.telefonistaID = telefonistaID;
        this.nomCompletoTel = nomCompletoTel;
    }

    public TelefonistaID getTelefonistaID() {
        return telefonistaID;
    }

    public NomCompletoTel getNomCompletoTel() {
        return nomCompletoTel;
    }
}
