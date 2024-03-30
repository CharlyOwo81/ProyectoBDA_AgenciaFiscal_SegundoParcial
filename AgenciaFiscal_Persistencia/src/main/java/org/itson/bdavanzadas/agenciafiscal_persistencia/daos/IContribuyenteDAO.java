package org.itson.bdavanzadas.agenciafiscal_persistencia.daos;

import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Contribuyente;
import org.itson.bdavanzadas.agenciafiscal_persistencia.excepciones.PersistenciaException;

/**
 * Interfaz que define el método para agregar un contribuyente a la base de datos.
 * Las implementaciones de esta interfaz proporcionan funcionalidades para agregar nuevos contribuyentes.
 * 
 * Esta interfaz sigue el patrón de diseño DAO (Data Access Object).
 * 
 * @author Gamaliel Armenta
 * @author Roberto García
 */
public interface IContribuyenteDAO {
    
    /**
     * Agrega un nuevo contribuyente a la base de datos.
     * 
     * @param contribuyente El contribuyente a agregar.
     * @return El contribuyente agregado.
     * @throws org.itson.bdavanzadas.agenciafiscal_persistencia.excepciones.PersistenciaException
     * @throws java.sql.SQLIntegrityConstraintViolationException
     */
    public Contribuyente agregarContribuyente(Contribuyente contribuyente) throws Exception;
}

