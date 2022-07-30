package com.Sofka.Deliveri.orden.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Direccion implements ValueObject<String> {
    private final  String calle;
    private final String numPuerta;
    private final String ciudad;

    public Direccion(String calle, String numPuerta, String ciudad) {
        this.calle = Objects.requireNonNull(calle) ;
        this.numPuerta = Objects.requireNonNull(numPuerta) ;
        this.ciudad = Objects.requireNonNull(ciudad) ;
    }




    @Override
    public String value() {
        return toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Direccion direccion = (Direccion) o;
        return Objects.equals(calle, direccion.calle) && Objects.equals(numPuerta, direccion.numPuerta) && Objects.equals(ciudad, direccion.ciudad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(calle, numPuerta, ciudad);
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "calle: '" + calle + '\'' +
                ", numPuerta: '" + numPuerta + '\'' +
                ", ciudad: '" + ciudad + '\'' +
                '}';
    }
}
