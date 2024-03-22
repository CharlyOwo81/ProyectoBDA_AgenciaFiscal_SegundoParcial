package org.itson.bdavanzadas.agenciafiscal_negocio.dtos;

/**
 *
 * @author Roberto García
 */
public class BuscarContribyenteRFCDTO {
    String rfc;

    public BuscarContribyenteRFCDTO(String rfc) {
        this.rfc = rfc;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
    
    
}
