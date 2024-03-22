package org.itson.bdavanzadas.agenciafiscal_negocio.dtos;

import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.ContribuyenteDiscapacidad;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Tramite;
import org.itson.bdavanzadas.agenciafiscal_negocio.excepciones.ValidacionDTOException;

/**
 *
 * @author gamaliel
 */
public class ContribuyenteNuevoDTO {

    private String RFC;
    private String nombre;
    private String apellido_paterno;
    private String apellido_materno;
    private String telefono;
    private Date fecha_nacimiento;
    private ContribuyenteDiscapacidad discapacidad;
    private List<Tramite> licencia;

    //ATRIBUTOS - VALIDACIONES
    private String validadorEnEspaniol = "^[a-zA-ZáéíóúüñÁÉÍÓÚÜÑ\\s]+$";
    private String validadorNumerico = "^[0-9]+$";
    private String validadorFechas = "^\\d{4}-\\d{2}-\\d{2}$";
    private String validadorCorreos = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    private Pattern patron;
    private Matcher coincidencia;

    public ContribuyenteNuevoDTO(String RFC, String nombre, String apellido_paterno, String apellido_materno, String telefono, Date fecha_nacimiento, ContribuyenteDiscapacidad discapacidad, List<Tramite> licencia) {
        this.RFC = RFC;
        this.nombre = nombre;
        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
        this.telefono = telefono;
        this.fecha_nacimiento = fecha_nacimiento;
        this.discapacidad = discapacidad;
        this.licencia = licencia;
    }

    public ContribuyenteNuevoDTO(String RFC, String nombre, String apellido_paterno, String apellido_materno, String telefono, Date fecha_nacimiento, ContribuyenteDiscapacidad discapacidad) {
        this.RFC = RFC;
        this.nombre = nombre;
        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
        this.telefono = telefono;
        this.fecha_nacimiento = fecha_nacimiento;
        this.discapacidad = discapacidad;
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

    public boolean esValido() throws ValidacionDTOException {
        validarNombre();
        validarApellidoPaterno();
        validarApellidoMaterno();
        validarRFC();
        validarCURP();
        validarTelefono();
        validarFechaNacimiento();
        return true;
    }

    private void validarNombre() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void validarApellidoPaterno() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void validarApellidoMaterno() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void validarRFC() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void validarCURP() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void validarTelefono() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void validarFechaNacimiento() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
