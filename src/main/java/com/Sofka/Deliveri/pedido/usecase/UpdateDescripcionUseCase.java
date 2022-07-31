package com.Sofka.Deliveri.pedido.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.Sofka.Deliveri.pedido.Pedido;
import com.Sofka.Deliveri.pedido.comands.UpdateDescripcion;

public class UpdateDescripcionUseCase  extends UseCase<RequestCommand<UpdateDescripcion>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<UpdateDescripcion> updateDescripcionRequestCommand) {
        var command = updateDescripcionRequestCommand.getCommand();
        Pedido pedido = Pedido.from(command.getPedidoID(), repository().getEventsBy(command.getPedidoID().value()));
        pedido.updateDescripcion(command.getPaqueteID(),command.getDescripcion());
        emit().onResponse(new ResponseEvents(pedido.getUncommittedChanges()));
    }
}
