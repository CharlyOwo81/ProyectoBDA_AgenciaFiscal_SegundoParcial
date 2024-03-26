/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.bdavanzadas.agenciafiscal_negocio.dtos;

import java.util.Date;

/**
 *
 * @author gamaliel
 */
public class TramiteNuevoDTO {

    private Float costo;
    private Date fechaEmision;
    private ContribuyenteDTO contribuyenteDTO;

    public TramiteNuevoDTO(Float costo, Date fechaEmision, ContribuyenteDTO contribuyenteDTO) {
        this.costo = costo;
        this.fechaEmision = fechaEmision;
        this.contribuyenteDTO = contribuyenteDTO;
    }

    public ContribuyenteDTO getContribuyenteDTO() {
        return contribuyenteDTO;
    }

    public void setContribuyenteDTO(ContribuyenteDTO contribuyenteDTO) {
        this.contribuyenteDTO = contribuyenteDTO;
    }

    public Float getCosto() {
        return costo;
    }

    public void setCosto(Float costo) {
        this.costo = costo;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

}
