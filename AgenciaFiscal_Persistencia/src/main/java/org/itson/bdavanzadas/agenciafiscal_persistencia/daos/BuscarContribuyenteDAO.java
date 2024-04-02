package org.itson.bdavanzadas.agenciafiscal_persistencia.daos;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Contribuyente;
import org.itson.bdavanzadas.agenciafiscal_persistencia.excepciones.PersistenciaException;

/**
 *
 * Clase que implementa la interfaz IBuscarContribuyenteDAO para buscar
 * contribuyentes en la base de datos. Proporciona métodos para buscar
 * contribuyentes por su RFC, ID, nombre, apellido y año de nacimiento. Utiliza
 * una implementación de IConexion para establecer la conexión con la base de
 * datos.
 *
 * @author Gamaliel Armenta
 * @author Roberto García
 */
public class BuscarContribuyenteDAO implements IBuscarContribuyenteDAO {

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
    @Override
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
            return contribuyentes.get(0); // Devolver el primer contribuyente encontrado aprovechando que RFC es UK
        }
    }

    /**
     * Busca un contribuyente en la base de datos por su ID.
     *
     * @param id El ID del contribuyente a buscar.
     * @return El contribuyente encontrado.
     * @throws PersistenciaException Si no se encuentra ningún contribuyente con
     * el ID proporcionado.
     */
    @Override
    public Contribuyente buscarContribuyente(Long id) throws PersistenciaException {
        EntityManager entityManager = this.conexion.crearConexion();
        // Objeto constructor de consultas
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        // Objeto consulta que se está construyendo
        CriteriaQuery<Contribuyente> criteria = cb.createQuery(Contribuyente.class);

        Root<Contribuyente> root = criteria.from(Contribuyente.class);

        // Filtrar por ID igual al parámetro proporcionado
        criteria.select(root).where(cb.equal(root.get("idContribuyente"), id));

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

    /**
     * Busca contribuyentes en la base de datos por su nombre, apellido paterno
     * y apellido materno.
     *
     * @param contribuyente El contribuyente con los datos de nombre y apellidos
     * a buscar.
     * @return Una lista de contribuyentes que coinciden con los criterios de
     * búsqueda.
     * @throws PersistenciaException Si no se encuentra ningún contribuyente con
     * los nombres específicados.
     */
    public List<Contribuyente> buscarContribuyentes(Contribuyente contribuyente) throws PersistenciaException {
        EntityManager entityManager = this.conexion.crearConexion();
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Contribuyente> criteria = cb.createQuery(Contribuyente.class);
        Root<Contribuyente> root = criteria.from(Contribuyente.class);

        Predicate nombrePredicate = cb.like(root.get("nombre"), "%" + contribuyente.getNombre() + "%");
        Predicate apellidoPaternoPredicate = cb.like(root.get("apellidoPaterno"), "%" + contribuyente.getApellidoPaterno() + "%");
        Predicate apellidoMaternoPredicate = cb.like(root.get("apellidoMaterno"), "%" + contribuyente.getApellidoMaterno() + "%");

        // Construyendo una condición compuesta para buscar por nombre, apellido paterno y materno
        Predicate combinedPredicate = cb.and(nombrePredicate, apellidoPaternoPredicate, apellidoMaternoPredicate);

        criteria.select(root).where(combinedPredicate);

        TypedQuery<Contribuyente> query = entityManager.createQuery(criteria);
        List<Contribuyente> contribuyentes = query.getResultList();

        entityManager.close();

        if (contribuyentes.isEmpty()) {
            throw new PersistenciaException("No se encontró ningún contribuyente con los nombres específicados");
        } else {
            return contribuyentes;
        }
    }

    /**
     * Busca contribuyentes en la base de datos por su nombre.
     *
     * @param nombre El nombre del contribuyente a buscar.
     * @return Una lista de contribuyentes que coinciden con el nombre
     * proporcionado.
     * @throws PersistenciaException Si no se encuentra ningún contribuyente con
     * el nombre proporcionado.
     */
    @Override
    public List<Contribuyente> buscarContribuyenteNombre(String nombre) throws PersistenciaException {
        EntityManager entityManager = this.conexion.crearConexion();
        // Objeto constructor de consultas
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        // Objeto consulta que se está construyendo
        CriteriaQuery<Contribuyente> criteria = cb.createQuery(Contribuyente.class);

        Root<Contribuyente> root = criteria.from(Contribuyente.class);

        // Filtrar por nombre igual al parámetro proporcionado
        criteria.select(root).where(cb.equal(root.get("nombre"), nombre));

        // Consulta construida
        TypedQuery<Contribuyente> query = entityManager.createQuery(criteria);

        // Obtener el resultado de la consulta
        List<Contribuyente> contribuyentes = query.getResultList();

        entityManager.close();
        
        if (contribuyentes.isEmpty()) {
            throw new PersistenciaException("No se encontró ningún contribuyente\ncon el nombre proporcionado");
        } else {
            return contribuyentes;
        }
    }

    /**
     * Busca contribuyentes en la base de datos por su año de nacimiento.
     *
     * @param anio El año de nacimiento de los contribuyentes a buscar.
     * @return Una lista de contribuyentes que nacieron en el año especificado.
     * @throws PersistenciaException Si no se encuentra ningún contribuyente con
     * el año de nacimiento proporcionado.
     */
    @Override
    public List<Contribuyente> buscarContribuyente(Integer anio) throws PersistenciaException {
        EntityManager entityManager = this.conexion.crearConexion();
        //Consulta JPQL
        String jpqlQuery = "SELECT c FROM Contribuyente c WHERE FUNCTION('YEAR', c.fechaNacimiento) = :anioBuscado";

        TypedQuery<Contribuyente> query = entityManager.createQuery(jpqlQuery, Contribuyente.class);
        query.setParameter("anioBuscado", anio);

        List<Contribuyente> contribuyentes = query.getResultList();

        entityManager.close();

        if (contribuyentes.isEmpty()) {
            throw new PersistenciaException("No se encontró ningún contribuyente\ncon el año de nacimiento proporcionado");
        } else {
            return contribuyentes;
        }
    }

}
