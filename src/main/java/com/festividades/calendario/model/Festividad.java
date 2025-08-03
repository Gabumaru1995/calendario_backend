package com.festividades.calendario.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Festividad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String descripcion;
    private LocalDate fecha;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "canton_id")
    @JsonBackReference
    private Canton canton;

    // Constructor adicional para usar en Seeder sin ID
    public Festividad(String nombre, String descripcion, LocalDate fecha, Canton canton) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.canton = canton;
    }
}
