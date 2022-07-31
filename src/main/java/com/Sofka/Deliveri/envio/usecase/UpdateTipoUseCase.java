package com.Sofka.Deliveri.envio.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.Sofka.Deliveri.envio.Envio;
import com.Sofka.Deliveri.envio.comands.UpdateTipo;

public class UpdateTipoUseCase extends UseCase<RequestCommand<UpdateTipo>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<UpdateTipo> updateTipoRequestCommand) {
        var command = updateTipoRequestCommand.getCommand();
        Envio envio = Envio.from(command.getEnvioID(), repository().getEventsBy(command.getEnvioID().value()));
        envio.updateTipoVeiculo(command.getVeiculoID(),command.getTipoVeiculo());
        emit().onResponse(new ResponseEvents(envio.getUncommittedChanges()));

    }
}
