package org.itson.bdavanzadas.agenciafiscal_persistencia.dominio;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Clase que representa una licencia en el sistema.
 *
 * Esta clase extiende de la clase Tramite e incluye información específica
 * sobre las licencias, como el tipo de licencia, la vigencia y la fecha de
 * vencimiento.
 *
 * @author Gamaliel Armenta
 * @author Roberto García
 */
@Entity
@Table(name = "licencias")
@DiscriminatorValue("Licencia")
public class Licencia extends Tramite implements Serializable {

    @Column(name = "anios_vigencia", nullable = false)
    private Integer vigencia;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_licencia", nullable = false)
    private TipoLicencia tipoLicencia;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_vencimiento", nullable = false)
    private Date fechaVencimiento;
    
    /**
     * Constructor por defecto de la clase Licencia. Crea un objeto Licencia sin
     * inicializar sus atributos.
     */
    public Licencia() {

    }

    /**
     * Constructor de la clase Licencia que inicializa todos los campos.
     *
     * @param tipoLicencia El tipo de licencia.
     * @param vigencia La vigencia de la licencia en años.
     * @param fechaVencimiento La fecha de vencimiento de la licencia.
     * @param costo El costo del trámite de la licencia.
     * @param fechaEmision La fecha de emisión del trámite de la licencia.
     * @param contribuyente El contribuyente asociado al trámite de la licencia.
     */
    public Licencia(Integer vigencia, TipoLicencia tipoLicencia,Date fechaVencimiento, Float costo, Date fechaEmision, Contribuyente contribuyente) {
        super(costo, fechaEmision, contribuyente);
        this.vigencia = vigencia;
        this.tipoLicencia = tipoLicencia;
        this.fechaVencimiento = fechaVencimiento;
    }

    /**
     * Devuelve el tipo de licencia.
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
     * Devuelve la vigencia de la licencia en años.
     *
     * @return La vigencia de la licencia en años.
     */
    public Integer getVigencia() {
        return vigencia;
    }

    /**
     * Establece la vigencia de la licencia en años.
     *
     * @param vigencia La nueva vigencia de la licencia en años.
     */
    public void setVigencia(Integer vigencia) {
        this.vigencia = vigencia;
    }

    /**
     * Devuelve la fecha de vencimiento de la licencia.
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

    /**
     * Calcula el código hash para el objeto Licencia.
     *
     * @return El código hash del objeto.
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.tipoLicencia);
        return hash;
    }

    /**
     * Compara este objeto Licencia con otro objeto para determinar si son
     * iguales.
     *
     * @param obj El objeto a comparar con este Licencia.
     * @return true si los objetos son iguales, false en caso contrario.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Licencia other = (Licencia) obj;
        return this.tipoLicencia == other.tipoLicencia;
    }

    /**
     * Devuelve una representación en forma de cadena de este objeto Licencia,
     * incluyendo los datos de la entidad Trámite.
     *
     * @return Una cadena que representa el objeto Licencia.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Licencia{");
        sb.append("tipoLicencia=").append(tipoLicencia);
        sb.append(", vigencia=").append(vigencia);
        sb.append(", fechaVencimiento=").append(fechaVencimiento);
        sb.append(", id=").append(getId());
        sb.append(", costo=").append(getCosto());
        sb.append(", fechaEmision=").append(getFechaEmision());
        sb.append(", contribuyente=").append(getContribuyente());
        sb.append('}');
        return sb.toString();
    }

}
