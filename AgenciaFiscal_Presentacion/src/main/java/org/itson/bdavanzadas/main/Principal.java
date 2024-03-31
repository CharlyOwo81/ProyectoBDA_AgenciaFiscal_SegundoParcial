package org.itson.bdavanzadas.main;

import org.itson.bdavanzadas.agenciafiscal_persistencia.daos.Conexion;
import org.itson.bdavanzadas.agenciafiscal_persistencia.daos.IConexion;
import org.itson.bdavanzadas.agenciafiscal_presentacion.FramePrincipal;

/**
 *
 * @author Roberto García
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FramePrincipal ventana = new FramePrincipal();
        ventana.cambiarPanelInicio();
        ventana.setVisible(true);
        IConexion conexion = new Conexion();
        conexion.crearConexion();

    }

}
