package com.festividades.calendario.repository;

import com.festividades.calendario.model.Canton;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CantonRepository extends JpaRepository<Canton, Long> {
    Optional<Canton> findByNombre(String nombre);  // ✅ AGREGA ESTA LÍNEA
}