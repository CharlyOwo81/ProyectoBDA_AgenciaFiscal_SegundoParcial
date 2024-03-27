package org.itson.bdavanzadas.agenciafiscal_negocio.dtos;

import java.util.Date;

/**
 * DTO (Objeto de Transferencia de Datos) que representa un nuevo trámite.
 * Contiene información sobre el costo, la fecha de emisión y el contribuyente
 * asociado al trámite.
 *
 * @author Gamaliel Armenta
 * @author Roberto García
 */
public class TramiteNuevoDTO {

    private Float costo;
    private Date fechaEmision;
    private ContribuyenteDTO contribuyenteDTO;

    /**
     * Constructor de la clase TramiteNuevoDTO.
     *
     * @param costo Costo del trámite.
     * @param fechaEmision Fecha de emisión del trámite.
     * @param contribuyenteDTO Contribuyente asociado al trámite.
     */
    public TramiteNuevoDTO(Float costo, Date fechaEmision, ContribuyenteDTO contribuyenteDTO) {
        this.costo = costo;
        this.fechaEmision = fechaEmision;
        this.contribuyenteDTO = contribuyenteDTO;
    }

    /**
     * Obtiene el costo del trámite.
     *
     * @return El costo del trámite.
     */
    public Float getCosto() {
        return costo;
    }

    /**
     * Establece el costo del trámite.
     *
     * @param costo El costo del trámite a establecer.
     */
    public void setCosto(Float costo) {
        this.costo = costo;
    }

    /**
     * Obtiene la fecha de emisión del trámite.
     *
     * @return La fecha de emisión del trámite.
     */
    public Date getFechaEmision() {
        return fechaEmision;
    }

    /**
     * Establece la fecha de emisión del trámite.
     *
     * @param fechaEmision La fecha de emisión del trámite a establecer.
     */
    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    /**
     * Obtiene el contribuyente asociado al trámite.
     *
     * @return El contribuyente asociado al trámite.
     */
    public ContribuyenteDTO getContribuyenteDTO() {
        return contribuyenteDTO;
    }

    /**
     * Establece el contribuyente asociado al trámite.
     *
     * @param contribuyenteDTO El contribuyente asociado al trámite a
     * establecer.
     */
    public void setContribuyenteDTO(ContribuyenteDTO contribuyenteDTO) {
        this.contribuyenteDTO = contribuyenteDTO;
    }

}
