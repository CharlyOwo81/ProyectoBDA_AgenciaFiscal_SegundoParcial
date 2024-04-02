package org.itson.bdavanzadas.agenciafiscal_negocio.bos;

import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.AutomovilNuevoDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.ContribuyenteDTO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.daos.IVehiculoDAO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.daos.VehiculoDAO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Contribuyente;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Vehiculo;
import org.itson.bdavanzadas.agenciafiscal_persistencia.excepciones.PersistenciaException;

/**
 * Implementación de la interfaz IAgregarAutomovilBO que permite agregar un
 * nuevo automóvil. Esta clase encapsula la lógica de negocio para agregar un
 * automóvil asociado a un contribuyente.
 *
 * @author Gamaliel Armenta
 * @author Roberto García
 */
public class AgregarAutomovilBO implements IAgregarAutomovilBO {

    private final AutomovilNuevoDTO automovilNuevoDTO;

    /**
     * Constructor de la clase AgregarAutomovilBO.
     *
     * @param automovilNuevoDTO El DTO que representa el automóvil a agregar.
     */
    public AgregarAutomovilBO(AutomovilNuevoDTO automovilNuevoDTO) {
        this.automovilNuevoDTO = automovilNuevoDTO;
    }

    /**
     * Agrega un nuevo automóvil asociado a un contribuyente.
     *
     * @param contribuyenteDTO El DTO que representa al contribuyente al que se
     * asociará el automóvil.
     * @return El DTO que representa el automóvil agregado.
     * @throws PersistenciaException Si ocurre un error al persistir el
     * automóvil en la base de datos.
     */
    @Override
    public AutomovilNuevoDTO agregarAutomovil(ContribuyenteDTO contribuyenteDTO) throws PersistenciaException {
        IVehiculoDAO vehiculoDAO = new VehiculoDAO();
        Contribuyente contribuyente = new Contribuyente(
                contribuyenteDTO.getId(),
                contribuyenteDTO.getRfc(),
                contribuyenteDTO.getNombre(),
                contribuyenteDTO.getApellidoPaterno(),
                contribuyenteDTO.getApellidoMaterno(),
                contribuyenteDTO.getTelefono(),
                contribuyenteDTO.getFechaNacimiento(),
                contribuyenteDTO.getDiscapacidad());
        Vehiculo vehiculo = new Vehiculo(
                automovilNuevoDTO.getNumeroSerie(),
                automovilNuevoDTO.getMarca(),
                automovilNuevoDTO.getLinea(),
                automovilNuevoDTO.getColor(),
                automovilNuevoDTO.getModelo(),
                contribuyente);
        try {
            Vehiculo vehiculoConId = vehiculoDAO.agregarVehiculo(vehiculo);
            automovilNuevoDTO.setId(vehiculoConId.getId());
            return automovilNuevoDTO;
        } catch (Exception e) {
            throw new PersistenciaException("El número de serie del automóvil\nya se encentra registrado");
        }
    }
}
