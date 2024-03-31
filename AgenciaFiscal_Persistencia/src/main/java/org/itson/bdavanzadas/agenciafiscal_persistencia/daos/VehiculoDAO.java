/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.bdavanzadas.agenciafiscal_persistencia.daos;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Contribuyente;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Vehiculo;
import org.itson.bdavanzadas.agenciafiscal_persistencia.dominio.Vehiculo;
import org.itson.bdavanzadas.agenciafiscal_persistencia.excepciones.PersistenciaException;

/**
 *
 * @author gamaliel
 */
public class VehiculoDAO implements IVehiculoDAO {

    private IConexion conexion;

    public VehiculoDAO() {
        this.conexion = new Conexion();
    }    
    
    @Override
    public Vehiculo agregarVehiculo(Vehiculo vehiculo) throws Exception{
        EntityManager eManager = conexion.crearConexion();
        
        eManager.getTransaction().begin();
        
        eManager.persist(vehiculo);
        
        eManager.getTransaction().commit();
        
        eManager.close();
        
        return vehiculo;
    }
    
    @Override
    public List<Vehiculo> buscarVehiculo(Vehiculo vehiculo, Contribuyente contribuyente) throws PersistenciaException{
        EntityManager entityManager = this.conexion.crearConexion();
        // Objeto constructor de consultas
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        // Objeto consulta que se está construyendo
        CriteriaQuery<Vehiculo> criteria = cb.createQuery(Vehiculo.class);

        Root<Vehiculo> root = criteria.from(Vehiculo.class);

        // Filtrar por id igual al parámetro proporcionado
        criteria.select(root).where(cb.equal(root.get("contribuyente").get("id"), contribuyente.getId()));

        // Consulta construida
        TypedQuery<Vehiculo> query = entityManager.createQuery(criteria);

        // Obtener el resultado de la consulta
        List<Vehiculo> vehiculos = query.getResultList();

        entityManager.close();

        // Verificar si se encontró
        if (vehiculos.isEmpty()) {
            throw new PersistenciaException("El contribuyente no tiene un ningun automóvil registrado");
        } else {
            return vehiculos; // Devolver el primer vehiculo
        }
    }
    
}
