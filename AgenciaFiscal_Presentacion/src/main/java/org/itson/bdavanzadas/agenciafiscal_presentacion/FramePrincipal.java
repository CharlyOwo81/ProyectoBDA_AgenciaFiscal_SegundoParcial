package org.itson.bdavanzadas.agenciafiscal_presentacion;


import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.ContribuyenteDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.LicenciaNuevaDTO;
/**
 *
 * @author rover
 */
public class FramePrincipal extends javax.swing.JFrame {

    private JPanel panelActual;
    private ContribuyenteDTO contribuyenteDTO;
    private LicenciaNuevaDTO tramiteLicenciaDTO;
    /**
     * Creates new form Ventana
     */
    public FramePrincipal() {
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Red Única de Trámites");
        setMinimumSize(new java.awt.Dimension(1000, 580));
        setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    /**
     * Método para limpiar el contenido de la ventana. Si hay un panel
     * actualmente mostrado, lo elimina de la ventana.
     */
    public void limpiarFrame() {
        if (panelActual != null) {
        this.remove(panelActual);
            panelActual = null;
        }
    }
    
    /**
     * Método para agregar un panel a la ventana. Este método agrega el panel
     * especificado a la ventana, lo posiciona y ajusta su tamaño
     * automáticamente.
     *
     * @param panel El panel que se va a agregar a la ventana.
     */
    public void ponerEnJFrame(JPanel panel) {
        this.add(panel);
        panel.setBounds(0, 0, 1000, 580);
        this.setLocationRelativeTo(null);
        this.pack();  // Ajustar el tamaño automáticamente
    }

    /**
     * Método para cambiar a la vista de inicio de la agencia. Este método elimina
     * el panel actual y muestra la vista de inicio de la agencia.
     */
    public void cambiarPanelInicio() {
        limpiarFrame();
        PanelInicio vistaInicio = new PanelInicio(this);
        ponerEnJFrame(vistaInicio);
        panelActual = vistaInicio;
    }
    
    public void cambiarPanelTramites() {
        limpiarFrame();
        PanelTramites panelTramites = new PanelTramites(this);
        ponerEnJFrame(panelTramites);
        panelActual = panelTramites;
    }  
    
    public void cambiarPanelLicencia() {
        limpiarFrame();
        PanelLicencia panelLicencia = new PanelLicencia(this);
        ponerEnJFrame(panelLicencia);
        panelActual = panelLicencia;
    }
    
    public void cambiarPanelContribuyentes() {
        limpiarFrame();
        PanelContribuyentes panelContribuyentes = new PanelContribuyentes(this);
        ponerEnJFrame(panelContribuyentes);
        panelActual = panelContribuyentes;

    }
    
    public void cambiarPanelLicenciaAnios() {
        limpiarFrame();
        PanelLicenicaAnios panelLicenicaAnios = new PanelLicenicaAnios(this);
        ponerEnJFrame(panelLicenicaAnios);
        panelActual = panelLicenicaAnios;

    }
    
    public void cambiarPanelLicenciaExito() {
        limpiarFrame();
        PanelLicenciaExito panelLicenciaExito = new PanelLicenciaExito(this);
        ponerEnJFrame(panelLicenciaExito);
        panelActual = panelLicenciaExito;

    }
    
//    TODO habilitar este método para mostrar la ventana
//    public void cambiarPanelConfirmarSalir(Integer seleccion) {
//        JLayeredPane layeredPane = new JLayeredPane(); // Crear un JLayeredPane local
//        PanelConfirmarSalir panelConfirmarSalir = new PanelConfirmarSalir(this, seleccion);
//        layeredPane.add(panelConfirmarSalir, JLayeredPane.MODAL_LAYER); // Agregar el panel al JLayeredPane local
//        panelConfirmarSalir.setBounds(0, 0, 1000, 580);
//        panelConfirmarSalir.setLocationRelativeTo(null);
//        
//        // Mostrar el JLayeredPane local en el JFrame
//        this.setContentPane(layeredPane);
//        this.revalidate();
//        this.repaint();
//    }
//    
    /**
     * Método para mostrar un aviso al usuario mediante una ventana emergente.
     *
     * @param mensaje El mensaje a mostrar en el aviso.
     */
    public void mostrarAviso(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Aviso", JOptionPane.WARNING_MESSAGE);
    }

    /**
     * Método para mostrar una ventana emergente de confirmación al usuario.
     *
     * @param mensaje El mensaje a mostrar en la ventana de confirmación.
     * @param titulo El título de la ventana de confirmación.
     * @return true si el usuario selecciona "OK", false si selecciona
     * "Cancelar".
     */
    public boolean mostrarConfirmacion(String mensaje, String titulo) {
        int respuesta = JOptionPane.showConfirmDialog(null, mensaje, titulo, JOptionPane.OK_CANCEL_OPTION);
        return respuesta == JOptionPane.OK_OPTION;
    }

    /**
     * Método para mostrar una ventana emergente de información al usuario.
     *
     * @param mensaje El mensaje a mostrar en la ventana de información.
     * @param titulo El título de la ventana de información.
     */
    public void mostrarInformacion(String mensaje, String titulo) {
        JOptionPane.showMessageDialog(this, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
    }

    public JPanel getPanelActual() {
        return panelActual;
    }

    public void setPanelActual(JPanel panelActual) {
        this.panelActual = panelActual;
    }

    public ContribuyenteDTO getContribuyenteDTO() {
        return contribuyenteDTO;
    }

    public void setContribuyenteDTO(ContribuyenteDTO contribuyenteDTO) {
        this.contribuyenteDTO = contribuyenteDTO;
    }

    public LicenciaNuevaDTO getTramiteLicenciaDTO() {
        return tramiteLicenciaDTO;
    }

    public void setTramiteLicenciaDTO(LicenciaNuevaDTO tramiteLicenciaDTO) {
        this.tramiteLicenciaDTO = tramiteLicenciaDTO;
    }
    
    
}
