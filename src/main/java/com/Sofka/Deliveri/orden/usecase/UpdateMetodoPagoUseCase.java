package com.Sofka.Deliveri.orden.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.Sofka.Deliveri.orden.Orden;
import com.Sofka.Deliveri.orden.comands.UpdateMetodoPago;

public class UpdateMetodoPagoUseCase extends UseCase<RequestCommand<UpdateMetodoPago>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<UpdateMetodoPago> updateMetodoPagoRequestCommand) {
        var command = updateMetodoPagoRequestCommand.getCommand();
        Orden orden = Orden.from(command.getOrdenID(), repository().getEventsBy(command.getOrdenID().value()));
        orden.updateMetodoPago(command.getClienteID(),command.getMetodoPago());
        emit().onResponse(new ResponseEvents(orden.getUncommittedChanges()));
    }
}
