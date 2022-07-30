package com.Sofka.Deliveri.orden.comands;

import co.com.sofka.domain.generic.Command;
import com.Sofka.Deliveri.orden.value.Horario;
import com.Sofka.Deliveri.orden.value.NomCompletoTel;
import com.Sofka.Deliveri.orden.value.OrdenID;

public class AddTelefonista extends Command {
    private final OrdenID ordenID;
    private final NomCompletoTel nomCompletoTel;
    private final Horario horario;

    public AddTelefonista(OrdenID ordenID, NomCompletoTel nomCompletoTel, Horario horario) {
        this.ordenID = ordenID;
        this.nomCompletoTel = nomCompletoTel;
        this.horario = horario;
    }

    public OrdenID getOrdenID() {
        return ordenID;
    }

    public NomCompletoTel getNomCompletoTel() {
        return nomCompletoTel;
    }

    public Horario getHorario() {
        return horario;
    }
}
