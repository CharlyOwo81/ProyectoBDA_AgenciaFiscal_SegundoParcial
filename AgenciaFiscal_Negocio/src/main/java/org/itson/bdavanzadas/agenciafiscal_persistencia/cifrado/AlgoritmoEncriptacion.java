/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.bdavanzadas.agenciafiscal_persistencia.cifrado;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author gamaliel
 */
public class AlgoritmoEncriptacion {
    // Clave de encriptación
    private static final String ENCRYPT_CODE = "MzIzNjU2Nzg5MDEyMzQ1Njc4OTAxMjM0NTY3ODkwMTI=";

    public static String encriptar(String texto) {
        try {
            SecretKeySpec key = new SecretKeySpec(Base64.getDecoder().decode(ENCRYPT_CODE), "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            byte[] iv = new byte[16]; // Vector de inicialización para CBC
            IvParameterSpec ivParameterSpec = new IvParameterSpec(iv);
            cipher.init(Cipher.ENCRYPT_MODE, key, ivParameterSpec);
            byte[] textoEncriptado = cipher.doFinal(texto.getBytes(StandardCharsets.UTF_8));
            return Base64.getEncoder().encodeToString(textoEncriptado);
        } catch (Exception e) {
            e.printStackTrace(); // Manejo de excepciones
        }
        return null;
    }

    public static String desencriptar(String textoEncriptado) {
        try {
            SecretKeySpec key = new SecretKeySpec(Base64.getDecoder().decode(ENCRYPT_CODE), "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            byte[] iv = new byte[16]; // Vector de inicialización para CBC
            IvParameterSpec ivParameterSpec = new IvParameterSpec(iv);
            cipher.init(Cipher.DECRYPT_MODE, key, ivParameterSpec);
            byte[] textoDesencriptado = cipher.doFinal(Base64.getDecoder().decode(textoEncriptado));
            return new String(textoDesencriptado, StandardCharsets.UTF_8);
        } catch (Exception e) {
            e.printStackTrace(); // Manejo de excepciones
        }
        return null;
    }
}
