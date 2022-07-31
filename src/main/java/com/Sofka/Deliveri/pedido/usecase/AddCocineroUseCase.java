package com.Sofka.Deliveri.pedido.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.Sofka.Deliveri.pedido.Pedido;
import com.Sofka.Deliveri.pedido.comands.AddCocinero;

public class AddCocineroUseCase extends UseCase<RequestCommand<AddCocinero>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AddCocinero> addCocineroRequestCommand) {
        var command = addCocineroRequestCommand.getCommand();
        Pedido pedido = Pedido.from(command.getPedidoID(), repository().getEventsBy(command.getPedidoID().value()));
        pedido.addCocinero(command.getNomCompletoCocinero());
        emit().onResponse(new ResponseEvents(pedido.getUncommittedChanges()));
    }
}
