package org.itson.bdavanzadas.agenciafiscal_persistencia.daos;

import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Placa;
import org.itson.bdavanzadas.agenciafiscal_persistencia.excepciones.PersistenciaException;

/**
 *
 * @author Gamaliel Armenta
 * @author Roberto García
 */
public interface IPlacasDAO {

    /**
     * Registra las placas en la base de datos.
     *
     * @param placa La placa a registrar.
     * @throws Exception Si ocurre algún error al intentar registrar las placas.
     */
    public void registrarPlacas(Placa placa) throws Exception;

    /**
     * Busca las placas en la base de datos por su número de placas.
     *
     * @param placa La placa a buscar.
     * @return La placa encontrada.
     * @throws PersistenciaException Si no se encuentra ninguna placa con el
     * número proporcionado.
     */
    public Placa buscarPlacas(Placa placa) throws PersistenciaException;

    /**
     * Busca las placas vigentes en la base de datos por su número de placas.
     *
     * @param placa La placa a buscar.
     * @return La placa vigente encontrada.
     * @throws PersistenciaException Si no se encuentra ninguna placa vigente
     * con el número proporcionado.
     */
    public Placa buscarPlacasVigentes(Placa placa) throws PersistenciaException;

    /**
     * Vence las placas en la base de datos asignadole una fecha de recepción.
     *
     * @param placa La placa a vencer.
     * @return La placa vencida.
     * @throws PersistenciaException Si ocuure algún error inesperado.
     */
    public Placa vencerPlaca(Placa placa) throws PersistenciaException;

    /**
     * Busca placas duplicadas en la base de datos por su número de placas.
     *
     * @param placa La placa a buscar.
     * @return La placa duplicada encontrada, o null si no se encuentra ninguna.
     */
    public Placa buscarPlacasDuplicadas(Placa placa);
}
