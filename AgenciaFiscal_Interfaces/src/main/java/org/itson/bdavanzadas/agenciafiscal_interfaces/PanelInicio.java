/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package org.itson.bdavanzadas.agenciafiscal_interfaces;

import javax.swing.JOptionPane;

/**
 *
 * @author rover
 */
public class PanelInicio extends javax.swing.JPanel {

    private FramePrincipal framePrincipal;

    /**
     * Creates new form Inicio
     */
    public PanelInicio(FramePrincipal framePrincipal) {
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
        lblFondo = new javax.swing.JLabel();
        lblBienvenido = new javax.swing.JLabel();
        lblTexto = new javax.swing.JLabel();
        lblTitulo1 = new javax.swing.JLabel();
        lblTitulo2 = new javax.swing.JLabel();
        lblContribuyentes = new javax.swing.JLabel();
        lblReportes = new javax.swing.JLabel();
        lblConsultas = new javax.swing.JLabel();
        lblTramites = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1000, 580));
        setMinimumSize(new java.awt.Dimension(1000, 580));
        setPreferredSize(new java.awt.Dimension(1000, 580));
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

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panelInicio.png"))); // NOI18N
        lblFondo.setToolTipText("");
        add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblBienvenido.setFont(new java.awt.Font("Montserrat", 0, 56)); // NOI18N
        lblBienvenido.setForeground(new java.awt.Color(137, 21, 71));
        lblBienvenido.setText("BIENVENID@");
        add(lblBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, -1, -1));

        lblTexto.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        lblTexto.setForeground(new java.awt.Color(116, 71, 48));
        lblTexto.setText("Selecciona una opción del menú para comenzar");
        add(lblTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 480, 30));

        lblTitulo1.setFont(new java.awt.Font("Montserrat", 0, 26)); // NOI18N
        lblTitulo1.setForeground(new java.awt.Color(155, 90, 23));
        lblTitulo1.setText("Red Única de Trámites");
        add(lblTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 26, -1, -1));

        lblTitulo2.setFont(new java.awt.Font("Montserrat", 1, 26)); // NOI18N
        lblTitulo2.setForeground(new java.awt.Color(116, 71, 48));
        lblTitulo2.setText("Proyecto RUTRA");
        add(lblTitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 66, -1, -1));

        lblContribuyentes.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        lblContribuyentes.setForeground(new java.awt.Color(155, 90, 23));
        lblContribuyentes.setText("Contribuyentes");
        add(lblContribuyentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 416, -1, -1));

        lblReportes.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        lblReportes.setForeground(new java.awt.Color(155, 90, 23));
        lblReportes.setText("Reportes");
        add(lblReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 369, -1, -1));

        lblConsultas.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        lblConsultas.setForeground(new java.awt.Color(155, 90, 23));
        lblConsultas.setText("Consultas");
        add(lblConsultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 322, -1, -1));

        lblTramites.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        lblTramites.setForeground(new java.awt.Color(155, 90, 23));
        lblTramites.setText("Trámites");
        add(lblTramites, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 275, -1, -1));
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultas;
    private javax.swing.JButton btnContribuyentes;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnTramites;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JLabel lblConsultas;
    private javax.swing.JLabel lblContribuyentes;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblReportes;
    private javax.swing.JLabel lblTexto;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JLabel lblTitulo2;
    private javax.swing.JLabel lblTramites;
    // End of variables declaration//GEN-END:variables
}
