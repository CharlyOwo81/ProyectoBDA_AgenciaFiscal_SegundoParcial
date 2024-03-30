package org.itson.bdavanzadas.agenciafiscal_negocio.bos;

import java.util.ArrayList;
import java.util.List;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.AutomovilNuevoDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.ContribuyenteDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.PlacasNuevasDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.excepciones.ValidacionDTOException;
import org.itson.bdavanzadas.agenciafiscal_persistencia.daos.ITramiteDAO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.daos.TramiteDAO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.daos.VehiculoDAO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Contribuyente;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Placa;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Tramite;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Vehiculo;
import org.itson.bdavanzadas.agenciafiscal_persistencia.excepciones.PersistenciaException;

/**
 *
 * @author Roberto García
 */
public class BuscarAutomovilBO implements IBuscarAutomovilBO {

    private AutomovilNuevoDTO automovilNuevoDTO;

    public BuscarAutomovilBO(AutomovilNuevoDTO automovilNuevoDTO) {
        this.automovilNuevoDTO = automovilNuevoDTO;
    }

    @Override
    public AutomovilNuevoDTO buscarAutomovil(ContribuyenteDTO contribuyenteDTO, PlacasNuevasDTO placasNuevasDTO) throws ValidacionDTOException, PersistenciaException {
        ITramiteDAO tramiteDAO = new TramiteDAO();
        Contribuyente contribuyente = new Contribuyente(contribuyenteDTO.getId());
        List<Tramite> tramites = tramiteDAO.buscarTramitesPorContribuyente(contribuyente);
        List<Placa> placas = obtenerPlacasDesdeTramites(tramites);
        if (placas.isEmpty()) {
            throw new ValidacionDTOException("El contribuyente no tiene placas asociadas");
        }
        Placa placa = null;
        
        //busca si en la lista de placas del contribuyente, una de ellas coincide con la proprocionada
        for (Placa placa1 : placas) {
            if (placa1.getNumeroPlacas().equalsIgnoreCase(placasNuevasDTO.getNumeroPlacas())) {
                placa = new Placa(
                        placa1.getNumeroPlacas(),
                        placa1.getVehiculo(),
                        placa1.getCosto(), 
                        placa1.getFechaEmision(),
                        placa1.getContribuyente()
                );
                break;
            }
        }
        //si no es el caso, lanza excepcion y se termina el método
        if (placa == null) {
            throw new ValidacionDTOException("El contribuyente no cuenta con ese número de placas");
        }
        VehiculoDAO vehiculoDAO = new VehiculoDAO();
        Vehiculo vehiculo = new Vehiculo(automovilNuevoDTO.getId());
        List<Vehiculo> vehiculos = vehiculoDAO.buscarVehiculo(vehiculo, contribuyente);
        
        //compara si un vehiculo de la lista del contribuyente es igual a uno con el número de placas
        for (Vehiculo vehiculo1 : vehiculos) {
            if (vehiculo1.equals(placa.getVehiculo())) {
                vehiculo = vehiculo1;
            }
        }
        //si no existe igual se acaba el método
        if (vehiculo.getMarca() == null) {
            throw new ValidacionDTOException("El contribuyente no tiene un\nautomóvil con ese número de placas");
        }
        //si todo sale bien, regresa un DTO con los datos del vehículo encontrado
        automovilNuevoDTO = new AutomovilNuevoDTO(
                vehiculo.getId(),
                vehiculo.getNumeroSerie(),
                vehiculo.getMarca(),
                vehiculo.getLinea(),
                vehiculo.getColor(),
                vehiculo.getModelo());

        return automovilNuevoDTO;
    }

    private List<Placa> obtenerPlacasDesdeTramites(List<Tramite> tramites) {
        List<Placa> placas = new ArrayList<>();
        for (Tramite tramite : tramites) {
            if (tramite instanceof Placa) {
                placas.add((Placa) tramite);
            }
        }
        return placas;
    }
}
