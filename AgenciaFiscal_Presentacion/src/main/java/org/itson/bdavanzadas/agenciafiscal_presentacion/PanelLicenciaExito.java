package org.itson.bdavanzadas.agenciafiscal_presentacion;

/**
 *
 * @author Roberto García
 */
public class PanelLicenciaExito extends javax.swing.JPanel {

    FramePrincipal framePrincipal;

    /**
     * Creates new form PanelLicenciaExito
     */
    public PanelLicenciaExito(FramePrincipal framePrincipal) {
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

        btnTramites = new javax.swing.JButton();
        btnConsultas = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        btnContribuyentes = new javax.swing.JButton();
        btnTerminar = new javax.swing.JButton();
        lblAnios = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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

        btnTerminar.setBorder(null);
        btnTerminar.setBorderPainted(false);
        btnTerminar.setContentAreaFilled(false);
        btnTerminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTerminar.setOpaque(false);
        btnTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerminarActionPerformed(evt);
            }
        });
        add(btnTerminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 292, 137, 40));

        lblAnios.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        lblAnios.setForeground(new java.awt.Color(77, 77, 77));
        add(lblAnios, new org.netbeans.lib.awtextra.AbsoluteConstraints(741, 253, -1, -1));
        lblAnios.setText(String.valueOf(framePrincipal.getLicenciaNuevaDTO().getVigencia()));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panelLicenciaExito.png"))); // NOI18N
        add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminarActionPerformed
        framePrincipal.setContribuyenteDTO(null);
        framePrincipal.setLicenciaNuevaDTO(null);
        framePrincipal.cambiarPanelInicio();
    }//GEN-LAST:event_btnTerminarActionPerformed

    private void btnTramitesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTramitesActionPerformed
        framePrincipal.setContribuyenteDTO(null);
        framePrincipal.setLicenciaNuevaDTO(null);
        framePrincipal.cambiarPanelTramites();
    }//GEN-LAST:event_btnTramitesActionPerformed

    private void btnConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultasActionPerformed
        framePrincipal.setContribuyenteDTO(null);
        framePrincipal.setLicenciaNuevaDTO(null);
        framePrincipal.cambiarPanelHistorialTipoBusqueda();
    }//GEN-LAST:event_btnConsultasActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        framePrincipal.setContribuyenteDTO(null);
        framePrincipal.setLicenciaNuevaDTO(null);
        framePrincipal.cambiarPanelReportesBusqueda();
    }//GEN-LAST:event_btnReportesActionPerformed

    private void btnContribuyentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContribuyentesActionPerformed
        framePrincipal.setContribuyenteDTO(null);
        framePrincipal.setLicenciaNuevaDTO(null);
        framePrincipal.cambiarPanelContribuyentes();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnContribuyentesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultas;
    private javax.swing.JButton btnContribuyentes;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnTerminar;
    private javax.swing.JButton btnTramites;
    private javax.swing.JLabel lblAnios;
    private javax.swing.JLabel lblFondo;
    // End of variables declaration//GEN-END:variables

}
