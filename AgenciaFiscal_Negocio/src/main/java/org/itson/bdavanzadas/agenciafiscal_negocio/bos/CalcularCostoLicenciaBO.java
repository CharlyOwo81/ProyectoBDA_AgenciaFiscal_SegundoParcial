package org.itson.bdavanzadas.agenciafiscal_negocio.bos;

import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.ContribuyenteDTO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.ContribuyenteDiscapacidad;

/**
 * Esta clase proporciona métodos para calcular el costo de una licencia de conducir basado en la duración y las características del contribuyente.
 * Los costos varían dependiendo de si el contribuyente tiene alguna discapacidad y la duración de la licencia.
 * 
 * @author Gamaliel Armenta
 * @author Roberto García
 */
public class CalcularCostoLicenciaBO implements ICalcularCostoLicenciaBO{

    private final ContribuyenteDTO contribuyenteDTO;

    /**
     * Construye un nuevo objeto CalcularCostoLicenciaBO con el ContribuyenteDTO proporcionado.
     * 
     * @param contribuyenteDTO El objeto ContribuyenteDTO que se utilizará para el cálculo del costo de la licencia.
     */
    public CalcularCostoLicenciaBO(ContribuyenteDTO contribuyenteDTO) {
        this.contribuyenteDTO = contribuyenteDTO;
    }

    /**
     * Calcula el costo de una licencia de conducir para la duración especificada en años.
     * 
     * @param anios La duración de la licencia en años.
     * @return El costo de la licencia calculado.
     */
    @Override
    public Float calcularCosto(int anios) {
        return switch (anios) {
            case 1 ->
                contribuyenteDTO.getDiscapacidad() == ContribuyenteDiscapacidad.NO ? 600F : 200F;
            case 2 ->
                contribuyenteDTO.getDiscapacidad() == ContribuyenteDiscapacidad.NO ? 900F : 500F;
            case 3 ->
                contribuyenteDTO.getDiscapacidad() == ContribuyenteDiscapacidad.NO ? 1100F : 700F;
            default ->
                null; // En caso de que la vigencia no sea 1, 2 o 3 años
        };
    }

}

