package com.Sofka.Deliveri.envio.comands;

import co.com.sofka.domain.generic.Command;
import com.Sofka.Deliveri.envio.value.DeliveriID;
import com.Sofka.Deliveri.envio.value.EnvioID;
import com.Sofka.Deliveri.envio.value.NomCompletoDeliveri;

public class UpdateNomCompletoDeliveri extends Command {
    private final EnvioID envioID;
    private final DeliveriID deliveriID;
    private final NomCompletoDeliveri nomCompletoDeliveri;


    public UpdateNomCompletoDeliveri(EnvioID envioID, DeliveriID deliveriID, NomCompletoDeliveri nomCompletoDeliveri) {
        this.envioID = envioID;
        this.deliveriID = deliveriID;
        this.nomCompletoDeliveri = nomCompletoDeliveri;
    }

    public EnvioID getEnvioID() {
        return envioID;
    }

    public DeliveriID getDeliveriID() {
        return deliveriID;
    }

    public NomCompletoDeliveri getNomCompletoDeliveri() {
        return nomCompletoDeliveri;
    }
}
