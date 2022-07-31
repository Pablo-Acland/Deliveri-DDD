package com.Sofka.Deliveri.orden.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.Sofka.Deliveri.orden.Orden;
import com.Sofka.Deliveri.orden.comands.UpdatePrecio;

public class UpdatePrecioUseCase extends UseCase<RequestCommand<UpdatePrecio>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<UpdatePrecio> updatePrecioRequestCommand) {
        var command = updatePrecioRequestCommand.getCommand();
        Orden orden = Orden.from(command.getOrdenID(), repository().getEventsBy(command.getOrdenID().value()));
        orden.updatePrecioProducto(command.getProductoID(),command.getPrecioProducto());
        emit().onResponse(new ResponseEvents(orden.getUncommittedChanges()));

    }
}
