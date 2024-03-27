package org.itson.bdavanzadas.agenciafiscal_persistencia.daos;

import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Licencia;
import org.itson.bdavanzadas.agenciafiscal_persistencia.excepciones.PersistenciaException;

/**
 * Interfaz que define el método para registrar una licencia en la base de datos.
 * Las implementaciones de esta interfaz proporcionan funcionalidades para registrar nuevas licencias.
 * 
 * Esta interfaz sigue el patrón de diseño DAO (Data Access Object).
 * 
 * @author Gamaliel Armenta
 * @author Roberto García
 */
public interface IRegistrarLicenciaDAO {
    
    /**
     * Registra una nueva licencia en la base de datos.
     * 
     * @param tramiteLicencia La licencia a registrar.
     * @throws PersistenciaException Si ocurre un error durante la operación de persistencia.
     */
    public void registrarLicencia(Licencia tramiteLicencia) throws PersistenciaException;
}

