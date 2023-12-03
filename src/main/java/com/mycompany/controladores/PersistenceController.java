/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controladores;

import com.mycompany.controladores.exceptions.NonexistentEntityException;
import com.mycompany.models.Admin;
import com.mycompany.models.Consumidor;
import com.mycompany.models.Prestador;
import com.mycompany.models.Servicio;
import com.mycompany.models.Trabajo;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class PersistenceController {
    ConsumidorJpaController consumidorJPA = new ConsumidorJpaController();
    AdminJpaController adminJPA = new AdminJpaController();
    PrestadorJpaController prestadorJPA = new PrestadorJpaController();
    ServicioJpaController servicioJPA = new ServicioJpaController();
    TrabajoJpaController trabajoJPA = new TrabajoJpaController();
    
    public void crearAdmin(Admin admin){
        adminJPA.create(admin);
    }
    
    public void crearPrestador(Prestador prestador){
        prestadorJPA.create(prestador);
    }
    
    public void crearConsumidor(Consumidor cons){
        consumidorJPA.create(cons);
    }

    void crearServicio(Servicio servicio) {
        servicioJPA.create(servicio);
    }
    
    
    //TRABAJO
    void crearTrabajo(Trabajo trabajo){
        trabajoJPA.create(trabajo);
    }
    
    void eliminarTrabajo(int id){
        try {
            trabajoJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    void editarTrabajo(Trabajo trabajo){
        try {
            trabajoJPA.edit(trabajo);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Trabajo buscarTrabajo(int id){
        return trabajoJPA.findTrabajo(id);
    }
    
    public ArrayList<Trabajo> listaTrabajos() {
        List<Trabajo> listaTemp = trabajoJPA.findTrabajoEntities();
        ArrayList<Trabajo> lista = new ArrayList(listaTemp);
        return lista;
    }
}
