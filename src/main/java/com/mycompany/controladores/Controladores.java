/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controladores;


import com.mycompany.models.Admin;
import com.mycompany.models.Consumidor;
import com.mycompany.models.Prestador;
import com.mycompany.models.Servicio;
import com.mycompany.models.Trabajo;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class Controladores {
    PersistenceController control = new PersistenceController();
    
    public void crearAdmin(Admin admin){
        control.crearAdmin(admin);
    }

    public void crearPrestador(Prestador prestador) {
        control.crearPrestador(prestador);
    }
    
    public void crearConsumidor(Consumidor consumidor){
        control.crearConsumidor(consumidor);
    }
    
    public void crearServicio(Servicio servicio){
        control.crearServicio(servicio);
    }
    
    
    //TRABAJO
    public void crearTrabajo(Trabajo trabajo){
        control.crearTrabajo(trabajo);
    }
    
    public void eliminarTrabajo(int id){
        control.eliminarTrabajo(id);
    }
    
    public void editarTrabajo(Trabajo trabajo){
        control.editarTrabajo(trabajo);
    }
    
    public Trabajo buscarTrabajo(int id){
        Trabajo trabajo = new Trabajo();
        trabajo = control.buscarTrabajo(id);
        return trabajo;
    }
    
     public ArrayList<Trabajo> listaTrabajos()
    {
        ArrayList<Trabajo> trabajos = new ArrayList();
        trabajos = control.listaTrabajos();
        return trabajos;
    }
}
