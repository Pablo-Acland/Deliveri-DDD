package com.Sofka.Deliveri.orden.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Horario implements ValueObject<String> {
   private final String Turno;
   private final String CantidadHoras;

    public Horario(String turno, String cantidadHoras) {
        Turno = Objects.requireNonNull(turno) ;
        CantidadHoras = Objects.requireNonNull(cantidadHoras) ;
    }

    @Override
    public String value() {
        return toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horario horario = (Horario) o;
        return Objects.equals(Turno, horario.Turno) && Objects.equals(CantidadHoras, horario.CantidadHoras);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Turno, CantidadHoras);
    }

    @Override
    public String toString() {
        return "Horario{" +
                "Turno: '" + Turno + '\'' +
                ", CantidadHoras: '" + CantidadHoras + '\'' +
                '}';
    }
}
