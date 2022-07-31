package com.Sofka.Deliveri.envio.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.Sofka.Deliveri.envio.value.MatriculaVeiculo;
import com.Sofka.Deliveri.envio.value.VeiculoID;

public class MatriculaUpdated extends DomainEvent {
    private final VeiculoID veiculoID;
    private final MatriculaVeiculo matriculaVeiculo;

    public MatriculaUpdated(VeiculoID veiculoID, MatriculaVeiculo matriculaVeiculo) {
        super("com.sofka.deliveri.envio.matriculaupdated");
        this.veiculoID = veiculoID;
        this.matriculaVeiculo = matriculaVeiculo;
    }

    public VeiculoID getVeiculoID() {
        return veiculoID;
    }

    public MatriculaVeiculo getMatriculaVeiculo() {
        return matriculaVeiculo;
    }
}
