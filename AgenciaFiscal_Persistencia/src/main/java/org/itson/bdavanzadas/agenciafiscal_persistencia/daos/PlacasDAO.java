package org.itson.bdavanzadas.agenciafiscal_persistencia.daos;

import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Placa;
import org.itson.bdavanzadas.agenciafiscal_persistencia.excepciones.PersistenciaException;

/**
 * Clase que implementa la interfaz IPlacasDAO y proporciona funcionalidades
 * para registrar, buscar y gestionar placas en la base de datos.
 *
 * @author Gamaliel Armenta
 * @author Roberto García
 */
public class PlacasDAO implements IPlacasDAO {

    private final IConexion conexion;

    /**
     * Constructor de la clase PlacasDAO. Crea una nueva instancia de PlacasDAO
     * y establece la conexión a la base de datos.
     */
    public PlacasDAO() {
        this.conexion = new Conexion();
    }

    /**
     * Registra las placas en la base de datos.
     *
     * @param placa La placa a registrar.
     * @throws Exception Si las placas ya están registradas
     */
    @Override
    public void registrarPlacas(Placa placa) throws Exception {
        EntityManager eManager = conexion.crearConexion();

        // Iniciar una transacción
        eManager.getTransaction().begin();

        // Persistir la licencia en la base de datos
        eManager.persist(placa);

        // Confirmar la transacción
        eManager.getTransaction().commit();

        // Cerrar la conexión
        eManager.close();
    }

    /**
     * Busca las placas en la base de datos por su número de placas.
     *
     * @param placa La placa a buscar.
     * @return La placa encontrada.
     * @throws PersistenciaException Si no se encuentra ninguna placa con el
     * número proporcionado.
     */
    @Override
    public Placa buscarPlacas(Placa placa) throws PersistenciaException {
        EntityManager entityManager = conexion.crearConexion();

        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();

        CriteriaQuery<Placa> criteriaQuery = criteriaBuilder.createQuery(Placa.class);

        Root<Placa> root = criteriaQuery.from(Placa.class);

        criteriaQuery.select(root).where(criteriaBuilder.equal(root.get("numeroPlacas"), placa.getNumeroPlacas()));
        // Consulta construida
        TypedQuery<Placa> query = entityManager.createQuery(criteriaQuery);
        // Obtener el resultado de la consulta
        List<Placa> placas = query.getResultList();

        entityManager.close();

        if (placas.isEmpty()) {
            throw new PersistenciaException("No se encontraron ningunas placas con el número proporcionado");
        } else {
            placa = placas.getFirst();
            return placa;
        }
    }

    /**
     * Busca las placas vigentes en la base de datos por su número de placas.
     *
     * @param placa La placa a buscar.
     * @return La placa vigente encontrada.
     * @throws PersistenciaException Si no se encuentra ninguna placa vigente
     * con el número proporcionado.
     */
    @Override
    public Placa buscarPlacasVigentes(Placa placa) throws PersistenciaException {
        EntityManager entityManager = conexion.crearConexion();

        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();

        CriteriaQuery<Placa> criteriaQuery = criteriaBuilder.createQuery(Placa.class);

        Root<Placa> root = criteriaQuery.from(Placa.class);

        criteriaQuery.select(root)
                .where(
                        criteriaBuilder.and(
                                criteriaBuilder.equal(root.get("numeroPlacas"), placa.getNumeroPlacas()),
                                criteriaBuilder.isNull(root.get("fechaRecepcion"))
                        )
                );
        // Consulta construida
        TypedQuery<Placa> query = entityManager.createQuery(criteriaQuery);
        // Obtener el resultado de la consulta
        List<Placa> placas = query.getResultList();

        entityManager.close();

        if (placas.isEmpty()) {
            throw new PersistenciaException("No se encontraron ningunas placas\nvigentes con el número proporcionado");
        } else {
            placa = placas.getFirst();
            return placa;
        }
    }

    /**
     * Busca placas duplicadas en la base de datos por su número de placas.
     *
     * @param placa La placa a buscar.
     * @return La placa duplicada encontrada.
     */
    @Override
    public Placa buscarPlacasDuplicadas(Placa placa) {
        EntityManager entityManager = conexion.crearConexion();

        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();

        CriteriaQuery<Placa> criteriaQuery = criteriaBuilder.createQuery(Placa.class);

        Root<Placa> root = criteriaQuery.from(Placa.class);

        criteriaQuery.select(root).where(criteriaBuilder.equal(root.get("numeroPlacas"), placa.getNumeroPlacas()));
        // Consulta construida
        TypedQuery<Placa> query = entityManager.createQuery(criteriaQuery);
        // Obtener el resultado de la consulta
        List<Placa> placas = query.getResultList();

        entityManager.close();

        if (!placas.isEmpty()) {
            return placas.getFirst();
        } else {
            return null; // No se encontraron placas duplicadas
        }

    }

    /**
     * Vence las placas en la base de datos asignandole una fecha de recepción.
     *
     * @param placa La placa a vencer.
     * @return La placa vencida.
     * @throws PersistenciaException Si ocurre algún error inesperado.
     */
    @Override
    public Placa vencerPlaca(Placa placa) throws PersistenciaException {
        EntityManager eManager = conexion.crearConexion();

        placa = buscarPlacasDuplicadas(placa);

        // Iniciar una transacción
        eManager.getTransaction().begin();

        placa = eManager.find(Placa.class, placa.getId());

        placa.setFechaRecepcion(new Date());

        // Confirmar la transacción
        eManager.getTransaction().commit();

        // Cerrar la conexión
        eManager.close();

        return placa;
    }
}
