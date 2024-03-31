/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.bdavanzadas.agenciafiscal_negocio.bos;

import java.util.List;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.FiltroReporteDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.TramiteNuevoDTO;

/**
 *
 * @author gamaliel
 */
public interface IGenerarReporte {
    void setFiltroReporteDTO(FiltroReporteDTO filtros);
    FiltroReporteDTO getFiltro();
    List<TramiteNuevoDTO> consultarTramites();
}
