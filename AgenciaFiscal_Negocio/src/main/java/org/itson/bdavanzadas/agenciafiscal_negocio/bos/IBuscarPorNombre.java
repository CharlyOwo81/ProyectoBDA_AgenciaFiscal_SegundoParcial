package org.itson.bdavanzadas.agenciafiscal_negocio.bos;

import java.util.List;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.ContribuyenteDTO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.excepciones.PersistenciaException;

/**
 *
 * @author Roberto García
 */
public interface IBuscarPorNombre {

    public List<ContribuyenteDTO> buscarContribuyente(ContribuyenteDTO contribuyenteDTO) throws PersistenciaException;
}
