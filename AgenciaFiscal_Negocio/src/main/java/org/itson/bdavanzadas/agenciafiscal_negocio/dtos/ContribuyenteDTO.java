package org.itson.bdavanzadas.agenciafiscal_negocio.dtos;

import java.util.Date;
import java.util.List;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Contribuyente;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.ContribuyenteDiscapacidad;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Tramite;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Vehiculo;

/**
 * DTO (Data Transfer Object) utilizado para representar la información de un
 * contribuyente. Esta clase encapsula los datos básicos de un contribuyente,
 * incluyendo su RFC, nombre, apellidos, teléfono, fecha de nacimiento,
 * discapacidad (si la tiene), y listas de trámites de licencia y vehículos
 * asociados.
 *
 * La clase proporciona métodos para acceder y modificar cada uno de estos
 * atributos.
 *
 * @author Gamaliel Armenta
 * @author Roberto García
 */
public class ContribuyenteDTO {

    private Long id;
    private String rfc;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String telefono;
    private Date fechaNacimiento;
    private ContribuyenteDiscapacidad discapacidad;
    private List<Tramite> tramites;
    private List<Vehiculo> vehiculos;

    /**
     * Crea una nueva instancia de ContribuyenteDTO con el ID del contribuyente.
     *
     * @param id El ID del contribuyente.
     */
    public ContribuyenteDTO(Long id) {
        this.id = id;
    }

    /**
     * Crea una nueva instancia de ContribuyenteDTO con los nombres y apellidos
     * de un contribuyente.
     *
     * @param nombre El nombre del contribuyente.
     * @param apellidoPaterno El apellido paterno del contribuyente.
     * @param apellidoMaterno El apellido materno del contribuyente.
     */
    public ContribuyenteDTO(String nombre, String apellidoPaterno, String apellidoMaterno) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
    }

    /**
     * Crea una nueva instancia de ContribuyenteDTO con los datos básicos de un
     * contribuyente.
     *
     * @param rfc El RFC del contribuyente.
     * @param nombre El nombre del contribuyente.
     * @param apellidoPaterno El apellido paterno del contribuyente.
     * @param apellidoMaterno El apellido materno del contribuyente.
     * @param telefono El número de teléfono del contribuyente.
     * @param fechaNacimiento La fecha de nacimiento del contribuyente.
     * @param discapacidad La discapacidad del contribuyente, o null si no tiene
     * ninguna.
     */
    public ContribuyenteDTO(String rfc, String nombre, String apellidoPaterno, String apellidoMaterno, String telefono, Date fechaNacimiento, ContribuyenteDiscapacidad discapacidad) {
        this.rfc = rfc;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.discapacidad = discapacidad;
    }

    /**
     * Crea una nueva instancia de ContribuyenteDTO con los datos básicos de un
     * contribuyente incluyendo su ID.
     *
     * @param id El ID del contribuyente.
     * @param rfc El RFC del contribuyente.
     * @param nombre El nombre del contribuyente.
     * @param apellidoPaterno El apellido paterno del contribuyente.
     * @param apellidoMaterno El apellido materno del contribuyente.
     * @param telefono El número de teléfono del contribuyente.
     * @param fechaNacimiento La fecha de nacimiento del contribuyente.
     * @param discapacidad La discapacidad del contribuyente, o null si no tiene
     * ninguna.
     */
    public ContribuyenteDTO(Long id, String rfc, String nombre, String apellidoPaterno, String apellidoMaterno, String telefono, Date fechaNacimiento, ContribuyenteDiscapacidad discapacidad) {
        this.id = id;
        this.rfc = rfc;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.discapacidad = discapacidad;
    }

    /**
     * Crea una nueva instancia de ContribuyenteDTO a partir de un objeto
     * Contribuyente.
     *
     * @param contribuyente El contribuyente del cual se inicializarán los datos
     * del ContribuyenteDTO.
     */
    public ContribuyenteDTO(Contribuyente contribuyente) {
        this.id = contribuyente.getId();
        this.rfc = contribuyente.getRfc();
        this.nombre = contribuyente.getNombre();
        this.apellidoPaterno = contribuyente.getApellidoPaterno();
        this.apellidoMaterno = contribuyente.getApellidoMaterno();
        this.telefono = contribuyente.getTelefono();
        this.fechaNacimiento = contribuyente.getFechaNacimiento();
        this.discapacidad = contribuyente.getDiscapacidad();
        this.tramites = contribuyente.getTramites();
        this.vehiculos = contribuyente.getVehiculos();
    }

    /**
     * Obtiene el ID del contribuyente.
     *
     * @return El ID del contribuyente.
     */
    public Long getId() {
        return id;
    }

    /**
     * Establece el ID del contribuyente.
     *
     * @param id El ID del contribuyente.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Obtiene el RFC del contribuyente.
     *
     * @return El RFC del contribuyente.
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * Establece el RFC del contribuyente.
     *
     * @param rfc El RFC del contribuyente.
     */
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    /**
     * Obtiene el nombre del contribuyente.
     *
     * @return El nombre del contribuyente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del contribuyente.
     *
     * @param nombre El nombre del contribuyente.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el apellido paterno del contribuyente.
     *
     * @return El apellido paterno del contribuyente.
     */
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    /**
     * Establece el apellido paterno del contribuyente.
     *
     * @param apellidoPaterno El apellido paterno del contribuyente.
     */
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    /**
     * Obtiene el apellido materno del contribuyente.
     *
     * @return El apellido materno del contribuyente.
     */
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    /**
     * Establece el apellido materno del contribuyente.
     *
     * @param apellidoMaterno El apellido materno del contribuyente.
     */
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    /**
     * Obtiene el número de teléfono del contribuyente.
     *
     * @return El número de teléfono del contribuyente.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establece el número de teléfono del contribuyente.
     *
     * @param telefono El número de teléfono del contribuyente.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Obtiene la fecha de nacimiento del contribuyente.
     *
     * @return La fecha de nacimiento del contribuyente.
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Establece la fecha de nacimiento del contribuyente.
     *
     * @param fechaNacimiento La fecha de nacimiento del contribuyente.
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Obtiene la discapacidad del contribuyente.
     *
     * @return La discapacidad del contribuyente.
     */
    public ContribuyenteDiscapacidad getDiscapacidad() {
        return discapacidad;
    }

    /**
     * Establece la discapacidad del contribuyente.
     *
     * @param discapacidad La discapacidad del contribuyente.
     */
    public void setDiscapacidad(ContribuyenteDiscapacidad discapacidad) {
        this.discapacidad = discapacidad;
    }

    /**
     * Obtiene la lista de trámites asociados al contribuyente.
     *
     * @return La lista de trámites asociados al contribuyente.
     */
    public List<Tramite> getTramites() {
        return tramites;
    }

    /**
     * Establece la lista de trámites asociados al contribuyente.
     *
     * @param tramites La lista de trámites a establecer.
     */
    public void setTramites(List<Tramite> tramites) {
        this.tramites = tramites;
    }

    /**
     * Obtiene la lista de vehículos asociados al contribuyente.
     *
     * @return La lista de vehículos asociados al contribuyente.
     */
    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    /**
     * Establece la lista de vehículos asociados al contribuyente.
     *
     * @param vehiculos La lista de vehículos a establecer.
     */
    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

}
