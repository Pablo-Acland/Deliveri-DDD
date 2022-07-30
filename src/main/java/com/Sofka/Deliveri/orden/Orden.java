package com.Sofka.Deliveri.orden;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.Sofka.Deliveri.orden.entities.Cliente;
import com.Sofka.Deliveri.orden.entities.Producto;
import com.Sofka.Deliveri.orden.entities.Telefonista;
import com.Sofka.Deliveri.orden.events.*;
import com.Sofka.Deliveri.orden.value.*;


import java.util.*;

public class Orden extends AggregateEvent<OrdenID>  {
    protected Set<Producto> productos;
    protected Cliente cliente;
    protected Telefonista telefonista;
    protected boolean crada;

    public Orden(OrdenID entityId, boolean creada) {
        super(entityId);
        appendChange(new OrdenCreated(creada)).apply();
    }

    private Orden(OrdenID entityId){
        super(entityId);
        subscribe(new OrdenChange(this));
    }

    public static Orden from(OrdenID ordenID, List<DomainEvent> domainEvents) {
        Orden orden = new Orden(ordenID);
        domainEvents.forEach(orden::applyEvent);
        return orden;
    }

    public void addProducto(Receta receta, PrecioProducto precioProducto){
        ProductoID productoID = new ProductoID();
        appendChange(new ProductoAdded(productoID, precioProducto, receta)).apply();
    }

    public void updateReceta(ProductoID productoID, Receta receta){
        appendChange(new RecetaUpdated(productoID, receta)).apply();
    }

    public void updatePrecioProducto(ProductoID productoID, PrecioProducto precio){
        appendChange(new PrecioUpdated(productoID, precio)).apply();
    }

    public void addCliente(NomCompletoCliente nomCompletoCliente, Direccion direccion, MetodoPago metodoPago){
        ClienteID clienteID= new ClienteID();
        appendChange(new ClienteAdded(clienteID, direccion, nomCompletoCliente,  metodoPago)).apply();
    }

    public void updateNomCompletoCliente(ClienteID clienteID, NomCompletoCliente nomCompletoCliente){
        appendChange(new NomCompletoClienteUpdated(clienteID, nomCompletoCliente
        )).apply();
    }

    public void updateDireccion(ClienteID clienteID, Direccion direccion){
        appendChange(new DireccionUpdated(clienteID, direccion)).apply();
    }

    public void updateMetodoPago(ClienteID clienteID, MetodoPago metodoPago){
        appendChange(new MetodoPagoUpdated(clienteID, metodoPago)).apply();
    }

    public void addTelefonista(NomCompletoTel nomCompletoTel, Horario horario){
        TelefonistaID telefonistaID= new TelefonistaID();
        appendChange(new TelefonistaAdded(telefonistaID, nomCompletoTel, horario)).apply();
    }

    public void updateNomCompletoTel(TelefonistaID telefonistaID, NomCompletoTel nomCompletoTel){
        appendChange(new NomCompletoTelUpdated(telefonistaID, nomCompletoTel)).apply();
    }

    public void updateHorario(TelefonistaID telefonistaID, Horario horario){
        appendChange(new HorarioUpdated(telefonistaID, horario)).apply();
    }

    protected Optional<Producto> findProductoById(ProductoID productoID) {
        return this.productos.stream().filter(producto -> producto.identity().equals(productoID)).findFirst();
    }

    public Set<Producto> getProductos() {
        return productos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Telefonista getTelefonista() {
        return telefonista;
    }

    public boolean isCrada() {
        return crada;
    }
}

