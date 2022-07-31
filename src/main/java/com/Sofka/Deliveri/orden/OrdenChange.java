package com.Sofka.Deliveri.orden;

import co.com.sofka.domain.generic.EventChange;
import com.Sofka.Deliveri.orden.entities.Cliente;
import com.Sofka.Deliveri.orden.entities.Producto;
import com.Sofka.Deliveri.orden.entities.Telefonista;
import com.Sofka.Deliveri.orden.events.*;

import java.util.HashSet;

public class OrdenChange extends EventChange {
    OrdenChange(Orden orden){
        apply((OrdenCreated event)->{
            orden.productos = new HashSet<>();
        });

        apply((ProductoAdded event)->{
            Producto producto= new Producto(event.getProductoID(),event.getReceta(),event.getPrecioProducto());
            orden.productos.add(producto);
        });

        apply((ClienteAdded event)->{
            orden.cliente= new Cliente(event.getClienteID(),event.getNomCompletoCliente(),event.getDir(),event.getMetodoPago());
        });

        apply((DireccionUpdated event)->{
            orden.cliente.setDir(event.getDir());

        });

        apply((HorarioUpdated event)->{
            orden.telefonista.setHorario(event.getHorario());
        });

        apply((MetodoPagoUpdated event)->{
            orden.cliente.setMetodo(event.getMetodoPago());
        });

        apply((NomCompletoClienteUpdated event)->{
            orden.cliente.setNombre(event.getNomCompletoCliente());
        });

        apply((NomCompletoTelUpdated event)->{
            orden.telefonista.setNombre(event.getNomCompletoTel());
        });

        apply((PrecioUpdated event)->{
            Producto producto = orden.findProductoById(event.getProductoID()).orElseThrow();
            producto.setPrecio(event.getPrecioProducto());
        });

        apply((RecetaUpdated event)->{
            Producto producto = orden.findProductoById(event.getProductoID()).orElseThrow();
            producto.setReceta(event.getReceta());
        });

        apply((TelefonistaAdded event)->{
            orden.telefonista= new Telefonista(event.getTelefonistaID(),event.getNomCompletoTel(),event.getHorario());
        });

    }


}
