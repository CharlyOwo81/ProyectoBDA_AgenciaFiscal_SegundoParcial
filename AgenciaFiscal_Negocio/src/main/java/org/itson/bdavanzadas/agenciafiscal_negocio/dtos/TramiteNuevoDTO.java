/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.bdavanzadas.agenciafiscal_negocio.dtos;

import java.util.Date;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Contribuyente;

/**
 *
 * @author gamaliel
 */
public class TramiteNuevoDTO {
    
    private Float costo;
    private Date fecha_emision; 
    private Date fecha_recepcion;
    private Contribuyente contribuyente;

    public TramiteNuevoDTO(Float costo, Date fecha_emision, Date fecha_recepcion, Contribuyente contribuyente) {
        this.costo = costo;
        this.fecha_emision = fecha_emision;
        this.fecha_recepcion = fecha_recepcion;
        this.contribuyente = contribuyente;
    }


    public Contribuyente getContribuyente() {
        return contribuyente;
    }

    public void setContribuyente(Contribuyente contribuyente) {
        this.contribuyente = contribuyente;
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

    public Date getFecha_recepcion() {
        return fecha_recepcion;
    }

    public void setFecha_recepcion(Date fecha_recepcion) {
        this.fecha_recepcion = fecha_recepcion;
    }
    
    
    
}
