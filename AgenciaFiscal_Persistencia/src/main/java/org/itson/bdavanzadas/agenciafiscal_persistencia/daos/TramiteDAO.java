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
 *
 * @author Roberto García
 */
public class TramiteDAO implements ITramiteDAO {

    private final IConexion conexion;

    public TramiteDAO() {
        this.conexion = new Conexion();
    }

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

//
//        String jpql = "SELECT t FROM Tramite t WHERE t.id_contribuyente = :id_contribuyente";
//
//        // Crear la consulta TypedQuery
//        TypedQuery<Tramite> query = entityManager.createQuery(jpql, Tramite.class);
//
//        query.setParameter("id_contribuyente", contribuyente.getId());
//
//        List<Tramite> tramites = query.getResultList();
        entityManager.close();

        if (tramites.isEmpty()) {
            throw new PersistenciaException("El contribuyente no tiene ningún trámite asociado");
        } else {
            return tramites;
        }
    }

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
