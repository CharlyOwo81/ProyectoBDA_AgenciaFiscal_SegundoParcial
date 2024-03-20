/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.bdavanzadas.agenciafiscal_dominio;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author gamaliel
 */
@Entity
@Table (name = "contribuyentes")
public class Contribuyente implements Serializable {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_contribuyente")
    private Long id;
    
    @Column (name= "RFC", nullable = false, length = 13, unique = true)
    private String RFC;
    
    @Column (name= "CURP", nullable = false, length = 18, unique = true)
    private String CURP;
    
    @Column (name = "nombre", nullable = false, length = 200)
    private String nombre;
    
    @Column (name = "apellido_paterno", nullable = false, length = 200)
    private String apellido_paterno;
    
    @Column (name = "apellido_materno", nullable = false, length = 200)
    private String apellido_materno;
    
    @Column (name = "telefono", nullable = false, length = 13)
    private String telefono;
    
    @Temporal(TemporalType.DATE)
    @Column (name = "fecha_nacimiento", nullable = false)
    private Date fecha_nacimiento;
    
    @Column (name ="discapacidad", nullable = false)
    private boolean discapacidad;

    @OneToMany(mappedBy = "contribuyente", cascade = CascadeType.PERSIST)
    @Column (name = "licencia", nullable = true)
    private List<Tramite> licencia;
    
    public Contribuyente() {
    }

    public Contribuyente(String RFC, String CURP, String nombre, String apellido_paterno, String apellido_materno, String telefono, Date fecha_nacimiento, boolean discapacidad, List<Tramite> licencia) {
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

    public void agregarTramite(Tramite tramite) {
        this.licencia.add(tramite);
    }
    
    public String getCURP() {
        return CURP;
    }

    public void setCURP(String CURP) {
        this.CURP = CURP;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contribuyente)) {
            return false;
        }
        Contribuyente other = (Contribuyente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Dominio.Contribuyente[ id=" + id + " ]";
    }
    
}
