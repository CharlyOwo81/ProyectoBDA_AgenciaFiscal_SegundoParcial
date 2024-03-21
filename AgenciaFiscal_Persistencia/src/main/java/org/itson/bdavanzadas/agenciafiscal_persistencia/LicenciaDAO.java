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
import org.itson.bdavanzadas.agenciafiscal_dominio.TramiteLicencia;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dtos.TramiteLicenciaNuevaDTO;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dtos.TramiteNuevoDTO;

/**
 *
 * @author gamaliel
 */
public class LicenciaDAO implements ILicenciaDAO{

    @Override
    public TramiteLicencia agregarLicencia(TramiteLicenciaNuevaDTO licenciaNueva) {
        EntityManagerFactory  emf = Persistence.createEntityManagerFactory("AgenciaFiscalPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        
        tx.begin();
        TramiteLicencia licencia = new TramiteLicencia(
                licenciaNueva.getTipo_licencia(),
                licenciaNueva.getVigencia(),
                licenciaNueva.getCosto(),
                licenciaNueva.getFecha_emision(),
                licenciaNueva.getFecha_recepcion(),
                licenciaNueva.getContribuyente()
        );      
        em.persist(licencia);
        tx.commit();
        em.close();
        return licencia;
    }
    
}
