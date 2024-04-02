package org.itson.bdavanzadas.agenciafiscal_persistencia.daos;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Contribuyente;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Vehiculo;
import org.itson.bdavanzadas.agenciafiscal_persistencia.excepciones.PersistenciaException;

/**
 * Clase que implementa la interfaz IVehiculoDAO y proporciona funcionalidades
 * para agregar y buscar vehículos en la base de datos.
 *
 * Esta clase se encarga de persistir nuevos vehículos en la base de datos y de
 * buscar vehículos asociados a un contribuyente.
 *
 * @author Gamaliel Armenta
 * @author Roberto García
 */
public class VehiculoDAO implements IVehiculoDAO {

    private final IConexion conexion;

    /**
     * Constructor de la clase VehiculoDAO.
     *
     * Crea una nueva instancia de VehiculoDAO y establece la conexión a la base
     * de datos.
     */
    public VehiculoDAO() {
        this.conexion = new Conexion();
    }

    /**
     * Agrega un nuevo vehículo a la base de datos.
     *
     * @param vehiculo El vehículo a agregar.
     * @return El vehículo agregado.
     * @throws Exception Si un vehículo con el mismo número de serie ya se
     * encuentra en la base de datos
     */
    @Override
    public Vehiculo agregarVehiculo(Vehiculo vehiculo) throws Exception {
        EntityManager eManager = conexion.crearConexion();

        eManager.getTransaction().begin();

        eManager.persist(vehiculo);

        eManager.getTransaction().commit();

        eManager.close();

        return vehiculo;
    }

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
    @Override

    public List<Vehiculo> buscarVehiculo(Vehiculo vehiculo, Contribuyente contribuyente) throws PersistenciaException {
        EntityManager entityManager = this.conexion.crearConexion();
        // Objeto constructor de consultas
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        // Objeto consulta que se está construyendo
        CriteriaQuery<Vehiculo> criteria = cb.createQuery(Vehiculo.class);

        Root<Vehiculo> root = criteria.from(Vehiculo.class);

        // Filtrar por id igual al parámetro proporcionado
        criteria.select(root).where(cb.equal(root.get("contribuyente").get("id"), contribuyente.getId()));

        // Consulta construida
        TypedQuery<Vehiculo> query = entityManager.createQuery(criteria);

        // Obtener el resultado de la consulta
        List<Vehiculo> vehiculos = query.getResultList();

        entityManager.close();

        // Verificar si se encontró
        if (vehiculos.isEmpty()) {
            throw new PersistenciaException("El contribuyente no tiene un ningun automóvil registrado");
        } else {
            return vehiculos; // Devolver el primer vehiculo
        }
    }

}
