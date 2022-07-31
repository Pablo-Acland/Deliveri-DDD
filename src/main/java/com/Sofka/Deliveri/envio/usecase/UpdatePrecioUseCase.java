package com.Sofka.Deliveri.envio.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.Sofka.Deliveri.envio.Envio;
import com.Sofka.Deliveri.envio.comands.UpdatePrecio;

public class UpdatePrecioUseCase extends UseCase<RequestCommand<UpdatePrecio>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<UpdatePrecio> updatePrecioRequestCommand) {
        var command = updatePrecioRequestCommand.getCommand();
        Envio envio = Envio.from(command.getEnvioID(), repository().getEventsBy(command.getEnvioID().value()));
        envio.updatePrecioFactura(command.getFacturaID(),command.getPrecioFactura());
        emit().onResponse(new ResponseEvents(envio.getUncommittedChanges()));

    }
}
