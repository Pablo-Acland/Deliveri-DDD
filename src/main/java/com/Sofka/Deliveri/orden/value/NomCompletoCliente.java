package com.Sofka.Deliveri.orden.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NomCompletoCliente implements ValueObject<String> {
    private final String nombre;
    private final String Apellido;

    public NomCompletoCliente(String nombre, String apellido) {
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
        NomCompletoCliente that = (NomCompletoCliente) o;
        return Objects.equals(nombre, that.nombre) && Objects.equals(Apellido, that.Apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, Apellido);
    }

    @Override
    public String toString() {
        return "Nombre Completo de Cliente{" +
                "Nombre: '" + nombre + '\'' +
                ", Apellido: '" + Apellido + '\'' +
                '}';
    }
}
