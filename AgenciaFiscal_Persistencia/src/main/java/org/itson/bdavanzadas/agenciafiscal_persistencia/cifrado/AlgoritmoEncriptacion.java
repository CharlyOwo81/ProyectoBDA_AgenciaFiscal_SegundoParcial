/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.bdavanzadas.agenciafiscal_persistencia.cifrado;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.LinkedList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Contribuyente;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Placa;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Tramite;

/**
 *
 * @author gamaliel
 */
public class AlgoritmoEncriptacion {
    private static final String ALGORITMO = "AES";
    private static final String MODO = "ECB";
    private static final String PADDING = "PKCS5Padding";
    private static final String CLAVE = "AgenciaFiscal123";

    public String encriptar(String texto) {
        try {
            SecretKeySpec clave = new SecretKeySpec(CLAVE.getBytes(StandardCharsets.UTF_8), ALGORITMO);
            Cipher cipher = Cipher.getInstance(ALGORITMO + "/" + MODO + "/" + PADDING);
            cipher.init(Cipher.ENCRYPT_MODE, clave);
            byte[] textoEncriptado = cipher.doFinal(texto.getBytes(StandardCharsets.UTF_8));
            return Base64.getEncoder().encodeToString(textoEncriptado);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }    
    
    public String desencriptar(String textoEncriptado) {
        try {
            SecretKeySpec clave = new SecretKeySpec(CLAVE.getBytes(StandardCharsets.UTF_8), ALGORITMO);
            Cipher cipher = Cipher.getInstance(ALGORITMO + "/" + MODO + "/" + PADDING);
            cipher.init(Cipher.DECRYPT_MODE, clave);
            byte[] textoDesencriptado = cipher.doFinal(Base64.getDecoder().decode(textoEncriptado));
            return new String(textoDesencriptado, StandardCharsets.UTF_8);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public List<Contribuyente> desencriptarLista(List<Contribuyente> lista) {
        List<Contribuyente> listaDesencriptada = new LinkedList<>();

        for (Contribuyente contribuyente : lista) {
            try {
                contribuyente.setNombre(this.desencriptar(contribuyente.getNombre()));
                contribuyente.setApellidoPaterno(this.desencriptar(contribuyente.getApellidoPaterno()));
                contribuyente.setApellidoMaterno(this.desencriptar(contribuyente.getApellidoMaterno()));
                contribuyente.setTelefono(this.desencriptar(contribuyente.getTelefono()));
                listaDesencriptada.add(contribuyente);

            } catch (Exception e) {
                System.out.println(contribuyente.getNombre());
                System.out.println(contribuyente.getApellidoMaterno());
                System.out.println(contribuyente.getApellidoPaterno());
                System.out.println(contribuyente.getTelefono());
            }

        }
        return lista;
    }


    public List<Tramite> desencriptarListaTramite(List<Tramite> lista) {
        List<Contribuyente> personasDesencriptadas = new LinkedList<>(); 
        List<Tramite> listaTramiteContribuyente = new LinkedList<>(); 

        for (Tramite tramite : lista) {
            Contribuyente persona = tramite.getContribuyente(); 

            if (!personasDesencriptadas.contains(persona)) {

                try {
                    personasDesencriptadas.add(persona); 
                    persona.setNombre(this.desencriptar(persona.getNombre()));
                    persona.setApellidoPaterno(this.desencriptar(persona.getApellidoPaterno()));
                    persona.setApellidoMaterno(this.desencriptar(persona.getApellidoMaterno()));

                } catch (Exception e) {
                    System.out.println(persona.getNombre());
                    System.out.println(persona.getApellidoMaterno());
                    System.out.println(persona.getApellidoPaterno());
                }

            }
            listaTramiteContribuyente.add(tramite); // agrega el trámite a la lista
        }

        return listaTramiteContribuyente;
    }

    public List<Placa> desencriptarListaPlacas(List<Placa> lista) {
        List<Contribuyente> personasDesencriptadas = new LinkedList<>(); 
        List<Placa> lista_placasPersona = new LinkedList<>();
        for (Placa placas : lista) {
            Contribuyente persona = placas.getContribuyente(); 

            if (!personasDesencriptadas.contains(persona)) { 
                try {
                    personasDesencriptadas.add(persona);
                    persona.setNombre(this.desencriptar(persona.getNombre()));
                    persona.setApellidoPaterno(this.desencriptar(persona.getApellidoPaterno()));
                    persona.setApellidoMaterno(this.desencriptar(persona.getApellidoMaterno()));
                } catch (Exception e) {
                    System.out.println(persona.getNombre());
                    System.out.println(persona.getApellidoMaterno());
                    System.out.println(persona.getApellidoPaterno());
                }

            }
            lista_placasPersona.add(placas);
        } 
        return lista_placasPersona;
    }

}
