package org.itson.bdavanzadas.agenciafiscal_negocio.bos;

import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.ContribuyenteDTO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.ContribuyenteDiscapacidad;

/**
 *
 * @author Roberto García
 */
public class CalcularCostoLicenciaBO {

    ContribuyenteDTO contribuyenteDTO;

    public CalcularCostoLicenciaBO(ContribuyenteDTO contribuyenteDTO) {
        this.contribuyenteDTO = contribuyenteDTO;
    }

    public Float calcularCosto(int anios) {
    return switch (anios) {
        case 1 -> contribuyenteDTO.getDiscapacidad() == ContribuyenteDiscapacidad.NO ? 600F : 200F;
        case 2 -> contribuyenteDTO.getDiscapacidad() == ContribuyenteDiscapacidad.NO ? 900F : 500F;
        case 3 -> contribuyenteDTO.getDiscapacidad() == ContribuyenteDiscapacidad.NO ? 1100F : 700F;
        default -> null; // En caso de que la vigencia no sea 1, 2 o 3 años
    };
}

}
