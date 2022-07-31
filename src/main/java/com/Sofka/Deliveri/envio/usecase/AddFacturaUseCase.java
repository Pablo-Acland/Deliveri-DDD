package com.Sofka.Deliveri.envio.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.Sofka.Deliveri.envio.Envio;
import com.Sofka.Deliveri.envio.comands.AddFactura;

public class AddFacturaUseCase extends UseCase<RequestCommand<AddFactura>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AddFactura> addFacturaRequestCommand) {
        var command = addFacturaRequestCommand.getCommand();
        Envio envio = Envio.from(command.getEnvioID(), repository().getEventsBy(command.getEnvioID().value()));
        envio.addFactura(command.getPrecioFactura(),command.getDireccion());
        emit().onResponse(new ResponseEvents(envio.getUncommittedChanges()));
    }
}
