package com.Sofka.Deliveri.envio.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.Sofka.Deliveri.envio.Envio;
import com.Sofka.Deliveri.envio.comands.CreateEnvio;

public class CreateEnvioUseCase extends UseCase<RequestCommand<CreateEnvio>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<CreateEnvio> createEnvioRequestCommand) {
        var command = createEnvioRequestCommand.getCommand();
        var envio= new Envio(command.getEnvioID(),command.getPedidoID());
        emit().onResponse(new ResponseEvents(envio.getUncommittedChanges()));
    }
}
