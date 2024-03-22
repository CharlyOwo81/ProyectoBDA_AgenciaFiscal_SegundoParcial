package org.itson.bdavanzadas.agenciafiscal_persistencia.daos;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Contribuyente;
import org.itson.bdavanzadas.agenciafiscal_persistencia.excepciones.PersistenciaException;

/**
 *
 * @author Roberto García
 */
public class BuscarContribuyenteDAO {

    private IConexion conexion;

    public BuscarContribuyenteDAO() {
        this.conexion = new Conexion();
    }

    public Contribuyente buscarContribuyente(String rfc) throws PersistenciaException{

        EntityManager entityManager = this.conexion.crearConexion();
        // Objeto constructor de consultas
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        // Objeto consulta que se está construyendo
        CriteriaQuery<Contribuyente> criteria = cb.createQuery(Contribuyente.class);

        Root<Contribuyente> root = criteria.from(Contribuyente.class);

        // Filtrar por RFC igual al parámetro proporcionado
        criteria.select(root).where(cb.equal(root.get("RFC"), rfc));

        // Consulta construida
        TypedQuery<Contribuyente> query = entityManager.createQuery(criteria);

        // Obtener el resultado de la consulta
        List<Contribuyente> contribuyentes = query.getResultList();

        entityManager.close();

        // Verificar si se encontró algún contribuyente con el RFC dado
        if (contribuyentes.isEmpty()) {
            throw new PersistenciaException("No se encontró ningún contribuyente con el RFC dado");// No se encontró ningún contribuyente con el RFC dado
        } else {
            return contribuyentes.get(0); // Devolver el primer contribuyente encontrado
        }

    }

}
