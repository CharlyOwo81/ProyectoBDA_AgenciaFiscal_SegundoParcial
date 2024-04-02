package org.itson.bdavanzadas.agenciafiscal_negocio.bos;

import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.PlacasNuevasDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.excepciones.ValidacionDTOException;
import org.itson.bdavanzadas.agenciafiscal_persistencia.excepciones.PersistenciaException;

/**
 * Esta interfaz define el contrato para validar placas nuevas. Define un método
 * para validar las placas y lanzar excepciones en caso de que el proceso falle.
 * Las implementaciones de esta interfaz deben proporcionar la lógica para
 * realizar la validación.
 *
 * @author Gamaliel Armenta
 * @author Roberto García
 */
public interface IValidarPlacasBO {

    /**
     * Valida las placas nuevas.
     *
     * @return El objeto PlacasNuevasDTO si las placas son válidas.
     * @throws ValidacionDTOException si las placas no cumplen con el formato
     * esperado.
     * @throws PersistenciaException si hay un error al buscar las placas en la
     * base de datos.
     */
    public PlacasNuevasDTO validarPlacas() throws ValidacionDTOException, PersistenciaException;
}
