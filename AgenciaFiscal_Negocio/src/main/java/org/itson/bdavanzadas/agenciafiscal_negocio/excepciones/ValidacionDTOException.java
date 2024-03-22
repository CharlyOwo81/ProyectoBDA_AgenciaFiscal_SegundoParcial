package org.itson.bdavanzadas.agenciafiscal_negocio.excepciones;

/**
 *
 * @author Roberto García
 */
public class ValidacionDTOException extends Exception{

    public ValidacionDTOException() {
    }

    public ValidacionDTOException(String message) {
        super(message);
    }

    public ValidacionDTOException(String message, Throwable cause) {
        super(message, cause);
    }

    public ValidacionDTOException(Throwable cause) {
        super(cause);
    }

}
