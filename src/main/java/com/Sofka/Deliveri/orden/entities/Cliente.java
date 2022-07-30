package com.Sofka.Deliveri.orden.entities;

import co.com.sofka.domain.generic.Entity;
import com.Sofka.Deliveri.orden.value.ClienteID;
import com.Sofka.Deliveri.orden.value.Direccion;
import com.Sofka.Deliveri.orden.value.MetodoPago;
import com.Sofka.Deliveri.orden.value.NomCompletoCliente;

import java.util.Objects;

public class Cliente extends Entity<ClienteID> {
    private NomCompletoCliente nombre;
    private Direccion dir;
    private MetodoPago metodo;


    public Cliente(ClienteID entityId, NomCompletoCliente nombre, Direccion dir, MetodoPago metodo) {
        super(entityId);
        this.nombre= nombre;
        this.dir = dir;
        this.metodo= metodo;
    }

    public NomCompletoCliente getNombre() {
        return nombre;
    }

    public void setNombre(NomCompletoCliente nombre) {
        this.nombre = Objects.requireNonNull(nombre) ;
    }

    public Direccion getDir() {
        return dir;
    }

    public void setDir(Direccion dir) {
        this.dir = Objects.requireNonNull(dir) ;
    }

    public MetodoPago getMetodo() {
        return metodo;
    }

    public void setMetodo(MetodoPago metodo) {
        this.metodo = Objects.requireNonNull(metodo) ;
    }
}
