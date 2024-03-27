package org.itson.bdavanzadas.agenciafiscal_negocio.excepciones;


/**
 * Excepción personalizada para manejar errores relacionados con la validación de DTO (Data Transfer Objects).
 * Esta excepción puede ser lanzada cuando ocurren errores durante la validación de los datos dentro de un DTO.
 * 
 * @author Gamaliel Armenta
 * @author Roberto García
 */
public class ValidacionDTOException extends Exception {

    /**
     * Crea una nueva instancia de ValidacionDTOException sin mensaje de detalle.
     */
    public ValidacionDTOException() {
    }

    /**
     * Crea una nueva instancia de ValidacionDTOException con el mensaje especificado.
     * 
     * @param message El mensaje que describe la excepción.
     */
    public ValidacionDTOException(String message) {
        super(message);
    }

    /**
     * Crea una nueva instancia de ValidacionDTOException con el mensaje y la causa especificada.
     * 
     * @param message El mensaje que describe la excepción.
     * @param cause La causa de la excepción.
     */
    public ValidacionDTOException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Crea una nueva instancia de ValidacionDTOException con la causa especificada y un mensaje detallado.
     * 
     * @param cause La causa de la excepción.
     */
    public ValidacionDTOException(Throwable cause) {
        super(cause);
    }
}

