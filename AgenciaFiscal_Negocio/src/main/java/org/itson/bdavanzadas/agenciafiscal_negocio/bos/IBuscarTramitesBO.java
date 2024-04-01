package org.itson.bdavanzadas.agenciafiscal_negocio.bos;

import java.util.List;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.ContribuyenteDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.LicenciaNuevaDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.PlacasNuevasDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.ReporteDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.TramiteNuevoDTO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.excepciones.PersistenciaException;

/**
 *
 * @author Roberto García
 */
public interface IBuscarTramitesBO {

    /**
     *
     * @param reporteDTO
     * @return
     * @throws PersistenciaException
     */
    public List<TramiteNuevoDTO> buscarTramites(ReporteDTO reporteDTO) throws PersistenciaException;

    public List<LicenciaNuevaDTO> buscarLicencias(ContribuyenteDTO contribuyenteDTO) throws PersistenciaException;

    public List<PlacasNuevasDTO> buscarPlacas(ContribuyenteDTO contribuyenteDTO) throws PersistenciaException;
}
