package org.itson.bdavanzadas.agenciafiscal_negocio.dtos;

import java.util.Date;

/**
 *
 * @author Roberto García
 */
public class ReporteDTO {
    private TipoTramiteEnum tipoTramite;
    private Date desde;
    private Date hasta;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;

    public ReporteDTO(TipoTramiteEnum tipoTramite, Date desde, Date hasta, String nombre, String apellidoPaterno, String apellidoMaterno) {
        this.tipoTramite = tipoTramite;
        this.desde = desde;
        this.hasta = hasta;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
    }


    public TipoTramiteEnum getTipoTramite() {
        return tipoTramite;
    }

    public void setTipoTramite(TipoTramiteEnum tipoTramite) {
        this.tipoTramite = tipoTramite;
    }

    public Date getDesde() {
        return desde;
    }

    public void setDesde(Date desde) {
        this.desde = desde;
    }

    public Date getHasta() {
        return hasta;
    }

    public void setHasta(Date hasta) {
        this.hasta = hasta;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    
}
