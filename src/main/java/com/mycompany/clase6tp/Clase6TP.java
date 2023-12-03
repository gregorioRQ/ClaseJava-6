/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clase6tp;

import com.mycompany.controladores.Controladores;
import com.mycompany.controladores.PersistenceController;
import com.mycompany.models.Admin;
import com.mycompany.models.Consumidor;
import com.mycompany.models.Prestador;
import com.mycompany.models.Servicio;
import com.mycompany.models.Trabajo;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author PC
 */
public class Clase6TP {

    public static void main(String[] args) {
        PersistenceController pc = new PersistenceController();
        
        Controladores control = new Controladores();
       
        
       /*
       Admin admin1 = new Admin(43, "yoyo", "melano", new Date());
       control.crearAdmin(admin1);
       
       
       Prestador prestador1 = new Prestador(
        12, 269, "DNI", 4326, "Romero", "Piñeda", new Date(), 376,
       "romero@gmail.com", 3, 1, 100, "lunees", "soldador");
       control.crearPrestador(prestador1);
       
       
       Consumidor consumidor01 = new Consumidor(32, "Pablo", "Palomo");
       control.crearConsumidor(consumidor01);
      
       
       Servicio servicio1 = new Servicio(432, "Jardineria");
       control.crearServicio(servicio1);

       
       Trabajo trabajo4 = new Trabajo(8, "Electricista", "verificacion", "mantenimiento", "instalacion", "atencion cli",100.00);
       control.crearTrabajo(trabajo4);
     
       
       control.eliminarTrabajo(60);
      
       
       Trabajo trabajo5 = new Trabajo(42, "Veterinario", "revicion", "consulta", "opQuirurjicas", "", 90.00);
       control.crearTrabajo(trabajo5);
       trabajo5.setTarea3("peluqueria");
       
       control.editarTrabajo(trabajo5);
       
       
       Trabajo trabajoBuscado = control.buscarTrabajo(4);
        System.out.println(trabajoBuscado.toString());
        */
       
       ArrayList<Trabajo> lista = control.listaTrabajos();
        System.out.println("*****************");
        System.out.println("Lista de trabajos");
        for(Trabajo t: lista)
            System.out.println(t.getNombre());
        
        
        List<Trabajo> trabajosMasDe50 = lista
        .stream()
        .filter(t -> t.getPrecio() > 50)
        .collect(Collectors.toList());
        
        for(Trabajo t: trabajosMasDe50)
            System.out.println(t);
    }
    
}
