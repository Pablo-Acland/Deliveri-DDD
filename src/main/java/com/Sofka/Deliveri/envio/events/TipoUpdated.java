package com.Sofka.Deliveri.envio.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.Sofka.Deliveri.envio.value.TipoVeiculo;
import com.Sofka.Deliveri.envio.value.VeiculoID;

public class TipoUpdated extends DomainEvent {
    private final VeiculoID veiculoID;
    private final TipoVeiculo tipoVeiculo;


    public TipoUpdated(VeiculoID veiculoID, TipoVeiculo tipoVeiculo) {
        super("com.sofka.deliveri.envio.tipoupdated");
        this.veiculoID = veiculoID;
        this.tipoVeiculo = tipoVeiculo;
    }

    public VeiculoID getVeiculoID() {
        return veiculoID;
    }

    public TipoVeiculo getTipoVeiculo() {
        return tipoVeiculo;
    }
}
