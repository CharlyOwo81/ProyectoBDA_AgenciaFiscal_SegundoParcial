package org.itson.bdavanzadas.main;

import org.itson.bdavanzadas.agenciafiscal_interfaces.FramePrincipal;

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
        ventana.cambiarVistaInicio();
        ventana.setVisible(true);
    }

}
