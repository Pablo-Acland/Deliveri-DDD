package com.Sofka.Deliveri.envio.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class DetallesVeiculo implements ValueObject<String> {

    private final String cilindrada;
    private final String modelo;
    private final String color;

    public DetallesVeiculo(String cilindrada, String modelo, String color) {
        this.cilindrada = Objects.requireNonNull(cilindrada) ;
        this.modelo = Objects.requireNonNull(modelo) ;
        this.color = Objects.requireNonNull(color) ;
    }


    @Override
    public String value() {
        return toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DetallesVeiculo that = (DetallesVeiculo) o;
        return Objects.equals(cilindrada, that.cilindrada) && Objects.equals(modelo, that.modelo) && Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cilindrada, modelo, color);
    }

    @Override
    public String toString() {
        return "Detalles del Veiculo{" +
                "cilindrada: '" + cilindrada + '\'' +
                ", modelo: '" + modelo + '\'' +
                ", color: '" + color + '\'' +
                '}';
    }
}
