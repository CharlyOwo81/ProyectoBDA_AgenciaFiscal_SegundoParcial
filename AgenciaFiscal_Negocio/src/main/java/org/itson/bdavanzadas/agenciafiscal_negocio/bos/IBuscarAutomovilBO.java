package org.itson.bdavanzadas.agenciafiscal_negocio.bos;

import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.AutomovilNuevoDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.ContribuyenteDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.PlacasViejasDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.excepciones.ValidacionDTOException;
import org.itson.bdavanzadas.agenciafiscal_persistencia.excepciones.PersistenciaException;

/**
 * Interfaz que define el contrato para buscar un automóvil asociado a un
 * contribuyente a partir de un número de placas.
 *
 * La implementación de esta interfaz debe proporcionar un método para realizar
 * la búsqueda del automóvil a partir de los datos del contribuyente y las
 * placas del vehículo.

 * @author Gamaliel Armenta
 * @author Roberto García
 */
public interface IBuscarAutomovilBO {

    /**
     * Método para buscar un automóvil asociado a un contribuyente a partir de
     * un número de placas.
     *
     * @param contribuyenteDTO El DTO que representa al contribuyente asociado
     * al automóvil.
     * @param placasViejasDTO El DTO que representa las placas del automóvil a
     * buscar.
     * @return El DTO que representa al automóvil encontrado.
     * @throws ValidacionDTOException Si no se encuentra el número de placas
     * proporcionado o si no se encuentra un automóvil asociado a ese número de
     * placas.
     * @throws PersistenciaException Si ocurre un error al realizar la búsqueda
     * en la base de datos.
     */
    public AutomovilNuevoDTO buscarAutomovil(ContribuyenteDTO contribuyenteDTO, PlacasViejasDTO placasViejasDTO) throws ValidacionDTOException, PersistenciaException;

}
