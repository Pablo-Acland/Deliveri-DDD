package com.Sofka.Deliveri.orden.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.Sofka.Deliveri.orden.Orden;
import com.Sofka.Deliveri.orden.comands.UpdateNomCompletoCliente;

public class UpdateNomCompletoClienteUseCase extends UseCase<RequestCommand<UpdateNomCompletoCliente>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<UpdateNomCompletoCliente> updateNomCompletoClienteRequestCommand) {
        var command = updateNomCompletoClienteRequestCommand.getCommand();
        Orden orden = Orden.from(command.getOrdenID(), repository().getEventsBy(command.getOrdenID().value()));
        orden.updateNomCompletoCliente(command.getClienteID(),command.getNomCompletoCliente());
        emit().onResponse(new ResponseEvents(orden.getUncommittedChanges()));
    }
}
