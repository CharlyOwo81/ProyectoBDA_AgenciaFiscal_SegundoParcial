/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.bdavanzadas.agenciafiscal_persistencia.daos;

import javax.persistence.EntityManager;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Vehiculo;

/**
 *
 * @author gamaliel
 */
public class VehiculoDAO implements IVehiculoDAO {

    private IConexion conexion;

    public VehiculoDAO(IConexion conexion) {
        this.conexion = conexion;
    }    
    
    @Override
    public Vehiculo agregarVehiculo(Vehiculo vehiculo) {
        EntityManager eManager = conexion.crearConexion();
        
        eManager.getTransaction().begin();
        
        eManager.persist(vehiculo);
        
        eManager.getTransaction().commit();
        
        eManager.close();
        
        return vehiculo;
    }
    
}
