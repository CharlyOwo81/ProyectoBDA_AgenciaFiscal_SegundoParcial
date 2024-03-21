/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.bdavanzadas.agenciafiscal_persistencia;

import javax.persistence.EntityManager;
import org.itson.bdavanzadas.agenciafiscal_dominio.Contribuyente;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dtos.ContribuyenteNuevoDTO;

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
    public Contribuyente agregarContribuyente(ContribuyenteNuevoDTO contribuyenteNuevo) {
       
        EntityManager eManager = conexion.crearConexion();
        
        eManager.getTransaction().begin();
        
        Contribuyente contribuyente = new Contribuyente(
                            contribuyenteNuevo.getCURP(),
                            contribuyenteNuevo.getRFC(),        
                            contribuyenteNuevo.getNombre(),        
                            contribuyenteNuevo.getApellido_paterno(),        
                            contribuyenteNuevo.getApellido_materno(),        
                            contribuyenteNuevo.getTelefono(),        
                            contribuyenteNuevo.getFecha_nacimiento(),
                            contribuyenteNuevo.getDiscapacidad(),
                            contribuyenteNuevo.getLicencia());      
        
        eManager.persist(contribuyente);
        
        eManager.getTransaction().commit();
        
        eManager.close();
        
        return contribuyente;

    }
    
}
