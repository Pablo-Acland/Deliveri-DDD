package com.Sofka.Deliveri.envio;

import co.com.sofka.domain.generic.EventChange;
import com.Sofka.Deliveri.envio.entities.Deliveri;
import com.Sofka.Deliveri.envio.entities.Factura;
import com.Sofka.Deliveri.envio.entities.Veiculo;
import com.Sofka.Deliveri.envio.events.*;

public class EnvioChange extends EventChange {
     EnvioChange(Envio envio) {
        apply((EnvioCreated event)->{
        envio.pedidoID= event.getPedidoID();
        });

        apply((VeiculoAdded event)->{envio.veiculo= new Veiculo(event.getVeiculoID(),event.getTipoVeiculo(),event.getMatriculaVeiculo(),event.getDetallesVeiculo());
        });

        apply((TipoUpdated event)->{
            envio.veiculo.setTipoVeiculo(event.getTipoVeiculo());
        });

        apply((DetalleUpdated event)->{
            envio.veiculo.setDetallesVeiculo(event.getDetallesVeiculo());
        });

        apply((MatriculaUpdated event)->{
            envio.veiculo.setMatriculaVeiculo(event.getMatriculaVeiculo());
        });

        apply((DeliveriAdded event)->{
            envio.deliveri= new Deliveri(event.getDeliveriID(), event.getNomCompletoDeliveri(), event.getTelefonoDeliveri());
        });

        apply((NomCompletoDeliveriUpdated event)->{
            envio.deliveri.setNomCompletoDeliveri(event.getNomCompletoDeliveri());
        });

        apply((TelefonoUpdated event)->{
            envio.deliveri.setTelefonoDeliveri(event.getTelefonoDeliveri());
        });

        apply((FacturaAdded event)->{
            envio.factura= new Factura(event.getFacturaID(),event.getDireccion(),event.getPrecioFactura());
        });

        apply((PrecioUpdated event)->{
            envio.factura.setPrecioFactura(event.getPrecioFactura());
        });

        apply((DireccionUpdated event)->{
            envio.factura.setDireccion(event.getDireccion());
        });

    }
}
