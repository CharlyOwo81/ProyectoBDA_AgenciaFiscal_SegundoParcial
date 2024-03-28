package org.itson.bdavanzadas.agenciafiscal_negocio.dtos;

/**
 *
 * @author Roberto García
 */
public class AutomovilNuevoDTO {

    private Long id;
    private String numeroSerie;
    private String marca;
    private String linea;
    private String color;
    private String modelo;

    public AutomovilNuevoDTO(String numeroSerie, String marca, String linea, String color, String modelo) {
        this.numeroSerie = numeroSerie;
        this.marca = marca;
        this.linea = linea;
        this.color = color;
        this.modelo = modelo;
    }

    
    
    public AutomovilNuevoDTO(Long id, String numeroSerie, String marca, String linea, String color, String modelo) {
        this.id = id;
        this.numeroSerie = numeroSerie;
        this.marca = marca;
        this.linea = linea;
        this.color = color;
        this.modelo = modelo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    
    
}
