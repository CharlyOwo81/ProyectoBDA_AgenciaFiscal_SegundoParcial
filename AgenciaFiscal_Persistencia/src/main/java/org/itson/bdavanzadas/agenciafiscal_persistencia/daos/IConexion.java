/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.bdavanzadas.agenciafiscal_persistencia.daos;

import javax.persistence.EntityManager;

/**
 *
 * @author gamaliel
 */
public interface IConexion {
    public EntityManager crearConexion();
}
