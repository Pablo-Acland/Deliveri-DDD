package com.Sofka.Deliveri.envio.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.Sofka.Deliveri.envio.Envio;
import com.Sofka.Deliveri.envio.comands.UpdateMatricula;

public class UpdateMatriculaUseCase extends UseCase<RequestCommand<UpdateMatricula>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<UpdateMatricula> updateMatriculaRequestCommand) {
        var command = updateMatriculaRequestCommand.getCommand();
        Envio envio = Envio.from(command.getEnvioID(), repository().getEventsBy(command.getEnvioID().value()));
        envio.updateMatricula(command.getVeiculoID(),command.getMatriculaVeiculo());
        emit().onResponse(new ResponseEvents(envio.getUncommittedChanges()));

    }
}
