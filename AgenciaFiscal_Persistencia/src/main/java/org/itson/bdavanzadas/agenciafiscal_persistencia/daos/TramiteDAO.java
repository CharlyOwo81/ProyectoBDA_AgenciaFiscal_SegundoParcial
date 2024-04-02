package org.itson.bdavanzadas.agenciafiscal_persistencia.daos;

import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Contribuyente;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Tramite;
import org.itson.bdavanzadas.agenciafiscal_persistencia.excepciones.PersistenciaException;

/**
 * Clase que implementa la interfaz ITramiteDAO y proporciona funcionalidades
 * para buscar trámites en la base de datos. Esta clase se encarga de realizar
 * consultas de trámites relacionados con los contribuyentes y entre fechas
 * específicas.
 *
 * @author Gamaliel Armenta
 * @author Roberto García
 */
public class TramiteDAO implements ITramiteDAO {

    private final IConexion conexion;

    /**
     * Constructor de la clase TramiteDAO. Crea una nueva instancia de
     * TramiteDAO y establece la conexión a la base de datos.
     */
    public TramiteDAO() {
        this.conexion = new Conexion();
    }

    /**
     * Busca los trámites de un contribuyente en la base de datos.
     *
     * @param contribuyente El contribuyente del cual se desean buscar los
     * trámites.
     * @return Una lista de trámites asociados al contribuyente.
     * @throws PersistenciaException Si no se encuentran trámites asociados al
     * contribuyente.
     */
    @Override
    public List<Tramite> buscarTramitesPorContribuyente(Contribuyente contribuyente) throws PersistenciaException {
        EntityManager entityManager = conexion.crearConexion();

        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Tramite> criteriaQuery = criteriaBuilder.createQuery(Tramite.class);
        Root<Tramite> root = criteriaQuery.from(Tramite.class);

        criteriaQuery.select(root)
                .where(criteriaBuilder.equal(root.get("contribuyente").get("id"), contribuyente.getId()));

        TypedQuery<Tramite> query = entityManager.createQuery(criteriaQuery);
        List<Tramite> tramites = query.getResultList();

        entityManager.close();

        if (tramites.isEmpty()) {
            throw new PersistenciaException("El contribuyente no tiene ningún trámite asociado");
        } else {
            return tramites;
        }
    }

    /**
     * Busca los trámites en la base de datos que fueron emitidos entre las
     * fechas especificadas.
     *
     * @param desde La fecha desde la cual se desea buscar los trámites.
     * @param hasta La fecha hasta la cual se desea buscar los trámites.
     * @return Una lista de trámites emitidos entre las fechas especificadas.
     */
    @Override
    public List<Tramite> buscarTramitesFecha(Date desde, Date hasta) {
        EntityManager entityManager = this.conexion.crearConexion();
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Tramite> criteria = cb.createQuery(Tramite.class);
        Root<Tramite> root = criteria.from(Tramite.class);

        // Definir los predicados para las fechas
        Predicate desdePredicate = cb.greaterThanOrEqualTo(root.get("fechaEmision"), desde);
        Predicate hastaPredicate = cb.lessThanOrEqualTo(root.get("fechaEmision"), hasta);

        // Construir un predicado compuesto para el rango de fechas
        Predicate fechaPredicate = cb.and(desdePredicate, hastaPredicate);

        // Agregar el predicado al CriteriaQuery
        criteria.select(root).where(fechaPredicate);

        TypedQuery<Tramite> query = entityManager.createQuery(criteria);
        List<Tramite> tramites = query.getResultList();

        entityManager.close();

        return tramites;
    }

}
