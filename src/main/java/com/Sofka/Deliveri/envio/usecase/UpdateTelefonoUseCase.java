package com.Sofka.Deliveri.envio.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.Sofka.Deliveri.envio.Envio;
import com.Sofka.Deliveri.envio.comands.UpdateTelefono;

public class UpdateTelefonoUseCase extends UseCase<RequestCommand<UpdateTelefono>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<UpdateTelefono> updateTelefonoRequestCommand) {
        var command = updateTelefonoRequestCommand.getCommand();
        Envio envio = Envio.from(command.getEnvioID(), repository().getEventsBy(command.getEnvioID().value()));
        envio.updateTelefono(command.getDeliveriID(),command.getTelefonoDeliveri());
        emit().onResponse(new ResponseEvents(envio.getUncommittedChanges()));

    }
}
