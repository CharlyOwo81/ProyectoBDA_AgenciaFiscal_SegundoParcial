/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.bdavanzadas.agenciafiscal_persistencia;

import org.itson.bdavanzadas.agenciafiscal_dominio.Contribuyente;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dtos.ContribuyenteNuevoDTO;

/**
 *
 * @author gamaliel
 */
public interface IContribuyenteDAO {
    public Contribuyente agregarContribuyente(ContribuyenteNuevoDTO contribuyenteNuevo);
}
