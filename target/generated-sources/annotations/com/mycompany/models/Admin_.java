package com.mycompany.models;

import com.mycompany.models.Consumidor;
import com.mycompany.models.Prestador;
import com.mycompany.models.Servicio;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-12-03T03:23:40", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Admin.class)
public class Admin_ { 

    public static volatile SingularAttribute<Admin, Date> fechaNac;
    public static volatile ListAttribute<Admin, Consumidor> listaConsumidores;
    public static volatile SingularAttribute<Admin, String> apellido;
    public static volatile ListAttribute<Admin, Servicio> listaServicios;
    public static volatile SingularAttribute<Admin, Integer> id;
    public static volatile ListAttribute<Admin, Prestador> listaPrestadores;
    public static volatile SingularAttribute<Admin, String> nombre;

}