package org.itson.bdavanzadas.agenciafiscal_negocio.excepciones;

/**
 * Excepción personalizada para manejar errores relacionados con la lógica de negocio.
 * Esta excepción puede ser lanzada cuando ocurren errores específicos dentro del contexto del negocio.
 * 
 * @author Gamaliel Armenta
 * @author Roberto García
 */
public class NegocioException extends Exception {

    /**
     * Crea una nueva instancia de NegocioException sin mensaje de detalle.
     */
    public NegocioException() {
    }

    /**
     * Crea una nueva instancia de NegocioException con el mensaje especificado.
     * 
     * @param message El mensaje que describe la excepción.
     */
    public NegocioException(String message) {
        super(message);
    }

    /**
     * Crea una nueva instancia de NegocioException con el mensaje y la causa especificada.
     * 
     * @param message El mensaje que describe la excepción.
     * @param cause La causa de la excepción.
     */
    public NegocioException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Crea una nueva instancia de NegocioException con la causa especificada y un mensaje detallado.
     * 
     * @param cause La causa de la excepción.
     */
    public NegocioException(Throwable cause) {
        super(cause);
    }

    /**
     * Crea una nueva instancia de NegocioException con el mensaje, la causa, habilitación de supresión de excepciones
     * y habilitación de la capacidad de escritura en el rastreo de pila especificados.
     * 
     * @param message El mensaje que describe la excepción.
     * @param cause La causa de la excepción.
     * @param enableSuppression Indica si la supresión de excepciones está habilitada o no.
     * @param writableStackTrace Indica si el rastreo de pila debe ser escribible o no.
     */
    public NegocioException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
