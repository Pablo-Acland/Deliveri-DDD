package com.Sofka.Deliveri.envio.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.Sofka.Deliveri.envio.Envio;
import com.Sofka.Deliveri.envio.comands.AddDeliveri;

public class AddDeliveriUseCase extends UseCase<RequestCommand<AddDeliveri>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AddDeliveri> addDeliveriRequestCommand) {
        var command = addDeliveriRequestCommand.getCommand();
        Envio envio = Envio.from(command.getEnvioID(), repository().getEventsBy(command.getEnvioID().value()));
        envio.addDeliveri(command.getNomCompletoDeliveri(),command.getTelefonoDeliveri());
        emit().onResponse(new ResponseEvents(envio.getUncommittedChanges()));
    }
}
