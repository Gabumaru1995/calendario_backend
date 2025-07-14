package com.festividades.calendario.repository;

import com.festividades.calendario.model.Provincia;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProvinciaRepository extends JpaRepository<Provincia, Long> {
    Optional<Provincia> findByNombre(String nombre);  // ✅ AGREGA ESTA LÍNEA
    
}