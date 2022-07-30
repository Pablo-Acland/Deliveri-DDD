package com.Sofka.Deliveri.orden.comands;

import co.com.sofka.domain.generic.Command;
import com.Sofka.Deliveri.orden.value.Horario;
import com.Sofka.Deliveri.orden.value.OrdenID;
import com.Sofka.Deliveri.orden.value.TelefonistaID;

public class UpdateHorario extends Command {
    private final OrdenID ordenID;
    private final TelefonistaID telefonistaID;
    private final Horario horario;

    public UpdateHorario(OrdenID ordenID, TelefonistaID telefonistaID, Horario horario) {
        this.ordenID = ordenID;
        this.telefonistaID = telefonistaID;
        this.horario = horario;
    }

    public OrdenID getOrdenID() {
        return ordenID;
    }

    public TelefonistaID getTelefonistaID() {
        return telefonistaID;
    }

    public Horario getHorario() {
        return horario;
    }
}
