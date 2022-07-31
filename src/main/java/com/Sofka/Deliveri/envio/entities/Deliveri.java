package com.Sofka.Deliveri.envio.entities;

import co.com.sofka.domain.generic.Entity;
import com.Sofka.Deliveri.envio.value.DeliveriID;
import com.Sofka.Deliveri.envio.value.NomCompletoDeliveri;
import com.Sofka.Deliveri.envio.value.TelefonoDeliveri;
import com.Sofka.Deliveri.envio.value.TipoVeiculo;

public class Deliveri extends Entity<DeliveriID> {

    private NomCompletoDeliveri nomCompletoDeliveri;
    private TelefonoDeliveri telefonoDeliveri;

    public Deliveri(DeliveriID entityId, NomCompletoDeliveri nomCompletoDeliveri, TelefonoDeliveri telefonoDeliveri) {
        super(entityId);
        this.nomCompletoDeliveri= nomCompletoDeliveri;
        this.telefonoDeliveri= telefonoDeliveri;
    }

    public NomCompletoDeliveri getNomCompletoDeliveri() {
        return nomCompletoDeliveri;
    }

    public void setNomCompletoDeliveri(NomCompletoDeliveri nomCompletoDeliveri) {
        this.nomCompletoDeliveri = nomCompletoDeliveri;
    }

    public TelefonoDeliveri getTelefonoDeliveri() {
        return telefonoDeliveri;
    }

    public void setTelefonoDeliveri(TelefonoDeliveri telefonoDeliveri) {
        this.telefonoDeliveri = telefonoDeliveri;
    }
}
