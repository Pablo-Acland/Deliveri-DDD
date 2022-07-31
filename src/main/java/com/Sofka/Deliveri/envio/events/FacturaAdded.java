package com.Sofka.Deliveri.envio.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.Sofka.Deliveri.envio.value.DireccionFactura;
import com.Sofka.Deliveri.envio.value.FacturaID;
import com.Sofka.Deliveri.envio.value.PrecioFactura;

public class FacturaAdded extends DomainEvent {
    private final FacturaID facturaID;
    private final PrecioFactura precioFactura;
    private final DireccionFactura direccion;

    public FacturaAdded(FacturaID facturaID, PrecioFactura precioFactura, DireccionFactura direccion) {
        super("com.sofka.deliveri.envio.facturaadded");
        this.facturaID = facturaID;
        this.precioFactura = precioFactura;
        this.direccion = direccion;
    }

    public FacturaID getFacturaID() {
        return facturaID;
    }

    public PrecioFactura getPrecioFactura() {
        return precioFactura;
    }

    public DireccionFactura getDireccion() {
        return direccion;
    }
}
