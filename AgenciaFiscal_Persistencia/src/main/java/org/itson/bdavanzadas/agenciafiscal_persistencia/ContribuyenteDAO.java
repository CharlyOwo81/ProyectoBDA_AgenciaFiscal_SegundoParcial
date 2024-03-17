/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.bdavanzadas.agenciafiscal_persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.itson.bdavanzadas.agenciafiscal_dominio.Contribuyente;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dtos.ContribuyenteNuevoDTO;

/**
 *
 * @author Proyecto2
 */
public class ContribuyenteDAO implements IContribuyenteDAO{

    @Override
    public Contribuyente agregarContribuyente(ContribuyenteNuevoDTO contribuyenteNuevo) {
       
        EntityManagerFactory  emf = Persistence.createEntityManagerFactory("AgenciaFiscalPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        
        tx.begin();
        Contribuyente contribuyente = new Contribuyente(
                            contribuyenteNuevo.getCURP(),
                            contribuyenteNuevo.getRFC(),        
                            contribuyenteNuevo.getNombre(),        
                            contribuyenteNuevo.getApellido_paterno(),        
                            contribuyenteNuevo.getApellido_materno(),        
                            contribuyenteNuevo.getTelefono(),        
                            contribuyenteNuevo.getFecha_nacimiento(),
                            contribuyenteNuevo.isDiscapacidad());      
        em.persist(contribuyente);
        tx.commit();
        em.close();
        return contribuyente;

    }
    
}
