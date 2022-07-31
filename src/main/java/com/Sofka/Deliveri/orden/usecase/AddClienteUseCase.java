package com.Sofka.Deliveri.orden.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.Sofka.Deliveri.orden.Orden;
import com.Sofka.Deliveri.orden.comands.AddCliente;

public class AddClienteUseCase extends UseCase<RequestCommand<AddCliente>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AddCliente> addClienteRequestCommand) {
        var command = addClienteRequestCommand.getCommand();
        Orden orden = Orden.from(command.getOrdenID(), repository().getEventsBy(command.getOrdenID().value()));

        orden.addCliente(command.getNombre(),command.getDir(),command.getMetodoPago());
        emit().onResponse(new ResponseEvents(orden.getUncommittedChanges()));
    }
}
