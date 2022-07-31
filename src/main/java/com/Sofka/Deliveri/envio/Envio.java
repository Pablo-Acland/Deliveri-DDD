package com.Sofka.Deliveri.envio;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.Sofka.Deliveri.envio.entities.Deliveri;
import com.Sofka.Deliveri.envio.entities.Factura;
import com.Sofka.Deliveri.envio.entities.Veiculo;
import com.Sofka.Deliveri.envio.events.*;
import com.Sofka.Deliveri.envio.value.*;
import com.Sofka.Deliveri.pedido.value.PedidoID;

import java.util.List;

public class Envio extends AggregateEvent<EnvioID> {

    protected Veiculo veiculo;
    protected Deliveri deliveri;
    protected Factura factura;
    protected PedidoID pedidoID;

    public Envio(EnvioID entityId, PedidoID pedidoID) {
        super(entityId);
        appendChange(new EnvioCreated(pedidoID)).apply();
    }


    public Envio(EnvioID entityId) {
        super(entityId);
        subscribe(new EnvioChange(this));
    }

    public static Envio from(EnvioID envioID, List<DomainEvent> domainEvents) {
        Envio envio = new Envio(envioID);
        domainEvents.forEach(envio::applyEvent);
        return envio;
    }

    public void addVeiculo(TipoVeiculo tipoVeiculo, DetallesVeiculo detallesVeiculo, MatriculaVeiculo matriculaVeiculo) {
        VeiculoID veiculoID = new VeiculoID();
        appendChange(new VeiculoAdded(veiculoID, tipoVeiculo, matriculaVeiculo, detallesVeiculo )).apply();
    }

    public void updateTipoVeiculo(VeiculoID veiculoID, TipoVeiculo tipoVeiculo) {
        appendChange(new TipoUpdated(veiculoID, tipoVeiculo)).apply();
    }

    public void updateMatricula(VeiculoID veiculoID, MatriculaVeiculo matriculaVeiculo) {
        appendChange(new MatriculaUpdated(veiculoID, matriculaVeiculo)).apply();
    }

    public void updateDetalles(VeiculoID veiculoID, DetallesVeiculo detallesVeiculo) {
        appendChange(new DetalleUpdated(veiculoID, detallesVeiculo)).apply();
    }

    public void addDeliveri(NomCompletoDeliveri tipoVeiculo, TelefonoDeliveri detallesVeiculo) {
        DeliveriID deliveriID = new DeliveriID();
        appendChange(new DeliveriAdded(deliveriID, tipoVeiculo, detallesVeiculo)).apply();
    }

    public void updateNomCompletoDeliveri(DeliveriID deliveriID, NomCompletoDeliveri nomCompletoDeliveri) {
        appendChange(new NomCompletoDeliveriUpdated(deliveriID, nomCompletoDeliveri)).apply();
    }

    public void updateTelefono(DeliveriID deliveriID, TelefonoDeliveri telefonoDeliveri) {
        appendChange(new TelefonoUpdated(deliveriID, telefonoDeliveri)).apply();
    }

    public void addFactura(PrecioFactura precioFactura, DireccionFactura direccion) {
        FacturaID facturaID = new FacturaID();
        appendChange(new FacturaAdded(facturaID,  precioFactura, direccion)).apply();
    }

    public void updatePrecioFactura(FacturaID facturaID, PrecioFactura precioFactura) {
        appendChange(new PrecioUpdated(facturaID, precioFactura)).apply();
    }

    public void updateDireccion(FacturaID facturaID, DireccionFactura direccion) {
        appendChange(new DireccionUpdated(facturaID, direccion)).apply();
    }


    public Veiculo getVeiculo() {
        return veiculo;
    }

    public Deliveri getDeliveri() {
        return deliveri;
    }

    public Factura getFactura() {
        return factura;
    }

    public PedidoID getPedidoID() {
        return pedidoID;
    }
}
