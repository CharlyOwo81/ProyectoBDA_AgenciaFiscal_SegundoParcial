/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.bdavanzadas.agenciafiscal_persistencia;

import org.itson.bdavanzadas.agenciafiscal_dominio.TramiteLicencia;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dtos.TramiteLicenciaNuevaDTO;

/**
 *
 * @author gamaliel
 */
public interface ILicenciaDAO {
    public TramiteLicencia agregarLicencia(TramiteLicenciaNuevaDTO licenciaNueva);
}
