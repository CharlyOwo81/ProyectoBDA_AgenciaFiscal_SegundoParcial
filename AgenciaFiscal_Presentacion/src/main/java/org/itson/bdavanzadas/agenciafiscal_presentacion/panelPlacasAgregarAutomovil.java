package org.itson.bdavanzadas.agenciafiscal_presentacion;

/**
 *
 * @author Roberto García
 */
public class panelPlacasAgregarAutomovil extends javax.swing.JPanel {

    FramePrincipal framePrincipal;
    
    /** Creates new form panelPlacasAgregarAutomovil */
    public panelPlacasAgregarAutomovil(FramePrincipal framePrincipal) {
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

        txtNumeroSerie = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtLinea = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        btnContinuar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1000, 580));
        setMinimumSize(new java.awt.Dimension(1000, 580));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNumeroSerie.setBackground(new java.awt.Color(250, 248, 245));
        txtNumeroSerie.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        txtNumeroSerie.setToolTipText("");
        txtNumeroSerie.setName(""); // NOI18N
        add(txtNumeroSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 278, 250, 30));

        txtMarca.setBackground(new java.awt.Color(250, 248, 245));
        txtMarca.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        txtMarca.setToolTipText("");
        txtMarca.setName(""); // NOI18N
        add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 343, 200, 30));

        txtLinea.setBackground(new java.awt.Color(250, 248, 245));
        txtLinea.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        txtLinea.setToolTipText("");
        txtLinea.setName(""); // NOI18N
        add(txtLinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(593, 343, 201, 30));

        txtModelo.setBackground(new java.awt.Color(250, 248, 245));
        txtModelo.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        txtModelo.setToolTipText("");
        txtModelo.setName(""); // NOI18N
        add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 408, 200, 30));

        txtColor.setBackground(new java.awt.Color(250, 248, 245));
        txtColor.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        txtColor.setToolTipText("");
        txtColor.setName(""); // NOI18N
        add(txtColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(593, 408, 201, 30));

        btnContinuar.setBorder(null);
        btnContinuar.setBorderPainted(false);
        btnContinuar.setContentAreaFilled(false);
        btnContinuar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnContinuar.setOpaque(false);
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 463, 137, 40));

        btnCancelar.setBorder(null);
        btnCancelar.setBorderPainted(false);
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.setOpaque(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 463, 137, 40));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panelPlacasAgregarAutomovil.png"))); // NOI18N
        add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        // TODO validar con automovilNuevoDTO
        if (true) {    
            framePrincipal.mostrarAviso("Proporciona un automóvil válido");
        } else {
            framePrincipal.cambiarPanelPlacasConfirmar();
        }
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        framePrincipal.cambiarPanelPlacasTipoAutomovil();
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtLinea;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtNumeroSerie;
    // End of variables declaration//GEN-END:variables

}
