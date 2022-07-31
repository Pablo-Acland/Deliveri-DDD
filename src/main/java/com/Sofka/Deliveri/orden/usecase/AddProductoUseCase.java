package com.Sofka.Deliveri.orden.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.Sofka.Deliveri.orden.Orden;
import com.Sofka.Deliveri.orden.comands.AddProducto;

public class AddProductoUseCase extends UseCase<RequestCommand<AddProducto>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AddProducto> addProductoRequestCommand) {
        var command = addProductoRequestCommand.getCommand();
        Orden orden = Orden.from(command.getOrdenID(), repository().getEventsBy(command.getOrdenID().value()));

        orden.addProducto(command.getReceta(),command.getPrecioProducto());
        emit().onResponse(new ResponseEvents(orden.getUncommittedChanges()));
    }
}
