package org.itson.bdavanzadas.agenciafiscal_negocio.bos;

import java.util.Date;
import java.util.List;
import java.util.Random;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.AutomovilNuevoDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.ContribuyenteDTO;
import org.itson.bdavanzadas.agenciafiscal_negocio.dtos.PlacasNuevasDTO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.daos.PlacasDAO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Contribuyente;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Placa;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Vehiculo;
import org.itson.bdavanzadas.agenciafiscal_persistencia.excepciones.PersistenciaException;

/**
 *
 * @author Roberto García
 */
public class RegistrarPlacasBO implements IRegistrarPlacasBO {

    private final PlacasNuevasDTO placasNuevasDTO;

    public RegistrarPlacasBO(PlacasNuevasDTO placasNuevasDTO) {
        this.placasNuevasDTO = placasNuevasDTO;
    }

    @Override
    public PlacasNuevasDTO registrarPlacas(AutomovilNuevoDTO automovilNuevoDTO) throws PersistenciaException {
        ContribuyenteDTO contribuyenteDTO = placasNuevasDTO.getContribuyenteDTO();
        Contribuyente contribuyente = new Contribuyente(
                contribuyenteDTO.getId(),
                contribuyenteDTO.getRfc(),
                contribuyenteDTO.getNombre(),
                contribuyenteDTO.getApellidoPaterno(),
                contribuyenteDTO.getApellidoMaterno(),
                contribuyenteDTO.getTelefono(),
                contribuyenteDTO.getFechaNacimiento(),
                contribuyenteDTO.getDiscapacidad());
        Vehiculo vehiculo = new Vehiculo(
                automovilNuevoDTO.getId(),
                automovilNuevoDTO.getNumeroSerie(),
                automovilNuevoDTO.getMarca(),
                automovilNuevoDTO.getLinea(),
                automovilNuevoDTO.getColor(),
                automovilNuevoDTO.getModelo(),
                contribuyente);
        generarNumeroPlacas();
        placasNuevasDTO.setFechaEmision(new Date());
        Placa placa = new Placa(
                placasNuevasDTO.getNumeroPlacas(),
                vehiculo,
                placasNuevasDTO.getCosto(),
                placasNuevasDTO.getFechaEmision(),
                contribuyente);
        PlacasDAO placasDAO = new PlacasDAO();
        try {
            placasDAO.registrarPlacas(placa);
        } catch (Exception e) {
            //creo que no se ocupa
            throw new PersistenciaException("Las placas ya existen en el sistema");
        }
        return placasNuevasDTO;
    }

    private void generarNumeroPlacas() {
        Random random = new Random();
        PlacasDAO placasDAO = new PlacasDAO();
        String numeroPlacas;
        Placa placa;
        Placa placaEncontrada;

        do {
            StringBuilder letras = new StringBuilder();

            // Genera las tres letras aleatorias
            for (int i = 0; i < 3; i++) {
                char letra = (char) (random.nextInt(26) + 'A'); // Letras mayúsculas
                letras.append(letra);
            }

            // Genera los tres dígitos aleatorios
            StringBuilder digitos = new StringBuilder();
            for (int i = 0; i < 3; i++) {
                int digito = random.nextInt(10); // Números del 0 al 9
                digitos.append(digito);
            }
            numeroPlacas = (letras.toString() + "-" + digitos.toString());
            placa = new Placa(numeroPlacas, null, null, null);

            placaEncontrada = placasDAO.buscarPlacasDuplicadas(placa);

        } while (placaEncontrada != null);

        // Une las letras y los dígitos con un guión intermedio
        placasNuevasDTO.setNumeroPlacas(numeroPlacas);
    }
}
