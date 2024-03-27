package org.itson.bdavanzadas.agenciafiscal_persistencia.daos;

import javax.persistence.EntityManager;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Licencia;
import org.itson.bdavanzadas.agenciafiscal_persistencia.excepciones.PersistenciaException;

/**
 * Clase que implementa la interfaz IRegistrarLicenciaDAO y proporciona
 * funcionalidades para registrar licencias en la base de datos.
 *
 * Esta clase se encarga de persistir nuevas licencias en la base de datos.
 *
 * @author Gamaliel Armenta
 * @author Roberto García
 */
public class RegistrarLicenciaDAO implements IRegistrarLicenciaDAO {

    private final IConexion conexion;

    /**
     * Constructor de la clase RegistrarLicenciaDAO.
     *
     * Crea una nueva instancia de RegistrarLicenciaDAO y establece la conexión
     * a la base de datos.
     */
    public RegistrarLicenciaDAO() {
        this.conexion = new Conexion();
    }

    /**
     * Registra una nueva licencia en la base de datos.
     *
     * @param tramiteLicencia La licencia a registrar.
     * @throws PersistenciaException Si ocurre un error durante la operación de
     * persistencia.
     */
    @Override
    public void registrarLicencia(Licencia tramiteLicencia) throws PersistenciaException {
        // Obtener una conexión a la base de datos
        EntityManager eManager = conexion.crearConexion();

        // Iniciar una transacción
        eManager.getTransaction().begin();

        // Persistir la licencia en la base de datos
        eManager.persist(tramiteLicencia);

        // Confirmar la transacción
        eManager.getTransaction().commit();

        // Cerrar la conexión
        eManager.close();
    }
}
