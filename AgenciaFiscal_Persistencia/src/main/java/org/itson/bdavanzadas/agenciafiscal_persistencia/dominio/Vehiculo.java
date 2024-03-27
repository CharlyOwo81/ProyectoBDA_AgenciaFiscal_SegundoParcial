package org.itson.bdavanzadas.agenciafiscal_persistencia.dominio;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Clase que representa un vehículo en el sistema.
 *
 * Esta clase almacena información sobre los vehículos, como su número de serie,
 * marca, línea, color, modelo y el contribuyente asociado.
 *
 * @author Gamaliel Armenta
 * @author Roberto García
 */
@Entity
@Table(name = "vehiculos")
public class Vehiculo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vehiculo")
    private Long id;

    @Column(name = "numero_serie", nullable = false, length = 17, unique = true)
    private String numeroSerie;

    @Column(name = "marca", nullable = false, length = 30)
    private String marca;

    @Column(name = "linea", nullable = false, length = 30)
    private String linea;

    @Column(name = "color", nullable = false, length = 20)
    private String color;

    @Column(name = "modelo", nullable = false, length = 4)
    private String modelo;

    @ManyToOne
    @JoinColumn(name = "id_contribuyente", nullable = false)
    private Contribuyente contribuyente;

    @OneToMany(mappedBy = "vehiculo", cascade = CascadeType.PERSIST)
    private List<Placa> placas;

    /**
     * Constructor por defecto de la clase Vehiculo.
     *
     * Crea un nuevo objeto Vehiculo sin inicializar sus atributos.
     */
    public Vehiculo() {
    }

    /**
     * Constructor de la clase Vehiculo.
     *
     * Crea un nuevo objeto Vehiculo con los atributos especificados.
     *
     * @param numeroSerie El número de serie del vehículo.
     * @param marca La marca del vehículo.
     * @param linea La línea del vehículo.
     * @param color El color del vehículo.
     * @param modelo El modelo del vehículo.
     * @param contribuyente El contribuyente asociado al vehículo.
     */
    public Vehiculo(String numeroSerie, String marca, String linea, String color, String modelo, Contribuyente contribuyente) {
        this.numeroSerie = numeroSerie;
        this.marca = marca;
        this.linea = linea;
        this.color = color;
        this.modelo = modelo;
        this.contribuyente = contribuyente;
    }

    /**
     * Devuelve el ID del vehículo.
     *
     * @return El ID del vehículo.
     */
    public Long getId() {
        return id;
    }

    /**
     * Establece el ID del vehículo.
     *
     * @param id El ID del vehículo.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Devuelve el número de serie del vehículo.
     *
     * @return El número de serie del vehículo.
     */
    public String getNumeroSerie() {
        return numeroSerie;
    }

    /**
     * Establece el número de serie del vehículo.
     *
     * @param numeroSerie El número de serie del vehículo.
     */
    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    /**
     * Devuelve la marca del vehículo.
     *
     * @return La marca del vehículo.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Establece la marca del vehículo.
     *
     * @param marca La marca del vehículo.
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Devuelve la línea del vehículo.
     *
     * @return La línea del vehículo.
     */
    public String getLinea() {
        return linea;
    }

    /**
     * Establece la línea del vehículo.
     *
     * @param linea La línea del vehículo.
     */
    public void setLinea(String linea) {
        this.linea = linea;
    }

    /**
     * Devuelve el color del vehículo.
     *
     * @return El color del vehículo.
     */
    public String getColor() {
        return color;
    }

    /**
     * Establece el color del vehículo.
     *
     * @param color El color del vehículo.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Devuelve el modelo del vehículo.
     *
     * @return El modelo del vehículo.
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Establece el modelo del vehículo.
     *
     * @param modelo El modelo del vehículo.
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Devuelve el contribuyente asociado al vehículo.
     *
     * @return El contribuyente asociado al vehículo.
     */
    public Contribuyente getContribuyente() {
        return contribuyente;
    }

    /**
     * Establece el contribuyente asociado al vehículo.
     *
     * @param contribuyente El contribuyente asociado al vehículo.
     */
    public void setContribuyente(Contribuyente contribuyente) {
        this.contribuyente = contribuyente;
    }

    /**
     * Devuelve la lista de placas asociadas al vehículo.
     *
     * @return La lista de placas asociadas al vehículo.
     */
    public List<Placa> getPlacas() {
        return placas;
    }

    /**
     * Establece la lista de placas asociadas al vehículo.
     *
     * @param placas La lista de placas asociadas al vehículo.
     */
    public void setPlacas(List<Placa> placas) {
        this.placas = placas;
    }

    /**
     * Devuelve el valor hash del vehículo.
     *
     * @return El valor hash del vehículo.
     */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.id);
        return hash;
    }

    /**
     * Compara este vehículo con otro objeto para determinar si son iguales.
     *
     * @param obj El objeto a comparar.
     * @return true si este vehículo es igual al objeto especificado, false de
     * lo contrario.
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
        final Vehiculo other = (Vehiculo) obj;
        return Objects.equals(this.id, other.id);
    }

    /**
     * Devuelve una representación en forma de cadena de este vehículo.
     *
     * @return Una cadena que representa este vehículo, incluyendo sus
     * atributos.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vehiculo{");
        sb.append("id=").append(id);
        sb.append(", numeroSerie=").append(numeroSerie);
        sb.append(", marca=").append(marca);
        sb.append(", linea=").append(linea);
        sb.append(", color=").append(color);
        sb.append(", modelo=").append(modelo);
        sb.append(", contribuyente=").append(contribuyente);
        sb.append(", placas=").append(placas);
        sb.append('}');
        return sb.toString();
    }

}
