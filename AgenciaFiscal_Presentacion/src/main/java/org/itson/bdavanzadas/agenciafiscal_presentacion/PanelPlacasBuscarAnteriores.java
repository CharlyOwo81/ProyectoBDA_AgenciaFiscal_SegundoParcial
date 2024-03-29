package org.itson.bdavanzadas.agenciafiscal_presentacion;

import org.itson.bdavanzadas.agenciafiscal_negocio.bos.IValidarPlacasBO;
import org.itson.bdavanzadas.agenciafiscal_negocio.bos.ValidarPlacasBO;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.AutomovilNuevoDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.PlacasNuevasDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.PlacasViejasDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.excepciones.ValidacionDTOException;
import org.itson.bdavanzadas.agenciafiscal_persistencia.excepciones.PersistenciaException;

/**
 *
 * @author Roberto García
 */
public class PanelPlacasBuscarAnteriores extends javax.swing.JPanel {

    FramePrincipal framePrincipal;
    PlacasViejasDTO placasViejasDTO;
    AutomovilNuevoDTO automovilNuevoDTO;
    /** Creates new form PanelPlacasBuscarAnteriores */
    public PanelPlacasBuscarAnteriores(FramePrincipal framePrincipal) {
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

        btnRegresar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnContinuar = new javax.swing.JButton();
        txtPlacas = new javax.swing.JTextField();
        lblAutomovil = new javax.swing.JLabel();
        lblPlacas = new javax.swing.JLabel();
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
        add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 386, 137, 40));

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
        add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 386, 137, 40));

        txtPlacas.setBackground(new java.awt.Color(250, 248, 245));
        txtPlacas.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        txtPlacas.setToolTipText("");
        txtPlacas.setName(""); // NOI18N
        txtPlacas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlacasActionPerformed(evt);
            }
        });
        add(txtPlacas, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 278, 250, 30));

        lblAutomovil.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        lblAutomovil.setForeground(new java.awt.Color(77, 77, 77));
        add(lblAutomovil, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 326, 583, 20));

        lblPlacas.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        lblPlacas.setForeground(new java.awt.Color(77, 77, 77));
        add(lblPlacas, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 346, 583, 20));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panelPlacasBuscarAnteriores.png"))); // NOI18N
        add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        framePrincipal.cambiarPanelPlacasTipoAutomovil();// TODO add your handling code here:
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        if (txtPlacas.getText().isBlank()) {
            framePrincipal.mostrarAviso("El campo de número de placa no puede estar vacío");
        }else{
            String placas = txtPlacas.getText();
            placasViejasDTO = new PlacasViejasDTO(txtPlacas.getText());
            IValidarPlacasBO validarPlacasBO = new ValidarPlacasBO(placasViejasDTO);
            try {
                PlacasNuevasDTO placasNuevasDTO = validarPlacasBO.validarPlacas();
                framePrincipal.mostrarAviso("Placas encontradas con exito: " + placasNuevasDTO.getNumeroPlacas());
                framePrincipal.cambiarPanelPlacasConfirmar();
            } catch (ValidacionDTOException | PersistenciaException ex) {
                framePrincipal.mostrarAviso(ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void txtPlacasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlacasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlacasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel lblAutomovil;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblPlacas;
    private javax.swing.JTextField txtPlacas;
    // End of variables declaration//GEN-END:variables

}
