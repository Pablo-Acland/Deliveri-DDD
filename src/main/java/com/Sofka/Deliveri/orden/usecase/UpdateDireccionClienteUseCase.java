package com.Sofka.Deliveri.orden.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.Sofka.Deliveri.envio.comands.UpdateDireccion;
import com.Sofka.Deliveri.orden.Orden;
import com.Sofka.Deliveri.orden.comands.UpdateDireccionCliente;

public class UpdateDireccionClienteUseCase extends UseCase<RequestCommand<UpdateDireccionCliente>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<UpdateDireccionCliente> updateDireccionClienteRequestCommand) {
        var command = updateDireccionClienteRequestCommand.getCommand();
        Orden orden = Orden.from(command.getOrdenID(), repository().getEventsBy(command.getOrdenID().value()));
        orden.updateDireccion(command.getClienteID(),command.getDir());
        emit().onResponse(new ResponseEvents(orden.getUncommittedChanges()));

    }
}
