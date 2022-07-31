package com.Sofka.Deliveri.envio.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.Sofka.Deliveri.envio.value.FacturaID;
import com.Sofka.Deliveri.envio.value.PrecioFactura;

public class PrecioUpdated extends DomainEvent {
    private final FacturaID facturaID;
    private final PrecioFactura precioFactura;


    public PrecioUpdated(FacturaID facturaID, PrecioFactura precioFactura) {
        super("com.sofka.deliveri.envio.precioupdated");
        this.facturaID = facturaID;
        this.precioFactura = precioFactura;
    }

    public FacturaID getFacturaID() {
        return facturaID;
    }

    public PrecioFactura getPrecioFactura() {
        return precioFactura;
    }
}
