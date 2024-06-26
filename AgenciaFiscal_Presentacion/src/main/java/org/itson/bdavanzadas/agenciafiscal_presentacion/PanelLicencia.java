/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package org.itson.bdavanzadas.agenciafiscal_presentacion;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.itson.bdavanzadas.agenciafiscal_negocio.bos.BuscarPorRfcBO;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.BuscarContribyenteRFCDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.ContribuyenteDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.excepciones.ValidacionDTOException;
import org.itson.bdavanzadas.agenciafiscal_persistencia.excepciones.PersistenciaException;

/**
 *
 * @author rover
 */
public class PanelLicencia extends javax.swing.JPanel {

    private FramePrincipal framePrincipal;
    private ContribuyenteDTO contribuyenteDTO;

    /**
     * Creates new form Inicio
     *
     * @param framePrincipal
     */
    public PanelLicencia(FramePrincipal framePrincipal) {
        this.framePrincipal = framePrincipal;
        initComponents();
        this.contribuyenteDTO = this.framePrincipal.getContribuyenteDTO();
        if (contribuyenteDTO != null) {
            setTextos(contribuyenteDTO);
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
        btnCancelar = new javax.swing.JButton();
        btnContinuar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtRfc = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        lblApellidoPaterno = new javax.swing.JLabel();
        lblApellidoMaterno = new javax.swing.JLabel();
        lblNumeroTelefono = new javax.swing.JLabel();
        lblFechaNacimiento = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(648, 485, 137, 40));

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
        add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 485, 137, 40));

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
        add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 273, 137, 40));

        txtRfc.setBackground(new java.awt.Color(250, 248, 245));
        txtRfc.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        txtRfc.setToolTipText("");
        txtRfc.setName(""); // NOI18N
        add(txtRfc, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 278, 250, 30));

        lblNombre.setFont(new java.awt.Font("Montserrat SemiBold", 0, 16)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(77, 77, 77));
        lblNombre.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblNombre.setFocusable(false);
        add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 341, 280, -1));

        lblApellidoPaterno.setFont(new java.awt.Font("Montserrat SemiBold", 0, 16)); // NOI18N
        lblApellidoPaterno.setForeground(new java.awt.Color(77, 77, 77));
        lblApellidoPaterno.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblApellidoPaterno.setFocusable(false);
        add(lblApellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 394, 280, -1));

        lblApellidoMaterno.setFont(new java.awt.Font("Montserrat SemiBold", 0, 16)); // NOI18N
        lblApellidoMaterno.setForeground(new java.awt.Color(77, 77, 77));
        lblApellidoMaterno.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblApellidoMaterno.setFocusable(false);
        add(lblApellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(634, 394, 280, -1));

        lblNumeroTelefono.setFont(new java.awt.Font("Montserrat SemiBold", 0, 16)); // NOI18N
        lblNumeroTelefono.setForeground(new java.awt.Color(77, 77, 77));
        lblNumeroTelefono.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblNumeroTelefono.setFocusable(false);
        add(lblNumeroTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 447, 280, -1));

        lblFechaNacimiento.setFont(new java.awt.Font("Montserrat SemiBold", 0, 16)); // NOI18N
        lblFechaNacimiento.setForeground(new java.awt.Color(77, 77, 77));
        lblFechaNacimiento.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblFechaNacimiento.setFocusable(false);
        add(lblFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 500, 290, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panelLicencia.png"))); // NOI18N
        lblFondo.setToolTipText("");
        add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        framePrincipal.setContribuyenteDTO(null);
        framePrincipal.cambiarPanelTramites();// TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        if (contribuyenteDTO == null) {
            framePrincipal.mostrarAviso("Proporciona un contribuyente válido");
        } else {
            framePrincipal.cambiarPanelLicenciaAnios();
        }
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        if (txtRfc.getText().isBlank()) {
            framePrincipal.mostrarAviso("El campo de RFC no puede estar vacío");
        } else {
            String rfc = txtRfc.getText();
            BuscarContribyenteRFCDTO buscarContribyenteRFCDTO = new BuscarContribyenteRFCDTO(rfc);
            BuscarPorRfcBO buscarPorRfcBO = new BuscarPorRfcBO(buscarContribyenteRFCDTO);

            try {
                contribuyenteDTO = buscarPorRfcBO.buscarContribuyente();
                setTextos(contribuyenteDTO);
                framePrincipal.setContribuyenteDTO(contribuyenteDTO);
            } catch (ValidacionDTOException ex) {
                framePrincipal.mostrarAviso(ex.getMessage());
            } catch (PersistenciaException ex) {
                framePrincipal.mostrarAviso(ex.getMessage());
                if (contribuyenteDTO != null) {
                    txtRfc.setText(contribuyenteDTO.getRfc());
                }
            }
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnTramitesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTramitesActionPerformed
        if (framePrincipal.mostrarConfirmacion("Perderás el progreso del trámite actual", "¿Deseas regresar?")) {            framePrincipal.setContribuyenteDTO(null);
            framePrincipal.cambiarPanelTramites();
        }
    }//GEN-LAST:event_btnTramitesActionPerformed

    private void btnConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultasActionPerformed
        if (framePrincipal.mostrarConfirmacion("Perderás el progreso del trámite actual", "¿Deseas cambiar de módulo?")) {
            framePrincipal.setContribuyenteDTO(null);
            framePrincipal.cambiarPanelHistorialTipoBusqueda();
        }
    }//GEN-LAST:event_btnConsultasActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        if (framePrincipal.mostrarConfirmacion("Perderás el progreso del trámite actual", "¿Deseas cambiar de módulo?")) {
            framePrincipal.setContribuyenteDTO(null);
            framePrincipal.cambiarPanelReportesBusqueda();
        }
    }//GEN-LAST:event_btnReportesActionPerformed

    private void btnContribuyentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContribuyentesActionPerformed
        if (framePrincipal.mostrarConfirmacion("Perderás el progreso del trámite actual", "¿Deseas cambiar de módulo?")) {
            framePrincipal.setContribuyenteDTO(null);
            framePrincipal.cambiarPanelContribuyentes();
        }
// TODO add your handling code here:
    }//GEN-LAST:event_btnContribuyentesActionPerformed

    private void setTextos(ContribuyenteDTO contribuyenteDTO) {
        txtRfc.setText(contribuyenteDTO.getRfc());
        lblNombre.setText(contribuyenteDTO.getNombre());
        lblApellidoPaterno.setText(contribuyenteDTO.getApellidoPaterno());
        lblApellidoMaterno.setText(contribuyenteDTO.getApellidoMaterno());
        lblNumeroTelefono.setText(contribuyenteDTO.getTelefono());
        lblFechaNacimiento.setText(convertirFechaATexto(contribuyenteDTO.getFechaNacimiento()));
    }

    private String convertirFechaATexto(Date fecha) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(fecha);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConsultas;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnContribuyentes;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnTramites;
    private javax.swing.JLabel lblApellidoMaterno;
    private javax.swing.JLabel lblApellidoPaterno;
    private javax.swing.JLabel lblFechaNacimiento;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumeroTelefono;
    private javax.swing.JTextField txtRfc;
    // End of variables declaration//GEN-END:variables
}
