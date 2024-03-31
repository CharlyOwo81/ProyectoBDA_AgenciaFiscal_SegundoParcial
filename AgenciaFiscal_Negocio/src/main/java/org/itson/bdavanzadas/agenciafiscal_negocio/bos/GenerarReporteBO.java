/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.bdavanzadas.agenciafiscal_negocio.bos;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.FiltroReporteDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.TramiteNuevoDTO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.daos.IConexion;
import org.itson.bdavanzadas.agenciafiscal_persistencia.daos.ITramiteDAO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Tramite;

/**
 *
 * @author gamaliel
 */
public class GenerarReporteBO implements IGenerarReporte{
    private IConexion conexion;
    private ITramiteDAO tramitesDAO;
    private FiltroReporteDTO filtros;
    private List<TramiteNuevoDTO> listaTramites;

    public GenerarReporteBO(IConexion conexion, ITramiteDAO tramitesDAO) {
        this.conexion = conexion;
        this.tramitesDAO = tramitesDAO;
    }

    @Override
    public void setFiltroReporteDTO(FiltroReporteDTO filtros) {
        this.filtros = filtros;
    }

    @Override
    public FiltroReporteDTO getFiltro() {
        return filtros;
    }

    @Override
    public List<TramiteNuevoDTO> consultarTramites() {
//        List<TramiteNuevoDTO> tramitesFiltrados = null;
//        List<Tramite> tramites = tramitesDAO.consultarTramitesConFiltro(
//                filtros.getTipoTramite(),
//                filtros.getNombre(),
//                filtros.getDesde(),
//                filtros.getHasta());
//
//        if (tramites != null) {
//            tramitesFiltrados = new ArrayList<>();
//            for (Tramite tramite : tramites) {
//                // Obtener la instancia actual de Calendar
//
//                SimpleDateFormat formatoFechaHora = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//
//                String fechaHoraFormateada = formatoFechaHora.format(tramite.getFechaExpedicion().getTime());
//
//                System.out.println(fechaHoraFormateada);
//                TramiteNuevoDTO reporte = new TramiteNuevoDTO(tramite.getContribuyente().getNombre(), tramite.getClass().getSimpleName(), fechaHoraFormateada, tramite.getCosto());
//
//                tramitesFiltrados.add(reporte);
//            }
//        }

        return null;
    }
    
    
}
