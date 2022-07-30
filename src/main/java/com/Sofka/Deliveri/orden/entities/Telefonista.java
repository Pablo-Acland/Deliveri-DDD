package com.Sofka.Deliveri.orden.entities;

import co.com.sofka.domain.generic.Entity;
import com.Sofka.Deliveri.orden.value.Horario;
import com.Sofka.Deliveri.orden.value.NomCompletoTel;
import com.Sofka.Deliveri.orden.value.TelefonistaID;

import java.util.Objects;

public class Telefonista extends Entity<TelefonistaID> {

    private NomCompletoTel nombre;
    private Horario horario;

    public Telefonista(TelefonistaID entityId, NomCompletoTel nombre, Horario horario) {
        super(entityId);
        this.nombre= nombre;
        this.horario= horario;
    }

    public NomCompletoTel getNombre() {
        return nombre;
    }

    public void setNombre(NomCompletoTel nombre) {
        this.nombre = Objects.requireNonNull(nombre) ;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = Objects.requireNonNull(horario) ;
    }
}
