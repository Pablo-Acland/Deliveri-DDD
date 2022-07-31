package com.Sofka.Deliveri.envio.comands;

import co.com.sofka.domain.generic.Command;
import com.Sofka.Deliveri.envio.value.EnvioID;
import com.Sofka.Deliveri.envio.value.NomCompletoDeliveri;
import com.Sofka.Deliveri.envio.value.TelefonoDeliveri;

public class AddDeliveri extends Command {

    private final EnvioID envioID;
    private final NomCompletoDeliveri nomCompletoDeliveri;
    private final TelefonoDeliveri telefonoDeliveri;

    public AddDeliveri(EnvioID envioID, NomCompletoDeliveri nomCompletoDeliveri, TelefonoDeliveri telefonoDeliveri) {
        this.envioID = envioID;
        this.nomCompletoDeliveri = nomCompletoDeliveri;
        this.telefonoDeliveri = telefonoDeliveri;
    }

    public EnvioID getEnvioID() {
        return envioID;
    }

    public NomCompletoDeliveri getNomCompletoDeliveri() {
        return nomCompletoDeliveri;
    }

    public TelefonoDeliveri getTelefonoDeliveri() {
        return telefonoDeliveri;
    }
}
