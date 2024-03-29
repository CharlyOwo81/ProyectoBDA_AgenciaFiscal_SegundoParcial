package org.itson.bdavanzadas.agenciafiscal_negocio.bos;

import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.PlacasNuevasDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.PlacasViejasDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.excepciones.ValidacionDTOException;
import org.itson.bdavanzadas.agenciafiscal_persistencia.daos.PlacasDAO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Placa;
import org.itson.bdavanzadas.agenciafiscal_persistencia.excepciones.PersistenciaException;

/**
 *
 * @author Roberto García
 */
public class ValidarPlacasBO implements IValidarPlacasBO{
    private final PlacasViejasDTO placasViejasDTO;

    public ValidarPlacasBO(PlacasViejasDTO placasViejasDTO) {
        this.placasViejasDTO = placasViejasDTO;
    }
    
    @Override
    public PlacasNuevasDTO validarPlacas() throws ValidacionDTOException, PersistenciaException{
        String regex = "^[A-Z]{3}-\\d{3}$";

        if (!placasViejasDTO.getNumeroPlacas().matches(regex)) {
            throw new ValidacionDTOException("Formato inválido. Las placas deben tener únicamente 7 cáracteres con el siguiente formato: 'AAA-111', es decir, tres letras mayúsculas seguidas de un guión y tres números");
        }
        
        PlacasDAO placasDAO = new PlacasDAO();
        Placa placa = new Placa(placasViejasDTO.getNumeroPlacas(), null, null, null);
        placa = placasDAO.buscarPlacas(placa);
        PlacasNuevasDTO placasNuevasDTO = new PlacasNuevasDTO(
                placa.getNumeroPlacas(), 
                placa.getCosto(), 
                placa.getFechaEmision(), 
                null);
        return placasNuevasDTO;
    }
}
