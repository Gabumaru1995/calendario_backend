package com.festividades.calendario.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String descripcion;

    @OneToMany(mappedBy = "rol", cascade = CascadeType.ALL)
    private List<UsuarioRol> usuarioRoles;

    @OneToMany(mappedBy = "rol", cascade = CascadeType.ALL)
    private List<RolFuncionalidad> rolFuncionalidades;

    // Getters y setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<UsuarioRol> getUsuarioRoles() {
        return usuarioRoles;
    }

    public void setUsuarioRoles(List<UsuarioRol> usuarioRoles) {
        this.usuarioRoles = usuarioRoles;
    }

    public List<RolFuncionalidad> getRolFuncionalidades() {
        return rolFuncionalidades;
    }

    public void setRolFuncionalidades(List<RolFuncionalidad> rolFuncionalidades) {
        this.rolFuncionalidades = rolFuncionalidades;
    }
}
