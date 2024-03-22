/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.bdavanzadas.agenciafiscal_persistencia.daos;

import javax.persistence.EntityManager;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Contribuyente;

/**
 *
 * @author Proyecto2
 */
public class ContribuyenteDAO implements IContribuyenteDAO{

    private IConexion conexion;

    public ContribuyenteDAO(IConexion conexion) {
        this.conexion = conexion;
    }
   
    @Override
    public Contribuyente agregarContribuyente(Contribuyente contribuyente) {
       
        EntityManager eManager = conexion.crearConexion();
        
        eManager.getTransaction().begin(); 
        
        eManager.persist(contribuyente);
        
        eManager.getTransaction().commit();
        
        eManager.close();
        
        return contribuyente;

    }
    
}
