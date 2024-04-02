package org.itson.bdavanzadas.agenciafiscal_negocio.bos;

import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.PlacasViejasDTO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.excepciones.PersistenciaException;

/**
 * Interfaz que define el contrato para buscar placas en la base de datos.
 *
 * Las clases que implementen esta interfaz deben proporcionar una
 * implementación para buscar placas en la base de datos.
 *
 * @author Gamaliel Armenta
 * @author Roberto García
 */
public interface IBuscarPlacasBO {

    /**
     * Método para buscar placas en la base de datos.
     *
     * Si no se encuentran placas vigentes asociadas al número de placas
     * proporcionado, se lanza una excepción de tipo PersistenciaException.
     *
     * @return Un objeto PlacasViejasDTO que representa las placas encontradas.
     * @throws PersistenciaException Si no se encuentran placas vigentes
     * asociadas al número de placas proporcionado.
     */
    public PlacasViejasDTO buscarPlacas() throws PersistenciaException;
}
