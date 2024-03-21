package org.itson.bdavanzadas.agenciafiscal_interfaces;

/**
 *
 * @author Roberto García
 */
public class PanelContribuyentes extends javax.swing.JPanel {

    
    private FramePrincipal framePrincipal;
    /** Creates new form panelContribuyentes */
    public PanelContribuyentes(FramePrincipal principal) {
        this.framePrincipal = framePrincipal;
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTramites = new javax.swing.JButton();
        btnConsultas = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        btnContribuyentes = new javax.swing.JButton();
        btnAgregarContribuyentes = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

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

        btnAgregarContribuyentes.setBorder(null);
        btnAgregarContribuyentes.setBorderPainted(false);
        btnAgregarContribuyentes.setContentAreaFilled(false);
        btnAgregarContribuyentes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarContribuyentes.setOpaque(false);
        btnAgregarContribuyentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarContribuyentesActionPerformed(evt);
            }
        });
        add(btnAgregarContribuyentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 213, 137, 65));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panelContribuyentes.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
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
        // TODO add your handling code here:
    }//GEN-LAST:event_btnContribuyentesActionPerformed

    private void btnAgregarContribuyentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarContribuyentesActionPerformed
//        framePrincipal.mostrarConfirmacion("Seguro que deseas agregar 20 contribuyentes", "Agregar contribuyentes")        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarContribuyentesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarContribuyentes;
    private javax.swing.JButton btnConsultas;
    private javax.swing.JButton btnContribuyentes;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnTramites;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}
