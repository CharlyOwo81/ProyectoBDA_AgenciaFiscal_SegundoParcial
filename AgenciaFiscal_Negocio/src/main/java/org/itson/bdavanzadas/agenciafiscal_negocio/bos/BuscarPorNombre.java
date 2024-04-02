package org.itson.bdavanzadas.agenciafiscal_negocio.bos;

import java.util.ArrayList;
import java.util.List;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.ContribuyenteDTO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.daos.BuscarContribuyenteDAO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.daos.IBuscarContribuyenteDAO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Contribuyente;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.ContribuyenteDiscapacidad;
import org.itson.bdavanzadas.agenciafiscal_persistencia.excepciones.PersistenciaException;

/**
 *
 * @author Roberto García
 */
public class BuscarPorNombre implements IBuscarPorNombre{

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
