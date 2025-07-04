package com.festividades.calendario.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Festividad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String descripcion;
    private LocalDate fecha;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "provincia_id")
    private Provincia provincia;

    // Constructor adicional para usar en Seeder sin ID
    public Festividad(String nombre, String descripcion, LocalDate fecha, Provincia provincia) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.provincia = provincia;
    }
}
