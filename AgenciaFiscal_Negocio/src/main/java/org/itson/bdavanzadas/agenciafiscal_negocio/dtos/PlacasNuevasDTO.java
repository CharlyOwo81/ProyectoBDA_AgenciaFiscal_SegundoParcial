package org.itson.bdavanzadas.agenciafiscal_negocio.dtos;

import java.util.Date;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Vehiculo;

/**
 *
 * @author Roberto García
 */
public class PlacasNuevasDTO extends TramiteNuevoDTO{
    private String numeroPlacas;
    private AutomovilNuevoDTO automovilNuevoDTO;

    public PlacasNuevasDTO(String numeroPlacas, Float costo, Date fechaEmision, ContribuyenteDTO contribuyenteDTO) {
        super(costo, fechaEmision, contribuyenteDTO);
        this.numeroPlacas = numeroPlacas;
    }

    public PlacasNuevasDTO(Float costo, Date fechaEmision, ContribuyenteDTO contribuyenteDTO) {
        super(costo, fechaEmision, contribuyenteDTO);
    }

    public PlacasNuevasDTO(String numeroPlacas, AutomovilNuevoDTO automovilNuevoDTO, Float costo, Date fechaEmision, ContribuyenteDTO contribuyenteDTO) {
        super(costo, fechaEmision, contribuyenteDTO);
        this.numeroPlacas = numeroPlacas;
        this.automovilNuevoDTO = automovilNuevoDTO;
    }

    public String getNumeroPlacas() {
        return numeroPlacas;
    }

    public void setNumeroPlacas(String numeroPlacas) {
        this.numeroPlacas = numeroPlacas;
    }

    public AutomovilNuevoDTO getAutomovilNuevoDTO() {
        return automovilNuevoDTO;
    }

    public void setAutomovilNuevoDTO(AutomovilNuevoDTO automovilNuevoDTO) {
        this.automovilNuevoDTO = automovilNuevoDTO;
    }
    
}
