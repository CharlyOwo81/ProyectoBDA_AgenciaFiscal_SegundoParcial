package org.itson.bdavanzadas.agenciafiscal_persistencia.daos;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Clase que implementa la interfaz IConexion y proporciona funcionalidades para crear conexiones
 * a la base de datos utilizando JPA (Java Persistence API).
 * 
 * Esta clase utiliza la configuración definida en el archivo persistence.xml para establecer 
 * la conexión con la base de datos.
 * 
 * @author Gamaliel Armenta
 * @author Roberto García
 */
public class Conexion implements IConexion {

    /**
     * Crea y devuelve una nueva conexión a la base de datos utilizando JPA.
     * 
     * @return Una instancia de EntityManager que representa la conexión a la base de datos.
     */
    @Override
    public EntityManager crearConexion() {
        // Obtener acceso a la Fábrica de Entity Managers
        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("AgenciaFiscalPU");
        // Solicitar una Entity Manager
        EntityManager eManager = emFactory.createEntityManager();
        
        return eManager;
    }
}

