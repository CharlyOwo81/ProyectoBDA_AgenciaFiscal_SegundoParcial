package org.itson.bdavanzadas.agenciafiscal_presentacion;

import java.util.ArrayList;
import java.util.List;
import org.itson.bdavanzadas.agenciafiscal_negocio.bos.BuscarPorNombre;
import org.itson.bdavanzadas.agenciafiscal_negocio.bos.IBuscarPorNombre;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.ContribuyenteDTO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.excepciones.PersistenciaException;

/**
 *
 * @author Roberto García
 */
public class PanelHistorialNombre extends javax.swing.JPanel {

    FramePrincipal framePrincipal;

    /**
     * Creates new form PanelHistorialNombre
     */
    public PanelHistorialNombre(FramePrincipal framePrincipal) {
        this.framePrincipal = framePrincipal;
        initComponents();
        if (framePrincipal.getContribuyenteDTOs() != null) {
            txtNombre.setText(framePrincipal.getContribuyenteDTOs().getFirst().getNombre());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTramites = new javax.swing.JButton();
        btnConsultas = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        btnContribuyentes = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        lblFondo = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1000, 580));
        setMinimumSize(new java.awt.Dimension(1000, 580));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTramites.setBorder(null);
        btnTramites.setBorderPainted(false);
        btnTramites.setContentAreaFilled(false);
        btnTramites.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTramites.setOpaque(false);
        btnTramites.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTramitesActionPerformed(evt);
            }
        });
        add(btnTramites, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 261, 186, 47));

        btnConsultas.setBorder(null);
        btnConsultas.setBorderPainted(false);
        btnConsultas.setContentAreaFilled(false);
        btnConsultas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultas.setOpaque(false);
        btnConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultasActionPerformed(evt);
            }
        });
        add(btnConsultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 308, 186, 47));

        btnReportes.setBorder(null);
        btnReportes.setBorderPainted(false);
        btnReportes.setContentAreaFilled(false);
        btnReportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReportes.setOpaque(false);
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });
        add(btnReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 355, 186, 47));

        btnContribuyentes.setBorder(null);
        btnContribuyentes.setBorderPainted(false);
        btnContribuyentes.setContentAreaFilled(false);
        btnContribuyentes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnContribuyentes.setOpaque(false);
        btnContribuyentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContribuyentesActionPerformed(evt);
            }
        });
        add(btnContribuyentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 402, 186, 47));

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

        txtNombre.setBackground(new java.awt.Color(250, 248, 245));
        txtNombre.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        txtNombre.setToolTipText("");
        txtNombre.setName(""); // NOI18N
        add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 278, 250, 30));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panelHistorialNombre.png"))); // NOI18N
        add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        framePrincipal.setPanelAnterior(null);
        framePrincipal.setContribuyenteDTOs(null);
        framePrincipal.cambiarPanelHistorialTipoBusqueda();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (txtNombre.getText().isBlank()) {
            framePrincipal.mostrarAviso("El campo de nombre no puede estar vacío");
        } else {
            ContribuyenteDTO contribuyenteDTO = new ContribuyenteDTO(txtNombre.getText(), null, null);
            IBuscarPorNombre buscarPorNombre = new BuscarPorNombre();
            List<ContribuyenteDTO> contribuyentesDto;
            try {
                contribuyentesDto = buscarPorNombre.buscarContribuyente(contribuyenteDTO);
                framePrincipal.setContribuyenteDTOs(contribuyentesDto);
                framePrincipal.setPanelAnterior(2);
                framePrincipal.cambiarPanelHistorialSeleccion();
            } catch (PersistenciaException e) {
                framePrincipal.mostrarAviso(e.getMessage());
            }
        }


    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnTramitesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTramitesActionPerformed
        if (framePrincipal.mostrarConfirmacion("Perderás el progreso del trámite actual", "¿Deseas cambiar de módulo?")) {
            framePrincipal.setContribuyenteDTOs(null);
            framePrincipal.setPanelAnterior(null);
            framePrincipal.cambiarPanelTramites();
        }
    }//GEN-LAST:event_btnTramitesActionPerformed

    private void btnConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultasActionPerformed
        if (framePrincipal.mostrarConfirmacion("Perderás el progreso del trámite actual", "¿Deseas regresar?")) {
            framePrincipal.setContribuyenteDTOs(null);
            framePrincipal.setPanelAnterior(null);
            framePrincipal.cambiarPanelHistorialTipoBusqueda();
        }
    }//GEN-LAST:event_btnConsultasActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        if (framePrincipal.mostrarConfirmacion("Perderás el progreso del trámite actual", "¿Deseas cambiar de módulo?")) {
            framePrincipal.setContribuyenteDTOs(null);
            framePrincipal.setPanelAnterior(null);
            framePrincipal.cambiarPanelReportesBusqueda();
        }
    }//GEN-LAST:event_btnReportesActionPerformed

    private void btnContribuyentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContribuyentesActionPerformed
        if (framePrincipal.mostrarConfirmacion("Perderás el progreso del trámite actual", "¿Deseas cambiar de módulo?")) {
            framePrincipal.setContribuyenteDTOs(null);
            framePrincipal.setPanelAnterior(null);
            framePrincipal.cambiarPanelContribuyentes();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnContribuyentesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnConsultas;
    private javax.swing.JButton btnContribuyentes;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnTramites;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

}
