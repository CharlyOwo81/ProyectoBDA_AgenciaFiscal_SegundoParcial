package org.itson.bdavanzadas.agenciafiscal_negocio.bos;

import java.util.ArrayList;
import java.util.List;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.ContribuyenteDTO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.daos.BuscarContribuyenteDAO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.daos.IBuscarContribuyenteDAO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Contribuyente;
import org.itson.bdavanzadas.agenciafiscal_persistencia.excepciones.PersistenciaException;

/**
 * Clase que implementa la interfaz IBuscarPorAnio para buscar contribuyentes
 * por año.
 *
 * Esta clase busca contribuyentes en la base de datos que hayan realizado
 * trámites en el año proporcionado.
 *
 * @author Gamaliel Armenta
 * @author Roberto García
 */
public class BuscarPorAnio implements IBuscarPorAnio {

    /**
     * Método para buscar contribuyentes por año en la base de datos.
     *
     * @param anio El año para el cual se desea buscar contribuyentes.
     * @return Una lista de objetos ContribuyenteDTO que representan los
     * contribuyentes encontrados.
     * @throws PersistenciaException Si no existe ningún contribuyente con el
     * año indicado
     */
    @Override
    public List<ContribuyenteDTO> buscarContribuyente(Integer anio) throws PersistenciaException {
        IBuscarContribuyenteDAO buscarContribuyenteDAO = new BuscarContribuyenteDAO();
        List<Contribuyente> contribuyentes;
        contribuyentes = buscarContribuyenteDAO.buscarContribuyente(anio);
        List<ContribuyenteDTO> contribuyentesDTO = new ArrayList<>();
        for (Contribuyente contribuyente : contribuyentes) {
            ContribuyenteDTO contribuyenteDTO = new ContribuyenteDTO(
                    contribuyente.getId(),
                    contribuyente.getRfc(),
                    contribuyente.getNombre(),
                    contribuyente.getApellidoPaterno(),
                    contribuyente.getApellidoMaterno(),
                    contribuyente.getTelefono(),
                    contribuyente.getFechaNacimiento(),
                    contribuyente.getDiscapacidad());
            contribuyentesDTO.add(contribuyenteDTO);
        }
        return contribuyentesDTO;

    }

}
