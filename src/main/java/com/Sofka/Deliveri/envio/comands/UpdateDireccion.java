package com.Sofka.Deliveri.envio.comands;

import co.com.sofka.domain.generic.Command;
import com.Sofka.Deliveri.envio.value.DireccionFactura;
import com.Sofka.Deliveri.envio.value.EnvioID;
import com.Sofka.Deliveri.envio.value.FacturaID;

public class UpdateDireccion extends Command {
    private final EnvioID envioID;
    private final FacturaID facturaID;
    private final DireccionFactura direccion;

    public UpdateDireccion(EnvioID envioID, FacturaID facturaID, DireccionFactura direccion) {
        this.envioID = envioID;
        this.facturaID = facturaID;
        this.direccion = direccion;
    }

    public EnvioID getEnvioID() {
        return envioID;
    }

    public FacturaID getFacturaID() {
        return facturaID;
    }

    public DireccionFactura getDireccion() {
        return direccion;
    }
}
