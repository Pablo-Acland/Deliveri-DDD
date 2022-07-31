package com.Sofka.Deliveri.pedido.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.Sofka.Deliveri.pedido.Pedido;
import com.Sofka.Deliveri.pedido.comands.CreatePedido;

public class CreatePredidoUseCase extends UseCase<RequestCommand<CreatePedido>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CreatePedido> createPedidoRequestCommand) {
        var command = createPedidoRequestCommand.getCommand();
        var pedido = new Pedido(command.getPedidoID(), command.getOrdenID());
        emit().onResponse(new ResponseEvents(pedido.getUncommittedChanges()));
    }
}
