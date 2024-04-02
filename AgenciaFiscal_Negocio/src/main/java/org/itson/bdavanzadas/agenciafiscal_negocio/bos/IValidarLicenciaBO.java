package org.itson.bdavanzadas.agenciafiscal_negocio.bos;

import java.util.List;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.LicenciaNuevaDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.excepciones.ValidacionDTOException;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Licencia;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Tramite;
import org.itson.bdavanzadas.agenciafiscal_persistencia.excepciones.PersistenciaException;

/**
 * Esta interfaz define el contrato para validar la vigencia de la licencia de
 * un contribuyente. Define un método para buscar la licencia y verificar su
 * vigencia.
 *
 * @author Gamaliel Armenta
 * @author Roberto García
 */
public interface IValidarLicenciaBO {

    /**
     * Busca la licencia del contribuyente y valida su vigencia.
     *
     * @return Un objeto LicenciaNuevaDTO si la licencia está vigente, lanzará
     * una excepción ValidacionDTOException si la licencia está vencida o no se
     * encontraron licencias asociadas.
     * @throws PersistenciaException si hay un error de persistencia al buscar
     * la licencia.
     * @throws ValidacionDTOException si la licencia está vencida o no se
     * encontraron licencias asociadas.
     */
    public LicenciaNuevaDTO validarLicencia() throws PersistenciaException, ValidacionDTOException;

    /**
     * Método para obtener las licencias asociadas a los trámites de un
     * contribuyente.
     *
     * @param tramites Lista de trámites del contribuyente.
     * @return Lista de licencias asociadas al contribuyente.
     */
    public List<Licencia> obtenerLicenciasDesdeTramites(List<Tramite> tramites);
}
