package com.festividades.calendario.repository;

import com.festividades.calendario.model.Festividad;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface FestividadRepository extends JpaRepository<Festividad, Long> {
    List<Festividad> findByCantonId(Long cantonId);

    List<Festividad> findByNombreContainingIgnoreCase(String nombre);

}

