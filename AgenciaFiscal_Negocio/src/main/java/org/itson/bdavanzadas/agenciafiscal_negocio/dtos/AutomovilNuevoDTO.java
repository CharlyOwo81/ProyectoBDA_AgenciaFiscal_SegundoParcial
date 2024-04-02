package org.itson.bdavanzadas.agenciafiscal_negocio.dtos;

/**
 * Clase que representa un objeto de transferencia de datos (DTO) para un
 * automóvil nuevo. Este DTO contiene información como el número de serie,
 * marca, línea, color y modelo del automóvil. Se utiliza para transferir datos
 * relacionados con automóviles nuevos entre diferentes capas de la aplicación.
 *
 * @author Gamaliel Armenta
 * @author Roberto García
 */
public class AutomovilNuevoDTO {

    private Long id;
    private String numeroSerie;
    private String marca;
    private String linea;
    private String color;
    private String modelo;

    /**
     * Constructor de la clase AutomovilNuevoDTO que inicializa el ID del
     * automóvil.
     *
     * @param id El ID del automóvil nuevo.
     */
    public AutomovilNuevoDTO(Long id) {
        this.id = id;
    }

    /**
     * Constructor de la clase AutomovilNuevoDTO que inicializa todos los
     * atributos a excepción del ID.
     *
     * @param numeroSerie El número de serie del automóvil nuevo.
     * @param marca La marca del automóvil nuevo.
     * @param linea La línea del automóvil nuevo.
     * @param color El color del automóvil nuevo.
     * @param modelo El modelo del automóvil nuevo.
     */
    public AutomovilNuevoDTO(String numeroSerie, String marca, String linea, String color, String modelo) {
        this.numeroSerie = numeroSerie;
        this.marca = marca;
        this.linea = linea;
        this.color = color;
        this.modelo = modelo;
    }

    /**
     * Constructor de la clase AutomovilNuevoDTO que inicializa todos los
     * atributos, incluido el ID.
     *
     * @param id El ID del automóvil nuevo.
     * @param numeroSerie El número de serie del automóvil nuevo.
     * @param marca La marca del automóvil nuevo.
     * @param linea La línea del automóvil nuevo.
     * @param color El color del automóvil nuevo.
     * @param modelo El modelo del automóvil nuevo.
     */
    public AutomovilNuevoDTO(Long id, String numeroSerie, String marca, String linea, String color, String modelo) {
        this.id = id;
        this.numeroSerie = numeroSerie;
        this.marca = marca;
        this.linea = linea;
        this.color = color;
        this.modelo = modelo;
    }

    /**
     * Devuelve el ID del automóvil nuevo.
     *
     * @return El ID del automóvil nuevo.
     */
    public Long getId() {
        return id;
    }

    /**
     * Establece el ID del automóvil nuevo.
     *
     * @param id El ID del automóvil nuevo.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Devuelve el número de serie del automóvil nuevo.
     *
     * @return El número de serie del automóvil nuevo.
     */
    public String getNumeroSerie() {
        return numeroSerie;
    }

    /**
     * Establece el número de serie del automóvil nuevo.
     *
     * @param numeroSerie El número de serie del automóvil nuevo.
     */
    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    /**
     * Devuelve la marca del automóvil nuevo.
     *
     * @return La marca del automóvil nuevo.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Establece la marca del automóvil nuevo.
     *
     * @param marca La marca del automóvil nuevo.
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Devuelve la línea del automóvil nuevo.
     *
     * @return La línea del automóvil nuevo.
     */
    public String getLinea() {
        return linea;
    }

    /**
     * Establece la línea del automóvil nuevo.
     *
     * @param linea La línea del automóvil nuevo.
     */
    public void setLinea(String linea) {
        this.linea = linea;
    }

    /**
     * Devuelve el color del automóvil nuevo.
     *
     * @return El color del automóvil nuevo.
     */
    public String getColor() {
        return color;
    }

    /**
     * Establece el color del automóvil nuevo.
     *
     * @param color El color del automóvil nuevo.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Devuelve el modelo del automóvil nuevo.
     *
     * @return El modelo del automóvil nuevo.
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Establece el modelo del automóvil nuevo.
     *
     * @param modelo El modelo del automóvil nuevo.
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
