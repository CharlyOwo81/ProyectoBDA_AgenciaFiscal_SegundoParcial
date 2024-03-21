/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.itson.bdavanzadas.agenciafiscal;

import java.util.Date;
import java.util.GregorianCalendar;
import static org.itson.bdavanzadas.agenciafiscal_dominio.TipoLicencia.ESTANDAR;
import org.itson.bdavanzadas.agenciafiscal_dominio.TramiteLicencia;
import org.itson.bdavanzadas.agenciafiscal_persistencia.LicenciaDAO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dtos.TramiteLicenciaNuevaDTO;

/**
 *
 * @author gamaliel
 */
public class AgenciaFiscal {

    public static void main(String[] args){
        
//        try {
//            String fechaString = "1970-03-21"; // Fecha en formato "yyyy-MM-dd"
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//            Date fecha = sdf.parse(fechaString);
//            
//            
//            ContribuyenteDAO contriDAO= new ContribuyenteDAO();
////            Contribuyente contri = contriDAO.agregarContribuyente(
////                    new ContribuyenteNuevoDTO("RUCJ700321WE2",
////                            "José", "Ruíz", "Chávez","6432133124", fecha, true));
//        } catch (ParseException ex) {
//            Logger.getLogger(AgenciaFiscal.class.getName()).log(Level.SEVERE, null, ex);
//        }

        GregorianCalendar calendario = new GregorianCalendar();
        Date fecha = calendario.getTime();
//        LicenciaDAO licenciaDAO = new LicenciaDAO();
//        TramiteLicencia nuevaLicencia = licenciaDAO.agregarLicencia(new TramiteLicenciaNuevaDTO(1, ESTANDAR, 600F, fecha));
    }
}
