package org.itson.bdavanzadas.agenciafiscal_presentacion;

/**
 *
 * @author Roberto García
 */
public class PanelPlacasExito extends javax.swing.JPanel {

    FramePrincipal framePrincipal;
    /** Creates new form PanelPlacasExito */
    public PanelPlacasExito(FramePrincipal framePrincipal) {
        this.framePrincipal = framePrincipal;
        initComponents();
        setTextos();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTerminar = new javax.swing.JButton();
        lblPlacas = new javax.swing.JLabel();
        lblNumPlacas = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1000, 580));
        setMinimumSize(new java.awt.Dimension(1000, 580));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        add(btnTerminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 439, 137, 40));

        lblPlacas.setFont(new java.awt.Font("Driver Gothic", 0, 67)); // NOI18N
        lblPlacas.setForeground(new java.awt.Color(38, 38, 38));
        lblPlacas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(lblPlacas, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 374, 200, 65));

        lblNumPlacas.setFont(new java.awt.Font("Montserrat SemiBold", 0, 16)); // NOI18N
        lblNumPlacas.setForeground(new java.awt.Color(77, 77, 77));
        add(lblNumPlacas, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 278, 100, 20));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panelPlacasExito.png"))); // NOI18N
        lblFondo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminarActionPerformed
        // TODO validar con automovilNuevoDTO
        framePrincipal.setAutomovilNuevoDTO(null);
        framePrincipal.setContribuyenteDTO(null);
        framePrincipal.setLicenciaNuevaDTO(null);
        framePrincipal.setPlacasNuevasDTO(null);
        framePrincipal.cambiarPanelInicio();
    }//GEN-LAST:event_btnTerminarActionPerformed

    private void setTextos(){
        lblNumPlacas.setText(framePrincipal.getPlacasNuevasDTO().getNumeroPlacas());
        lblPlacas.setText(framePrincipal.getPlacasNuevasDTO().getNumeroPlacas());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTerminar;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblNumPlacas;
    private javax.swing.JLabel lblPlacas;
    // End of variables declaration//GEN-END:variables

}
