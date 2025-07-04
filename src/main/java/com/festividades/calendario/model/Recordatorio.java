package com.festividades.calendario.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

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
    private Festividad festividad;

    // Getters y setters

}
