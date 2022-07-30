package com.Sofka.Deliveri.pedido;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.Sofka.Deliveri.orden.value.OrdenID;
import com.Sofka.Deliveri.pedido.entities.Cocinero;
import com.Sofka.Deliveri.pedido.entities.Paquete;
import com.Sofka.Deliveri.pedido.events.*;
import com.Sofka.Deliveri.pedido.value.*;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public class Pedido extends AggregateEvent<PedidoID> {
    protected Set<Paquete> paquetes;
    protected Cocinero cocinero;
    protected OrdenID ordenID;


    public Pedido(PedidoID entityId, OrdenID ordenID) {
        super(entityId);
        appendChange(new PedidoCreated(ordenID)).apply();
    }

    private Pedido(PedidoID entityId) {
        super(entityId);
        subscribe(new PedidoChange(this));
    }

    public static Pedido from(PedidoID pedidoID, List<DomainEvent> events) {
        Pedido pedido = new Pedido(pedidoID);
        events.forEach(pedido::applyEvent);
        return pedido;
    }

    public void addCocinero(NomCompletoCocinero nomCompletoCocinero) {
        CocineroID cocineroID = new CocineroID();
        appendChange(new CocineroAdded(cocineroID, nomCompletoCocinero)).apply();
    }

    public void updateNomCompletoCocinero(CocineroID cocineroID, NomCompletoCocinero nomCompletoCocinero) {
        appendChange(new NomCompletoCocineroUpdated(cocineroID, nomCompletoCocinero)).apply();
    }

    public void addPaquete(Descripcion descripcion) {
        PaqueteID paqueteID = new PaqueteID();
        appendChange(new PaqueteAdded(paqueteID, descripcion)).apply();
    }

    public void updateDescripcion(PaqueteID paqueteID, Descripcion descripcion) {
        appendChange(new DescripcionUpdated(paqueteID, descripcion)).apply();
    }



    protected Optional<Paquete> findPedidoById(PaqueteID paqueteID) {
        return this.paquetes.stream().filter(paquete -> paquete.identity().equals(paqueteID)).findFirst();
    }

    public Set<Paquete> getPaquetes() {
        return paquetes;
    }

    public Cocinero getCocinero() {
        return cocinero;
    }

    public OrdenID getOrdenID() {
        return ordenID;
    }
}
