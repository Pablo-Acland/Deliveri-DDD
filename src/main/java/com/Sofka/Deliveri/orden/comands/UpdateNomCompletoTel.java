package com.Sofka.Deliveri.orden.comands;

import co.com.sofka.domain.generic.Command;
import com.Sofka.Deliveri.orden.value.NomCompletoTel;
import com.Sofka.Deliveri.orden.value.OrdenID;
import com.Sofka.Deliveri.orden.value.TelefonistaID;

public class UpdateNomCompletoTel extends Command {
    private final OrdenID ordenID;
    private final TelefonistaID telefonistaID;
    private final NomCompletoTel nomCompletoTel;

    public UpdateNomCompletoTel(OrdenID ordenID, TelefonistaID telefonistaID, NomCompletoTel nomCompletoTel) {
        this.ordenID = ordenID;
        this.telefonistaID = telefonistaID;
        this.nomCompletoTel = nomCompletoTel;
    }

    public OrdenID getOrdenID() {
        return ordenID;
    }

    public TelefonistaID getTelefonistaID() {
        return telefonistaID;
    }

    public NomCompletoTel getNomCompletoTel() {
        return nomCompletoTel;
    }
}
