package org.itson.bdavanzadas.agenciafiscal_negocio.dtos;

import java.util.Date;

/**
 * DTO (Data Transfer Object) utilizado para representar los filtros de un
 * reporte. Esta clase encapsula los datos que se pueden utilizar para filtrar
 * los resultados de un reporte, como nombre, apellidos, fechas y tipo de
 * trámite.
 *
 * @author Gamaliel Armenta
 * @author Roberto García
 */
public class FiltroReporteDTO {

    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private Date desde;
    private Date hasta;
    private String tipoTramite;

    /**
     * Constructor por defecto de la clase FiltroReporteDTO.
     */
    public FiltroReporteDTO() {
    }

    /**
     * Constructor de la clase FiltroReporteDTO que recibe el nombre como
     * parámetro.
     *
     * @param nombre El nombre para filtrar el reporte.
     */
    public FiltroReporteDTO(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Constructor de la clase FiltroReporteDTO que recibe las fechas como
     * parámetros.
     *
     * @param desde La fecha de inicio para filtrar el reporte.
     * @param hasta La fecha de fin para filtrar el reporte.
     */
    public FiltroReporteDTO(Date desde, Date hasta) {
        this.desde = desde;
        this.hasta = hasta;
    }

    /**
     * Constructor de la clase FiltroReporteDTO que recibe el nombre y los
     * apellidos como parámetros.
     *
     * @param nombre El nombre para filtrar el reporte.
     * @param apellidoPaterno El apellido paterno para filtrar el reporte.
     * @param apellidoMaterno El apellido materno para filtrar el reporte.
     */
    public FiltroReporteDTO(String nombre, String apellidoPaterno, String apellidoMaterno) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
    }

    /**
     * Constructor de la clase FiltroReporteDTO que recibe las fechas y el tipo
     * de trámite como parámetros.
     *
     * @param desde La fecha de inicio para filtrar el reporte.
     * @param hasta La fecha de fin para filtrar el reporte.
     * @param tipoTramite El tipo de trámite para filtrar el reporte.
     */
    public FiltroReporteDTO(Date desde, Date hasta, String tipoTramite) {
        this.desde = desde;
        this.hasta = hasta;
        this.tipoTramite = tipoTramite;
    }

    /**
     * Constructor de la clase FiltroReporteDTO que recibe el nombre, los
     * apellidos, las fechas y el tipo de trámite como parámetros.
     *
     * @param nombre El nombre para filtrar el reporte.
     * @param apellidoPaterno El apellido paterno para filtrar el reporte.
     * @param apellidoMaterno El apellido materno para filtrar el reporte.
     * @param desde La fecha de inicio para filtrar el reporte.
     * @param hasta La fecha de fin para filtrar el reporte.
     * @param tipoTramite El tipo de trámite para filtrar el reporte.
     */
    public FiltroReporteDTO(String nombre, String apellidoPaterno, String apellidoMaterno, Date desde, Date hasta, String tipoTramite) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.desde = desde;
        this.hasta = hasta;
        this.tipoTramite = tipoTramite;
    }

    /**
     * Obtiene el nombre del filtro.
     *
     * @return El nombre del filtro.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del filtro.
     *
     * @param nombre El nombre del filtro.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el apellido paterno del filtro.
     *
     * @return El apellido paterno del filtro.
     */
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    /**
     * Establece el apellido paterno del filtro.
     *
     * @param apellidoPaterno El apellido paterno del filtro.
     */
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    /**
     * Obtiene el apellido materno del filtro.
     *
     * @return El apellido materno del filtro.
     */
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    /**
     * Establece el apellido materno del filtro.
     *
     * @param apellidoMaterno El apellido materno del filtro.
     */
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    /**
     * Obtiene la fecha de inicio del filtro.
     *
     * @return La fecha de inicio del filtro.
     */
    public Date getDesde() {
        return desde;
    }

    /**
     * Establece la fecha de inicio del filtro.
     *
     * @param desde La fecha de inicio del filtro.
     */
    public void setDesde(Date desde) {
        this.desde = desde;
    }

    /**
     * Obtiene la fecha de fin del filtro.
     *
     * @return La fecha de fin del filtro.
     */
    public Date getHasta() {
        return hasta;
    }

    /**
     * Establece la fecha de fin del filtro.
     *
     * @param hasta La fecha de fin del filtro.
     */
    public void setHasta(Date hasta) {
        this.hasta = hasta;
    }

    /**
     * Obtiene el tipo de trámite del filtro.
     *
     * @return El tipo de trámite del filtro.
     */
    public String getTipoTramite() {
        return tipoTramite;
    }

    /**
     * Establece el tipo de trámite del filtro.
     *
     * @param tipoTramite El tipo de trámite del filtro.
     */
    public void setTipoTramite(String tipoTramite) {
        this.tipoTramite = tipoTramite;
    }

}
