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
 * Clase DAO para buscar contribuyentes en la base de datos. Permite realizar
 * búsquedas de contribuyentes por su RFC o por su ID.
 *
 * @author Gamaliel Armenta
 * @author Roberto García
 */
public class BuscarContribuyenteDAO {

    private final IConexion conexion;

    /**
     * Constructor de la clase BuscarContribuyenteDAO. Inicializa la conexión
     * con la base de datos utilizando la implementación de IConexion por
     * defecto.
     */
    public BuscarContribuyenteDAO() {
        this.conexion = new Conexion();
    }

    /**
     * Busca un contribuyente en la base de datos por su RFC.
     *
     * @param rfc El RFC del contribuyente a buscar.
     * @return El contribuyente encontrado.
     * @throws PersistenciaException Si no se encuentra ningún contribuyente con
     * el RFC proporcionado.
     */
    public Contribuyente buscarContribuyente(String rfc) throws PersistenciaException {
        EntityManager entityManager = this.conexion.crearConexion();
        // Objeto constructor de consultas
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        // Objeto consulta que se está construyendo
        CriteriaQuery<Contribuyente> criteria = cb.createQuery(Contribuyente.class);

        Root<Contribuyente> root = criteria.from(Contribuyente.class);

        // Filtrar por RFC igual al parámetro proporcionado
        criteria.select(root).where(cb.equal(root.get("rfc"), rfc));

        // Consulta construida
        TypedQuery<Contribuyente> query = entityManager.createQuery(criteria);

        // Obtener el resultado de la consulta
        List<Contribuyente> contribuyentes = query.getResultList();

        entityManager.close();

        // Verificar si se encontró algún contribuyente con el RFC dado
        if (contribuyentes.isEmpty()) {
            throw new PersistenciaException("No se encontró ningún contribuyente con el RFC proporcionado");
        } else {
            return contribuyentes.get(0); // Devolver el primer contribuyente encontrado
        }
    }

    //TODO, este método aún no funciona
    /**
     * Busca un contribuyente en la base de datos por su ID.
     *
     * @param id El ID del contribuyente a buscar.
     * @return El contribuyente encontrado.
     * @throws PersistenciaException Si no se encuentra ningún contribuyente con
     * el ID proporcionado.
     */
    public Contribuyente buscarContribuyente(Long id) throws PersistenciaException {
        EntityManager entityManager = this.conexion.crearConexion();
        // Objeto constructor de consultas
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        // Objeto consulta que se está construyendo
        CriteriaQuery<Contribuyente> criteria = cb.createQuery(Contribuyente.class);

        Root<Contribuyente> root = criteria.from(Contribuyente.class);

        // Filtrar por ID igual al parámetro proporcionado
        criteria.select(root).where(cb.equal(root.get("id_contribuyente"), id));

        // Consulta construida
        TypedQuery<Contribuyente> query = entityManager.createQuery(criteria);

        // Obtener el resultado de la consulta
        List<Contribuyente> contribuyentes = query.getResultList();

        entityManager.close();

        // Verificar si se encontró algún contribuyente con el ID dado
        if (contribuyentes.isEmpty()) {
            throw new PersistenciaException("No se encontró ningún contribuyente con el ID proporcionado");
        } else {
            return contribuyentes.get(0); // Devolver el primer contribuyente encontrado
        }
    }
}
