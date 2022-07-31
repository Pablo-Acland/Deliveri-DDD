package com.Sofka.Deliveri.envio.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.Sofka.Deliveri.envio.value.DeliveriID;
import com.Sofka.Deliveri.envio.value.TelefonoDeliveri;

public class TelefonoUpdated extends DomainEvent {

    private final DeliveriID deliveriID;
    private final TelefonoDeliveri telefonoDeliveri;


    public TelefonoUpdated(DeliveriID deliveriID, TelefonoDeliveri telefonoDeliveri) {
        super("com.sofka.deliveri.envio.telefonoupdated");
        this.deliveriID = deliveriID;
        this.telefonoDeliveri = telefonoDeliveri;
    }

    public DeliveriID getDeliveriID() {
        return deliveriID;
    }

    public TelefonoDeliveri getTelefonoDeliveri() {
        return telefonoDeliveri;
    }
}
