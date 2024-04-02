package org.itson.bdavanzadas.agenciafiscal_negocio.dtos;

import java.util.Date;

/**
 * Clase que representa un trámite de placas viejas. Extiende la clase
 * TramiteNuevoDTO y contiene información específica sobre el número de placas,
 * el automóvil asociado y la fecha de recepción del trámite.
 *
 * @author Gamaliel Armenta
 * @author Roberto García
 */
public class PlacasViejasDTO extends TramiteNuevoDTO {

    private String numeroPlacas;
    private AutomovilNuevoDTO automovilNuevoDTO;
    private Date fechaRecepcion;

    /**
     * Constructor de la clase PlacasViejasDTO que inicializa un trámite de
     * placas viejas.
     *
     * @param costo Costo del trámite.
     * @param fechaEmision Fecha de emisión del trámite.
     * @param contribuyenteDTO Contribuyente asociado al trámite.
     */
    public PlacasViejasDTO(Float costo, Date fechaEmision, ContribuyenteDTO contribuyenteDTO) {
        super(costo, fechaEmision, contribuyenteDTO);
    }

    /**
     * Constructor de la clase PlacasViejasDTO que inicializa un trámite de
     * placas viejas con el número de placas especificado.
     *
     * @param numeroPlacas Número de placas asociado al trámite.
     * @param costo Costo del trámite.
     * @param fechaEmision Fecha de emisión del trámite.
     * @param contribuyenteDTO Contribuyente asociado al trámite.
     */
    public PlacasViejasDTO(String numeroPlacas, Float costo, Date fechaEmision, ContribuyenteDTO contribuyenteDTO) {
        super(costo, fechaEmision, contribuyenteDTO);
        this.numeroPlacas = numeroPlacas;
    }

    /**
     * Constructor de la clase PlacasViejasDTO que inicializa un trámite de
     * placas viejas con el número de placas y el automóvil asociado
     * especificados.
     *
     * @param numeroPlacas Número de placas asociado al trámite.
     * @param automovilNuevoDTO Automóvil asociado al trámite.
     * @param costo Costo del trámite.
     * @param fechaEmision Fecha de emisión del trámite.
     * @param contribuyenteDTO Contribuyente asociado al trámite.
     */
    public PlacasViejasDTO(String numeroPlacas, AutomovilNuevoDTO automovilNuevoDTO, Float costo, Date fechaEmision, ContribuyenteDTO contribuyenteDTO) {
        super(costo, fechaEmision, contribuyenteDTO);
        this.numeroPlacas = numeroPlacas;
        this.automovilNuevoDTO = automovilNuevoDTO;
    }

    /**
     * Constructor de la clase PlacasViejasDTO que inicializa un trámite de
     * placas viejas con el número de placas, el automóvil asociado y la fecha
     * de recepción especificados.
     *
     * @param numeroPlacas Número de placas asociado al trámite.
     * @param automovilNuevoDTO Automóvil asociado al trámite.
     * @param fechaRecepcion Fecha de recepción del trámite.
     * @param costo Costo del trámite.
     * @param fechaEmision Fecha de emisión del trámite.
     * @param contribuyenteDTO Contribuyente asociado al trámite.
     */
    public PlacasViejasDTO(String numeroPlacas, AutomovilNuevoDTO automovilNuevoDTO, Date fechaRecepcion, Float costo, Date fechaEmision, ContribuyenteDTO contribuyenteDTO) {
        super(costo, fechaEmision, contribuyenteDTO);
        this.numeroPlacas = numeroPlacas;
        this.automovilNuevoDTO = automovilNuevoDTO;
        this.fechaRecepcion = fechaRecepcion;
    }

    /**
     * Obtiene el número de placas asociado al trámite de placas viejas.
     *
     * @return El número de placas asociado al trámite.
     */
    public String getNumeroPlacas() {
        return numeroPlacas;
    }

    /**
     * Establece el número de placas asociado al trámite de placas viejas.
     *
     * @param numeroPlacas El número de placas a establecer.
     */
    public void setNumeroPlacas(String numeroPlacas) {
        this.numeroPlacas = numeroPlacas;
    }

    /**
     * Obtiene el automóvil nuevo asociado al trámite de placas viejas.
     *
     * @return El automóvil nuevo asociado al trámite.
     */
    public AutomovilNuevoDTO getAutomovilNuevoDTO() {
        return automovilNuevoDTO;
    }

    /**
     * Establece el automóvil nuevo asociado al trámite de placas viejas.
     *
     * @param automovilNuevoDTO El automóvil nuevo a establecer.
     */
    public void setAutomovilNuevoDTO(AutomovilNuevoDTO automovilNuevoDTO) {
        this.automovilNuevoDTO = automovilNuevoDTO;
    }

    /**
     * Obtiene la fecha de recepción del trámite de placas viejas.
     *
     * @return La fecha de recepción del trámite.
     */
    public Date getFechaRecepcion() {
        return fechaRecepcion;
    }

    /**
     * Establece la fecha de recepción del trámite de placas viejas.
     *
     * @param fechaRecepcion La fecha de recepción a establecer.
     */
    public void setFechaRecepcion(Date fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }
    
}
