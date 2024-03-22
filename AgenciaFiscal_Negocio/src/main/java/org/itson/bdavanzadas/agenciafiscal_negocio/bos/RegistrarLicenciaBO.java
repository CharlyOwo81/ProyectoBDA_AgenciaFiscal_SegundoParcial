package org.itson.bdavanzadas.agenciafiscal_negocio.bos;

import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.ContribuyenteDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.TramiteLicenciaNuevaDTO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.daos.BuscarContribuyenteDAO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.daos.RegistrarLicenciaDAO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Contribuyente;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.TramiteLicencia;
import org.itson.bdavanzadas.agenciafiscal_persistencia.excepciones.PersistenciaException;

/**
 *
 * @author Roberto García
 */
public class RegistrarLicenciaBO {

    TramiteLicenciaNuevaDTO tramiteLicenciaNuevaDTO;

    public RegistrarLicenciaBO(TramiteLicenciaNuevaDTO tramiteLicenciaNuevaDTO) {
        this.tramiteLicenciaNuevaDTO = tramiteLicenciaNuevaDTO;
    }

    public void registrarLicencia(ContribuyenteDTO contribuyenteDTO) throws PersistenciaException {
        BuscarContribuyenteDAO buscarContribuyenteDAO = new BuscarContribuyenteDAO();
        
        Contribuyente contribuyente = buscarContribuyenteDAO.buscarContribuyente(contribuyenteDTO.getRFC());
        TramiteLicencia tramiteLicencia = new TramiteLicencia(
                tramiteLicenciaNuevaDTO.getTipo_licencia(),
                tramiteLicenciaNuevaDTO.getVigencia(),
                tramiteLicenciaNuevaDTO.getCosto(),
                tramiteLicenciaNuevaDTO.getFecha_emision(),
                tramiteLicenciaNuevaDTO.getFecha_recepcion(),
                contribuyente);
        RegistrarLicenciaDAO registrarLicenciaDAO = new RegistrarLicenciaDAO();
        registrarLicenciaDAO.registrarLicencia(tramiteLicencia);
    }
    
    
    
    
}
