package com.festividades.calendario.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Data
public class Recordatorio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String mensaje;
    private LocalDateTime fechaHora;
    private LocalDateTime creadoEn;
    private LocalDateTime actualizadoEn;

    @ManyToOne
    @JoinColumn(name = "festividad_id", nullable = true)
    @JsonBackReference
    private Festividad festividad;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    @JsonBackReference
    private Usuario usuario;

    // Getters y setters

}
