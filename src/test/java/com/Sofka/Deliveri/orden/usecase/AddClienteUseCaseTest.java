package com.Sofka.Deliveri.orden.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import com.Sofka.Deliveri.orden.comands.AddCliente;
import com.Sofka.Deliveri.orden.events.ClienteAdded;
import com.Sofka.Deliveri.orden.value.DireccionCliente;
import com.Sofka.Deliveri.orden.value.MetodoPago;
import com.Sofka.Deliveri.orden.value.NomCompletoCliente;
import com.Sofka.Deliveri.orden.value.OrdenID;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class AddClienteUseCaseTest {

    @InjectMocks
    private AddClienteUseCase useCase;

    @Test
    void addClienteToOrdenSuccessfully(){
        OrdenID ordenID = OrdenID.of("XXXX");
        MetodoPago metodoPago = new MetodoPago("efectivo");
        DireccionCliente direccionCliente = new DireccionCliente("Pedro", "100", "Pay");
        NomCompletoCliente nomCompletoCliente = new NomCompletoCliente("Pablo", "Acland");
        var comand = new AddCliente(ordenID, nomCompletoCliente, direccionCliente, metodoPago);


        List<DomainEvent> domainEvents = UseCaseHandler.getInstance()
                .setIdentifyExecutor(comand.getOrdenID().value())
                .syncExecutor(useCase, new RequestCommand<>(comand))
                .orElseThrow()
                .getDomainEvents();

        var event = (ClienteAdded) domainEvents.get(0);
        assertEquals("xxxx", event.getClienteID().value());
        assertEquals("efectivo", event.getMetodoPago().value());



    }

}
