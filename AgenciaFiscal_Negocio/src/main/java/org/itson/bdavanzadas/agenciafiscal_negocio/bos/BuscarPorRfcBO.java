package org.itson.bdavanzadas.agenciafiscal_negocio.bos;

import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.BuscarContribyenteRFCDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.ContribuyenteDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.excepciones.ValidacionDTOException;
import org.itson.bdavanzadas.agenciafiscal_persistencia.daos.BuscarContribuyenteDAO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Contribuyente;
import org.itson.bdavanzadas.agenciafiscal_persistencia.excepciones.PersistenciaException;

/**
 * Clase que representa un objeto de negocio para buscar un contribuyente por su RFC.
 * Implementa la interfaz IBuscarPorRfcBO.
 * 
 * @author Gamaliel Armenta
 * @author Roberto García
 */
public class BuscarPorRfcBO implements IBuscarPorRfcBO {

    private final String rfc;

    /**
     * Constructor de la clase.
     * 
     * @param contribuyenteRfcDto Objeto DTO que contiene el RFC del contribuyente.
     */
    public BuscarPorRfcBO(BuscarContribyenteRFCDTO contribuyenteRfcDto) {
        this.rfc = contribuyenteRfcDto.getRfc();
    }
    
    /**
     * Método para buscar un contribuyente por su RFC.
     * 
     * @return ContribuyenteDTO con la información del contribuyente encontrado.
     * @throws ValidacionDTOException Si ocurre algún error de validación.
     * @throws PersistenciaException Si ocurre algún error de persistencia.
     */
    @Override
    public ContribuyenteDTO buscarContribuyente() throws ValidacionDTOException, PersistenciaException{
        validarRfc();
        BuscarContribuyenteDAO buscarContribuyenteDAO = new BuscarContribuyenteDAO();
        
        Contribuyente contribuyente = buscarContribuyenteDAO.buscarContribuyente(rfc);
        ContribuyenteDTO contribuyenteDTO = new ContribuyenteDTO(
                contribuyente.getId(),
                contribuyente.getRfc(),
                contribuyente.getNombre(),
                contribuyente.getApellidoPaterno(),
                contribuyente.getApellidoMaterno(),
                contribuyente.getTelefono(),
                contribuyente.getFechaNacimiento(),
                contribuyente.getDiscapacidad());
        return contribuyenteDTO;
    }

    /**
     * Método para validar el RFC del contribuyente.
     * 
     * @return true si el RFC es válido, false de lo contrario.
     * @throws ValidacionDTOException Si el RFC no cumple con las reglas de validación.
     */
    @Override
    public boolean validarRfc() throws ValidacionDTOException {
        String regex = "^[a-zA-Z0-9]{13}$";
        if (rfc.length() != 13) {
            throw new ValidacionDTOException("El RFC debe contener 13 caracteres");
        } else if (!rfc.matches(regex)) {
            throw new ValidacionDTOException("El RFC solo debe contener letras y números");
        }
        return true;
    }
}

