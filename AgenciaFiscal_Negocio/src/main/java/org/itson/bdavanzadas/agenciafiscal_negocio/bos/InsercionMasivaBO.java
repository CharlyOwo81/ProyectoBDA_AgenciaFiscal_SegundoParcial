package org.itson.bdavanzadas.agenciafiscal_negocio.bos;

import java.util.ArrayList;
import java.util.List;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.ContribuyenteDTO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.cifrado.AlgoritmoEncriptacion;
import org.itson.bdavanzadas.agenciafiscal_persistencia.daos.ContribuyenteDAO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Contribuyente;

/**
 * Esta clase implementa la interfaz IInsercionMasivaBO y proporciona
 * funcionalidad para insertar una lista masiva de contribuyentes en el sistema.
 * Convierte los objetos DTO de contribuyentes en entidades Contribuyente y los
 * inserta en la base de datos utilizando el DAO correspondiente.
 *
 * @author Gamaliel Armenta
 * @author Roberto García
 */
public class InsercionMasivaBO implements IInsercionMasivaBO {

    /**
     * Inserta una lista masiva de contribuyentes en el sistema.
     *
     * @param contribuyentesDTO La lista de contribuyentes en forma de objetos
     * DTO que se insertarán.
     * @throws Exception Si los contribuyentes ya han sido ingresados a la base
     * de datos, se usa Exception general ya que es la única que nos permite
     * manejar la excepcion de DatabaseException de eclipse.
     */
    @Override
    public void insertar(List<ContribuyenteDTO> contribuyentesDTO){
        // Convertir DTO a entidades Contribuyente
        List<Contribuyente> contribuyentes = new ArrayList<>();
        for (ContribuyenteDTO dto : contribuyentesDTO) {
        String telefonoEncriptado = AlgoritmoEncriptacion.encriptar(dto.getTelefono());

            Contribuyente contribuyente = new Contribuyente(
                    dto.getRfc(),
                    dto.getNombre(),
                    dto.getApellidoPaterno(),
                    dto.getApellidoMaterno(),
                    telefonoEncriptado,
                    dto.getFechaNacimiento(),
                    dto.getDiscapacidad()
            );
            contribuyentes.add(contribuyente);
        }

        ContribuyenteDAO contribuyenteDAO = new ContribuyenteDAO();

        // Insertar cada contribuyente en la base de datos
        for (Contribuyente contribuyente : contribuyentes) {
            contribuyenteDAO.agregarContribuyente(contribuyente);
        }
    }

}
