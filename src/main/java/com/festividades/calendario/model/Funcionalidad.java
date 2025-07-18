package com.festividades.calendario.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Funcionalidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreFuncionalidad;
    private String descripcion;

    @OneToMany(mappedBy = "funcionalidad", cascade = CascadeType.ALL)
    private List<RolFuncionalidad> rolFuncionalidades;

    // Getters y setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreFuncionalidad() {
        return nombreFuncionalidad;
    }

    public void setNombreFuncionalidad(String nombreFuncionalidad) {
        this.nombreFuncionalidad = nombreFuncionalidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<RolFuncionalidad> getRolFuncionalidades() {
        return rolFuncionalidades;
    }

    public void setRolFuncionalidades(List<RolFuncionalidad> rolFuncionalidades) {
        this.rolFuncionalidades = rolFuncionalidades;
    }
}
