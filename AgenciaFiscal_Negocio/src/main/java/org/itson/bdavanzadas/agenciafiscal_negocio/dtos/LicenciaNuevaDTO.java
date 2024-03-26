/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.bdavanzadas.agenciafiscal_negocio.dtos;

import java.util.Date;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.TipoLicencia;

/**
 *
 * @author gamaliel
 */
public class LicenciaNuevaDTO extends TramiteNuevoDTO{
    private Integer vigencia;
    private TipoLicencia tipoLicencia;
    private Date fechaVencimiento;

    public LicenciaNuevaDTO(Integer vigencia, TipoLicencia tipoLicencia, Date fechaVencimiento, Float costo, Date fechaEmision, ContribuyenteDTO contribuyenteDTO) {
        super(costo, fechaEmision, contribuyenteDTO);
        this.vigencia = vigencia;
        this.tipoLicencia = tipoLicencia;
        this.fechaVencimiento = fechaVencimiento;
    }

    public Integer getVigencia() {
        return vigencia;
    }

    public void setVigencia(Integer vigencia) {
        this.vigencia = vigencia;
    }

    public TipoLicencia getTipoLicencia() {
        return tipoLicencia;
    }

    public void setTipoLicencia(TipoLicencia tipoLicencia) {
        this.tipoLicencia = tipoLicencia;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    
    
    
}
