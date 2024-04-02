package org.itson.bdavanzadas.agenciafiscal_negocio.bos;

import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.AutomovilNuevoDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.PlacasNuevasDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.excepciones.ValidacionDTOException;
import org.itson.bdavanzadas.agenciafiscal_persistencia.daos.PlacasDAO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Placa;
import org.itson.bdavanzadas.agenciafiscal_persistencia.excepciones.PersistenciaException;

/**
 * Esta clase se encarga de validar el formato y la existencia de placas nuevas.
 * Recibe un objeto de tipo PlacasNuevasDTO que contiene la información de las
 * placas a validar. Lanza una excepción ValidacionDTOException si el formato de
 * las placas es inválido o si no se encuentran en la base de datos.
 *
 * @author Gamaliel Armenta
 * @author Roberto García
 */
public class ValidarPlacasBO implements IValidarPlacasBO {

    private PlacasNuevasDTO placasNuevasDTO;

    /**
     * Constructor de la clase ValidarPlacasBO.
     *
     * @param placasNuevasDTO El objeto PlacasNuevasDTO que contiene la
     * información de las placas a validar.
     */
    public ValidarPlacasBO(PlacasNuevasDTO placasNuevasDTO) {
        this.placasNuevasDTO = placasNuevasDTO;
    }

    /**
     * Valida el formato y la existencia de las placas.
     *
     * @return El objeto PlacasNuevasDTO si las placas son válidas y existen en
     * la base de datos.
     * @throws ValidacionDTOException si el formato de las placas es inválido o
     * si no se encuentran en la base de datos.
     * @throws PersistenciaException si hay un error al buscar las placas en la
     * base de datos.
     */
    @Override
    public PlacasNuevasDTO validarPlacas() throws ValidacionDTOException, PersistenciaException {
        String regex = "^[A-Z]{3}-\\d{3}$";

        if (!placasNuevasDTO.getNumeroPlacas().matches(regex)) {
            throw new ValidacionDTOException("Formato inválido. Las placas deben tener únicamente 7 cáracteres con el siguiente formato: 'AAA-111', es decir, tres letras mayúsculas seguidas de un guión y tres números");
        }

        PlacasDAO placasDAO = new PlacasDAO();
        Placa placa = new Placa(placasNuevasDTO.getNumeroPlacas(), null, null, null);
        placa = placasDAO.buscarPlacas(placa);
        AutomovilNuevoDTO automovilNuevoDTO = new AutomovilNuevoDTO(placa.getVehiculo().getId());
        placasNuevasDTO = new PlacasNuevasDTO(
                placa.getNumeroPlacas(),
                automovilNuevoDTO,
                placa.getCosto(),
                placa.getFechaEmision(),
                null);
        return placasNuevasDTO;
    }
}
