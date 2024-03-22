/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.bdavanzadas.agenciafiscal_persistencia.daos;

import javax.persistence.EntityManager;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.TramiteLicencia;

/**
 *
 * @author gamaliel
 */
public class LicenciaDAO implements ILicenciaDAO{

    private IConexion conexion;

    public LicenciaDAO(IConexion conexion) {
        this.conexion = conexion;
    }

    @Override
    public TramiteLicencia agregarLicencia(TramiteLicencia licencia) {
        EntityManager eManager = conexion.crearConexion();
        
        eManager.getTransaction().begin();    
        
        eManager.persist(licencia);
        
        eManager.getTransaction().commit();
        
        eManager.close();
        
        return licencia;
    }
    
}
