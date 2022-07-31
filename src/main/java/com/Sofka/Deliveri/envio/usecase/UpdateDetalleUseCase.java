package com.Sofka.Deliveri.envio.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.Sofka.Deliveri.envio.Envio;
import com.Sofka.Deliveri.envio.comands.UpdateDetalle;

public class UpdateDetalleUseCase extends UseCase<RequestCommand<UpdateDetalle>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<UpdateDetalle> updateDetalleRequestCommand) {
        var command = updateDetalleRequestCommand.getCommand();
        Envio envio = Envio.from(command.getEnvioID(), repository().getEventsBy(command.getEnvioID().value()));
        envio.updateDetalles(command.getVeiculoID(),command.getDetallesVeiculo());
        emit().onResponse(new ResponseEvents(envio.getUncommittedChanges()));

    }
}
