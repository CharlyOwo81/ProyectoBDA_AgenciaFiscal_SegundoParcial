package org.itson.bdavanzadas.agenciafiscal_negocio.bos;

import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.AutomovilNuevoDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.ContribuyenteDTO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.excepciones.PersistenciaException;

/**
 * Interfaz que define el contrato para la lógica de negocio de agregar un
 * automóvil. Define un método para agregar un nuevo automóvil asociado a un
 * contribuyente.
 *
 * @author Gamaliel Armenta
 * @author Roberto García
 */
public interface IAgregarAutomovilBO {

    /**
     * Agrega un nuevo automóvil asociado a un contribuyente.
     *
     * @param contribuyenteDTO El DTO que representa al contribuyente al que se
     * asociará el automóvil.
     * @return El DTO que representa el automóvil agregado.
     * @throws PersistenciaException Si ocurre un error al persistir el
     * automóvil en la base de datos.
     */
    public AutomovilNuevoDTO agregarAutomovil(ContribuyenteDTO contribuyenteDTO) throws PersistenciaException;
}
