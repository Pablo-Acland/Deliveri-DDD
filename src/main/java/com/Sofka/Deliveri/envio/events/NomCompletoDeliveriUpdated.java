package com.Sofka.Deliveri.envio.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.Sofka.Deliveri.envio.value.DeliveriID;
import com.Sofka.Deliveri.envio.value.NomCompletoDeliveri;

public class NomCompletoDeliveriUpdated extends DomainEvent {
    private final DeliveriID deliveriID;
    private final NomCompletoDeliveri nomCompletoDeliveri;


    public NomCompletoDeliveriUpdated(DeliveriID deliveriID, NomCompletoDeliveri nomCompletoDeliveri) {
        super("com.sofka.deliveri.envio.nomcompletodeliveriupdated");
        this.deliveriID = deliveriID;
        this.nomCompletoDeliveri = nomCompletoDeliveri;
    }

    public DeliveriID getDeliveriID() {
        return deliveriID;
    }

    public NomCompletoDeliveri getNomCompletoDeliveri() {
        return nomCompletoDeliveri;
    }
}
