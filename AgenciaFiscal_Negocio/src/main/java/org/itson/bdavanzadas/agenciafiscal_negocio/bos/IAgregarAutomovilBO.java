package org.itson.bdavanzadas.agenciafiscal_negocio.bos;

import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.AutomovilNuevoDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.ContribuyenteDTO;

/**
 *
 * @author Roberto García
 */
public interface IAgregarAutomovilBO {

    public AutomovilNuevoDTO agregarAutomovil(ContribuyenteDTO contribuyenteDTO);
}
