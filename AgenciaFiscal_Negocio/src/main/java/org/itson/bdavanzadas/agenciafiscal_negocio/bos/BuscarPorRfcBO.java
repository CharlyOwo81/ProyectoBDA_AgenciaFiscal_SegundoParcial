package org.itson.bdavanzadas.agenciafiscal_negocio.bos;

import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.BuscarContribyenteRFCDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.ContribuyenteDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.excepciones.ValidacionDTOException;
import org.itson.bdavanzadas.agenciafiscal_persistencia.daos.BuscarContribuyenteDAO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Contribuyente;
import org.itson.bdavanzadas.agenciafiscal_persistencia.excepciones.PersistenciaException;

/**
 *
 * @author Roberto García
 */
public class BuscarPorRfcBO implements IBuscarPorRfcBO {
    String rfc;

    public BuscarPorRfcBO(BuscarContribyenteRFCDTO contribuyenteRfcDto) {
        this.rfc = contribuyenteRfcDto.getRfc();
    }
    
    @Override
    public ContribuyenteDTO buscarContribuyente() throws ValidacionDTOException, PersistenciaException{
        validarRfc();
        BuscarContribuyenteDAO buscarContribuyenteDAO = new BuscarContribuyenteDAO();
        
        Contribuyente contribuyente = buscarContribuyenteDAO.buscarContribuyente(rfc);
        ContribuyenteDTO contribuyenteDTO = new ContribuyenteDTO(
                contribuyente.getId(),
                contribuyente.getRFC(),
                contribuyente.getNombre(),
                contribuyente.getApellido_paterno(),
                contribuyente.getApellido_materno(),
                contribuyente.getTelefono(),
                contribuyente.getFecha_nacimiento(),
                contribuyente.getDiscapacidad());
        return contribuyenteDTO;
    }

    @Override
    public boolean validarRfc() throws ValidacionDTOException {
        String regex = "^[a-zA-Z0-9]{13}$";
        if (rfc.length() != 13) {
            throw new ValidacionDTOException("El RFC debe contener 13 cáracteres");
        } else if (!rfc.matches(regex)) {
            throw new ValidacionDTOException("El RFC solo debe contener letras y números");
        }
        return true;
    }


}
