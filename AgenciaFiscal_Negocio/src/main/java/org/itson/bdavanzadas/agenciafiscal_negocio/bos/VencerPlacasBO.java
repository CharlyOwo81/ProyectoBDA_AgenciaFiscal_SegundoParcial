package org.itson.bdavanzadas.agenciafiscal_negocio.bos;

import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.AutomovilNuevoDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.ContribuyenteDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.PlacasViejasDTO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.daos.IPlacasDAO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.daos.PlacasDAO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Contribuyente;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Placa;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Vehiculo;
import org.itson.bdavanzadas.agenciafiscal_persistencia.excepciones.PersistenciaException;

/**
 * Esta clase se encarga de vencer las placas viejas de un vehículo. Recibe un
 * objeto de tipo PlacasViejasDTO que contiene la información de las placas
 * viejas y del vehículo asociado.
 *
 * @author Roberto García
 */
public class VencerPlacasBO implements IVencerPlacasBO {

    private final PlacasViejasDTO placasViejasDTO;

    /**
     * Constructor de la clase VencerPlacasBO.
     *
     * @param placasViejasDTO El objeto PlacasViejasDTO que contiene la
     * información de las placas viejas y del vehículo asociado.
     */
    public VencerPlacasBO(PlacasViejasDTO placasViejasDTO) {
        this.placasViejasDTO = placasViejasDTO;
    }

    /**
     * Vence las placas viejas del vehículo asociado.
     *
     * @return El objeto PlacasViejasDTO actualizado después de vencer las
     * placas.
     * @throws PersistenciaException Si hay un error al interactuar con la capa
     * de persistencia.
     */
    @Override
    public PlacasViejasDTO vencerPlacas() throws PersistenciaException {
        ContribuyenteDTO contribuyenteDTO = placasViejasDTO.getContribuyenteDTO();
        Contribuyente contribuyente = new Contribuyente(
                contribuyenteDTO.getId(),
                contribuyenteDTO.getRfc(),
                contribuyenteDTO.getNombre(),
                contribuyenteDTO.getApellidoPaterno(),
                contribuyenteDTO.getApellidoMaterno(),
                contribuyenteDTO.getTelefono(),
                contribuyenteDTO.getFechaNacimiento(),
                contribuyenteDTO.getDiscapacidad());
        AutomovilNuevoDTO automovilNuevoDTO = placasViejasDTO.getAutomovilNuevoDTO();
        Vehiculo vehiculo = new Vehiculo(
                automovilNuevoDTO.getId(),
                automovilNuevoDTO.getNumeroSerie(),
                automovilNuevoDTO.getMarca(),
                automovilNuevoDTO.getLinea(),
                automovilNuevoDTO.getColor(),
                automovilNuevoDTO.getModelo(),
                contribuyente);
        Placa placa = new Placa(
                placasViejasDTO.getNumeroPlacas(),
                vehiculo,
                placasViejasDTO.getCosto(),
                placasViejasDTO.getFechaEmision(),
                contribuyente);

        IPlacasDAO placasDAO = new PlacasDAO();
        placa = placasDAO.vencerPlaca(placa);
        placasViejasDTO.setFechaRecepcion(placa.getFechaEmision());
        return placasViejasDTO;
    }

}
