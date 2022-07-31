package com.Sofka.Deliveri.envio.comands;

import co.com.sofka.domain.generic.Command;
import com.Sofka.Deliveri.envio.value.EnvioID;
import com.Sofka.Deliveri.envio.value.TipoVeiculo;
import com.Sofka.Deliveri.envio.value.VeiculoID;

public class UpdateTipo extends Command {
    private final EnvioID envioID;
    private final VeiculoID veiculoID;
    private final TipoVeiculo tipoVeiculo;


    public UpdateTipo(EnvioID envioID, VeiculoID veiculoID, TipoVeiculo tipoVeiculo) {
        this.envioID = envioID;
        this.veiculoID = veiculoID;
        this.tipoVeiculo = tipoVeiculo;
    }

    public EnvioID getEnvioID() {
        return envioID;
    }

    public VeiculoID getVeiculoID() {
        return veiculoID;
    }

    public TipoVeiculo getTipoVeiculo() {
        return tipoVeiculo;
    }
}
