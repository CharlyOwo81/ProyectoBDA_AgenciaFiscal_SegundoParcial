package org.itson.bdavanzadas.agenciafiscal_negocio.bos;

import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.ContribuyenteDTO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.excepciones.PersistenciaException;

/**
 * Esta interfaz define el contrato para la clase que se encarga de gestionar el
 * proceso de registro de una nueva licencia en el sistema. La implementación de
 * esta interfaz debe proporcionar un método para registrar una nueva licencia
 * para un contribuyente en el sistema.
 *
 * @author Gamaliel Armenta
 * @author Roberto García
 */
public interface IRegistrarLicenciaBO {

    /**
     * Registra una nueva licencia para un contribuyente en el sistema.
     *
     * @param contribuyenteDTO El objeto ContribuyenteDTO que representa al
     * contribuyente al que se le va a registrar la licencia.
     * @throws PersistenciaException Si ocurre algún error durante el proceso de
     * persistencia.
     */
    public void registrarLicencia(ContribuyenteDTO contribuyenteDTO) throws PersistenciaException;
}
