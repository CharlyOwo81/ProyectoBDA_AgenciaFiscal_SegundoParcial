package org.itson.bdavanzadas.agenciafiscal_negocio.bos;

import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.ContribuyenteDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.excepciones.ValidacionDTOException;
import org.itson.bdavanzadas.agenciafiscal_persistencia.excepciones.PersistenciaException;

/**
 * Esta interfaz define los métodos para buscar un contribuyente por RFC y
 * validar el RFC. Los implementadores de esta interfaz deben proporcionar
 * lógica para buscar un contribuyente por su RFC y validar la estructura del
 * RFC.
 *
 * @author Roberto García
 */
public interface IBuscarPorRfcBO {

    /**
     * Busca un contribuyente por su RFC y devuelve un objeto ContribuyenteDTO
     * si se encuentra.
     *
     * @return Un objeto ContribuyenteDTO que representa al contribuyente
     * encontrado.
     * @throws ValidacionDTOException si ocurre algún problema de validación en
     * el RFC.
     * @throws PersistenciaException si ocurre algún problema durante la
     * búsqueda en la capa de persistencia.
     */
    public ContribuyenteDTO buscarContribuyente() throws ValidacionDTOException, PersistenciaException;

    /**
     * Valida la estructura del RFC.
     *
     * @return true si el RFC es válido, false en caso contrario.
     * @throws ValidacionDTOException si el RFC no cumple con la estructura
     * requerida.
     */
    public boolean validarRfc() throws ValidacionDTOException;
}
