package com.Sofka.Deliveri.envio.comands;

import co.com.sofka.domain.generic.Command;
import com.Sofka.Deliveri.envio.value.DetallesVeiculo;
import com.Sofka.Deliveri.envio.value.EnvioID;
import com.Sofka.Deliveri.envio.value.MatriculaVeiculo;
import com.Sofka.Deliveri.envio.value.TipoVeiculo;

public class AddVeiculo extends Command {
    private final EnvioID envioID;
    private final MatriculaVeiculo matriculaVeiculo;
    private final DetallesVeiculo detallesVeiculo;
    private final TipoVeiculo tipoVeiculo;

    public AddVeiculo(EnvioID envioID, MatriculaVeiculo matriculaVeiculo, DetallesVeiculo detallesVeiculo, TipoVeiculo tipoVeiculo) {
        this.envioID = envioID;
        this.matriculaVeiculo = matriculaVeiculo;
        this.detallesVeiculo = detallesVeiculo;
        this.tipoVeiculo = tipoVeiculo;
    }

    public EnvioID getEnvioID() {
        return envioID;
    }

    public MatriculaVeiculo getMatriculaVeiculo() {
        return matriculaVeiculo;
    }

    public DetallesVeiculo getDetallesVeiculo() {
        return detallesVeiculo;
    }

    public TipoVeiculo getTipoVeiculo() {
        return tipoVeiculo;
    }
}
