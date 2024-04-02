package org.itson.bdavanzadas.agenciafiscal_negocio.bos;

import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.AutomovilNuevoDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.ContribuyenteDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.PlacasViejasDTO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.daos.PlacasDAO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Placa;
import org.itson.bdavanzadas.agenciafiscal_persistencia.excepciones.PersistenciaException;

/**
 * Clase que implementa la interfaz IBuscarPlacasBO para buscar placas vigentes
 * en la base de datos.
 *
 * @author Gamaliel Armenta
 * @author Roberto García
 */
public class BuscarPlacasBO implements IBuscarPlacasBO {

    private PlacasViejasDTO placasViejasDTO;

    /**
     * Constructor de la clase BuscarPlacasBO.
     *
     * @param placasViejasDTO El DTO que contiene el número de placas a buscar.
     */
    public BuscarPlacasBO(PlacasViejasDTO placasViejasDTO) {
        this.placasViejasDTO = placasViejasDTO;
    }

    /**
     * Método para buscar placas vigentes en la base de datos.
     *
     * @return El DTO que representa las placas vigentes encontradas.
     * @throws PersistenciaException Si no se encuentra ninguna placa vigente
     * asociada al número de placas proporcionado.
     */
    @Override
    public PlacasViejasDTO buscarPlacas() throws PersistenciaException {
        PlacasDAO placasDAO = new PlacasDAO();
        Placa placa = new Placa(placasViejasDTO.getNumeroPlacas(), null, null, null);
        placa = placasDAO.buscarPlacasVigentes(placa);
        AutomovilNuevoDTO automovilNuevoDTO = new AutomovilNuevoDTO(placa.getVehiculo().getId());
        ContribuyenteDTO contribuyenteDTO = new ContribuyenteDTO(placa.getContribuyente().getId());
        placasViejasDTO = new PlacasViejasDTO(
                placa.getNumeroPlacas(),
                automovilNuevoDTO,
                placa.getCosto(),
                placa.getFechaEmision(),
                contribuyenteDTO);
        return placasViejasDTO;
    }
}
