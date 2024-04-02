package org.itson.bdavanzadas.agenciafiscal_negocio.bos;

import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.PlacasViejasDTO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.excepciones.PersistenciaException;

/**
 * Esta interfaz define el contrato para vencer las placas viejas de un vehículo.
 * Implementaciones de esta interfaz deben proporcionar la lógica para vencer las placas.
 * 
 * @author Gamaliel Armenta
 * @author Roberto García
 */
public interface IVencerPlacasBO {

    /**
     * Vence las placas viejas del vehículo asociado.
     * 
     * @return El objeto PlacasViejasDTO actualizado después de vencer las placas.
     * @throws PersistenciaException Si hay un error al interactuar con la capa de persistencia.
     */
    public PlacasViejasDTO vencerPlacas() throws PersistenciaException;
}

