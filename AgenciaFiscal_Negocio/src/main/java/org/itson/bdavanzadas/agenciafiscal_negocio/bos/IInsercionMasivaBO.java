package org.itson.bdavanzadas.agenciafiscal_negocio.bos;

import java.util.List;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.ContribuyenteDTO;

/**
 *
 * @author Roberto García
 */
public interface IInsercionMasivaBO {

    public void insertar(List<ContribuyenteDTO> contribuyentesDTO);
}
