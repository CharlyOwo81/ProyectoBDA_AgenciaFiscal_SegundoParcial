/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.bdavanzadas.agenciafiscal_persistencia.daos;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author gamaliel
 */
public class Conexion implements IConexion{

    @Override
    public EntityManager crearConexion() {
        //Obtener acceso a la Fabrica de Entity Managers
        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("AgenciaFiscalPU");
        //Solicitar una Entity Manager
        EntityManager eManager = emFactory.createEntityManager();
        
        return eManager;
    }
    
}
