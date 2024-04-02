package org.itson.bdavanzadas.agenciafiscal_persistencia.daos;

import java.util.Date;
import java.util.List;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Contribuyente;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Tramite;
import org.itson.bdavanzadas.agenciafiscal_persistencia.excepciones.PersistenciaException;

/**
 * Interfaz que define los métodos para buscar trámites en la base de datos.
 * Las implementaciones de esta interfaz proporcionan funcionalidades para buscar trámites
 * asociados a un contribuyente y entre fechas específicas.
 * 
 * @author Gamaliel Armenta
 * @author Roberto García
 */
public interface ITramiteDAO {
    
    /**
     * Busca los trámites de un contribuyente en la base de datos.
     *
     * @param contribuyente El contribuyente del cual se desean buscar los trámites.
     * @return Una lista de trámites asociados al contribuyente.
     * @throws PersistenciaException Si no se encuentran trámites asociados al contribuyente.
     */
    public List<Tramite> buscarTramitesPorContribuyente(Contribuyente contribuyente) throws PersistenciaException;

    /**
     * Busca los trámites en la base de datos que fueron emitidos entre las fechas especificadas.
     *
     * @param desde La fecha desde la cual se desea buscar los trámites.
     * @param hasta La fecha hasta la cual se desea buscar los trámites.
     * @return Una lista de trámites emitidos entre las fechas especificadas.
     */
    public List<Tramite> buscarTramitesFecha(Date desde, Date hasta);
}