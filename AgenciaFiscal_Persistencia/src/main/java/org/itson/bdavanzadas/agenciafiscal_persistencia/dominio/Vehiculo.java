package org.itson.bdavanzadas.agenciafiscal_persistencia.dominio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author gamaliel
 */
@Entity
@Table(name="vehiculos")
public class Vehiculo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name= "numeroSerie", nullable = false, length = 17)
    private String numeroSerie;
    
    @Column(name = "marca", nullable = false, length = 30)
    private String marca;
    
    @Column(name = "linea", nullable = false, length = 30)
    private String linea;
    
    @Column(name = "color", nullable = false, length = 20)
    private String color;
    
    @Column(name = "modelo", nullable = false, length = 4)
    private String modelo;
    
    @Column(name = "id_tramite", nullable = true)
    private Long id_tramite;
    
    @JoinColumn(name = "contribuyente", nullable = true)
    @ManyToOne
    private Contribuyente contribuyente;

    public Vehiculo() {
    }

    public Vehiculo(String numeroSerie, String marca, String linea, String color, String modelo, Long id_tramite, Contribuyente contribuyente) {
        this.numeroSerie = numeroSerie;
        this.marca = marca;
        this.linea = linea;
        this.color = color;
        this.modelo = modelo;
        this.id_tramite = id_tramite;
        this.contribuyente = contribuyente;
    }

    public Vehiculo(String numeroSerie, String marca, String linea, String color, String modelo) {
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

    public String getNumero_serie() {
        return numeroSerie;
    }

    public void setNumero_serie(String numeroSerie) {
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

    public Long getId_tramite() {
        return id_tramite;
    }

    public void setId_tramite(Long id_tramite) {
        this.id_tramite = id_tramite;
    }

    public Contribuyente getContribuyente() {
        return contribuyente;
    }

    public void setContribuyente(Contribuyente contribuyente) {
        this.contribuyente = contribuyente;
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
        if (!(object instanceof Vehiculo)) {
            return false;
        }
        Vehiculo other = (Vehiculo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.itson.bdavanzadas.agenciafiscal_dominio.Vehiculo[ id=" + id + " ]";
    }
    
}
