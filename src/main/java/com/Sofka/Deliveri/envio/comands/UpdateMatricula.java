package com.Sofka.Deliveri.envio.comands;

import co.com.sofka.domain.generic.Command;
import com.Sofka.Deliveri.envio.value.EnvioID;
import com.Sofka.Deliveri.envio.value.MatriculaVeiculo;
import com.Sofka.Deliveri.envio.value.VeiculoID;

public class UpdateMatricula extends Command {
    private final EnvioID envioID;
    private final VeiculoID veiculoID;
    private final MatriculaVeiculo matriculaVeiculo;

    public UpdateMatricula(EnvioID envioID, VeiculoID veiculoID, MatriculaVeiculo matriculaVeiculo) {
        this.envioID = envioID;
        this.veiculoID = veiculoID;
        this.matriculaVeiculo = matriculaVeiculo;
    }

    public EnvioID getEnvioID() {
        return envioID;
    }

    public VeiculoID getVeiculoID() {
        return veiculoID;
    }

    public MatriculaVeiculo getMatriculaVeiculo() {
        return matriculaVeiculo;
    }
}
