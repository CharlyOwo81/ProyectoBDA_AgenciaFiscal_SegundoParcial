/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.bdavanzadas.agenciafiscal_negocio.dtos;

import java.util.Date;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Contribuyente;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.TipoLicencia;

/**
 *
 * @author gamaliel
 */
public class TramiteLicenciaNuevaDTO extends TramiteNuevoDTO{
    private Integer vigencia;
    private TipoLicencia tipo_licencia;

    public TramiteLicenciaNuevaDTO(Integer vigencia, TipoLicencia tipo_licencia, Float costo, Date fecha_emision, Date fecha_recepcion, Contribuyente contribuyente) {
        super(costo, fecha_emision, fecha_recepcion, contribuyente);
        this.vigencia = vigencia;
        this.tipo_licencia = tipo_licencia;
    }

    public Integer getVigencia() {
        return vigencia;
    }

    public void setVigencia(Integer vigencia) {
        this.vigencia = vigencia;
    }

    public TipoLicencia getTipo_licencia() {
        return tipo_licencia;
    }

    public void setTipo_licencia(TipoLicencia tipo_licencia) {
        this.tipo_licencia = tipo_licencia;
    }
    
    
    
}
