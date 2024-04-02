package org.itson.bdavanzadas.agenciafiscal_negocio.bos;

import java.time.LocalDate;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.AutomovilNuevoDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.excepciones.ValidacionDTOException;

/**
 * Clase que proporciona métodos para validar los datos de un automóvil nuevo.
 * Esta clase implementa la interfaz IValidarAutomovilBO.
 *
 * @author Roberto García
 */
public class ValidarAutomovilBO implements IValidarAutomovilBO {

    private final AutomovilNuevoDTO automovilNuevoDTO;

    /**
     * Constructor de la clase ValidarAutomovilBO.
     *
     * @param automovilNuevoDTO Objeto AutomovilNuevoDTO que contiene los datos
     * del automóvil a validar.
     */
    public ValidarAutomovilBO(AutomovilNuevoDTO automovilNuevoDTO) {
        this.automovilNuevoDTO = automovilNuevoDTO;
    }

    /**
     * Método que realiza todas las validaciones necesarias sobre los datos del
     * automóvil.
     *
     * @return true si todas las validaciones son exitosas.
     * @throws ValidacionDTOException si alguna validación falla.
     */
    @Override
    public boolean validarAutomovil() throws ValidacionDTOException {
        validarNumeroSerie();
        validarMarca();
        validarLinea();
        validarColor();
        validarModelo();
        validarFechaModelo();
        return true;
    }

    /**
     * Método para validar el número de serie del automóvil.
     *
     * @return true si el número de serie es válido.
     * @throws ValidacionDTOException si el número de serie no cumple con los
     * requisitos de validación.
     */
    private boolean validarNumeroSerie() throws ValidacionDTOException {
        String regex = "^[A-Z0-9]{17}$";
        String numeroSerie = automovilNuevoDTO.getNumeroSerie();
        if (numeroSerie.length() != 17) {
            throw new ValidacionDTOException("El número de serie debe contener 17 caracteres");
        } else if (!numeroSerie.matches(regex)) {
            throw new ValidacionDTOException("El número de serie solo debe contener letras mayúsculas y números");
        }
        return true;
    }

    /**
     * Método para validar la marca del automóvil.
     *
     * @return true si la marca es válida.
     * @throws ValidacionDTOException si la marca no cumple con los requisitos
     * de validación.
     */
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

    /**
     * Método para validar la línea del automóvil.
     *
     * @return true si la línea es válida.
     * @throws ValidacionDTOException si la línea no cumple con los requisitos
     * de validación.
     */
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

    /**
     * Método para validar el color del automóvil.
     *
     * @return true si el color es válido.
     * @throws ValidacionDTOException si el color no cumple con los requisitos
     * de validación.
     */
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

    /**
     * Método para validar el modelo del automóvil.
     *
     * @return true si el modelo es válido.
     * @throws ValidacionDTOException si el modelo no cumple con los requisitos
     * de validación.
     */
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

    /**
     * Método para validar la fecha del modelo del automóvil.
     *
     * @return true si la fecha del modelo es válida.
     * @throws ValidacionDTOException si la fecha del modelo no cumple con los
     * requisitos de validación.
     */
    private boolean validarFechaModelo() throws ValidacionDTOException {
        int añoLimite = LocalDate.now().getYear() + 1;
        int añoModelo = Integer.parseInt(automovilNuevoDTO.getModelo());
        if (añoModelo <= 1900) {
            throw new ValidacionDTOException("El año del modelo del automóvil debe ser posterior a 1990");
        }
        if (añoModelo > añoLimite) {
            throw new ValidacionDTOException("El año del modelo del automóvil no puede ser posterior a " + añoLimite);
        }
        return true;
    }

}
