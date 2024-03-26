package org.itson.bdavanzadas.agenciafiscal_presentacion;

import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.itson.bdavanzadas.agenciafiscal_negocio.bos.CalcularCostoLicenciaBO;
import org.itson.bdavanzadas.agenciafiscal_negocio.bos.RegistrarLicenciaBO;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.ContribuyenteDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.LicenciaNuevaDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.TramiteNuevoDTO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.ContribuyenteDiscapacidad;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.TipoLicencia;
import org.itson.bdavanzadas.agenciafiscal_persistencia.excepciones.PersistenciaException;

/**
 *
 * @author Roberto García
 */
public class PanelLicenicaAnios extends javax.swing.JPanel {

    private FramePrincipal framePrincipal;
    private CalcularCostoLicenciaBO calcularCostoLicenciaBO;
    private LicenciaNuevaDTO licenciaNuevaDTO;
    private ContribuyenteDTO contribuyenteDTO;
    private TipoLicencia tipoLicencia;
    private Float costo;
    private Integer vigencia;

    /**
     * Creates new form PanelLicenicaAnios
     */
    public PanelLicenicaAnios(FramePrincipal framePrincipal) {
        this.framePrincipal = framePrincipal;
        this.contribuyenteDTO = framePrincipal.getContribuyenteDTO();
        this.calcularCostoLicenciaBO = new CalcularCostoLicenciaBO(contribuyenteDTO);
        initComponents();
        setTipoLicencia();
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
        btnConfirmar = new javax.swing.JButton();
        btn1anio = new javax.swing.JButton();
        btn2anios = new javax.swing.JButton();
        btn3anios = new javax.swing.JButton();
        btnTramites = new javax.swing.JButton();
        btnConsultas = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        btnContribuyentes = new javax.swing.JButton();
        lblTipoLicencia = new javax.swing.JLabel();
        lblCosto = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1000, 580));
        setMinimumSize(new java.awt.Dimension(1000, 580));
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
        add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(648, 407, 137, 40));

        btnConfirmar.setBorder(null);
        btnConfirmar.setBorderPainted(false);
        btnConfirmar.setContentAreaFilled(false);
        btnConfirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfirmar.setOpaque(false);
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 407, 137, 40));

        btn1anio.setBorder(null);
        btn1anio.setBorderPainted(false);
        btn1anio.setContentAreaFilled(false);
        btn1anio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn1anio.setOpaque(false);
        btn1anio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1anioActionPerformed(evt);
            }
        });
        add(btn1anio, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 239, 86, 55));

        btn2anios.setBorder(null);
        btn2anios.setBorderPainted(false);
        btn2anios.setContentAreaFilled(false);
        btn2anios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn2anios.setOpaque(false);
        btn2anios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2aniosActionPerformed(evt);
            }
        });
        add(btn2anios, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 239, 86, 55));

        btn3anios.setBorder(null);
        btn3anios.setBorderPainted(false);
        btn3anios.setContentAreaFilled(false);
        btn3anios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn3anios.setOpaque(false);
        btn3anios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3aniosActionPerformed(evt);
            }
        });
        add(btn3anios, new org.netbeans.lib.awtextra.AbsoluteConstraints(577, 239, 86, 55));

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

        lblTipoLicencia.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        lblTipoLicencia.setForeground(new java.awt.Color(132, 21, 71));
        add(lblTipoLicencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 336, 300, 20));

        lblCosto.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        lblCosto.setForeground(new java.awt.Color(132, 21, 71));
        add(lblCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 382, 140, 20));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panelLicenciaAnios.png"))); // NOI18N
        lblFondo.setToolTipText("");
        add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        framePrincipal.cambiarPanelLicencia();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        if (vigencia == null) {
            framePrincipal.mostrarAviso("Seleccione un plazo de vigencia");
        } else {
            Calendar calendar = Calendar.getInstance();
            calendar.add(Calendar.YEAR, vigencia);
            Date fechaVencimiento = calendar.getTime();
            licenciaNuevaDTO = new LicenciaNuevaDTO(
                    vigencia,
                    tipoLicencia,
                    fechaVencimiento,
                    costo,
                    new Date(),
                    contribuyenteDTO);
            try {
                RegistrarLicenciaBO registrarLicenciaBO = new RegistrarLicenciaBO(licenciaNuevaDTO);
                registrarLicenciaBO.registrarLicencia(contribuyenteDTO);
                framePrincipal.setTramiteLicenciaDTO(licenciaNuevaDTO);
                framePrincipal.cambiarPanelLicenciaExito();
            } catch (PersistenciaException ex) {
                framePrincipal.mostrarAviso(ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btn1anioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1anioActionPerformed
        vigencia = 1;
        costo = calcularCostoLicenciaBO.calcularCosto(vigencia);
        lblCosto.setText("$" + String.valueOf(costo));
    }//GEN-LAST:event_btn1anioActionPerformed

    private void btn2aniosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2aniosActionPerformed
        vigencia = 2;
        costo = calcularCostoLicenciaBO.calcularCosto(vigencia);
        lblCosto.setText("$" + String.valueOf(costo));
     }//GEN-LAST:event_btn2aniosActionPerformed

    private void btn3aniosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3aniosActionPerformed
        vigencia = 3;
        costo = calcularCostoLicenciaBO.calcularCosto(vigencia);
        lblCosto.setText("$" + String.valueOf(costo));
    }//GEN-LAST:event_btn3aniosActionPerformed

    private void btnTramitesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTramitesActionPerformed

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
            framePrincipal.setTramiteLicenciaDTO(null);
            framePrincipal.cambiarPanelContribuyentes();
        }
    }//GEN-LAST:event_btnContribuyentesActionPerformed

    private void setTipoLicencia() {
        if (contribuyenteDTO.getDiscapacidad() == ContribuyenteDiscapacidad.NO) {
            lblTipoLicencia.setText("Estándar");
            tipoLicencia = TipoLicencia.ESTANDAR;
        } else {
            lblTipoLicencia.setText("Discapacitado");
            tipoLicencia = TipoLicencia.DISCAPACIDAD;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1anio;
    private javax.swing.JButton btn2anios;
    private javax.swing.JButton btn3anios;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnConsultas;
    private javax.swing.JButton btnContribuyentes;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnTramites;
    private javax.swing.JLabel lblCosto;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblTipoLicencia;
    // End of variables declaration//GEN-END:variables

}
