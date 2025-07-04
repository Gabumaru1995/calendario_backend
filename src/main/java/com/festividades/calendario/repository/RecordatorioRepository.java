package com.festividades.calendario.repository;

import com.festividades.calendario.model.Recordatorio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordatorioRepository extends JpaRepository<Recordatorio, Long> {}

