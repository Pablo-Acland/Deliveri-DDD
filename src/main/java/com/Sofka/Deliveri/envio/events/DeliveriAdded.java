package com.Sofka.Deliveri.envio.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.Sofka.Deliveri.envio.value.DeliveriID;
import com.Sofka.Deliveri.envio.value.NomCompletoDeliveri;
import com.Sofka.Deliveri.envio.value.TelefonoDeliveri;

public class DeliveriAdded extends DomainEvent {

    private final DeliveriID deliveriID;
    private final NomCompletoDeliveri nomCompletoDeliveri;
    private final TelefonoDeliveri telefonoDeliveri;

    public DeliveriAdded(DeliveriID deliveriID, NomCompletoDeliveri nomCompletoDeliveri, TelefonoDeliveri telefonoDeliveri) {
        super("com.sofka.deliveri.envio.deliveriadded");
        this.deliveriID = deliveriID;
        this.nomCompletoDeliveri = nomCompletoDeliveri;
        this.telefonoDeliveri = telefonoDeliveri;
    }

    public DeliveriID getDeliveriID() {
        return deliveriID;
    }

    public NomCompletoDeliveri getNomCompletoDeliveri() {
        return nomCompletoDeliveri;
    }

    public TelefonoDeliveri getTelefonoDeliveri() {
        return telefonoDeliveri;
    }
}
