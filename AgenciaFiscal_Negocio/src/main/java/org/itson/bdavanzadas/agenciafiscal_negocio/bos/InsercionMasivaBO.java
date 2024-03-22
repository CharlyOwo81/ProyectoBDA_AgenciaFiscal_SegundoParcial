package org.itson.bdavanzadas.agenciafiscal_negocio.bos;

import java.util.ArrayList;
import java.util.List;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.ContribuyenteNuevoDTO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.daos.ContribuyenteDAO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.daos.IConexion;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Contribuyente;

/**
 *
 * @author Roberto García
 */
public class InsercionMasivaBO implements IInsercionMasivaBO {

    @Override
    public void insertar(List<ContribuyenteNuevoDTO> contribuyentesDTO) {
        // Convertir DTO a entidades Contribuyente
        List<Contribuyente> contribuyentes = new ArrayList<>();
        for (ContribuyenteNuevoDTO dto : contribuyentesDTO) {
            Contribuyente contribuyente = new Contribuyente(
                    dto.getRFC(),
                    dto.getNombre(),
                    dto.getApellido_paterno(),
                    dto.getApellido_materno(),
                    dto.getTelefono(),
                    dto.getFecha_nacimiento(),
                    dto.getDiscapacidad()
            );
            contribuyentes.add(contribuyente);
        }

        ContribuyenteDAO contribuyenteDAO = new ContribuyenteDAO();

        for (Contribuyente contribuyente : contribuyentes) {
            contribuyenteDAO.agregarContribuyente(contribuyente);
        }
    }

}
