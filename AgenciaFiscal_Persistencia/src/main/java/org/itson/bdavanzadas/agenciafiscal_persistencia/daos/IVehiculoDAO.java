package org.itson.bdavanzadas.agenciafiscal_persistencia.daos;

import java.util.List;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Contribuyente;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Vehiculo;
import org.itson.bdavanzadas.agenciafiscal_persistencia.excepciones.PersistenciaException;

/**
 *
 * @author gamaliel
 */
public interface IVehiculoDAO {
    public Vehiculo agregarVehiculo(Vehiculo vehiculoNuevo) throws Exception;
    public List<Vehiculo> buscarVehiculo(Vehiculo vehiculo, Contribuyente contribuyente) throws PersistenciaException;
}
