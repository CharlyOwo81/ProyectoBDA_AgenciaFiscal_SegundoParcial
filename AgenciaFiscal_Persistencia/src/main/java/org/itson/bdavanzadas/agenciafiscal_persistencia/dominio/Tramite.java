package org.itson.bdavanzadas.agenciafiscal_persistencia.dominio;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Clase que representa un trámite en el sistema.
 *
 * Esta clase almacena información sobre los trámites realizados por los
 * contribuyentes, como su costo, fecha de emisión y el contribuyente asociado.
 *
 * @author Gamaliel Armenta
 * @author Roberto García
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "tramites")
@DiscriminatorColumn(name = "tipo")
public class Tramite implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tramite")
    private Long id;

    @Column(name = "costo", nullable = false)
    private Float costo;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_emision", nullable = false)
    private Date fechaEmision;

    @ManyToOne
    @JoinColumn(name = "id_contribuyente", nullable = false)
    private Contribuyente contribuyente;

    /**
     * Constructor por defecto de la clase Tramite. Crea un objeto Tramite sin
     * inicializar sus atributos.
     */
    public Tramite() {
    }

    /**
     * Constructor de la clase Tramite que inicializa todos los campos excepto
     * fecha_recepcion.
     *
     * @param costo El costo del trámite.
     * @param fechaEmision La fecha de emisión del trámite.
     * @param contribuyente El contribuyente asociado al trámite.
     */
    public Tramite(Float costo, Date fechaEmision, Contribuyente contribuyente) {
        this.costo = costo;
        this.fechaEmision = fechaEmision;
        this.contribuyente = contribuyente;
    }

    /**
     * Constructor de la clase Tramite que inicializa el costo y la fecha de
     * emisión del trámite. El contribuyente asociado se inicializa como null.
     *
     * @param costo El costo del trámite.
     * @param fechaEmision La fecha de emisión del trámite.
     */
    public Tramite(Float costo, Date fechaEmision) {
        this.costo = costo;
        this.fechaEmision = fechaEmision;
    }

    /**
     * Devuelve el ID del trámite.
     *
     * @return El ID del trámite.
     */
    public Long getId() {
        return id;
    }

    /**
     * Establece el ID del trámite.
     *
     * @param id El nuevo ID del trámite.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Devuelve el costo del trámite.
     *
     * @return El costo del trámite.
     */
    public Float getCosto() {
        return costo;
    }

    /**
     * Establece el costo del trámite.
     *
     * @param costo El nuevo costo del trámite.
     */
    public void setCosto(Float costo) {
        this.costo = costo;
    }

    /**
     * Devuelve la fecha de emisión del trámite.
     *
     * @return La fecha de emisión del trámite.
     */
    public Date getFechaEmision() {
        return fechaEmision;
    }

    /**
     * Establece la fecha de emisión del trámite.
     *
     * @param fechaEmision La nueva fecha de emisión del trámite.
     */
    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    /**
     * Devuelve el contribuyente asociado al trámite.
     *
     * @return El contribuyente asociado al trámite.
     */
    public Contribuyente getContribuyente() {
        return contribuyente;
    }

    /**
     * Establece el contribuyente asociado al trámite.
     *
     * @param contribuyente El nuevo contribuyente asociado al trámite.
     */
    public void setContribuyente(Contribuyente contribuyente) {
        this.contribuyente = contribuyente;
    }

    /**
     * Calcula el código hash para el objeto Tramite.
     *
     * @return El código hash del objeto.
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.id);
        return hash;
    }

    /**
     * Compara este objeto Tramite con otro objeto para determinar si son
     * iguales.
     *
     * @param obj El objeto a comparar con este Tramite.
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
        final Tramite other = (Tramite) obj;
        return Objects.equals(this.id, other.id);
    }

    /**
     * Devuelve una representación en forma de cadena de este objeto Tramite.
     *
     * @return Una cadena que representa el objeto Tramite.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tramite{");
        sb.append("id=").append(id);
        sb.append(", costo=").append(costo);
        sb.append(", fechaEmision=").append(fechaEmision);
        sb.append(", contribuyente=").append(contribuyente);
        sb.append('}');
        return sb.toString();
    }

}
