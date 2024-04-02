package org.itson.bdavanzadas.agenciafiscal_negocio.dtos;

import java.util.Date;

/**
 * DTO (Objeto de Transferencia de Datos) que representa un trámite de placas
 * nuevas. Contiene información sobre el número de placas, el automóvil
 * asociado, la fecha de recepción, el costo, la fecha de emisión y el
 * contribuyente asociado al trámite. Hereda de la clase TramiteNuevoDTO.
 *
 * @author Gamaliel Armenta
 * @author Roberto García
 */
public class PlacasNuevasDTO extends TramiteNuevoDTO {

    private String numeroPlacas;
    private AutomovilNuevoDTO automovilNuevoDTO;
    private Date fechaRecepcion;

    /**
     * Constructor de la clase PlacasNuevasDTO que toma el costo, la fecha de
     * emisión y el contribuyente asociado al trámite.
     *
     * @param costo El costo del trámite.
     * @param fechaEmision La fecha de emisión del trámite.
     * @param contribuyenteDTO El contribuyente asociado al trámite.
     */
    public PlacasNuevasDTO(Float costo, Date fechaEmision, ContribuyenteDTO contribuyenteDTO) {
        super(costo, fechaEmision, contribuyenteDTO);
    }

    /**
     * Constructor de la clase PlacasNuevasDTO que toma el número de placas, el
     * costo, la fecha de emisión y el contribuyente asociado al trámite.
     *
     * @param numeroPlacas El número de placas asociado al trámite.
     * @param costo El costo del trámite.
     * @param fechaEmision La fecha de emisión del trámite.
     * @param contribuyenteDTO El contribuyente asociado al trámite.
     */
    public PlacasNuevasDTO(String numeroPlacas, Float costo, Date fechaEmision, ContribuyenteDTO contribuyenteDTO) {
        super(costo, fechaEmision, contribuyenteDTO);
        this.numeroPlacas = numeroPlacas;
    }

    /**
     * Constructor de la clase PlacasNuevasDTO que toma el número de placas, el
     * automóvil asociado, el costo, la fecha de emisión y el contribuyente
     * asociado al trámite.
     *
     * @param numeroPlacas El número de placas asociado al trámite.
     * @param automovilNuevoDTO El objeto AutomovilNuevoDTO asociado al trámite.
     * @param costo El costo del trámite.
     * @param fechaEmision La fecha de emisión del trámite.
     * @param contribuyenteDTO El contribuyente asociado al trámite.
     */
    public PlacasNuevasDTO(String numeroPlacas, AutomovilNuevoDTO automovilNuevoDTO, Float costo, Date fechaEmision, ContribuyenteDTO contribuyenteDTO) {
        super(costo, fechaEmision, contribuyenteDTO);
        this.numeroPlacas = numeroPlacas;
        this.automovilNuevoDTO = automovilNuevoDTO;
    }

    /**
     * Constructor de la clase PlacasNuevasDTO que toma el número de placas, el
     * automóvil asociado, la fecha de recepción, el costo, la fecha de emisión
     * y el contribuyente asociado al trámite.
     *
     * @param numeroPlacas El número de placas asociado al trámite.
     * @param automovilNuevoDTO El objeto AutomovilNuevoDTO asociado al trámite.
     * @param fechaRecepcion La fecha de recepción del trámite.
     * @param costo El costo del trámite.
     * @param fechaEmision La fecha de emisión del trámite.
     * @param contribuyenteDTO El contribuyente asociado al trámite.
     */
    public PlacasNuevasDTO(String numeroPlacas, AutomovilNuevoDTO automovilNuevoDTO, Date fechaRecepcion, Float costo, Date fechaEmision, ContribuyenteDTO contribuyenteDTO) {
        super(costo, fechaEmision, contribuyenteDTO);
        this.numeroPlacas = numeroPlacas;
        this.automovilNuevoDTO = automovilNuevoDTO;
        this.fechaRecepcion = fechaRecepcion;
    }

    /**
     * Obtiene el número de placas asociado al trámite.
     *
     * @return El número de placas asociado al trámite.
     */
    public String getNumeroPlacas() {
        return numeroPlacas;
    }

    /**
     * Establece el número de placas asociado al trámite.
     *
     * @param numeroPlacas El número de placas a establecer.
     */
    public void setNumeroPlacas(String numeroPlacas) {
        this.numeroPlacas = numeroPlacas;
    }

    /**
     * Obtiene el objeto AutomovilNuevoDTO asociado al trámite.
     *
     * @return El objeto AutomovilNuevoDTO asociado al trámite.
     */
    public AutomovilNuevoDTO getAutomovilNuevoDTO() {
        return automovilNuevoDTO;
    }

    /**
     * Establece el objeto AutomovilNuevoDTO asociado al trámite.
     *
     * @param automovilNuevoDTO El objeto AutomovilNuevoDTO a establecer.
     */
    public void setAutomovilNuevoDTO(AutomovilNuevoDTO automovilNuevoDTO) {
        this.automovilNuevoDTO = automovilNuevoDTO;
    }

    /**
     * Obtiene la fecha de recepción del trámite.
     *
     * @return La fecha de recepción del trámite.
     */
    public Date getFechaRecepcion() {
        return fechaRecepcion;
    }

    /**
     * Establece la fecha de recepción del trámite.
     *
     * @param fechaRecepcion La fecha de recepción a establecer.
     */
    public void setFechaRecepcion(Date fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }

}
