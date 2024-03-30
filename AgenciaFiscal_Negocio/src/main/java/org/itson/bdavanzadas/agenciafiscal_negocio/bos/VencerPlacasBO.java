package org.itson.bdavanzadas.agenciafiscal_negocio.bos;

import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.AutomovilNuevoDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.ContribuyenteDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.PlacasNuevasDTO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.daos.IPlacasDAO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.daos.PlacasDAO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Contribuyente;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Placa;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Vehiculo;
import org.itson.bdavanzadas.agenciafiscal_persistencia.excepciones.PersistenciaException;

/**
 *
 * @author Roberto García
 */
public class VencerPlacasBO implements IVencerPlacasBO {

    private PlacasNuevasDTO placasNuevasDTO;

    public VencerPlacasBO(PlacasNuevasDTO placasNuevasDTO) {
        this.placasNuevasDTO = placasNuevasDTO;
    }

    @Override
    public PlacasNuevasDTO vencerPlacas() throws PersistenciaException {
        ContribuyenteDTO contribuyenteDTO = placasNuevasDTO.getContribuyenteDTO();
        Contribuyente contribuyente = new Contribuyente(
                contribuyenteDTO.getId(),
                contribuyenteDTO.getRfc(),
                contribuyenteDTO.getNombre(),
                contribuyenteDTO.getApellidoPaterno(),
                contribuyenteDTO.getApellidoMaterno(),
                contribuyenteDTO.getTelefono(),
                contribuyenteDTO.getFechaNacimiento(),
                contribuyenteDTO.getDiscapacidad());
        AutomovilNuevoDTO automovilNuevoDTO = placasNuevasDTO.getAutomovilNuevoDTO();
        Vehiculo vehiculo = new Vehiculo(
                automovilNuevoDTO.getId(),
                automovilNuevoDTO.getNumeroSerie(),
                automovilNuevoDTO.getMarca(),
                automovilNuevoDTO.getLinea(),
                automovilNuevoDTO.getColor(),
                automovilNuevoDTO.getModelo(),
                contribuyente);
        Placa placa = new Placa(
                placasNuevasDTO.getNumeroPlacas(),
                vehiculo,
                placasNuevasDTO.getCosto(),
                placasNuevasDTO.getFechaEmision(),
                contribuyente);

        IPlacasDAO placasDAO = new PlacasDAO();
        placa = placasDAO.vencerPlaca(placa);
        placasNuevasDTO.setFechaRecepcion(placa.getFechaEmision());
        return placasNuevasDTO;
    }

}
