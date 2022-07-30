package com.Sofka.Deliveri.orden.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.Sofka.Deliveri.orden.value.Horario;
import com.Sofka.Deliveri.orden.value.TelefonistaID;

public class HorarioUpdated extends DomainEvent {
    private final TelefonistaID telefonistaID;
    private final Horario horario;

    public HorarioUpdated(TelefonistaID telefonistaID, Horario horario) {
        super("com.sofka.deliveri.orden.horarioupdated");
        this.telefonistaID = telefonistaID;
        this.horario = horario;
    }

    public TelefonistaID getTelefonistaID() {
        return telefonistaID;
    }

    public Horario getHorario() {
        return horario;
    }
}
