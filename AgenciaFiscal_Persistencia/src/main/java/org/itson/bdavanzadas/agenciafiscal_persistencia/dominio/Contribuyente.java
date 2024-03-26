package org.itson.bdavanzadas.agenciafiscal_persistencia.dominio;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Clase que representa a un contribuyente en el sistema.
 *
 * Esta clase almacena información sobre los contribuyentes, como su rfc,
 * nombre, apellidos, teléfono, fecha de nacimiento, discapacidad, y los
 * trámites de licencias y vehículos asociados.
 *
 * @author Gamaliel Armenta, Roberto García
 */
@Entity
@Table(name = "contribuyentes")
public class Contribuyente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_contribuyente")
    private Long id;

    @Column(name = "rfc", nullable = false, length = 13, unique = true)
    private String rfc;

    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;

    @Column(name = "apellido_paterno", nullable = false, length = 30)
    private String apellidoPaterno;

    @Column(name = "apellido_materno", nullable = false, length = 30)
    private String apellidoMaterno;

    @Column(name = "telefono", nullable = false, length = 10)
    private String telefono;

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_nacimiento", nullable = false)
    private Date fechaNacimiento;

    @Column(name = "discapacidad", nullable = false)
    private ContribuyenteDiscapacidad discapacidad;

    @OneToMany(mappedBy = "contribuyente", cascade = CascadeType.PERSIST)
//    @JoinColumn (name = "licencias", nullable = true)
    private List<Tramite> licencias;

    @OneToMany(mappedBy = "contribuyente", cascade = CascadeType.PERSIST)
//    @JoinColumn(name = "vehiculo", nullable = true)
    private List<Vehiculo> vehiculos;

    /**
     * Constructor por defecto de la clase Contribuyente.
     */
    public Contribuyente() {

    }

    /**
     * Constructor de la clase Contribuyente que permite inicializar todos los
     * campos.
     *
     * @param rfc El RFC del contribuyente.
     * @param nombre El nombre del contribuyente.
     * @param apellidoPaterno El apellido paterno del contribuyente.
     * @param apellidoMaterno El apellido materno del contribuyente.
     * @param telefono El número de teléfono del contribuyente.
     * @param fechaNacimiento La fecha de nacimiento del contribuyente.
     * @param discapacidad La información sobre la discapacidad del
     * contribuyente (SI, NO).
     */
    public Contribuyente(String rfc, String nombre, String apellidoPaterno, String apellidoMaterno, String telefono, Date fechaNacimiento, ContribuyenteDiscapacidad discapacidad) {
        this.rfc = rfc;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.discapacidad = discapacidad;
    }

    /**
     * Método para obtener el ID del contribuyente.
     *
     * @return El ID del contribuyente.
     */
    public Long getId() {
        return id;
    }

    /**
     * Método para establecer el ID del contribuyente.
     *
     * @param id El ID del contribuyente.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Método para obtener el RFC del contribuyente.
     *
     * @return El RFC del contribuyente.
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * Método para establecer el RFC del contribuyente.
     *
     * @param rfc El RFC del contribuyente.
     */
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    /**
     * Método para obtener el nombre del contribuyente.
     *
     * @return El nombre del contribuyente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para establecer el nombre del contribuyente.
     *
     * @param nombre El nombre del contribuyente.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener el apellido paterno del contribuyente.
     *
     * @return El apellido paterno del contribuyente.
     */
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    /**
     * Método para establecer el apellido paterno del contribuyente.
     *
     * @param apellidoPaterno El apellido paterno del contribuyente.
     */
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    /**
     * Método para obtener el apellido materno del contribuyente.
     *
     * @return El apellido materno del contribuyente.
     */
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    /**
     * Método para establecer el apellido materno del contribuyente.
     *
     * @param apellidoMaterno El apellido materno del contribuyente.
     */
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    /**
     * Método para obtener el teléfono del contribuyente.
     *
     * @return El teléfono del contribuyente.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Método para establecer el teléfono del contribuyente.
     *
     * @param telefono El teléfono del contribuyente.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Método para obtener la fecha de nacimiento del contribuyente.
     *
     * @return La fecha de nacimiento del contribuyente.
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Método para establecer la fecha de nacimiento del contribuyente.
     *
     * @param fechaNacimiento La fecha de nacimiento del contribuyente.
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Método para obtener la discapacidad del contribuyente.
     *
     * @return La discapacidad del contribuyente.
     */
    public ContribuyenteDiscapacidad getDiscapacidad() {
        return discapacidad;
    }

    /**
     * Método para establecer la discapacidad del contribuyente.
     *
     * @param discapacidad La discapacidad del contribuyente.
     */
    public void setDiscapacidad(ContribuyenteDiscapacidad discapacidad) {
        this.discapacidad = discapacidad;
    }

    /**
     * Método para obtener la lista de licencias asociadas al contribuyente.
     *
     * @return La lista de licencias asociadas al contribuyente.
     */
    public List<Tramite> getLicencias() {
        return licencias;
    }

    /**
     * Método para establecer la lista de licencias asociadas al contribuyente.
     *
     * @param licencias La lista de licencias asociadas al contribuyente.
     */
    public void setLicencias(List<Tramite> licencias) {
        this.licencias = licencias;
    }

    /**
     * Método para obtener la lista de vehículos asociados al contribuyente.
     *
     * @return La lista de vehículos asociados al contribuyente.
     */
    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    /**
     * Método para establecer la lista de vehículos asociados al contribuyente.
     *
     * @param vehiculos La lista de vehículos asociados al contribuyente.
     */
    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    /**
     * Calcula el código hash para el objeto Contribuyente.
     *
     * @return El código hash del objeto.
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.id);
        hash = 37 * hash + Objects.hashCode(this.rfc);
        return hash;
    }

    /**
     * Compara este objeto Contribuyente con otro objeto para determinar si son
     * iguales.
     *
     * @param obj El objeto a comparar con este Contribuyente.
     * @return true si los objetos son iguales, false en caso contrario.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Contribuyente other = (Contribuyente) obj;
        if (!Objects.equals(this.rfc, other.rfc)) {
            return false;
        }
        return Objects.equals(this.id, other.id);
    }

    /**
     * Devuelve una representación en forma de cadena de este objeto
     * Contribuyente.
     *
     * @return Una cadena que representa el objeto Contribuyente.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Contribuyente{");
        sb.append("id=").append(id);
        sb.append(", rfc=").append(rfc);
        sb.append(", nombre=").append(nombre);
        sb.append(", apellidoPaterno=").append(apellidoPaterno);
        sb.append(", apellidoMaterno=").append(apellidoMaterno);
        sb.append(", telefono=").append(telefono);
        sb.append(", fechaNacimiento=").append(fechaNacimiento);
        sb.append(", discapacidad=").append(discapacidad);
        sb.append(", licencias=").append(licencias);
        sb.append(", vehiculos=").append(vehiculos);
        sb.append('}');
        return sb.toString();
    }

}
