package org.itson.bdavanzadas.agenciafiscal_presentacion;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.itson.bdavanzadas.agenciafiscal_negocio.bos.BuscarPorRfcBO;
import org.itson.bdavanzadas.agenciafiscal_negocio.bos.IBuscarPorRfcBO;
import org.itson.bdavanzadas.agenciafiscal_negocio.bos.IValidarLicenciaBO;
import org.itson.bdavanzadas.agenciafiscal_negocio.bos.ValidarLicenciaBO;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.BuscarContribyenteRFCDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.ContribuyenteDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.LicenciaNuevaDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.excepciones.ValidacionDTOException;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Licencia;
import org.itson.bdavanzadas.agenciafiscal_persistencia.excepciones.PersistenciaException;

/**
 *
 * @author Roberto García
 */
public class PanelPlacasValidarLicencia extends javax.swing.JPanel {

    FramePrincipal framePrincipal;
    ContribuyenteDTO contribuyenteDTO;
    LicenciaNuevaDTO licenciaNuevaDTO;

    /**
     * Creates new form PanelPlacasValidarLicencia
     */
    public PanelPlacasValidarLicencia(FramePrincipal framePrincipal) {
        this.framePrincipal = framePrincipal;
        this.contribuyenteDTO = this.framePrincipal.getContribuyenteDTO();
        initComponents();
        if (contribuyenteDTO != null) {
            setLabels();
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
        btnContinuar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        btnValidar = new javax.swing.JButton();
        txtRfc = new javax.swing.JTextField();
        lblContribuyente = new javax.swing.JLabel();
        lblLicencia = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1000, 580));
        setMinimumSize(new java.awt.Dimension(1000, 580));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTramites.setBorder(null);
        btnTramites.setBorderPainted(false);
        btnTramites.setContentAreaFilled(false);
        btnTramites.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        btnConsultas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        btnReportes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        btnContribuyentes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnContribuyentes.setOpaque(false);
        btnContribuyentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContribuyentesActionPerformed(evt);
            }
        });
        add(btnContribuyentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 402, 186, 47));

        btnContinuar.setBorder(null);
        btnContinuar.setBorderPainted(false);
        btnContinuar.setContentAreaFilled(false);
        btnContinuar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnContinuar.setOpaque(false);
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 379, 137, 40));

        btnRegresar.setBorder(null);
        btnRegresar.setBorderPainted(false);
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegresar.setOpaque(false);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 379, 137, 40));

        btnValidar.setBorder(null);
        btnValidar.setBorderPainted(false);
        btnValidar.setContentAreaFilled(false);
        btnValidar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnValidar.setOpaque(false);
        btnValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidarActionPerformed(evt);
            }
        });
        add(btnValidar, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 273, 137, 40));

        txtRfc.setBackground(new java.awt.Color(250, 248, 245));
        txtRfc.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        txtRfc.setToolTipText("");
        txtRfc.setName(""); // NOI18N
        add(txtRfc, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 278, 250, 30));

        lblContribuyente.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        lblContribuyente.setForeground(new java.awt.Color(77, 77, 77));
        add(lblContribuyente, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 318, 592, 20));

        lblLicencia.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        lblLicencia.setForeground(new java.awt.Color(77, 77, 77));
        add(lblLicencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 338, 592, 20));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panelPlacasValidarLicencia.png"))); // NOI18N
        lblFondo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnTramitesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTramitesActionPerformed
        framePrincipal.cambiarPanelTramites();
    }//GEN-LAST:event_btnTramitesActionPerformed

    private void btnConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultasActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReportesActionPerformed

    private void btnContribuyentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContribuyentesActionPerformed
        if (framePrincipal.mostrarConfirmacion("Perderás el progreso del trámite actual", "¿Deseas cambiar de módulo?")) {
            framePrincipal.setContribuyenteDTO(null);
            framePrincipal.cambiarPanelContribuyentes();
        }      // TODO add your handling code here:
    }//GEN-LAST:event_btnContribuyentesActionPerformed

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        if (licenciaNuevaDTO == null) {
            framePrincipal.mostrarAviso("Proporciona un contribuyente con licencia válida");
        } else {
            framePrincipal.cambiarPanelPlacasTipoAutomovil();
        }
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        
        
        
        framePrincipal.setContribuyenteDTO(null);
        framePrincipal.cambiarPanelTramites();        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidarActionPerformed
        if (txtRfc.getText().isBlank()) {
            framePrincipal.mostrarAviso("El campo de RFC no puede estar vacío");
        } else {
            String rfc = txtRfc.getText();
            BuscarContribyenteRFCDTO buscarContribyenteRFCDTO = new BuscarContribyenteRFCDTO(rfc);
            IBuscarPorRfcBO buscarPorRfcBO = new BuscarPorRfcBO(buscarContribyenteRFCDTO);
            try {
                contribuyenteDTO = buscarPorRfcBO.buscarContribuyente();
                framePrincipal.setContribuyenteDTO(contribuyenteDTO);
                IValidarLicenciaBO validarLicenciaBO = new ValidarLicenciaBO(contribuyenteDTO);
                licenciaNuevaDTO = validarLicenciaBO.validarLicencia();
                setLabels();
            } catch (ValidacionDTOException | PersistenciaException ex) {
                framePrincipal.mostrarAviso(ex.getMessage());
            }

        }

    }//GEN-LAST:event_btnValidarActionPerformed

    private void setLabels() {
        lblContribuyente.setText("El contribuyente " + contribuyenteDTO.getNombre() + " " + contribuyenteDTO.getApellidoPaterno() + " " + contribuyenteDTO.getApellidoMaterno());
        lblLicencia.setText("tiene una licencia válida");
        txtRfc.setText(contribuyenteDTO.getRfc());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultas;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnContribuyentes;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnTramites;
    private javax.swing.JButton btnValidar;
    private javax.swing.JLabel lblContribuyente;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblLicencia;
    private javax.swing.JTextField txtRfc;
    // End of variables declaration//GEN-END:variables

}
