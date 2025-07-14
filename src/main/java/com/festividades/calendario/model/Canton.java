package com.festividades.calendario.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Canton {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @ManyToOne
    @JoinColumn(name = "provincia_id")
    @JsonBackReference
    private Provincia provincia;

    @OneToMany(mappedBy = "canton", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Festividad> festividades;

    // Getters y setters
}
