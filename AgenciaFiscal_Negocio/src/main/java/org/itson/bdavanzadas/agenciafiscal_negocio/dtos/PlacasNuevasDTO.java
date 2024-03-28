package org.itson.bdavanzadas.agenciafiscal_negocio.dtos;

import java.util.Date;

/**
 *
 * @author Roberto García
 */
public class PlacasNuevasDTO extends TramiteNuevoDTO{
    private String numeroPlacas;

    public PlacasNuevasDTO(String numeroPlacas, Float costo, Date fechaEmision, ContribuyenteDTO contribuyenteDTO) {
        super(costo, fechaEmision, contribuyenteDTO);
        this.numeroPlacas = numeroPlacas;
    }

    public PlacasNuevasDTO(Float costo, Date fechaEmision, ContribuyenteDTO contribuyenteDTO) {
        super(costo, fechaEmision, contribuyenteDTO);
    }

    public String getNumeroPlacas() {
        return numeroPlacas;
    }

    public void setNumeroPlacas(String numeroPlacas) {
        this.numeroPlacas = numeroPlacas;
    }
    
}
