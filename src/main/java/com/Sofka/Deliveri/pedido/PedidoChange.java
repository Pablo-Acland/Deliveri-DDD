package com.Sofka.Deliveri.pedido;

import co.com.sofka.domain.generic.EventChange;
import com.Sofka.Deliveri.pedido.entities.Cocinero;
import com.Sofka.Deliveri.pedido.entities.Paquete;
import com.Sofka.Deliveri.pedido.events.*;
import com.Sofka.Deliveri.pedido.value.Descripcion;

import java.util.HashSet;

public class PedidoChange extends EventChange {
    PedidoChange(Pedido pedido){
        apply((PedidoCreated event)->{
            pedido.ordenID= event.getOrdenID();
            pedido.paquetes= new HashSet<>();
        });

        apply((CocineroAdded event)->{
            pedido.cocinero= new Cocinero(event.getCocineroID(), event.getNomCompletoCocinero());
        });

        apply((NomCompletoCocineroUpdated event)->{
            pedido.cocinero.setNomCompletoCocinero(event.getNomCompletoCocinero());
        });

        apply((PaqueteAdded event)->{
            Paquete paquete= new Paquete(event.getPaqueteID(),event.getDescripcion());
            pedido.paquetes.add(paquete);
        });
        apply((DescripcionUpdated event)->{
            Paquete paquete= pedido.findPedidoById(event.getPaqueteID()).orElseThrow();
            paquete.setDescripcion(event.getDescripcion());
        });


    }
}
