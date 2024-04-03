/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.bdavanzadas.agenciafiscal_negocio.bos;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import org.itson.bdavanzadas.agenciafiscal_negocio.excepciones.ValidacionDTOException;

/**
 *
 * @author gamaliel
 */
public class CalcularEdadContribuyente {
   
    public static Integer calcularEdad(Date fechaNacimiento) {
        LocalDate fechaNacimientoLocalDate = fechaNacimiento.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate fechaActual = LocalDate.now();
        return Math.toIntExact(ChronoUnit.YEARS.between(fechaNacimientoLocalDate, fechaActual));
    }

    public static void validarEdad(Integer edad, Integer edadMinimaRequerida) throws ValidacionDTOException {
        if (edad < edadMinimaRequerida) {
            throw new ValidacionDTOException("El contribuyente debe tener al menos " + edadMinimaRequerida + " años para tramitar la licencia.");
        }
    }
}
