package org.itson.bdavanzadas.main;

import java.util.Date;
import javax.persistence.EntityManager;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Contribuyente;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.ContribuyenteDiscapacidad;
import org.itson.bdavanzadas.agenciafiscal_persistencia.daos.Conexion;
import org.itson.bdavanzadas.agenciafiscal_persistencia.daos.IConexion;

/**
 *
 * @author Roberto García
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        FramePrincipal ventana = new FramePrincipal();
//        ventana.cambiarPanelInicio();
//        ventana.setVisible(true);

        IConexion conexion = new Conexion();
        EntityManager entityManager = conexion.crearConexion();

        entityManager.getTransaction().begin();

        

        entityManager.getTransaction().commit();

        entityManager.close();
    }

}
