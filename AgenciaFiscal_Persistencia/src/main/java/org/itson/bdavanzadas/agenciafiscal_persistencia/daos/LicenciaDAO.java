package org.itson.bdavanzadas.agenciafiscal_persistencia.daos;

import javax.persistence.EntityManager;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Licencia;

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

}
