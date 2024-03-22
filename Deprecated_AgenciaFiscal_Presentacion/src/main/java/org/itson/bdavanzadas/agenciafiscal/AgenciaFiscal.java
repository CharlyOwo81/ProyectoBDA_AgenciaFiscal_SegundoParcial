/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.itson.bdavanzadas.agenciafiscal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Contribuyente;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.ContribuyenteDiscapacidad;
import org.itson.bdavanzadas.agenciafiscal_persistencia.daos.Conexion;
import org.itson.bdavanzadas.agenciafiscal_persistencia.daos.ContribuyenteDAO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.daos.IConexion;

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
            
        } catch (ParseException ex) {
            Logger.getLogger(AgenciaFiscal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
