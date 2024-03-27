package org.itson.bdavanzadas.agenciafiscal_persistencia.daos;

import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Licencia;

/**
 * Interfaz que define el método para agregar una licencia a la base de datos.
 * Las implementaciones de esta interfaz proporcionan funcionalidades para agregar nuevas licencias.
 * 
 * Esta interfaz sigue el patrón de diseño DAO (Data Access Object).
 * 
 * @author Gamaliel Armenta
 * @author Roberto García
 */
public interface ILicenciaDAO {
    
    /**
     * Agrega una nueva licencia a la base de datos.
     * 
     * @param licenciaNueva La licencia a agregar.
     * @return La licencia agregada.
     */
    public Licencia agregarLicencia(Licencia licenciaNueva);
}

