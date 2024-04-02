package org.itson.bdavanzadas.agenciafiscal_persistencia.daos;

import java.util.List;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Contribuyente;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Vehiculo;
import org.itson.bdavanzadas.agenciafiscal_persistencia.excepciones.PersistenciaException;

/**
 * Interfaz que define los métodos para agregar y buscar vehículos en la base de
 * datos. Las implementaciones de esta interfaz proporcionan funcionalidades
 * para agregar vehículos y buscar vehículos asociados a un contribuyente.
 *
 * Esta interfaz define dos operaciones básicas: agregar un nuevo vehículo a la
 * base de datos y buscar los vehículos asociados a un contribuyente específico.
 *
 * @author Gamaliel Armenta
 * @author Roberto García
 */
public interface IVehiculoDAO {

    /**
     * Agrega un nuevo vehículo a la base de datos.
     *
     * @param vehiculoNuevo El vehículo a agregar.
     * @return El vehículo agregado.
     * @throws Exception Si un vehículo con el mismo número de serie ya se
     * encuentra en la base de datos
     */
    public Vehiculo agregarVehiculo(Vehiculo vehiculoNuevo) throws Exception;

    /**
     * Busca los vehículos asociados a un contribuyente en la base de datos.
     *
     * @param vehiculo El vehículo con los datos a buscar.
     * @param contribuyente El contribuyente del cual se desean buscar los
     * vehículos.
     * @return Una lista de vehículos asociados al contribuyente.
     * @throws PersistenciaException Si no se encuentran vehículos asociados al
     * contribuyente.
     */
    public List<Vehiculo> buscarVehiculo(Vehiculo vehiculo, Contribuyente contribuyente) throws PersistenciaException;
}
