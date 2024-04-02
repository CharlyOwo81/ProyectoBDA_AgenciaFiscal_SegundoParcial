package org.itson.bdavanzadas.agenciafiscal_negocio.bos;

import java.util.List;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.ContribuyenteDTO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.excepciones.PersistenciaException;

/**
 * Interfaz que define el método para buscar contribuyentes por año.
 *
 * Las clases que implementen esta interfaz deben proporcionar una
 * implementación del método buscarContribuyente, el cual busca contribuyentes
 * en la base de datos que hayan realizado trámites en el año proporcionado y
 * devuelve una lista de objetos ContribuyenteDTO que representan los
 * contribuyentes encontrados.
 *
 * @author Gamaliel Armenta
 * @author Roberto García
 */
public interface IBuscarPorAnio {

    /**
     * Método para buscar contribuyentes por año en la base de datos.
     *
     * @param anio El año para el cual se desea buscar contribuyentes.
     * @return Una lista de objetos ContribuyenteDTO que representan los
     * contribuyentes encontrados.
     * @throws PersistenciaException Si no existe ningún contribuyente con el
     * año indicado
     */
    public List<ContribuyenteDTO> buscarContribuyente(Integer anio) throws PersistenciaException;
}
