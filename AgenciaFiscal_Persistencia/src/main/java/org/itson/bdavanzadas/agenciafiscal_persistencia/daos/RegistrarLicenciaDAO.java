package org.itson.bdavanzadas.agenciafiscal_persistencia.daos;

import javax.persistence.EntityManager;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Contribuyente;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Licencia;

/**
 *
 * @author Roberto García
 */
public class RegistrarLicenciaDAO {
    private IConexion conexion;

    public RegistrarLicenciaDAO() {
        this.conexion = new Conexion();
    }
   
    public void registrarLicencia(Licencia tramiteLicencia) {
       
        EntityManager eManager = conexion.crearConexion();
        
        eManager.getTransaction().begin(); 
        
        eManager.persist(tramiteLicencia);
        
        eManager.getTransaction().commit();
        
        eManager.close();
       
        
    }
}
