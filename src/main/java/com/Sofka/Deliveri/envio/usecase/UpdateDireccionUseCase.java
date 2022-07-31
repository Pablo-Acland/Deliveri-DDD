package com.Sofka.Deliveri.envio.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.Sofka.Deliveri.envio.Envio;
import com.Sofka.Deliveri.envio.comands.UpdateDireccion;

public class UpdateDireccionUseCase extends UseCase<RequestCommand<UpdateDireccion>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<UpdateDireccion> updateDireccionRequestCommand) {
        var command = updateDireccionRequestCommand.getCommand();
        Envio envio = Envio.from(command.getEnvioID(), repository().getEventsBy(command.getEnvioID().value()));
        envio.updateDireccion(command.getFacturaID(),command.getDireccion());
        emit().onResponse(new ResponseEvents(envio.getUncommittedChanges()));

    }
}
