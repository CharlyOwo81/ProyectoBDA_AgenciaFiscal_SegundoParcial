package org.itson.bdavanzadas.agenciafiscal_negocio.bos;

import org.itson.bdavanzadas.agenciafiscal_negocio.excepciones.ValidacionDTOException;

/**
 * Interfaz para validar la información de un automóvil. Define un método para
 * validar los datos de un automóvil.
 *
 * @author Roberto García
 */
public interface IValidarAutomovilBO {

    /**
     * Valida los datos de un automóvil.
     *
     * @return true si los datos del automóvil son válidos.
     * @throws ValidacionDTOException si se encuentran problemas con los datos
     * del automóvil.
     */
    public boolean validarAutomovil() throws ValidacionDTOException;
}
