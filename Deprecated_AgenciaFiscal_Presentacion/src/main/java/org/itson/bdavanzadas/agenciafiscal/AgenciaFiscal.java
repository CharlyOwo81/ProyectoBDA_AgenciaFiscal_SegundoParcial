/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.itson.bdavanzadas.agenciafiscal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.itson.bdavanzadas.agenciafiscal_dominio.Contribuyente;
import org.itson.bdavanzadas.agenciafiscal_dominio.ContribuyenteDiscapacidad;
import org.itson.bdavanzadas.agenciafiscal_persistencia.Conexion;
import org.itson.bdavanzadas.agenciafiscal_persistencia.ContribuyenteDAO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.IConexion;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dtos.ContribuyenteNuevoDTO;

/**
 *
 * @author gamaliel
 */
public class AgenciaFiscal {

    public static void main(String[] args) {
        
        try {
            IConexion conexion = new Conexion();
            
            String fechaString = "1970-03-21"; // Fecha en formato "yyyy-MM-dd"
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            
            Date fecha = sdf.parse(fechaString);
            
            
            ContribuyenteDAO contriDAO = new ContribuyenteDAO(conexion);
            
            Contribuyente contri = contriDAO.agregarContribuyente(
                    new ContribuyenteNuevoDTO("RUCJ700321WE2","RUCJ",
                            "José", "Ruíz", "Chávez","6432133124", fecha, ContribuyenteDiscapacidad.SI));
        } catch (ParseException ex) {
            Logger.getLogger(AgenciaFiscal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
