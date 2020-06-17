package com.company.cubaforcepovidevelop.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "CUBAFORCEPOVIDEVELOP_ENTITY_DE_PRUEBA")
@Entity(name = "cubaforcepovidevelop_EntityDePrueba")
public class EntityDePrueba extends StandardEntity {
    private static final long serialVersionUID = 6396318122085315238L;

    @Column(name = "FECHA")
    protected String fecha;
    @Column(name = "NOMBRE")
    protected String nombre;

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}