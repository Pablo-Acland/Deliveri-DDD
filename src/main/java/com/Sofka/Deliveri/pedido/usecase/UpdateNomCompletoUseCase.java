package com.Sofka.Deliveri.pedido.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.Sofka.Deliveri.pedido.Pedido;
import com.Sofka.Deliveri.pedido.comands.UpdateNomCompleto;

public class UpdateNomCompletoUseCase extends UseCase<RequestCommand<UpdateNomCompleto>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<UpdateNomCompleto> updateNomCompletoRequestCommand) {
        var command = updateNomCompletoRequestCommand.getCommand();
        Pedido pedido = Pedido.from(command.getPedidoID(), repository().getEventsBy(command.getPedidoID().value()));
        pedido.updateNomCompletoCocinero(command.getCocineroID(),command.getNomCompletoCocinero());
        emit().onResponse(new ResponseEvents(pedido.getUncommittedChanges()));
    }
}
