package org.itson.bdavanzadas.agenciafiscal_negocio.bos;

import java.util.List;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.ContribuyenteDTO;

/**
 * Esta interfaz define el contrato para la inserción masiva de contribuyentes
 * en el sistema. Proporciona un método para insertar una lista de
 * contribuyentes representados como objetos DTO en el sistema.
 *
 * @author Gamaliel Armenta
 * @author Roberto García
 */
public interface IInsercionMasivaBO {

    /**
     * Inserta una lista masiva de contribuyentes en el sistema.
     *
     * @param contribuyentesDTO La lista de contribuyentes en forma de objetos
     * DTO que se insertarán.
     * @throws Exception Si los contribuyentes ya han sido ingresados a la base
     * de datos, se usa Exception general ya que es la única que nos permite
     * manejar la excepcion de DatabaseException de eclipse.
     */
    public void insertar(List<ContribuyenteDTO> contribuyentesDTO) throws Exception;
}
