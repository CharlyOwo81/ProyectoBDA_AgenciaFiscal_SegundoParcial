package org.itson.bdavanzadas.main;

import java.util.Date;
import javax.persistence.EntityManager;
import org.itson.bdavanzadas.agenciafiscal_dominio.Contribuyente;
import org.itson.bdavanzadas.agenciafiscal_dominio.ContribuyenteDiscapacidad;
import org.itson.bdavanzadas.agenciafiscal_persistencia.Conexion;
import org.itson.bdavanzadas.agenciafiscal_persistencia.IConexion;

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

        Contribuyente con = new Contribuyente("aadfds", "adfedf0", "dfd", "sdasdf", "fads", "6226", new Date(2004, 0, 0), ContribuyenteDiscapacidad.SI);

        entityManager.persist(con);
        entityManager.getTransaction().commit();

        entityManager.close();
    }

}
