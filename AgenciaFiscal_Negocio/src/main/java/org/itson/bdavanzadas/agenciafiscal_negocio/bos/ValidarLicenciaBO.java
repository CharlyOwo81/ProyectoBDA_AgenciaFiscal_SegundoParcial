package org.itson.bdavanzadas.agenciafiscal_negocio.bos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.ContribuyenteDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.LicenciaNuevaDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.excepciones.ValidacionDTOException;
import org.itson.bdavanzadas.agenciafiscal_persistencia.daos.ITramiteDAO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.daos.TramiteDAO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Contribuyente;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.ContribuyenteDiscapacidad;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Licencia;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.TipoLicencia;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Tramite;
import org.itson.bdavanzadas.agenciafiscal_persistencia.excepciones.PersistenciaException;

/**
 * Esta clase se encarga de validar la vigencia de la licencia de un
 * contribuyente. Recibe un objeto de tipo ContribuyenteDTO que contiene la
 * información de la licencia del contribuyente. Al buscar la licencia, verifica
 * si la fecha de vencimiento es posterior a la fecha actual. Si la fecha de
 * vencimiento es posterior a la fecha actual, devuelve true; de lo contrario,
 * devuelve false. La clase implementa la interfaz IValidarLicenciaBO.
 *
 * @author Gamaliel Armenta
 * @author Roberto García
 */
public class ValidarLicenciaBO implements IValidarLicenciaBO {

    private final ContribuyenteDTO contribuyenteDTO;
    Licencia licencia;

    /**
     * Constructor de la clase ValidarLicenciaBO.
     *
     * @param contribuyenteDTO El objeto ContribuyenteDTO que contiene la
     * información de la licencia del contribuyente.
     */
    public ValidarLicenciaBO(ContribuyenteDTO contribuyenteDTO) {
        this.contribuyenteDTO = contribuyenteDTO;
    }

    /**
     * Busca la licencia del contribuyente y valida su vigencia.
     *
     * @return true si la licencia está vigente (la fecha de vencimiento es
     * posterior a la fecha actual), false en caso contrario.
     * @throws
     * org.itson.bdavanzadas.agenciafiscal_negocio.excepciones.ValidacionDTOException
     */
    @Override
    public LicenciaNuevaDTO validarLicencia() throws PersistenciaException, ValidacionDTOException {
        ITramiteDAO tramiteDAO = new TramiteDAO();
        Contribuyente contribuyente = new Contribuyente(
                contribuyenteDTO.getId(),
                contribuyenteDTO.getRfc(),
                contribuyenteDTO.getNombre(),
                contribuyenteDTO.getApellidoPaterno(),
                contribuyenteDTO.getApellidoMaterno(),
                contribuyenteDTO.getTelefono(),
                contribuyenteDTO.getFechaNacimiento(),
                contribuyenteDTO.getDiscapacidad());
        List<Tramite> tramites = tramiteDAO.buscarTramitesPorContribuyente(contribuyente);
        List<Licencia> licencias = obtenerLicenciasDesdeTramites(tramites);

        if (licencias.isEmpty()) {
            throw new ValidacionDTOException("El contribuyente no ninguna licencia asociada");
        }
        licencia = licencias.getLast();
        if (!validarVencimiento()) {
            throw new ValidacionDTOException("La licencia del contribuyente esta vencida");
        }
        LicenciaNuevaDTO licenciaNuevaDTO = new LicenciaNuevaDTO(
                licencia.getVigencia(),
                licencia.getTipoLicencia(),
                licencia.getFechaVencimiento(),
                licencia.getCosto(),
                licencia.getFechaEmision(),
                contribuyenteDTO);
        return licenciaNuevaDTO;
    }

    public List<Licencia> obtenerLicenciasDesdeTramites(List<Tramite> tramites) {
        List<Licencia> licencias = new ArrayList<>();

        for (Tramite tramite : tramites) {
            if (tramite instanceof Licencia) {
                licencias.add((Licencia) tramite);
            }
        }

        return licencias;
    }

    /**
     * Valida la vigencia de la licencia.
     *
     * @return true si la fecha de vencimiento de la licencia es posterior a la
     * fecha actual, false en caso contrario.
     */
    private boolean validarVencimiento() {
        Date fechaVencimiento = licencia.getFechaVencimiento();
        return fechaVencimiento.after(new Date());
    }

}
