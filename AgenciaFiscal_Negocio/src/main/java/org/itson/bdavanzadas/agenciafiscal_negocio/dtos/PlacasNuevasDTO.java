package org.itson.bdavanzadas.agenciafiscal_negocio.dtos;

import java.util.Date;

/**
 *
 * @author Roberto García
 */
public class PlacasNuevasDTO extends TramiteNuevoDTO{
    private String numeroPlacas;
    private AutomovilNuevoDTO automovilNuevoDTO;
    private Date fechaRecepcion;

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

    public PlacasNuevasDTO(String numeroPlacas, AutomovilNuevoDTO automovilNuevoDTO, Date fechaRecepcion, Float costo, Date fechaEmision, ContribuyenteDTO contribuyenteDTO) {
        super(costo, fechaEmision, contribuyenteDTO);
        this.numeroPlacas = numeroPlacas;
        this.automovilNuevoDTO = automovilNuevoDTO;
        this.fechaRecepcion = fechaRecepcion;
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

    public Date getFechaRecepcion() {
        return fechaRecepcion;
    }

    public void setFechaRecepcion(Date fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }
    
}
