/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.bdavanzadas.agenciafiscal_negocio.dtos;

import java.util.Date;

/**
 *
 * @author gamaliel
 */
public class FiltroReporteDTO {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private Date desde;
    private Date hasta;
    private String tipoTramite;

    public FiltroReporteDTO() {
    }

    public FiltroReporteDTO(Date desde, Date hasta) {
        this.desde = desde;
        this.hasta = hasta;
    }

    public FiltroReporteDTO(String nombre, String apellidoPaterno, String apellidoMaterno) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
    }

    public FiltroReporteDTO(String nombre) {
        this.nombre = nombre;
    }

    public FiltroReporteDTO(String nombre, String apellidoPaterno, String apellidoMaterno, Date desde, Date hasta, String tipoTramite) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.desde = desde;
        this.hasta = hasta;
        this.tipoTramite = tipoTramite;
    }

    public FiltroReporteDTO(Date desde, Date hasta, String tipoTramite) {
        this.desde = desde;
        this.hasta = hasta;
        this.tipoTramite = tipoTramite;
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

    public String getTipoTramite() {
        return tipoTramite;
    }

    public void setTipoTramite(String tipoTramite) {
        this.tipoTramite = tipoTramite;
    }
    
}
