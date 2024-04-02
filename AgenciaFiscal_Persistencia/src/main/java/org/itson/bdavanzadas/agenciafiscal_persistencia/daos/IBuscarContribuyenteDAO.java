package org.itson.bdavanzadas.agenciafiscal_persistencia.daos;

import java.util.List;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Contribuyente;
import org.itson.bdavanzadas.agenciafiscal_persistencia.excepciones.PersistenciaException;

/**
 * Interfaz que define los métodos para buscar contribuyentes en la base de
 * datos. Las implementaciones de esta interfaz proporcionan funcionalidades
 * para buscar contribuyentes por su RFC, por su ID, por su nombre y por su año
 * de nacimiento.
 *
 * @author Gamaliel Armenta
 * @author Roberto García
 */
public interface IBuscarContribuyenteDAO {

    /**
     * Busca un contribuyente en la base de datos por su RFC.
     *
     * @param rfc El RFC del contribuyente a buscar.
     * @return El contribuyente encontrado.
     * @throws PersistenciaException Si no se encuentra ningún contribuyente con
     * el RFC proporcionado.
     */
    public Contribuyente buscarContribuyente(String rfc) throws PersistenciaException;

    /**
     * Busca un contribuyente en la base de datos por su ID.
     *
     * @param id El ID del contribuyente a buscar.
     * @return El contribuyente encontrado.
     * @throws PersistenciaException Si no se encuentra ningún contribuyente con
     * el ID proporcionado.
     */
    public Contribuyente buscarContribuyente(Long id) throws PersistenciaException;

    /**
     * Busca contribuyentes en la base de datos por su nombre.
     *
     * @param nombre El nombre del contribuyente a buscar.
     * @return Una lista de contribuyentes que coinciden con el nombre
     * proporcionado.
     * @throws PersistenciaException Si no se encuentra ningún contribuyente con
     * el nombre proporcionado.
     */
    public List<Contribuyente> buscarContribuyenteNombre(String nombre) throws PersistenciaException;

    /**
     * Busca contribuyentes en la base de datos por su año de nacimiento.
     *
     * @param anio El año de nacimiento de los contribuyentes a buscar.
     * @return Una lista de contribuyentes que nacieron en el año especificado.
     * @throws PersistenciaException Si no se encuentra ningún contribuyente con
     * el año de nacimiento proporcionado.
     */
    public List<Contribuyente> buscarContribuyente(Integer anio) throws PersistenciaException;
}
