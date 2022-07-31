package com.Sofka.Deliveri.envio.entities;

import co.com.sofka.domain.generic.Entity;
import com.Sofka.Deliveri.envio.value.DetallesVeiculo;
import com.Sofka.Deliveri.envio.value.MatriculaVeiculo;
import com.Sofka.Deliveri.envio.value.TipoVeiculo;
import com.Sofka.Deliveri.envio.value.VeiculoID;

public class Veiculo extends Entity<VeiculoID> {

    private TipoVeiculo tipoVeiculo;
    private MatriculaVeiculo matriculaVeiculo;
    private DetallesVeiculo detallesVeiculo;


    public Veiculo(VeiculoID entityId, TipoVeiculo tipoVeiculo, MatriculaVeiculo matriculaVeiculo, DetallesVeiculo detallesVeiculo) {
        super(entityId);
        this.detallesVeiculo= detallesVeiculo;
        this.matriculaVeiculo= matriculaVeiculo;
        this.tipoVeiculo = tipoVeiculo;
    }

    public TipoVeiculo getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public MatriculaVeiculo getMatriculaVeiculo() {
        return matriculaVeiculo;
    }

    public void setMatriculaVeiculo(MatriculaVeiculo matriculaVeiculo) {
        this.matriculaVeiculo = matriculaVeiculo;
    }

    public DetallesVeiculo getDetallesVeiculo() {
        return detallesVeiculo;
    }

    public void setDetallesVeiculo(DetallesVeiculo detallesVeiculo) {
        this.detallesVeiculo = detallesVeiculo;
    }
}
