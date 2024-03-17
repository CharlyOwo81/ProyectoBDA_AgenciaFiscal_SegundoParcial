/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.bdavanzadas.agenciafiscal_persistencia.dtos;

import java.util.Date;

/**
 *
 * @author gamaliel
 */
public class TramiteNuevoDTO {
    
    private Float costo;
    private Date fecha_emision; 

    public TramiteNuevoDTO(Float costo, Date fecha_emision) {
        this.costo = costo;
        this.fecha_emision = fecha_emision;
    }

    public Float getCosto() {
        return costo;
    }

    public void setCosto(Float costo) {
        this.costo = costo;
    }

    public Date getFecha_emision() {
        return fecha_emision;
    }

    public void setFecha_emision(Date fecha_emision) {
        this.fecha_emision = fecha_emision;
    }
    
    
}
