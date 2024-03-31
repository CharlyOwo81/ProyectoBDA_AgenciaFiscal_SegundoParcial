package org.itson.bdavanzadas.agenciafiscal_persistencia.daos;

import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Placa;
import org.itson.bdavanzadas.agenciafiscal_persistencia.excepciones.PersistenciaException;

/**
 *
 * @author Roberto García
 */
public interface IPlacasDAO {

    public void registrarPlacas(Placa placa) throws Exception;
    public Placa buscarPlacas(Placa placa) throws PersistenciaException;
    public Placa vencerPlaca(Placa placa) throws PersistenciaException;
    public Placa buscarPlacasDuplicadas(Placa placa);
}
