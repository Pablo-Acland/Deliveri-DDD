package com.Sofka.Deliveri.envio.comands;

import co.com.sofka.domain.generic.Command;
import com.Sofka.Deliveri.envio.value.EnvioID;
import com.Sofka.Deliveri.envio.value.FacturaID;
import com.Sofka.Deliveri.envio.value.PrecioFactura;

public class UpdatePrecio extends Command {
    private final EnvioID envioID;
    private final FacturaID facturaID;
    private final PrecioFactura precioFactura;


    public UpdatePrecio(EnvioID envioID, FacturaID facturaID, PrecioFactura precioFactura) {
        this.envioID = envioID;
        this.facturaID = facturaID;
        this.precioFactura = precioFactura;
    }

    public EnvioID getEnvioID() {
        return envioID;
    }

    public FacturaID getFacturaID() {
        return facturaID;
    }

    public PrecioFactura getPrecioFactura() {
        return precioFactura;
    }
}
