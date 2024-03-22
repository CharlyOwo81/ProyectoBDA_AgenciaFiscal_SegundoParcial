/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.bdavanzadas.agenciafiscal_persistencia.dominio;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author gamaliel
 */
@Entity
@DiscriminatorValue("Placa")
public class TramitePlaca extends Tramite implements Serializable {

    @Column(name = "numero_placa", nullable = true, length = 7)
    private String numero_placa;

    public TramitePlaca() {
    }

    public TramitePlaca(String numero_placa, Float costo, Date fecha_emision, Date fecha_recepcion, Contribuyente contribuyente) {
        super(costo, fecha_emision, fecha_recepcion, contribuyente);
        this.numero_placa = numero_placa;
    }

    public String getNumero_placa() {
        return numero_placa;
    }

    public void setNumero_placa(String numero_placa) {
        this.numero_placa = numero_placa;
    }
}
