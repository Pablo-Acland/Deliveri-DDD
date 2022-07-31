package com.Sofka.Deliveri.orden.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.Sofka.Deliveri.orden.Orden;
import com.Sofka.Deliveri.orden.comands.UpdateNomCompletoTel;

public class UpdateNomCompletoTelUseCase extends UseCase<RequestCommand<UpdateNomCompletoTel>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<UpdateNomCompletoTel> updateNomCompletoTelRequestCommand) {
        var command = updateNomCompletoTelRequestCommand.getCommand();
        Orden orden = Orden.from(command.getOrdenID(), repository().getEventsBy(command.getOrdenID().value()));
        orden.updateNomCompletoTel(command.getTelefonistaID(),command.getNomCompletoTel());
        emit().onResponse(new ResponseEvents(orden.getUncommittedChanges()));

    }
}
