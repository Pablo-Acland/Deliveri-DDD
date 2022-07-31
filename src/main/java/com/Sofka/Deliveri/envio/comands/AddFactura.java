package com.Sofka.Deliveri.envio.comands;

import co.com.sofka.domain.generic.Command;
import com.Sofka.Deliveri.envio.value.DireccionFactura;
import com.Sofka.Deliveri.envio.value.EnvioID;
import com.Sofka.Deliveri.envio.value.PrecioFactura;

public class AddFactura extends Command {
    private final EnvioID envioID;
    private final PrecioFactura precioFactura;
    private final DireccionFactura direccion;


    public AddFactura(EnvioID envioID, PrecioFactura precioFactura, DireccionFactura direccion) {
        this.envioID = envioID;
        this.precioFactura = precioFactura;
        this.direccion = direccion;
    }

    public EnvioID getEnvioID() {
        return envioID;
    }

    public PrecioFactura getPrecioFactura() {
        return precioFactura;
    }

    public DireccionFactura getDireccion() {
        return direccion;
    }
}
