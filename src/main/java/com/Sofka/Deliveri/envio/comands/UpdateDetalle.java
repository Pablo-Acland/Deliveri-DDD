package com.Sofka.Deliveri.envio.comands;

import co.com.sofka.domain.generic.Command;
import com.Sofka.Deliveri.envio.value.DetallesVeiculo;
import com.Sofka.Deliveri.envio.value.EnvioID;
import com.Sofka.Deliveri.envio.value.VeiculoID;

public class UpdateDetalle extends Command {
    private final EnvioID envioID;
    private final VeiculoID veiculoID;
    private final DetallesVeiculo detallesVeiculo;


    public UpdateDetalle(EnvioID envioID, VeiculoID veiculoID, DetallesVeiculo detallesVeiculo) {
        this.envioID = envioID;
        this.veiculoID = veiculoID;
        this.detallesVeiculo = detallesVeiculo;
    }

    public EnvioID getEnvioID() {
        return envioID;
    }

    public VeiculoID getVeiculoID() {
        return veiculoID;
    }

    public DetallesVeiculo getDetallesVeiculo() {
        return detallesVeiculo;
    }
}
