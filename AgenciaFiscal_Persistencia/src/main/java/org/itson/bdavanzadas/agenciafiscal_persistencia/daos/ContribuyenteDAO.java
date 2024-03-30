package org.itson.bdavanzadas.agenciafiscal_persistencia.daos;

import javax.persistence.EntityManager;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Contribuyente;

/**
 * Clase que implementa la interfaz IContribuyenteDAO y proporciona
 * funcionalidades para agregar contribuyentes a la base de datos.
 *
 * Esta clase se encarga de persistir nuevos contribuyentes en la base de datos.
 *
 * @author Gamaliel Armenta
 * @author Roberto García
 */
public class ContribuyenteDAO implements IContribuyenteDAO {

    private final IConexion conexion;

    /**
     * Constructor de la clase ContribuyenteDAO.
     *
     * Crea una nueva instancia de ContribuyenteDAO y establece la conexión a la
     * base de datos.
     */
    public ContribuyenteDAO() {
        this.conexion = new Conexion();
    }

    /**
     * Agrega un nuevo contribuyente a la base de datos.
     *
     * @param contribuyente El contribuyente a agregar.
     * @return El contribuyente agregado.
     * @throws java.lang.Exception
     */
    @Override
    public Contribuyente agregarContribuyente(Contribuyente contribuyente) throws Exception{
        // Obtener una conexión a la base de datos
        EntityManager eManager = conexion.crearConexion();

        // Iniciar una transacción
        eManager.getTransaction().begin();

        // Persistir el contribuyente en la base de datos
        eManager.persist(contribuyente);

        // Confirmar la transacción
        eManager.getTransaction().commit();

        // Cerrar la conexión
        eManager.close();

        return contribuyente;
    }
}
