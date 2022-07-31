package com.Sofka.Deliveri.envio.comands;

import co.com.sofka.domain.generic.Command;
import com.Sofka.Deliveri.envio.value.DeliveriID;
import com.Sofka.Deliveri.envio.value.EnvioID;
import com.Sofka.Deliveri.envio.value.TelefonoDeliveri;

public class UpdateTelefono extends Command {
    private final EnvioID envioID;
    private final DeliveriID deliveriID;
    private final TelefonoDeliveri telefonoDeliveri;

    public UpdateTelefono(EnvioID envioID, DeliveriID deliveriID, TelefonoDeliveri telefonoDeliveri) {
        this.envioID = envioID;
        this.deliveriID = deliveriID;
        this.telefonoDeliveri = telefonoDeliveri;
    }

    public EnvioID getEnvioID() {
        return envioID;
    }

    public DeliveriID getDeliveriID() {
        return deliveriID;
    }

    public TelefonoDeliveri getTelefonoDeliveri() {
        return telefonoDeliveri;
    }
}
