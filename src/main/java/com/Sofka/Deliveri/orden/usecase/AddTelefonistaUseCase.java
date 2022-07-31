package com.Sofka.Deliveri.orden.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.Sofka.Deliveri.orden.Orden;
import com.Sofka.Deliveri.orden.comands.AddTelefonista;

public class AddTelefonistaUseCase extends UseCase<RequestCommand<AddTelefonista>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AddTelefonista> addTelefonistaRequestCommand) {
        var command = addTelefonistaRequestCommand.getCommand();
        Orden orden = Orden.from(command.getOrdenID(), repository().getEventsBy(command.getOrdenID().value()));

        orden.addTelefonista(command.getNomCompletoTel(),command.getHorario());
        emit().onResponse(new ResponseEvents(orden.getUncommittedChanges()));
    }
}
