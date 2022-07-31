package com.Sofka.Deliveri.envio.entities;

import co.com.sofka.domain.generic.Entity;
import com.Sofka.Deliveri.envio.value.DireccionFactura;
import com.Sofka.Deliveri.envio.value.FacturaID;
import com.Sofka.Deliveri.envio.value.PrecioFactura;

public class Factura extends Entity<FacturaID> {

    private DireccionFactura direccion;
    private PrecioFactura precioFactura;


    public Factura(FacturaID entityId, DireccionFactura direccion, PrecioFactura precioFactura) {
        super(entityId);
        this.direccion= direccion;
        this.precioFactura= precioFactura;
    }

    public DireccionFactura getDireccion() {
        return direccion;
    }

    public void setDireccion(DireccionFactura direccion) {
        this.direccion = direccion;
    }

    public PrecioFactura getPrecioFactura() {
        return precioFactura;
    }

    public void setPrecioFactura(PrecioFactura precioFactura) {
        this.precioFactura = precioFactura;
    }
}
