package org.itson.bdavanzadas.agenciafiscal_negocio.bos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.ContribuyenteDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.ReporteDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.TipoTramiteEnum;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.TramiteNuevoDTO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.daos.BuscarContribuyenteDAO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.daos.ITramiteDAO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.daos.TramiteDAO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Contribuyente;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Licencia;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Placa;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Tramite;
import org.itson.bdavanzadas.agenciafiscal_persistencia.excepciones.PersistenciaException;

/**
 *
 * @author Roberto García
 */
public class BuscarTramitesBO implements IBuscarTramitesBO {

    private ReporteDTO reporteDTO;

    public BuscarTramitesBO(ReporteDTO reporteDTO) {
        this.reporteDTO = reporteDTO;
    }

    public List<TramiteNuevoDTO> buscarTramites() throws PersistenciaException {
        Contribuyente contribuyente = new Contribuyente(
                reporteDTO.getNombre(),
                reporteDTO.getApellidoPaterno(),
                reporteDTO.getApellidoMaterno());
        BuscarContribuyenteDAO buscarContribuyenteDAO = new BuscarContribuyenteDAO();
        List<Contribuyente> contribuyentes = buscarContribuyenteDAO.buscarContribuyentes(contribuyente);
        if (contribuyentes.isEmpty()) {
            throw new PersistenciaException("No hay registros con el nombre del contribuyente indicado");
        }
        ITramiteDAO tramiteDAO = new TramiteDAO();
        List<Tramite> tramites = tramiteDAO.buscarTramitesFecha(reporteDTO.getDesde(), reporteDTO.getHasta());
        if (tramites.isEmpty()) {
            throw new PersistenciaException("No existen trámites en el rango\nde fechas seleccionadas");
        }
        List<? extends Tramite> resultados;
        if (reporteDTO.getTipoTramite() == TipoTramiteEnum.LICENCIA) {
            resultados = obtenerTipoDesdeTramites(tramites, Licencia.class);
        } else {
            resultados = obtenerTipoDesdeTramites(tramites, Placa.class);
        }
        if (resultados.isEmpty()) {
            throw new PersistenciaException("El tipo de trámite" + resultados.getClass().getSimpleName() + "\nno tiene registros que coincidan");
        }
        Set<Contribuyente> contribuyentesSet = new HashSet<>(contribuyentes);
        List<Tramite> coincidencias = new ArrayList<>();
        for (Tramite resultado : resultados) {
            if (contribuyentesSet.contains(resultado.getContribuyente())) {
                coincidencias.add(resultado);
            }
        }
        if (coincidencias.isEmpty()) {
            throw new PersistenciaException("No hay registros que coincidan con todos los datos");
        }
        List<TramiteNuevoDTO> listaTramitesDTO = new ArrayList<>();
        for (Tramite resultado : coincidencias) {
            ContribuyenteDTO contribuyenteDTO = new ContribuyenteDTO(resultado.getContribuyente());
            TramiteNuevoDTO tramiteNuevoDTO = new TramiteNuevoDTO(
                    resultado.getId(),
                    resultado.getCosto(),
                    resultado.getFechaEmision(),
                    contribuyenteDTO);
            listaTramitesDTO.add(tramiteNuevoDTO);
        }

        return listaTramitesDTO;
    }

    private <T extends Tramite> List<T> obtenerTipoDesdeTramites(List<Tramite> tramites, Class<T> tipoDeseado) {
        List<T> tiposDeseados = new ArrayList<>();
        for (Tramite tramite : tramites) {
            if (tipoDeseado.isInstance(tramite)) {
                tiposDeseados.add(tipoDeseado.cast(tramite));
            }
        }
        return tiposDeseados;
    }
}
