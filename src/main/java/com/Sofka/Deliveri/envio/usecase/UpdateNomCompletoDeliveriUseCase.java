package com.Sofka.Deliveri.envio.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.Sofka.Deliveri.envio.Envio;
import com.Sofka.Deliveri.envio.comands.UpdateNomCompletoDeliveri;

public class UpdateNomCompletoDeliveriUseCase extends UseCase<RequestCommand<UpdateNomCompletoDeliveri>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<UpdateNomCompletoDeliveri> updateNomCompletoDeliveriRequestCommand) {
        var command = updateNomCompletoDeliveriRequestCommand.getCommand();
        Envio envio = Envio.from(command.getEnvioID(), repository().getEventsBy(command.getEnvioID().value()));
        envio.updateNomCompletoDeliveri(command.getDeliveriID(),command.getNomCompletoDeliveri());
        emit().onResponse(new ResponseEvents(envio.getUncommittedChanges()));

    }
}
