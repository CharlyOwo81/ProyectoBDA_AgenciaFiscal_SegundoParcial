package org.itson.bdavanzadas.agenciafiscal_persistencia.dominio;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author gamaliel
 */
@Entity
@Table(name = "placas")
@DiscriminatorValue("Placas")
public class Placa extends Tramite implements Serializable {

    @Column(name = "numero_placa", nullable = true, length = 7)
    private String numero_placa;

    @Temporal(TemporalType.TIMESTAMP)
    @Column (name = "fecha_recepcion", nullable = true)
    private Date fecha_recepcion;
    
    public Placa() {
    }

    public Placa(String numero_placa, Float costo, Date fecha_emision, Date fecha_recepcion, Contribuyente contribuyente) {
        super(costo, fecha_emision, fecha_recepcion, contribuyente);
        this.numero_placa = numero_placa;
    }

    public String getNumero_placa() {
        return numero_placa;
    }

    public void setNumero_placa(String numero_placa) {
        this.numero_placa = numero_placa;
    }

    public Date getFecha_recepcion() {
        return fecha_recepcion;
    }

    public void setFecha_recepcion(Date fecha_recepcion) {
        this.fecha_recepcion = fecha_recepcion;
    }
    
    
}
