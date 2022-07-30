package com.Sofka.Deliveri.orden.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Receta implements ValueObject<String> {
    private final String value;

    public Receta(String value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Receta receta = (Receta) o;
        return Objects.equals(value, receta.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
