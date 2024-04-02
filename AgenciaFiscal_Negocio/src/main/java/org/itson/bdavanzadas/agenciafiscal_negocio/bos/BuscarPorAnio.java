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
public class BuscarPorAnio implements IBuscarPorAnio {
    
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
