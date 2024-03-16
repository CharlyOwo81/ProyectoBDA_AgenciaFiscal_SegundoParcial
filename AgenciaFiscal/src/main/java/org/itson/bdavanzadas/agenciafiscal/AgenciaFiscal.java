/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.itson.bdavanzadas.agenciafiscal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.itson.bdavanzadas.agenciafiscal_dominio.Contribuyente;
import org.itson.bdavanzadas.agenciafiscal_persistencia.ContribuyenteDAO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dtos.ContribuyenteNuevoDTO;

/**
 *
 * @author gamaliel
 */
public class AgenciaFiscal {

    public static void main(String[] args) throws ParseException {
        String fechaString = "1998-12-31"; // Fecha en formato "yyyy-MM-dd"
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date fecha = sdf.parse(fechaString);
        
        ContribuyenteDAO contriDAO= new ContribuyenteDAO(); 
        Contribuyente contri = contriDAO.agregarContribuyente(
                new ContribuyenteNuevoDTO("YEPY981231RF5","Yolanda", "Yépiz", "Puentes", 
                        "6432134567", fecha));
    }
}
