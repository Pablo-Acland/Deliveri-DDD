package com.Sofka.Deliveri.orden.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.Sofka.Deliveri.orden.value.Horario;
import com.Sofka.Deliveri.orden.value.NomCompletoTel;
import com.Sofka.Deliveri.orden.value.TelefonistaID;

public class TelefonistaAdded extends DomainEvent {
    private final TelefonistaID telefonistaID;
    private final NomCompletoTel nomCompletoTel;
    private final Horario horario;

    public TelefonistaAdded(TelefonistaID telefonistaID, NomCompletoTel nomCompletoTel, Horario horario) {
        super("com.sofka.deliveri.orden.telefonistaadded");
        this.telefonistaID = telefonistaID;
        this.nomCompletoTel = nomCompletoTel;
        this.horario = horario;
    }

    public TelefonistaID getTelefonistaID() {
        return telefonistaID;
    }

    public NomCompletoTel getNomCompletoTel() {
        return nomCompletoTel;
    }

    public Horario getHorario() {
        return horario;
    }
}
