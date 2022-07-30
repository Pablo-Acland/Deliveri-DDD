package com.Sofka.Deliveri.orden.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class PrecioProducto implements ValueObject<Integer> {
    private final Integer pesos;

    public PrecioProducto(Integer pesos, Integer dolares) {
        this.pesos = Objects.requireNonNull(pesos) ;
    }

    @Override
    public Integer value() {
        return pesos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PrecioProducto that = (PrecioProducto) o;
        return Objects.equals(pesos, that.pesos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pesos);
    }
}
