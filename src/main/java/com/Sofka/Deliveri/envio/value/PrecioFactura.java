package com.Sofka.Deliveri.envio.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class PrecioFactura implements ValueObject<Integer> {
    private final Integer pesos;

    public PrecioFactura(Integer pesos) {
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
        PrecioFactura that = (PrecioFactura) o;
        return Objects.equals(pesos, that.pesos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pesos);
    }
}
