package com.mycompany.models;

import com.mycompany.models.Admin;
import com.mycompany.models.Consumidor;
import com.mycompany.models.Prestador;
import com.mycompany.models.Trabajo;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-12-03T03:23:40", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Servicio.class)
public class Servicio_ { 

    public static volatile SingularAttribute<Servicio, String> Nombre;
    public static volatile SingularAttribute<Servicio, Prestador> prestador;
    public static volatile SingularAttribute<Servicio, Admin> admin;
    public static volatile ListAttribute<Servicio, Trabajo> trabajos;
    public static volatile SingularAttribute<Servicio, Integer> id;
    public static volatile ListAttribute<Servicio, Consumidor> consumidores;

}