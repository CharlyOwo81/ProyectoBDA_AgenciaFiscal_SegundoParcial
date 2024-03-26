package org.itson.bdavanzadas.agenciafiscal_negocio.bos;

import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.ContribuyenteDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.LicenciaNuevaDTO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.daos.BuscarContribuyenteDAO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.daos.RegistrarLicenciaDAO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Contribuyente;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Licencia;
import org.itson.bdavanzadas.agenciafiscal_persistencia.excepciones.PersistenciaException;

/**
 *
 * @author Roberto García
 */
public class RegistrarLicenciaBO {

    LicenciaNuevaDTO tramiteLicenciaNuevaDTO;

    public RegistrarLicenciaBO(LicenciaNuevaDTO tramiteLicenciaNuevaDTO) {
        this.tramiteLicenciaNuevaDTO = tramiteLicenciaNuevaDTO;
    }

    public void registrarLicencia(ContribuyenteDTO contribuyenteDTO) throws PersistenciaException {
        BuscarContribuyenteDAO buscarContribuyenteDAO = new BuscarContribuyenteDAO();
        
        Contribuyente contribuyente = buscarContribuyenteDAO.buscarContribuyente(contribuyenteDTO.getRFC());
        Licencia tramiteLicencia = new Licencia(
                tramiteLicenciaNuevaDTO.getTipo_licencia(),
                tramiteLicenciaNuevaDTO.getVigencia(),
                tramiteLicenciaNuevaDTO.getCosto(),
                tramiteLicenciaNuevaDTO.getFecha_emision(),
                tramiteLicenciaNuevaDTO.,
                contribuyente);
        RegistrarLicenciaDAO registrarLicenciaDAO = new RegistrarLicenciaDAO();
        registrarLicenciaDAO.registrarLicencia(tramiteLicencia);
    }
    
    
    
    
}
