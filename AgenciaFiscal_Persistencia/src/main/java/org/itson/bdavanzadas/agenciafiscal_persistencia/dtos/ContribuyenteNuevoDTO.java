/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.bdavanzadas.agenciafiscal_persistencia.dtos;

import java.util.Date;
import java.util.List;
import org.itson.bdavanzadas.agenciafiscal_dominio.Tramite;

/**
 *
 * @author gamaliel
 */
public class ContribuyenteNuevoDTO {
    private String RFC;
    private String CURP;
    private String nombre;
    private String apellido_paterno;
    private String apellido_materno;
    private String telefono;
    private Date fecha_nacimiento;
    private boolean discapacidad;
    private List<Tramite> licencia;

    public ContribuyenteNuevoDTO(String RFC, String CURP, String nombre, String apellido_paterno, String apellido_materno, String telefono, Date fecha_nacimiento, boolean discapacidad) {
        this.RFC = RFC;
        this.CURP = CURP;
        this.nombre = nombre;
        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
        this.telefono = telefono;
        this.fecha_nacimiento = fecha_nacimiento;
        this.discapacidad = discapacidad;
    }

    public ContribuyenteNuevoDTO(String RFC, String CURP, String nombre, String apellido_paterno, String apellido_materno, String telefono, Date fecha_nacimiento, boolean discapacidad, List<Tramite> licencia) {
        this.RFC = RFC;
        this.CURP = CURP;
        this.nombre = nombre;
        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
        this.telefono = telefono;
        this.fecha_nacimiento = fecha_nacimiento;
        this.discapacidad = discapacidad;
        this.licencia = licencia;
    }

    
    
    public List<Tramite> getLicencia() {
        return licencia;
    }

    public void setLicencia(List<Tramite> licencia) {
        this.licencia = licencia;
    }


    
    public String getCURP() {
        return CURP;
    }

    public void setCURP(String CURP) {
        this.CURP = CURP;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    public String getApellido_materno() {
        return apellido_materno;
    }

    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public boolean isDiscapacidad() {
        return discapacidad;
    }

    public void setDiscapacidad(boolean discapacidad) {
        this.discapacidad = discapacidad;
    }
    
}
