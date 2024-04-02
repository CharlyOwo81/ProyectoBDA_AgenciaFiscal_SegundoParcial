package org.itson.bdavanzadas.agenciafiscal_negocio.bos;

import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.AutomovilNuevoDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.PlacasNuevasDTO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.excepciones.PersistenciaException;

/**
 * Interfaz que define el contrato para registrar nuevas placas de vehículos en
 * el sistema. Los implementadores de esta interfaz deben proporcionar la lógica
 * para registrar las placas de vehículos.
 *
 * @author Roberto García
 */
public interface IRegistrarPlacasBO {

    /**
     * Método para registrar nuevas placas de vehículos en el sistema.
     *
     * @param automovilNuevoDTO Objeto AutomovilNuevoDTO que contiene los datos
     * del vehículo asociado a las placas.
     * @return El objeto PlacasNuevasDTO registrado en el sistema.
     * @throws PersistenciaException Si ocurre un error durante la inserción de
     * las placas en la base de datos.
     */
    public PlacasNuevasDTO registrarPlacas(AutomovilNuevoDTO automovilNuevoDTO) throws PersistenciaException;
}
