package org.itson.bdavanzadas.agenciafiscal_persistencia.daos;

import java.util.List;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Contribuyente;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Tramite;
import org.itson.bdavanzadas.agenciafiscal_persistencia.excepciones.PersistenciaException;

/**
 *
 * @author Roberto García
 */
public interface ITramiteDAO {
    public List<Tramite> buscarTramitesPorContribuyente(Contribuyente contribuyente) throws PersistenciaException;
}
