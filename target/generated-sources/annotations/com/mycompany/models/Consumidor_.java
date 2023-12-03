package com.mycompany.models;

import com.mycompany.models.Admin;
import com.mycompany.models.Prestador;
import com.mycompany.models.Servicio;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-12-03T03:23:40", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Consumidor.class)
public class Consumidor_ { 

    public static volatile ListAttribute<Consumidor, Servicio> servicios;
    public static volatile SingularAttribute<Consumidor, String> apellido;
    public static volatile SingularAttribute<Consumidor, Admin> admin;
    public static volatile SingularAttribute<Consumidor, Integer> id;
    public static volatile SingularAttribute<Consumidor, String> nombre;
    public static volatile ListAttribute<Consumidor, Prestador> prestadores;

}