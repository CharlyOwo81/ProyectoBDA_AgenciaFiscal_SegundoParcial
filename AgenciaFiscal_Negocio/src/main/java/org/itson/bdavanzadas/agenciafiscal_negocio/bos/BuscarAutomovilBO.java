package org.itson.bdavanzadas.agenciafiscal_negocio.bos;

import java.util.ArrayList;
import java.util.List;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.AutomovilNuevoDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.ContribuyenteDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.PlacasViejasDTO;
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
 * Clase que implementa la interfaz IBuscarAutomovilBO para buscar un automóvil
 * asociado a un contribuyente a partir de un número de placas.
 *
 * La búsqueda se realiza consultando los trámites asociados al contribuyente
 * para obtener las placas registradas. Luego se busca la placa proporcionada en
 * la lista de placas obtenida y se recupera el vehículo asociado a esa placa.
 * Si se encuentra un vehículo asociado a la placa proporcionada, se crea un DTO
 * con los datos del vehículo y se retorna.
 *
 * Si no se encuentra la placa o no se encuentra un vehículo asociado a la
 * placa, se lanzan excepciones correspondientes.
 *
 * @author Gamaliel Armenta
 * @author Roberto García
 */
public class BuscarAutomovilBO implements IBuscarAutomovilBO {

    private AutomovilNuevoDTO automovilNuevoDTO;

    /**
     * Constructor de la clase BuscarAutomovilBO.
     *
     * @param automovilNuevoDTO El DTO que representa al automóvil buscado.
     */
    public BuscarAutomovilBO(AutomovilNuevoDTO automovilNuevoDTO) {
        this.automovilNuevoDTO = automovilNuevoDTO;
    }

    /**
     * Método que busca un automóvil asociado a un contribuyente a partir de un
     * número de placas.
     *
     * @param contribuyenteDTO El DTO que representa al contribuyente asociado
     * al automóvil.
     * @param placasViejasDTO El DTO que representa las placas del automóvil a
     * buscar.
     * @return El DTO que representa al automóvil encontrado.
     * @throws ValidacionDTOException Si no se encuentra el número de placas
     * proporcionado o si no se encuentra un automóvil asociado a ese número de
     * placas.
     * @throws PersistenciaException Si ocurre un error al realizar la búsqueda
     * en la base de datos.
     */
    @Override
    public AutomovilNuevoDTO buscarAutomovil(ContribuyenteDTO contribuyenteDTO, PlacasViejasDTO placasViejasDTO) throws ValidacionDTOException, PersistenciaException {
        ITramiteDAO tramiteDAO = new TramiteDAO();
        Contribuyente contribuyente = new Contribuyente(contribuyenteDTO.getId());
        List<Tramite> tramites = tramiteDAO.buscarTramitesPorContribuyente(contribuyente);
        List<Placa> placas = obtenerPlacasDesdeTramites(tramites);
        if (placas.isEmpty()) {
            throw new ValidacionDTOException("El contribuyente no tiene placas asociadas");
        }
        Placa placa = null;

        // Busca si en la lista de placas del contribuyente, una de ellas coincide con la proporcionada
        for (Placa placa1 : placas) {
            if (placa1.getNumeroPlacas().equalsIgnoreCase(placasViejasDTO.getNumeroPlacas())) {
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
        // Si no se encuentra la placa, se lanza una excepción
        if (placa == null) {
            throw new ValidacionDTOException("El contribuyente no cuenta con ese número de placas");
        }
        VehiculoDAO vehiculoDAO = new VehiculoDAO();
        Vehiculo vehiculo = new Vehiculo(automovilNuevoDTO.getId());
        List<Vehiculo> vehiculos = vehiculoDAO.buscarVehiculo(vehiculo, contribuyente);

        // Compara si un vehículo de la lista del contribuyente es igual a uno con el número de placas
        for (Vehiculo vehiculo1 : vehiculos) {
            if (vehiculo1.equals(placa.getVehiculo())) {
                vehiculo = vehiculo1;
            }
        }
        // Si el vehículo asociado a la placa proporcionada no le corresponde al contribuyente, se lanza una excepción
        if (vehiculo.getMarca() == null) {
            throw new ValidacionDTOException("El contribuyente no tiene un\nautomóvil con ese número de placas");
        }
        // Si todo sale bien, se crea un DTO con los datos del vehículo encontrado y se retorna
        automovilNuevoDTO = new AutomovilNuevoDTO(
                vehiculo.getId(),
                vehiculo.getNumeroSerie(),
                vehiculo.getMarca(),
                vehiculo.getLinea(),
                vehiculo.getColor(),
                vehiculo.getModelo());

        return automovilNuevoDTO;
    }

    /**
     * Método que obtiene las placas asociadas a los trámites de un
     * contribuyente.
     *
     * @param tramites La lista de trámites asociados al contribuyente.
     * @return Una lista de objetos Placa que representan las placas asociadas a
     * los trámites del contribuyente.
     */
    private List<Placa> obtenerPlacasDesdeTramites(List<Tramite> tramites) {
        List<Placa> placas = new ArrayList<>();
        for (Tramite tramite : tramites) {
            if (tramite instanceof Placa placa) {
                placas.add(placa);
            }
        }
        return placas;
    }
}
