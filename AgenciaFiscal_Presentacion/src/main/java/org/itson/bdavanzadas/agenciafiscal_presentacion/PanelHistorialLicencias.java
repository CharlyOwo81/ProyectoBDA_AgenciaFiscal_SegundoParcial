package org.itson.bdavanzadas.agenciafiscal_presentacion;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.text.SimpleDateFormat;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.LicenciaNuevaDTO;

/**
 *
 * @author Roberto García
 */
public class PanelHistorialLicencias extends javax.swing.JPanel {

    FramePrincipal framePrincipal;

    /**
     * Creates new form PanelHistorialLicencias
     */
    public PanelHistorialLicencias(FramePrincipal framePrincipal) {
        this.framePrincipal = framePrincipal;
        initComponents();
        setTabla();
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
        btnRegresar = new javax.swing.JButton();
        btnPlacas = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLicencias = new javax.swing.JTable();
        lblFondo = new javax.swing.JLabel();

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
        add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 500, 137, 40));

        btnPlacas.setBorder(null);
        btnPlacas.setBorderPainted(false);
        btnPlacas.setContentAreaFilled(false);
        btnPlacas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPlacas.setOpaque(false);
        btnPlacas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlacasActionPerformed(evt);
            }
        });
        add(btnPlacas, new org.netbeans.lib.awtextra.AbsoluteConstraints(818, 505, 119, 30));

        jScrollPane1.setBackground(new java.awt.Color(250, 248, 245));
        jScrollPane1.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N

        tblLicencias.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        tblLicencias.setForeground(new java.awt.Color(0, 0, 0));
        tblLicencias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Costo", "Fecha de Emisión", "Años de Vigencia", "Tipo de Licencia", "Fecha de Vencimiento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLicencias.setToolTipText("");
        tblLicencias.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        tblLicencias.setColumnSelectionAllowed(true);
        tblLicencias.setRowHeight(25);
        tblLicencias.setRowMargin(1);
        tblLicencias.setShowGrid(true);
        tblLicencias.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblLicencias);
        tblLicencias.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 264, 590, 220));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panelHistorialLicencias.png"))); // NOI18N
        add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed

        framePrincipal.setContribuyenteDTO(null);
        framePrincipal.setLicenciasDTOs(null);
        framePrincipal.setPlacasDTOs(null);

        framePrincipal.cambiarPanelHistorialSeleccion();// TODO add your handling code here:
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnPlacasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlacasActionPerformed
        framePrincipal.cambiarPanelHistorialPlacas();
    }//GEN-LAST:event_btnPlacasActionPerformed

    private void btnTramitesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTramitesActionPerformed
        if (framePrincipal.mostrarConfirmacion("Perderás el progreso del trámite actual", "¿Deseas cambiar de módulo?")) {
            framePrincipal.setContribuyenteDTOs(null);
            framePrincipal.setPanelAnterior(null);
            framePrincipal.setContribuyenteDTO(null);
            framePrincipal.setLicenciasDTOs(null);
            framePrincipal.setPlacasDTOs(null);
            framePrincipal.cambiarPanelTramites();
        }
    }//GEN-LAST:event_btnTramitesActionPerformed

    private void btnConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultasActionPerformed
        if (framePrincipal.mostrarConfirmacion("Perderás el progreso del trámite actual", "¿Deseas regresar?")) {
            framePrincipal.setContribuyenteDTOs(null);
            framePrincipal.setPanelAnterior(null);
            framePrincipal.setContribuyenteDTO(null);
            framePrincipal.setLicenciasDTOs(null);
            framePrincipal.setPlacasDTOs(null);
            framePrincipal.cambiarPanelHistorialTipoBusqueda();
        }
    }//GEN-LAST:event_btnConsultasActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        if (framePrincipal.mostrarConfirmacion("Perderás el progreso del trámite actual", "¿Deseas cambiar de módulo?")) {
            framePrincipal.setContribuyenteDTOs(null);
            framePrincipal.setPanelAnterior(null);
            framePrincipal.setContribuyenteDTO(null);
            framePrincipal.setLicenciasDTOs(null);
            framePrincipal.setPlacasDTOs(null);
            framePrincipal.cambiarPanelReportesBusqueda();
        }
    }//GEN-LAST:event_btnReportesActionPerformed

    private void btnContribuyentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContribuyentesActionPerformed
        if (framePrincipal.mostrarConfirmacion("Perderás el progreso del trámite actual", "¿Deseas cambiar de módulo?")) {
            framePrincipal.setContribuyenteDTOs(null);
            framePrincipal.setPanelAnterior(null);
            framePrincipal.setContribuyenteDTO(null);
            framePrincipal.setLicenciasDTOs(null);
            framePrincipal.setPlacasDTOs(null);
            framePrincipal.cambiarPanelContribuyentes();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnContribuyentesActionPerformed

    private void setTabla() {
        DefaultTableModel modelo = (DefaultTableModel) tblLicencias.getModel();
        for (LicenciaNuevaDTO licenciaDTO : framePrincipal.getLicenciasDTOs()) {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            String fechaEmision = formatoFecha.format(licenciaDTO.getFechaEmision());
            String fechaVencimiento = formatoFecha.format(licenciaDTO.getFechaVencimiento());
            Object[] datosFila = {
                licenciaDTO.getCosto(),
                fechaEmision,
                licenciaDTO.getVigencia(),
                licenciaDTO.getTipoLicencia(),
                fechaVencimiento
            };
            modelo.addRow(datosFila);
        }

        JTableHeader cabecera = tblLicencias.getTableHeader();
        cabecera.setDefaultRenderer(new PanelHistorialLicencias.MultiLineHeaderRenderer());
        setTamañoTitulos();

    }

    private class MultiLineHeaderRenderer extends DefaultTableCellRenderer {

//        }
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value,
                boolean isSelected, boolean hasFocus, int row, int column) {
            JLabel label = (JLabel) super.getTableCellRendererComponent(table, value,
                    isSelected, hasFocus, row, column);
            label.setHorizontalAlignment(SwingConstants.CENTER); // Centra el texto
            label.setVerticalAlignment(SwingConstants.NORTH);
            Color lightGray = new Color(248, 248, 248);
            label.setBackground(lightGray);
            label.setBorder(BorderFactory.createLineBorder(Color.GRAY));
//            label.setText("<html><center>" + value.toString().replaceAll("\\n", "<br>"));
            label.setText("<html><div style='text-align:center;'>" + value.toString().replace("\\n", "<br>") + "</html>");
            return label;
        }
    }

    private void setTamañoTitulos() {
        TableColumnModel columnModel = tblLicencias.getColumnModel();
        for (int i = 0; i < columnModel.getColumnCount(); i++) {
            TableColumn column = columnModel.getColumn(i);
            TableCellRenderer headerRenderer = column.getHeaderRenderer();
            if (headerRenderer == null) {
                headerRenderer = tblLicencias.getTableHeader().getDefaultRenderer();
            }
            Component headerComp = headerRenderer.getTableCellRendererComponent(tblLicencias, column.getHeaderValue(), false, false, 0, i);
            int headerHeight = headerComp.getPreferredSize().height;
            tblLicencias.getTableHeader().setPreferredSize(new Dimension(tblLicencias.getTableHeader().getPreferredSize().width, headerHeight * 2)); // Multiplica por 2 para asegurar que quepa todo el texto
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultas;
    private javax.swing.JButton btnContribuyentes;
    private javax.swing.JButton btnPlacas;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnTramites;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JTable tblLicencias;
    // End of variables declaration//GEN-END:variables

}
