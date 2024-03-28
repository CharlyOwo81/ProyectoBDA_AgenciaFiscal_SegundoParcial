package org.itson.bdavanzadas.agenciafiscal_persistencia.daos;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Placa;
import org.itson.bdavanzadas.agenciafiscal_persistencia.excepciones.PersistenciaException;

/**
 *
 * @author Roberto García
 */
public class PlacasDAO {

    private final IConexion conexion;

    /**
     * Constructor de la clase PlacasDAO.
     *
     */
    public PlacasDAO() {
        this.conexion = new Conexion();
    }

    public void registrarPlacas(Placa placa) throws PersistenciaException {
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
}
