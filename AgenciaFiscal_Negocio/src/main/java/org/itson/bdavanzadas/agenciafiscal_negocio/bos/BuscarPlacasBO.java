package org.itson.bdavanzadas.agenciafiscal_negocio.bos;

import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.AutomovilNuevoDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.ContribuyenteDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.PlacasViejasDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.PlacasViejasDTO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.daos.PlacasDAO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Placa;
import org.itson.bdavanzadas.agenciafiscal_persistencia.excepciones.PersistenciaException;

/**
 *
 * @author Roberto García
 */
public class BuscarPlacasBO implements IBuscarPlacasBO{
    private PlacasViejasDTO placasViejasDTO;

    public BuscarPlacasBO(PlacasViejasDTO placasViejasDTO) {
        this.placasViejasDTO = placasViejasDTO;
    }
    
    @Override
    public PlacasViejasDTO buscarPlacas() throws PersistenciaException{
        PlacasDAO placasDAO = new PlacasDAO();
        Placa placa = new Placa(placasViejasDTO.getNumeroPlacas(), null, null, null);
        placa = placasDAO.buscarPlacas(placa);
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
