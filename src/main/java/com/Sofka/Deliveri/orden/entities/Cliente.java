package com.Sofka.Deliveri.orden.entities;

import co.com.sofka.domain.generic.Entity;
import com.Sofka.Deliveri.orden.value.ClienteID;
import com.Sofka.Deliveri.orden.value.DireccionCliente;
import com.Sofka.Deliveri.orden.value.MetodoPago;
import com.Sofka.Deliveri.orden.value.NomCompletoCliente;

import java.util.Objects;

public class Cliente extends Entity<ClienteID> {
    private NomCompletoCliente nombre;
    private DireccionCliente dir;
    private MetodoPago metodo;


    public Cliente(ClienteID entityId, NomCompletoCliente nombre, DireccionCliente dir, MetodoPago metodo) {
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

    public DireccionCliente getDir() {
        return dir;
    }

    public void setDir(DireccionCliente dir) {
        this.dir = Objects.requireNonNull(dir) ;
    }

    public MetodoPago getMetodo() {
        return metodo;
    }

    public void setMetodo(MetodoPago metodo) {
        this.metodo = Objects.requireNonNull(metodo) ;
    }
}
