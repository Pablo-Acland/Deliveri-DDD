package com.Sofka.Deliveri.envio.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.Sofka.Deliveri.envio.Envio;
import com.Sofka.Deliveri.envio.comands.AddVeiculo;

public class AddVeiculoUseCase extends UseCase<RequestCommand<AddVeiculo>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AddVeiculo> addVeiculoRequestCommand) {
        var command = addVeiculoRequestCommand.getCommand();
        Envio envio = Envio.from(command.getEnvioID(), repository().getEventsBy(command.getEnvioID().value()));
        envio.addVeiculo(command.getTipoVeiculo(),command.getDetallesVeiculo(),command.getMatriculaVeiculo());
        emit().onResponse(new ResponseEvents(envio.getUncommittedChanges()));
    }
}
