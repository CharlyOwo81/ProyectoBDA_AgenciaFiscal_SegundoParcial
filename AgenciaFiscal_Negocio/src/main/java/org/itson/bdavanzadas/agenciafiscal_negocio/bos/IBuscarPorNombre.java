package org.itson.bdavanzadas.agenciafiscal_negocio.bos;

import java.util.List;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.ContribuyenteDTO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.excepciones.PersistenciaException;

/**
 * Interfaz que define el método para buscar contribuyentes por nombre.
 *
 * Esta interfaz proporciona un método para buscar contribuyentes en la base de
 * datos que coincidan con el nombre proporcionado.
 *
 * @author Gamaliel Armenta
 * @author Roberto García
 */
public interface IBuscarPorNombre {

    /**
     * Método para buscar contribuyentes por nombre en la base de datos.
     *
     * @param contribuyenteDTO Objeto ContribuyenteDTO que contiene el nombre
     * del contribuyente a buscar.
     * @return Una lista de objetos ContribuyenteDTO que representan los
     * contribuyentes encontrados.
     * @throws PersistenciaException Si no existe ningún contribuyente con el
     * nombre específicado.
     */
    public List<ContribuyenteDTO> buscarContribuyente(ContribuyenteDTO contribuyenteDTO) throws PersistenciaException;
}
