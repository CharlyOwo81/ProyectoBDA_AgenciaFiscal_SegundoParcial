package org.itson.bdavanzadas.agenciafiscal_negocio.dtos;

import java.util.Date;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.TipoLicencia;

/**
 * Representa un objeto DTO para una nueva licencia. Extiende de TramiteNuevoDTO
 * e incluye información adicional específica de la licencia.
 *
 * @author Gamaliel Armenta
 * @author Roberto García
 */
public class LicenciaNuevaDTO extends TramiteNuevoDTO {

    private Integer vigencia;
    private TipoLicencia tipoLicencia;
    private Date fechaVencimiento;

    /**
     * Crea un nuevo objeto LicenciaNuevaDTO con la información proporcionada.
     *
     * @param vigencia La vigencia de la licencia.
     * @param tipoLicencia El tipo de licencia.
     * @param fechaVencimiento La fecha de vencimiento de la licencia.
     * @param costo El costo del trámite.
     * @param fechaEmision La fecha de emisión del trámite.
     * @param contribuyenteDTO El contribuyente asociado al trámite.
     */
    public LicenciaNuevaDTO(Integer vigencia, TipoLicencia tipoLicencia, Date fechaVencimiento, Float costo, Date fechaEmision, ContribuyenteDTO contribuyenteDTO) {
        super(costo, fechaEmision, contribuyenteDTO);
        this.vigencia = vigencia;
        this.tipoLicencia = tipoLicencia;
        this.fechaVencimiento = fechaVencimiento;
    }

    /**
     * Obtiene la vigencia de la licencia.
     *
     * @return La vigencia de la licencia.
     */
    public Integer getVigencia() {
        return vigencia;
    }

    /**
     * Establece la vigencia de la licencia.
     *
     * @param vigencia La nueva vigencia de la licencia.
     */
    public void setVigencia(Integer vigencia) {
        this.vigencia = vigencia;
    }

    /**
     * Obtiene el tipo de licencia.
     *
     * @return El tipo de licencia.
     */
    public TipoLicencia getTipoLicencia() {
        return tipoLicencia;
    }

    /**
     * Establece el tipo de licencia.
     *
     * @param tipoLicencia El nuevo tipo de licencia.
     */
    public void setTipoLicencia(TipoLicencia tipoLicencia) {
        this.tipoLicencia = tipoLicencia;
    }

    /**
     * Obtiene la fecha de vencimiento de la licencia.
     *
     * @return La fecha de vencimiento de la licencia.
     */
    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    /**
     * Establece la fecha de vencimiento de la licencia.
     *
     * @param fechaVencimiento La nueva fecha de vencimiento de la licencia.
     */
    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

}
