package org.itson.bdavanzadas.agenciafiscal_presentacion;

import java.util.List;
import org.itson.bdavanzadas.agenciafiscal_negocio.bos.BuscarPorAnio;
import org.itson.bdavanzadas.agenciafiscal_negocio.bos.IBuscarPorAnio;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.ContribuyenteDTO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.excepciones.PersistenciaException;

/**
 *
 * @author Roberto García
 */
public class PanelHistorialFecha extends javax.swing.JPanel {

    FramePrincipal framePrincipal;

    /**
     * Creates new form PanelHistorialFecha
     */
    public PanelHistorialFecha(FramePrincipal framePrincipal) {
        this.framePrincipal = framePrincipal;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegresar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtAnio = new javax.swing.JTextField();
        lblFondo = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegresar.setBorder(null);
        btnRegresar.setBorderPainted(false);
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar.setOpaque(false);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 338, 137, 40));

        btnBuscar.setBorder(null);
        btnBuscar.setBorderPainted(false);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.setOpaque(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 338, 137, 40));

        txtAnio.setBackground(new java.awt.Color(250, 248, 245));
        txtAnio.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        txtAnio.setToolTipText("");
        txtAnio.setName(""); // NOI18N
        add(txtAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 278, 250, 30));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panelHistorialFecha.png"))); // NOI18N
        add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        framePrincipal.setPanelAnterior(null);

        framePrincipal.cambiarPanelHistorialTipoBusqueda();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (txtAnio.getText().isBlank()) {
            framePrincipal.mostrarAviso("El campo de año no puede estar vacío");
        } else {
            IBuscarPorAnio buscarPorAnio = new BuscarPorAnio();
            List<ContribuyenteDTO> contribuyenteDTOs;
            try {
                Integer anio = Integer.valueOf(txtAnio.getText());
                contribuyenteDTOs = buscarPorAnio.buscarContribuyente(anio);
                framePrincipal.setContribuyenteDTOs(contribuyenteDTOs);
                framePrincipal.setPanelAnterior(3);
                framePrincipal.cambiarPanelHistorialSeleccion();
            }catch(NumberFormatException e){
                framePrincipal.mostrarAviso("El campode texto solo puede tener números");
            } 
            catch (PersistenciaException e) {
                framePrincipal.mostrarAviso(e.getMessage());
            }

        }


    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JTextField txtAnio;
    // End of variables declaration//GEN-END:variables

}
