package org.itson.bdavanzadas.agenciafiscal_negocio.dtos;

/**
 * DTO (Data Transfer Object) utilizado para representar la solicitud de búsqueda de un contribuyente por RFC.
 * Esta clase encapsula el RFC del contribuyente que se desea buscar.
 * 
 * @author Gamaliel Armenta
 * @author Roberto García
 */
public class BuscarContribyenteRFCDTO {

    private String rfc;

    /**
     * Crea una nueva instancia de BuscarContribyenteRFCDTO con el RFC especificado.
     * 
     * @param rfc El RFC del contribuyente a buscar.
     */
    public BuscarContribyenteRFCDTO(String rfc) {
        this.rfc = rfc;
    }

    /**
     * Obtiene el RFC del contribuyente.
     * 
     * @return El RFC del contribuyente.
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * Establece el RFC del contribuyente.
     * 
     * @param rfc El RFC del contribuyente a establecer.
     */
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
}

