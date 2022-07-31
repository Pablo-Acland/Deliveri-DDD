package com.Sofka.Deliveri.orden.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.Sofka.Deliveri.orden.Orden;
import com.Sofka.Deliveri.orden.comands.UpdateDireccionCliente;
import com.Sofka.Deliveri.orden.comands.UpdateHorario;

public class UpdateHorarioUseCase extends UseCase<RequestCommand<UpdateHorario>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<UpdateHorario> updateHorarioRequestCommand) {
        var command = updateHorarioRequestCommand.getCommand();
        Orden orden = Orden.from(command.getOrdenID(), repository().getEventsBy(command.getOrdenID().value()));
        orden.updateHorario(command.getTelefonistaID(),command.getHorario());
        emit().onResponse(new ResponseEvents(orden.getUncommittedChanges()));
    }
}
