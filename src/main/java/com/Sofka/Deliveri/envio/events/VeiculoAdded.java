package com.Sofka.Deliveri.envio.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.Sofka.Deliveri.envio.value.DetallesVeiculo;
import com.Sofka.Deliveri.envio.value.MatriculaVeiculo;
import com.Sofka.Deliveri.envio.value.TipoVeiculo;
import com.Sofka.Deliveri.envio.value.VeiculoID;

public class VeiculoAdded extends DomainEvent {
    private final VeiculoID veiculoID;
    private final TipoVeiculo tipoVeiculo;
    private final MatriculaVeiculo matriculaVeiculo;
    private final DetallesVeiculo detallesVeiculo;

    public VeiculoAdded(VeiculoID veiculoID, TipoVeiculo tipoVeiculo, MatriculaVeiculo matriculaVeiculo, DetallesVeiculo detallesVeiculo) {
        super("com.sofka.deliveri.envio.veiculoadded");
        this.veiculoID = veiculoID;
        this.tipoVeiculo = tipoVeiculo;
        this.matriculaVeiculo = matriculaVeiculo;
        this.detallesVeiculo = detallesVeiculo;
    }

    public VeiculoID getVeiculoID() {
        return veiculoID;
    }

    public TipoVeiculo getTipoVeiculo() {
        return tipoVeiculo;
    }

    public MatriculaVeiculo getMatriculaVeiculo() {
        return matriculaVeiculo;
    }

    public DetallesVeiculo getDetallesVeiculo() {
        return detallesVeiculo;
    }
}
