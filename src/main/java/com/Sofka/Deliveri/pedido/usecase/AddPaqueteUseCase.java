package com.Sofka.Deliveri.pedido.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.Sofka.Deliveri.pedido.Pedido;
import com.Sofka.Deliveri.pedido.comands.AddPaquete;

public class AddPaqueteUseCase extends UseCase<RequestCommand<AddPaquete>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AddPaquete> addPaqueteRequestCommand) {
        var command = addPaqueteRequestCommand.getCommand();
        Pedido pedido = Pedido.from(command.getPedidoID(), repository().getEventsBy(command.getPedidoID().value()));
        pedido.addPaquete(command.getDescripcion());
        emit().onResponse(new ResponseEvents(pedido.getUncommittedChanges()));

    }
}
