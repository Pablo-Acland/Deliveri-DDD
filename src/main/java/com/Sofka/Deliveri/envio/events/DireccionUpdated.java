package com.Sofka.Deliveri.envio.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.Sofka.Deliveri.envio.value.DireccionFactura;
import com.Sofka.Deliveri.envio.value.FacturaID;

public class DireccionUpdated extends DomainEvent {

    private final FacturaID facturaID;
    private final DireccionFactura direccion;

    public DireccionUpdated(FacturaID facturaID, DireccionFactura direccion) {
        super("com.sofka.deliveri.envio.direccionupdated");
        this.facturaID = facturaID;
        this.direccion = direccion;
    }

    public FacturaID getFacturaID() {
        return facturaID;
    }

    public DireccionFactura getDireccion() {
        return direccion;
    }
}
