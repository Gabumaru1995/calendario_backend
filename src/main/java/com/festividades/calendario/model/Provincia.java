package com.festividades.calendario.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Provincia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @OneToMany(mappedBy = "provincia", cascade = CascadeType.ALL)
@com.fasterxml.jackson.annotation.JsonIgnore
private List<Festividad> festividades;

    // Getters y setters
}
