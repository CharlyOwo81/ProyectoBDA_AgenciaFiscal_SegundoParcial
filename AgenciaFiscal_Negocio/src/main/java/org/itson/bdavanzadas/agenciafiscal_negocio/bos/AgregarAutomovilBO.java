package org.itson.bdavanzadas.agenciafiscal_negocio.bos;

import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.AutomovilNuevoDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.ContribuyenteDTO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.daos.VehiculoDAO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Contribuyente;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.ContribuyenteDiscapacidad;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Vehiculo;

/**
 *
 * @author Roberto García
 */
public class AgregarAutomovilBO implements IAgregarAutomovilBO {

    private final AutomovilNuevoDTO automovilNuevoDTO;

    public AgregarAutomovilBO(AutomovilNuevoDTO automovilNuevoDTO) {
        this.automovilNuevoDTO = automovilNuevoDTO;
    }

    @Override
    public AutomovilNuevoDTO agregarAutomovil(ContribuyenteDTO contribuyenteDTO) {
        VehiculoDAO vehiculoDAO = new VehiculoDAO();
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
        Vehiculo vehiculoConId = vehiculoDAO.agregarVehiculo(vehiculo);
        automovilNuevoDTO.setId(vehiculoConId.getId());
        return automovilNuevoDTO;
    }
}
