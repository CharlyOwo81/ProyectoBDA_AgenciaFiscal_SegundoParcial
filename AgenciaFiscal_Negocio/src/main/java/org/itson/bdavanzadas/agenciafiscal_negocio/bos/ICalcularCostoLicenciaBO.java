package org.itson.bdavanzadas.agenciafiscal_negocio.bos;

/**
 * Esta interfaz define un método para calcular el costo de una licencia de conducir basado en la duración en años.
 * Implementaciones de esta interfaz deben proporcionar una forma de calcular el costo de la licencia.
 * 
 * @author Roberto García
 */
public interface ICalcularCostoLicenciaBO {

    /**
     * Calcula el costo de una licencia de conducir para la duración especificada en años.
     * 
     * @param anios La duración de la licencia en años.
     * @return El costo de la licencia calculado.
     */
    public Float calcularCosto(int anios);
}

