package org.itson.bdavanzadas.agenciafiscal_persistencia.daos;

import javax.persistence.EntityManager;

/**
 * Interfaz que define el método para crear conexiones a la base de datos utilizando JPA (Java Persistence API).
 * 
 * Las implementaciones de esta interfaz proporcionan funcionalidades para crear y obtener una conexión a la base de datos.
 * 
 * @author Gamaliel Armenta
 * @author Roberto García
 */
public interface IConexion {
    
    /**
     * Crea y devuelve una nueva conexión a la base de datos utilizando JPA.
     * 
     * @return Una instancia de EntityManager que representa la conexión a la base de datos.
     */
    public EntityManager crearConexion();
}
