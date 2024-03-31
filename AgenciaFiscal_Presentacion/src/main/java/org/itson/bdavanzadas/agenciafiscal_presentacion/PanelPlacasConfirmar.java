package org.itson.bdavanzadas.agenciafiscal_presentacion;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.itson.bdavanzadas.agenciafiscal_negocio.bos.AgregarAutomovilBO;
import org.itson.bdavanzadas.agenciafiscal_negocio.bos.IAgregarAutomovilBO;
import org.itson.bdavanzadas.agenciafiscal_negocio.bos.IRegistrarLicenciaBO;
import org.itson.bdavanzadas.agenciafiscal_negocio.bos.IRegistrarPlacasBO;
import org.itson.bdavanzadas.agenciafiscal_negocio.bos.IVencerPlacasBO;
import org.itson.bdavanzadas.agenciafiscal_negocio.bos.RegistrarPlacasBO;
import org.itson.bdavanzadas.agenciafiscal_negocio.bos.VencerPlacasBO;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.AutomovilNuevoDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.ContribuyenteDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.PlacasNuevasDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.PlacasViejasDTO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.excepciones.PersistenciaException;

/**
 *
 * @author Roberto García
 */
public class PanelPlacasConfirmar extends javax.swing.JPanel {

    FramePrincipal framePrincipal;
    AutomovilNuevoDTO automovilNuevoDTO;
    ContribuyenteDTO contribuyenteDTO;
    PlacasNuevasDTO placasNuevasDTO;
    PlacasViejasDTO placasViejasDTO;

    /**
     * Creates new form panelPlacasConfirmar
     */
    public PanelPlacasConfirmar(FramePrincipal framePrincipal) {
        this.framePrincipal = framePrincipal;
        this.contribuyenteDTO = framePrincipal.getContribuyenteDTO();
        this.automovilNuevoDTO = framePrincipal.getAutomovilNuevoDTO();
        if (framePrincipal.getPlacasViejasDTO() == null) {
            this.placasNuevasDTO = framePrincipal.getPlacasNuevasDTO();
        } else {
            this.placasViejasDTO = framePrincipal.getPlacasViejasDTO();
        }
        initComponents();
        setTextos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnConfirmar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        lblTipoTramite = new javax.swing.JLabel();
        lblCosto = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1000, 580));
        setMinimumSize(new java.awt.Dimension(1000, 580));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 367, 137, 40));

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
        add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(648, 367, 137, 40));

        lblTipoTramite.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        lblTipoTramite.setForeground(new java.awt.Color(137, 21, 71));
        add(lblTipoTramite, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 276, 230, 20));

        lblCosto.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        lblCosto.setForeground(new java.awt.Color(137, 21, 71));
        add(lblCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 332, 230, 20));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panelPlacasConfirmar.png"))); // NOI18N
        lblFondo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        // TODO validar con automovilNuevoDTO
        try {
            if (placasViejasDTO == null) {
                registrarAuto();
            } else {
                vencerPlacas();
            }
            registrarPlacas();
            framePrincipal.cambiarPanelPlacasExito();

        } catch (PersistenciaException e) {
            framePrincipal.mostrarAviso(e.getMessage());
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        if (placasViejasDTO == null) {
            framePrincipal.cambiarPanelPlacasAgregarAutomovil();
        } else {
            framePrincipal.cambiarPanelPlacasBuscarAnteriores();
        }


    }//GEN-LAST:event_btnRegresarActionPerformed

    private void registrarPlacas() throws PersistenciaException {
        placasNuevasDTO.setContribuyenteDTO(contribuyenteDTO);
        IRegistrarPlacasBO registrarPlacasBO = new RegistrarPlacasBO(placasNuevasDTO);
        placasNuevasDTO = registrarPlacasBO.registrarPlacas(automovilNuevoDTO);
        framePrincipal.setPlacasNuevasDTO(placasNuevasDTO);

    }

    private void registrarAuto() throws PersistenciaException {
        automovilNuevoDTO = framePrincipal.getAutomovilNuevoDTO();
        IAgregarAutomovilBO agregarAutomovilBO = new AgregarAutomovilBO(automovilNuevoDTO);
        automovilNuevoDTO = agregarAutomovilBO.agregarAutomovil(contribuyenteDTO);
    }

    private void setTextos() {
        if (placasViejasDTO == null) {
            lblTipoTramite.setText("Placas nuevas");
            lblCosto.setText("$1500.00");
            placasNuevasDTO = new PlacasNuevasDTO(1500.0F, new Date(), contribuyenteDTO);
        } else {
            lblTipoTramite.setText("Renovación");
            lblCosto.setText("$1000.00");
            placasNuevasDTO = new PlacasNuevasDTO(1000.0F, new Date(), contribuyenteDTO);

        }
    }

    private void vencerPlacas() throws PersistenciaException{
        IVencerPlacasBO vencerPlacasBO = new VencerPlacasBO(placasViejasDTO);
        placasViejasDTO = vencerPlacasBO.vencerPlacas();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel lblCosto;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblTipoTramite;
    // End of variables declaration//GEN-END:variables

}
