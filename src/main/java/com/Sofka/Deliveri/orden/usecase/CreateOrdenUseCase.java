package com.Sofka.Deliveri.orden.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.Sofka.Deliveri.orden.Orden;
import com.Sofka.Deliveri.orden.comands.CreateOrden;

public class CreateOrdenUseCase extends UseCase<RequestCommand<CreateOrden>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CreateOrden> createOrdenRequestCommand) {
        var command = createOrdenRequestCommand.getCommand();

        var orden = new Orden(command.getEntityId(),command.isCreada());

        emit().onResponse(new ResponseEvents(orden.getUncommittedChanges()));

    }
}
