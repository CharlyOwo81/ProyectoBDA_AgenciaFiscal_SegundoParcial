package org.itson.bdavanzadas.agenciafiscal_persistencia.excepciones;

import java.sql.SQLException;

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

//    /**
//     * Constructor que acepta un mensaje descriptivo y una causa subyacente de
//     * la excepción.
//     *
//     * @param message El mensaje descriptivo de la excepción.
//     * @param cause La causa subyacente de la excepción.
//     */
//    public PersistenciaException(String message, Throwable cause) {
//        super(message, cause);
//    }
//
//    /**
//     * Constructor que acepta una causa subyacente de la excepción.
//     *
//     * @param cause La causa subyacente de la excepción.
//     */
//    public PersistenciaException(Throwable cause) {
//        super(cause);
//    }
//
//    /**
//     * Constructor que acepta un mensaje descriptivo, una causa subyacente, un
//     * indicador de supresión de la pila de llamadas y un indicador de capacidad
//     * de escritura de la pila de llamadas.
//     *
//     * @param message El mensaje descriptivo de la excepción.
//     * @param cause La causa subyacente de la excepción.
//     * @param enableSuppression Indica si se permite la supresión de la
//     * excepción.
//     * @param writableStackTrace Indica si la pila de llamadas debe ser escrita.
//     */
//    public PersistenciaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
//        super(message, cause, enableSuppression, writableStackTrace);
//    }
}
