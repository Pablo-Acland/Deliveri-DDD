package com.Sofka.Deliveri.envio.value;

import co.com.sofka.domain.generic.ValueObject;
import com.Sofka.Deliveri.orden.value.NomCompletoCliente;

import java.util.Objects;

public class NomCompletoDeliveri implements ValueObject<String> {
    private final String nombre;
    private final String Apellido;

    public NomCompletoDeliveri(String nombre, String apellido) {
        this.nombre = Objects.requireNonNull(nombre) ;
        Apellido = Objects.requireNonNull(apellido) ;
    }

    @Override
    public String value() {
        return toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NomCompletoDeliveri that = (NomCompletoDeliveri) o;
        return Objects.equals(nombre, that.nombre) && Objects.equals(Apellido, that.Apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, Apellido);
    }

    @Override
    public String toString() {
        return "Nombre Completo de Deliveri{" +
                "Nombre: '" + nombre + '\'' +
                ", Apellido: '" + Apellido + '\'' +
                '}';
    }


}
