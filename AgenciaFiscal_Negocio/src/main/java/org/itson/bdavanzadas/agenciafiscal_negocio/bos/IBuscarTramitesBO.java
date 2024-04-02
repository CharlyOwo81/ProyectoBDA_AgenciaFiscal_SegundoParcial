package org.itson.bdavanzadas.agenciafiscal_negocio.bos;

import java.util.List;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.ContribuyenteDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.LicenciaNuevaDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.PlacasNuevasDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.ReporteDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.TramiteNuevoDTO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.excepciones.PersistenciaException;

/**
 * Interfaz que define los métodos para buscar trámites, licencias y placas en
 * la base de datos. Cada método realiza una búsqueda específica y devuelve una
 * lista de DTO correspondientes.
 *
 * Todas las implementaciones de esta interfaz deben manejar excepciones de tipo
 * PersistenciaException.
 *
 * @author Gamaliel Armenta
 * @author Roberto García
 */
public interface IBuscarTramitesBO {

    /**
     * Método para buscar trámites en la base de datos según los criterios
     * especificados en el objeto ReporteDTO.
     *
     * @param reporteDTO Objeto ReporteDTO que contiene los criterios de
     * búsqueda de trámites.
     * @return Una lista de objetos TramiteNuevoDTO que representan los trámites
     * encontrados.
     * @throws PersistenciaException Si no se encuentran trámites que coincidan
     * con los criterios de búsqueda.
     */
    public List<TramiteNuevoDTO> buscarTramites(ReporteDTO reporteDTO) throws PersistenciaException;

    /**
     * Método para buscar licencias de un contribuyente en la base de datos.
     *
     * @param contribuyenteDTO Objeto ContribuyenteDTO que contiene los datos
     * del contribuyente.
     * @return Una lista de objetos LicenciaNuevaDTO que representan las
     * licencias encontradas para el contribuyente.
     * @throws PersistenciaException Si no se encuentran licencias para el
     * contribuyente especificado.
     */
    public List<LicenciaNuevaDTO> buscarLicencias(ContribuyenteDTO contribuyenteDTO) throws PersistenciaException;

    /**
     * Método para buscar placas de un contribuyente en la base de datos.
     *
     * @param contribuyenteDTO Objeto ContribuyenteDTO que contiene los datos
     * del contribuyente.
     * @return Una lista de objetos PlacasNuevasDTO que representan las placas
     * encontradas para el contribuyente.
     * @throws PersistenciaException Si no se encuentran placas para el
     * contribuyente especificado.
     */
    public List<PlacasNuevasDTO> buscarPlacas(ContribuyenteDTO contribuyenteDTO) throws PersistenciaException;
}
