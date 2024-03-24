package org.itson.bdavanzadas.agenciafiscal_presentacion;

import org.itson.bdavanzadas.agenciafiscal_presentacion.FramePrincipal;

/**
 *
 * @author Roberto García
 */
public class PanelConfirmarSalir extends javax.swing.JPanel {
    FramePrincipal framePrincipal;
    Integer seleccion;
    
    /** Creates new form PanelConfirmarSalir */
    public PanelConfirmarSalir(FramePrincipal framePrincipal, Integer seleccion) {
        this.framePrincipal = framePrincipal;
        this.seleccion = seleccion;
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

        btnCambiar = new javax.swing.JButton();
        btnContinuar = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1000, 580));
        setMinimumSize(new java.awt.Dimension(1000, 580));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCambiar.setBorder(null);
        btnCambiar.setBorderPainted(false);
        btnCambiar.setContentAreaFilled(false);
        btnCambiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCambiar.setOpaque(false);
        btnCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarActionPerformed(evt);
            }
        });
        add(btnCambiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 411, 144, 50));

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
        add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(524, 411, 144, 50));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panelConfirmarSalir.png"))); // NOI18N
        add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarActionPerformed
        if (seleccion==1) {
            framePrincipal.cambiarPanelTramites();
        }
//        TODO navegación hacia consultas y reportes
//        if (seleccion==2) {
//            framePrincipal.cambiar();
//        }
//        if (seleccion==3) {
//            framePrincipal.cambiarPanelTramites();
//        }
        if (seleccion==4) {
            framePrincipal.cambiarPanelContribuyentes();
        }
        
//        return switch (anios) {
//        case 1 -> contribuyenteDTO.getDiscapacidad() == ContribuyenteDiscapacidad.NO ? 600F : 200F;
//        case 2 -> contribuyenteDTO.getDiscapacidad() == ContribuyenteDiscapacidad.NO ? 900F : 500F;
//        case 3 -> contribuyenteDTO.getDiscapacidad() == ContribuyenteDiscapacidad.NO ? 1100F : 700F;
//        default -> null; // En caso de que la vigencia no sea 1, 2 o 3 años
   
        
    }//GEN-LAST:event_btnCambiarActionPerformed

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        framePrincipal.remove(this);
    }//GEN-LAST:event_btnContinuarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCambiar;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JLabel lblFondo;
    // End of variables declaration//GEN-END:variables

}
