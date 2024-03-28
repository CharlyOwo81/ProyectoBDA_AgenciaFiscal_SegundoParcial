package org.itson.bdavanzadas.agenciafiscal_persistencia.daos;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Licencia;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Tramite;
import org.itson.bdavanzadas.agenciafiscal_persistencia.excepciones.PersistenciaException;

/**
 * Clase que implementa la interfaz ILicenciaDAO y proporciona funcionalidades
 * para agregar licencias a la base de datos.
 *
 * Esta clase se encarga de persistir nuevas licencias en la base de datos.
 *
 * @author Gamaliel Armenta
 * @author Roberto García
 */
public class LicenciaDAO implements ILicenciaDAO {

    private final IConexion conexion;

    /**
     * Constructor de la clase LicenciaDAO.
     *
     * @param conexion La conexión a la base de datos a utilizar.
     */
    public LicenciaDAO(IConexion conexion) {
        this.conexion = conexion;
    }

    /**
     * Agrega una nueva licencia a la base de datos.
     *
     * @param licencia La licencia a agregar.
     * @return La licencia agregada.
     */
    @Override
    public Licencia agregarLicencia(Licencia licencia) {
        // Obtener una conexión a la base de datos
        EntityManager eManager = conexion.crearConexion();

        // Iniciar una transacción
        eManager.getTransaction().begin();

        // Persistir la licencia en la base de datos
        eManager.persist(licencia);

        // Confirmar la transacción
        eManager.getTransaction().commit();

        // Cerrar la conexión
        eManager.close();

        return licencia;
    }

//    public List<Licencia> buscarLicencia(List<Tramite> tramites) throws PersistenciaException {
//        List<Licencia> licencias = new ArrayList<>();
//
//        for (Tramite tramite : tramites) {
//            if (tramite instanceof Licencia) {
//                licencias.add((Licencia) tramite);
//            }
//        }
//
//        return licencias;
//        EntityManager entityManager = this.conexion.crearConexion();
//        
//        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
//        
//        CriteriaQuery<Licencia> criteria = cb.createQuery(Licencia.class);
//        
//        Root<Licencia> root = criteria.from(Licencia.class);
//
//        criteria.select(root).where(cb.equal(root.get("contribuyente"), contribuyente));
//
//        // Consulta construida
//        TypedQuery<Licencia> query = entityManager.createQuery(criteria);
//
//        // Obtener el resultado de la consulta
//        List<Licencia> licencias = query.getResultList();
//
//        entityManager.close();
//
//        // Verificar si se encontró algún contribuyente con el RFC dado
//        if (licencias.isEmpty()) {
//            throw new PersistenciaException("El contribuyente no tiene una licencia en el sistema");
//        } else {
//            return licencias.getLast(); // Devolver el primer contribuyente encontrado
//        }
//    }
}
