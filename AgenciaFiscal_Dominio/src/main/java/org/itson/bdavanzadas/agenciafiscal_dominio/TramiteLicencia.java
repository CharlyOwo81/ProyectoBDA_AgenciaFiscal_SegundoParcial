/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.bdavanzadas.agenciafiscal_dominio;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author gamaliel
 */
@Entity
@DiscriminatorValue("Licencia")
public class TramiteLicencia extends Tramite implements Serializable {
    
    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_licencia", nullable = false)
    private TipoLicencia tipo_licencia;
    
    @Column (name= "vigencia", nullable = false)
    private Integer vigencia;

    public TramiteLicencia() {
   
    }

    public TramiteLicencia(TipoLicencia tipo_licencia, Integer vigencia, Float costo, Date fecha_emision, Date fecha_recepcion, Contribuyente contribuyente) {
        super(costo, fecha_emision, fecha_recepcion, contribuyente);
        this.tipo_licencia = tipo_licencia;
        this.vigencia = vigencia;
    }
    
    public TipoLicencia getTipo_licencia() {
        return tipo_licencia;
    }

    public void setTipo_licencia(TipoLicencia tipo_licencia) {
        this.tipo_licencia = tipo_licencia;
    }

    public Integer getVigencia() {
        return vigencia;
    }

    public void setVigencia(Integer vigencia) {
        this.vigencia = vigencia;
    }
}
