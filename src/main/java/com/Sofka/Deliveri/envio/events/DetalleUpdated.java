package com.Sofka.Deliveri.envio.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.Sofka.Deliveri.envio.value.DetallesVeiculo;
import com.Sofka.Deliveri.envio.value.VeiculoID;

public class DetalleUpdated extends DomainEvent {
    private final VeiculoID veiculoID;
    private final DetallesVeiculo detallesVeiculo;

    public DetalleUpdated(VeiculoID veiculoID, DetallesVeiculo detallesVeiculo) {
        super("com.sofka.deliveri.envio.detalleupdated");
        this.veiculoID = veiculoID;
        this.detallesVeiculo = detallesVeiculo;
    }

    public VeiculoID getVeiculoID() {
        return veiculoID;
    }

    public DetallesVeiculo getDetallesVeiculo() {
        return detallesVeiculo;
    }
}
