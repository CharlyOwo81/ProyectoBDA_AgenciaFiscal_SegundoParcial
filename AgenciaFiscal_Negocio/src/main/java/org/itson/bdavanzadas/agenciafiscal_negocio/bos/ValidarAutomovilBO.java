package org.itson.bdavanzadas.agenciafiscal_negocio.bos;

import java.time.LocalDate;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.AutomovilNuevoDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.excepciones.ValidacionDTOException;

/**
 *
 * @author Roberto García
 */
public class ValidarAutomovilBO implements IValidarAutomovilBO {

    private final AutomovilNuevoDTO automovilNuevoDTO;

    public ValidarAutomovilBO(AutomovilNuevoDTO automovilNuevoDTO) {
        this.automovilNuevoDTO = automovilNuevoDTO;
    }

    public boolean validarAutomovil() throws ValidacionDTOException {
        validarNumeroSerie();
        validarMarca();
        validarLinea();
        validarColor();
        validarModelo();
        validarFechaModelo();
        return true;
    }

    private boolean validarNumeroSerie() throws ValidacionDTOException {
        String regex = "^[a-zA-Z0-9]{17}$";
        String numeroSerie = automovilNuevoDTO.getNumeroSerie();
        if (numeroSerie.length() != 17) {
            throw new ValidacionDTOException("El número de serie debe contener 17 caracteres");
        } else if (!numeroSerie.matches(regex)) {
            throw new ValidacionDTOException("El número de serie solo debe contener letras y números");
        }
        return true;
    }

    private boolean validarMarca() throws ValidacionDTOException {
        String regex = "^[a-zA-Z\\sáéíóúÁÉÍÓÚüÜñÑ]{1,30}$";
        String marca = automovilNuevoDTO.getMarca();
        if (marca.length() > 30) {
            throw new ValidacionDTOException("El nombre de la marca no puede tener más de 30 caracteres");
        } else if (!marca.matches(regex)) {
            throw new ValidacionDTOException("El nombre de la marca solo debe contener letras");
        }
        return true;
    }

    private boolean validarLinea() throws ValidacionDTOException {
        String regex = "^[a-zA-Z\\sáéíóúÁÉÍÓÚüÜñÑ]{1,30}$";
        String linea = automovilNuevoDTO.getLinea();
        if (linea.length() > 30) {
            throw new ValidacionDTOException("La línea del automóvil no puede tener más de 30 caracteres");
        } else if (!linea.matches(regex)) {
            throw new ValidacionDTOException("La línea del automóvil solo debe contener letras");
        }
        return true;
    }

    private boolean validarColor() throws ValidacionDTOException {
        String regex = "^[a-zA-Z\\sáéíóúÁÉÍÓÚüÜñÑ]{1,30}$";
        String color = automovilNuevoDTO.getColor();
        if (color.length() > 20) {
            throw new ValidacionDTOException("El color del automóvil no puede tener más de 20 caracteres");
        } else if (!color.matches(regex)) {
            throw new ValidacionDTOException("El color del automóvil solo debe contener letras");
        }
        return true;
    }

    private boolean validarModelo() throws ValidacionDTOException {
        String regex = "^\\d{4}$";
        String modelo = automovilNuevoDTO.getModelo();
        if (modelo.length() != 4) {
            throw new ValidacionDTOException("El modelo del automóvil solo debe tener 4 caracteres");
        } else if (!modelo.matches(regex)) {
            throw new ValidacionDTOException("El modelo del automóvil solo debe contener números");
        }
        return true;
    }

    private boolean validarFechaModelo() throws ValidacionDTOException {
        int añoLimite = LocalDate.now().getYear() + 1;
        int añoModelo = Integer.parseInt(automovilNuevoDTO.getModelo());
        if (añoModelo <= 1990) {
            throw new ValidacionDTOException("El año del modelo del automóvil debe ser posterior a 1990");
        }
        if (añoModelo > añoLimite) {
            throw new ValidacionDTOException("El año del modelo del automóvil no puede ser posterior a " + añoLimite);
        }
        return true;
    }

}
