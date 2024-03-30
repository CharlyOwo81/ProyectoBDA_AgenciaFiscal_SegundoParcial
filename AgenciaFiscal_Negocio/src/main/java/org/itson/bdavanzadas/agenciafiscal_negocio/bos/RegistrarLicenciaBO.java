package org.itson.bdavanzadas.agenciafiscal_negocio.bos;

import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.ContribuyenteDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.LicenciaNuevaDTO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.daos.BuscarContribuyenteDAO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.daos.RegistrarLicenciaDAO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Contribuyente;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Licencia;
import org.itson.bdavanzadas.agenciafiscal_persistencia.excepciones.PersistenciaException;

/**
 * Esta clase se encarga de gestionar el proceso de registro de una nueva licencia en el sistema.
 * Recibe un objeto de tipo LicenciaNuevaDTO que contiene los detalles de la nueva licencia a registrar.
 * Al registrar la licencia, busca el contribuyente asociado a través de su RFC utilizando la capa de persistencia,
 * crea una nueva instancia de Licencia con los datos proporcionados y luego utiliza la capa de persistencia
 * para almacenar la nueva licencia en la base de datos.
 * 
 * @author Gamaliel Armenta
 * @author Roberto García
 */
public class RegistrarLicenciaBO implements IRegistrarLicenciaBO{

    private final LicenciaNuevaDTO licenciaNuevaDTO;

    /**
     * Constructor de la clase RegistrarLicenciaBO.
     * 
     * @param licenciaNuevaDTO El objeto LicenciaNuevaDTO que contiene los detalles de la nueva licencia.
     */
    public RegistrarLicenciaBO(LicenciaNuevaDTO licenciaNuevaDTO) {
        this.licenciaNuevaDTO = licenciaNuevaDTO;
    }

    /**
     * Registra una nueva licencia para un contribuyente en el sistema.
     * 
     * @param contribuyenteDTO El objeto ContribuyenteDTO que representa al contribuyente al que se le va a registrar la licencia.
     * @throws PersistenciaException Si ocurre algún error durante el proceso de persistencia.
     */
    @Override
    public void registrarLicencia(ContribuyenteDTO contribuyenteDTO) throws PersistenciaException {
        BuscarContribuyenteDAO buscarContribuyenteDAO = new BuscarContribuyenteDAO();
        
        Contribuyente contribuyente = buscarContribuyenteDAO.buscarContribuyente(contribuyenteDTO.getRfc());
        Integer edadContribuyente = buscarContribuyenteDAO.calcularEdad(contribuyente);

        if (edadContribuyente < 18) {
            throw new PersistenciaException("El contribuyente es menor de edad para obtener la licencia");
        }

        Licencia licencia = new Licencia(
                licenciaNuevaDTO.getVigencia(),
                licenciaNuevaDTO.getTipoLicencia(),
                licenciaNuevaDTO.getFechaVencimiento(),
                licenciaNuevaDTO.getCosto(),
                licenciaNuevaDTO.getFechaEmision(),
                contribuyente);

        RegistrarLicenciaDAO registrarLicenciaDAO = new RegistrarLicenciaDAO();
        registrarLicenciaDAO.registrarLicencia(licencia);
    }
}

