/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.bdavanzadas.agenciafiscal_dominio;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author gamaliel
 */
@Entity
@DiscriminatorValue("licencia")
@Table(name = "licencia")
public class TramiteLicencia extends Tramite implements Serializable {

    @Id
    @Column (name = "id_tramite_licencia")
    private Long id;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_licencia", nullable = false)
    private TipoLicencia tipo_licencia;
    
    @Column (name= "vigencia", nullable = false)
    private Integer vigencia;

    public TramiteLicencia() {
   
    }
    
    public TramiteLicencia(TipoLicencia tipo_licencia, Integer vigencia, Float costo, Date fecha_emision) {
        super(costo, fecha_emision);
        this.tipo_licencia = tipo_licencia;
        this.vigencia = vigencia;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TramiteLicencia)) {
            return false;
        }
        TramiteLicencia other = (TramiteLicencia) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.itson.bdavanzadas.agenciafiscal_dominio.TramiteLicencia[ id=" + id + " ]";
    }
    
}
