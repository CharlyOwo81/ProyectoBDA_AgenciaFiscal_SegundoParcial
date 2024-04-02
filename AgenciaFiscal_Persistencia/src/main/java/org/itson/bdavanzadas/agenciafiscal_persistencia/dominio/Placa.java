package org.itson.bdavanzadas.agenciafiscal_persistencia.dominio;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Clase que representa un trámite de placas en el sistema.
 *
 * Esta clase extiende de la clase Tramite e incluye información específica
 * sobre los trámites de placas, como el número de placas y la fecha de
 * recepción.
 *
 * @author Gamaliel Armenta
 * @author Roberto García
 */
@Entity
@Table(name = "placas")
@DiscriminatorValue("Placas")
public class Placa extends Tramite implements Serializable {

    @Column(name = "numero_placas", nullable = false, length = 7, unique = true)
    private String numeroPlacas;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_recepcion", nullable = true)
    private Date fechaRecepcion;

    @ManyToOne
    @JoinColumn(name = "id_vehiculo", nullable = false)
    private Vehiculo vehiculo;

    /**
     * Constructor por defecto de la clase Placas. Crea un objeto Placas sin
     * inicializar sus atributos.
     */
    public Placa() {
    }

    /**
     * Constructor de la clase Placas que inicializa el número de placas, el
     * costo, la fecha de emisión y el contribuyente asociado.
     *
     * @param numeroPlacas El número de placas.
     * @param costo El costo del trámite de las placas.
     * @param fechaEmision La fecha de emisión del trámite de las placas.
     * @param contribuyente El contribuyente asociado al trámite de las placas.
     */
    public Placa(String numeroPlacas, Float costo, Date fechaEmision, Contribuyente contribuyente) {
        super(costo, fechaEmision, contribuyente);
        this.numeroPlacas = numeroPlacas;
    }

    /**
     * Constructor de la clase Placas que inicializa el número de placas, el
     * vehículo asociado, el costo, la fecha de emisión y el contribuyente
     * asociado.
     *
     * @param numeroPlacas El número de placas.
     * @param vehiculo El vehículo asociado al trámite de las placas.
     * @param costo El costo del trámite de las placas.
     * @param fechaEmision La fecha de emisión del trámite de las placas.
     * @param contribuyente El contribuyente asociado al trámite de las placas.
     */
    public Placa(String numeroPlacas, Vehiculo vehiculo, Float costo, Date fechaEmision, Contribuyente contribuyente) {
        super(costo, fechaEmision, contribuyente);
        this.numeroPlacas = numeroPlacas;
        this.vehiculo = vehiculo;
    }

    /**
     * Constructor de la clase Placas que inicializa el número de placas, la
     * fecha de recepción, el vehículo asociado, el costo, la fecha de emisión y
     * el contribuyente asociado.
     *
     * @param numeroPlacas El número de placas.
     * @param fechaRecepcion La fecha de recepción de las placas.
     * @param vehiculo El vehículo asociado al trámite de las placas.
     * @param costo El costo del trámite de las placas.
     * @param fechaEmision La fecha de emisión del trámite de las placas.
     * @param contribuyente El contribuyente asociado al trámite de las placas.
     */
    public Placa(String numeroPlacas, Date fechaRecepcion, Vehiculo vehiculo, Float costo, Date fechaEmision, Contribuyente contribuyente) {
        super(costo, fechaEmision, contribuyente);
        this.numeroPlacas = numeroPlacas;
        this.fechaRecepcion = fechaRecepcion;
        this.vehiculo = vehiculo;
    }

    /**
     * Devuelve el número de placas.
     *
     * @return El número de placas.
     */
    public String getNumeroPlacas() {
        return numeroPlacas;
    }

    /**
     * Establece el número de placas.
     *
     * @param numeroPlacas El nuevo número de placas.
     */
    public void setNumeroPlacas(String numeroPlacas) {
        this.numeroPlacas = numeroPlacas;
    }

    /**
     * Devuelve la fecha de recepción de las placas.
     *
     * @return La fecha de recepción de las placas.
     */
    public Date getFechaRecepcion() {
        return fechaRecepcion;
    }

    /**
     * Establece la fecha de recepción de las placas.
     *
     * @param fechaRecepcion La nueva fecha de recepción de las placas.
     */
    public void setFechaRecepcion(Date fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }

    /**
     * Devuelve el vehículo asociado a este registro.
     *
     * @return El vehículo asociado a este registro.
     */
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    /**
     * Establece el vehículo asociado a este registro.
     *
     * @param vehiculo El vehículo que se asociará a este registro.
     */
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    /**
     * Calcula el código hash para el objeto Placa.
     *
     * @return El código hash del objeto.
     */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.numeroPlacas);
        return hash;
    }

    /**
     * Compara este objeto Placa con otro objeto para determinar si son iguales.
     *
     * @param obj El objeto a comparar con este Placa.
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
        final Placa other = (Placa) obj;
        return Objects.equals(this.numeroPlacas, other.numeroPlacas);
    }

    /**
     * Devuelve una representación en forma de cadena de este objeto Placa,
     * incluyendo los datos del trámite.
     *
     * @return Una cadena que representa el objeto Placa.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Placas{");
        sb.append("numeroPlacas=").append(numeroPlacas);
        sb.append(", fechaRecepcion=").append(fechaRecepcion);
        sb.append(", id=").append(getId());
        sb.append(", costo=").append(getCosto());
        sb.append(", fechaEmision=").append(getFechaEmision());
        sb.append(", contribuyente=").append(getContribuyente());
        sb.append('}');
        return sb.toString();
    }

}
