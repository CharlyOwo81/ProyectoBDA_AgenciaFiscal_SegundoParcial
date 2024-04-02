package org.itson.bdavanzadas.agenciafiscal_negocio.bos;

import java.util.ArrayList;
import java.util.List;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.ContribuyenteDTO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.daos.BuscarContribuyenteDAO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.daos.IBuscarContribuyenteDAO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Contribuyente;
import org.itson.bdavanzadas.agenciafiscal_persistencia.excepciones.PersistenciaException;

/**
 * Clase que implementa la interfaz IBuscarPorNombre y proporciona la
 * funcionalidad para buscar contribuyentes por nombre en la base de datos.
 *
 * El método buscarContribuyente realiza la búsqueda de contribuyentes en la
 * base de datos que coincidan con el nombre proporcionado en el objeto
 * ContribuyenteDTO y devuelve una lista de objetos ContribuyenteDTO que
 * representan los contribuyentes encontrados.
 *
 * @author Gamaliel Armenta
 * @author Roberto García
 */
public class BuscarPorNombre implements IBuscarPorNombre {

    /**
     * Método para buscar contribuyentes por nombre en la base de datos.
     *
     * @param contribuyenteDTO Objeto ContribuyenteDTO que contiene el nombre
     * del contribuyente a buscar.
     * @return Una lista de objetos ContribuyenteDTO que representan los
     * contribuyentes encontrados. Si no se encuentran contribuyentes para el
     * nombre proporcionado, se devuelve una lista vacía.
     * @throws PersistenciaException Si no existe ningún contribuyente con el
     * nombre específicado.
     */
    @Override
    public List<ContribuyenteDTO> buscarContribuyente(ContribuyenteDTO contribuyenteDTO) throws PersistenciaException {
        IBuscarContribuyenteDAO buscarContribuyenteDAO = new BuscarContribuyenteDAO();
        List<Contribuyente> contribuyentes;
        contribuyentes = buscarContribuyenteDAO.buscarContribuyenteNombre(contribuyenteDTO.getNombre());
        List<ContribuyenteDTO> contribuyentesDTO = new ArrayList<>();
        for (Contribuyente contribuyente : contribuyentes) {
            ContribuyenteDTO contribuyenteDTOTemp = new ContribuyenteDTO(
                    contribuyente.getId(),
                    contribuyente.getRfc(),
                    contribuyente.getNombre(),
                    contribuyente.getApellidoPaterno(),
                    contribuyente.getApellidoMaterno(),
                    contribuyente.getTelefono(),
                    contribuyente.getFechaNacimiento(),
                    contribuyente.getDiscapacidad());
            contribuyentesDTO.add(contribuyenteDTOTemp);
        }
        return contribuyentesDTO;
    }

}
