package org.itson.bdavanzadas.agenciafiscal_negocio.bos;

import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.LicenciaNuevaDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.excepciones.ValidacionDTOException;
import org.itson.bdavanzadas.agenciafiscal_persistencia.excepciones.PersistenciaException;

/**
 * Esta interfaz define el contrato para validar la vigencia de la licencia de un contribuyente.
 * Define un método para buscar la licencia y verificar su vigencia.
 * Implementaciones de esta interfaz deben proporcionar la lógica para realizar la validación.
 * 
 * @author Roberto García
 */
public interface IValidarLicenciaBO {

    /**
     * Busca la licencia del contribuyente y valida su vigencia.
     * 
     * @return true si la licencia está vigente, false en caso contrario.
     * @throws org.itson.bdavanzadas.agenciafiscal_persistencia.excepciones.PersistenciaException
     * @throws org.itson.bdavanzadas.agenciafiscal_negocio.excepciones.ValidacionDTOException
     */
    public LicenciaNuevaDTO validarLicencia() throws PersistenciaException, ValidacionDTOException;
}
