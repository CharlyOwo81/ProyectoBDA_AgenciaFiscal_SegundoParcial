package org.itson.bdavanzadas.agenciafiscal_negocio.bos;

import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.ContribuyenteDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.excepciones.ValidacionDTOException;
import org.itson.bdavanzadas.agenciafiscal_persistencia.excepciones.PersistenciaException;

/**
 *
 * @author Roberto García
 */
public interface IBuscarPorRfcBO {
    public ContribuyenteDTO buscarContribuyente( ) throws ValidacionDTOException, PersistenciaException;
    
    public boolean validarRfc( ) throws ValidacionDTOException;
}
