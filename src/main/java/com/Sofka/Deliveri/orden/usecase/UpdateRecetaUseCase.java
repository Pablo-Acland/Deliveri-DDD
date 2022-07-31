package com.Sofka.Deliveri.orden.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.Sofka.Deliveri.orden.Orden;
import com.Sofka.Deliveri.orden.comands.UpdateReceta;

public class UpdateRecetaUseCase extends UseCase<RequestCommand<UpdateReceta>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<UpdateReceta> updateRecetaRequestCommand) {
        var command = updateRecetaRequestCommand.getCommand();
        Orden orden = Orden.from(command.getOrdenID(), repository().getEventsBy(command.getOrdenID().value()));
        orden.updateReceta(command.getProductoID(),command.getReceta());
        emit().onResponse(new ResponseEvents(orden.getUncommittedChanges()));

    }
}
