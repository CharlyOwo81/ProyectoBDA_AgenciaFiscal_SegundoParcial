package org.itson.bdavanzadas.agenciafiscal_negocio.dtos;

import java.util.Date;
import java.util.List;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.ContribuyenteDiscapacidad;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Tramite;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Vehiculo;

/**
 *
 * @author gamaliel
 */
public class ContribuyenteDTO {

    private Long id;
    private String RFC;
    private String nombre;
    private String apellido_paterno;
    private String apellido_materno;
    private String telefono;
    private Date fecha_nacimiento;
    private ContribuyenteDiscapacidad discapacidad;
    private List<Tramite> licencia;
    private List <Vehiculo> vehiculo;


    public ContribuyenteDTO(String RFC, String nombre, String apellido_paterno, String apellido_materno, String telefono, Date fecha_nacimiento, ContribuyenteDiscapacidad discapacidad, List<Tramite> licencia) {
        this.RFC = RFC;
        this.nombre = nombre;
        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
        this.telefono = telefono;
        this.fecha_nacimiento = fecha_nacimiento;
        this.discapacidad = discapacidad;
        this.licencia = licencia;
    }

    public ContribuyenteDTO(String RFC, String nombre, String apellido_paterno, String apellido_materno, String telefono, Date fecha_nacimiento, ContribuyenteDiscapacidad discapacidad) {
        this.RFC = RFC;
        this.nombre = nombre;
        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
        this.telefono = telefono;
        this.fecha_nacimiento = fecha_nacimiento;
        this.discapacidad = discapacidad;
    }

    public ContribuyenteDTO(Long id, String RFC, String nombre, String apellido_paterno, String apellido_materno, String telefono, Date fecha_nacimiento, ContribuyenteDiscapacidad discapacidad) {
        this.id = id;
        this.RFC = RFC;
        this.nombre = nombre;
        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
        this.telefono = telefono;
        this.fecha_nacimiento = fecha_nacimiento;
        this.discapacidad = discapacidad;
    }

    public ContribuyenteDTO(String RFC, String nombre, String apellido_paterno, String apellido_materno, String telefono, Date fecha_nacimiento, ContribuyenteDiscapacidad discapacidad, List<Tramite> licencia, List<Vehiculo> vehiculo) {
        this.RFC = RFC;
        this.nombre = nombre;
        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
        this.telefono = telefono;
        this.fecha_nacimiento = fecha_nacimiento;
        this.discapacidad = discapacidad;
        this.licencia = licencia;
        this.vehiculo = vehiculo;
    }

    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Vehiculo> getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(List<Vehiculo> vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    
    

    public List<Tramite> getLicencia() {
        return licencia;
    }

    public void setLicencia(List<Tramite> licencia) {
        this.licencia = licencia;
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

    public ContribuyenteDiscapacidad getDiscapacidad() {
        return discapacidad;
    }

    public void setDiscapacidad(ContribuyenteDiscapacidad discapacidad) {
        this.discapacidad = discapacidad;
    }
}
