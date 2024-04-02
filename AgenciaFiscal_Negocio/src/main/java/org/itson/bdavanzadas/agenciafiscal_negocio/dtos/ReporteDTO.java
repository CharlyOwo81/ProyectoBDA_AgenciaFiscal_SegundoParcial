package org.itson.bdavanzadas.agenciafiscal_negocio.dtos;

import java.util.Date;

/**
 *
 * @author Roberto García
 */
/**
 * DTO (Data Transfer Object) utilizado para representar los datos de un
 * reporte. Contiene información sobre el tipo de trámite, el rango de fechas, y
 * los datos del contribuyente.
 *
 * @author Gamaliel Armenta
 * @author Roberto García
 */
public class ReporteDTO {

    private TipoTramiteEnum tipoTramite; // Tipo de trámite del reporte
    private Date desde; // Fecha de inicio del rango de fechas del reporte
    private Date hasta; // Fecha de fin del rango de fechas del reporte
    private String nombre; // Nombre del contribuyente para el reporte
    private String apellidoPaterno; // Apellido paterno del contribuyente para el reporte
    private String apellidoMaterno; // Apellido materno del contribuyente para el reporte

    /**
     * Constructor de la clase ReporteDTO. Crea una nueva instancia de
     * ReporteDTO con los datos proporcionados.
     *
     * @param tipoTramite El tipo de trámite del reporte.
     * @param desde La fecha de inicio del rango de fechas del reporte.
     * @param hasta La fecha de fin del rango de fechas del reporte.
     * @param nombre El nombre del contribuyente para el reporte.
     * @param apellidoPaterno El apellido paterno del contribuyente para el
     * reporte.
     * @param apellidoMaterno El apellido materno del contribuyente para el
     * reporte.
     */
    public ReporteDTO(TipoTramiteEnum tipoTramite, Date desde, Date hasta, String nombre, String apellidoPaterno, String apellidoMaterno) {
        this.tipoTramite = tipoTramite;
        this.desde = desde;
        this.hasta = hasta;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
    }

    /**
     * Obtiene el tipo de trámite del reporte.
     *
     * @return El tipo de trámite del reporte.
     */
    public TipoTramiteEnum getTipoTramite() {
        return tipoTramite;
    }

    /**
     * Establece el tipo de trámite del reporte.
     *
     * @param tipoTramite El tipo de trámite del reporte.
     */
    public void setTipoTramite(TipoTramiteEnum tipoTramite) {
        this.tipoTramite = tipoTramite;
    }

    /**
     * Obtiene la fecha de inicio del rango de fechas del reporte.
     *
     * @return La fecha de inicio del rango de fechas del reporte.
     */
    public Date getDesde() {
        return desde;
    }

    /**
     * Establece la fecha de inicio del rango de fechas del reporte.
     *
     * @param desde La fecha de inicio del rango de fechas del reporte.
     */
    public void setDesde(Date desde) {
        this.desde = desde;
    }

    /**
     * Obtiene la fecha de fin del rango de fechas del reporte.
     *
     * @return La fecha de fin del rango de fechas del reporte.
     */
    public Date getHasta() {
        return hasta;
    }

    /**
     * Establece la fecha de fin del rango de fechas del reporte.
     *
     * @param hasta La fecha de fin del rango de fechas del reporte.
     */
    public void setHasta(Date hasta) {
        this.hasta = hasta;
    }

    /**
     * Obtiene el nombre del contribuyente para el reporte.
     *
     * @return El nombre del contribuyente para el reporte.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del contribuyente para el reporte.
     *
     * @param nombre El nombre del contribuyente para el reporte.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el apellido paterno del contribuyente para el reporte.
     *
     * @return El apellido paterno del contribuyente para el reporte.
     */
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    /**
     * Establece el apellido paterno del contribuyente para el reporte.
     *
     * @param apellidoPaterno El apellido paterno del contribuyente para el
     * reporte.
     */
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    /**
     * Obtiene el apellido materno del contribuyente para el reporte.
     *
     * @return El apellido materno del contribuyente para el reporte.
     */
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    /**
     * Establece el apellido materno del contribuyente para el reporte.
     *
     * @param apellidoMaterno El apellido materno del contribuyente para el
     * reporte.
     */
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

}
