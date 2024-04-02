package org.itson.bdavanzadas.agenciafiscal_persistencia.excepciones;

/**
 * Excepción específica para errores relacionados con la persistencia de datos.
 * Esta excepción puede ser lanzada cuando ocurren problemas durante las
 * operaciones de persistencia, como la inserción, actualización o eliminación
 * de datos en la base de datos.
 *
 * @author Gamaliel Armenta
 * @author Roberto García
 */
public class PersistenciaException extends Exception{

    /**
     * Constructor por defecto de la excepción PersistenciaException.
     */
    public PersistenciaException() {
    }

    /**
     * Constructor que acepta un mensaje descriptivo de la excepción.
     *
     * @param message El mensaje descriptivo de la excepción.
     */
    public PersistenciaException(String message) {
        super(message);
    }
}
