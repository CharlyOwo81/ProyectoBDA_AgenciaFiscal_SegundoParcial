package org.itson.bdavanzadas.agenciafiscal_persistencia.dominio;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author gamaliel
 */
@Entity
@Table(name = "licencias")
@DiscriminatorValue("Licencia")
public class Licencia extends Tramite implements Serializable {
    
    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_licencia", nullable = false)
    private TipoLicencia tipo_licencia;
    
    @Column (name= "anios_vigencia", nullable = false)
    private Integer vigencia;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column (name = "fecha_vencimiento", nullable = false)
    private Date fecha_vencimiento;

    public Licencia() {
   
    }

    public Licencia(TipoLicencia tipo_licencia, Integer vigencia, Float costo, Date fecha_emision, Date fecha_recepcion, Contribuyente contribuyente) {
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

    public Date getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(Date fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

}
