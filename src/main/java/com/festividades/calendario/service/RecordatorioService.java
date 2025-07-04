package com.festividades.calendario.service;

import com.festividades.calendario.model.Recordatorio;
import com.festividades.calendario.repository.RecordatorioRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RecordatorioService {

    private final RecordatorioRepository recordatorioRepository;

    public RecordatorioService(RecordatorioRepository recordatorioRepository) {
        this.recordatorioRepository = recordatorioRepository;
    }

    public ResponseEntity<?> actualizar(Long id, Recordatorio datosActualizados) {
        Optional<Recordatorio> existenteOpt = recordatorioRepository.findById(id);
        if (existenteOpt.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        Recordatorio existente = existenteOpt.get();

        // Solo actualizamos si vienen nuevos valores
        if (datosActualizados.getTitulo() != null) {
            existente.setTitulo(datosActualizados.getTitulo());
        }
        if (datosActualizados.getMensaje() != null) {
            existente.setMensaje(datosActualizados.getMensaje());
        }
        if (datosActualizados.getFechaHora() != null) {
            existente.setFechaHora(datosActualizados.getFechaHora());
        }

        existente.setActualizadoEn(java.time.LocalDateTime.now());

        Recordatorio actualizado = recordatorioRepository.save(existente);
        return ResponseEntity.ok(actualizado);
    }

    public void eliminar(Long id) {
        recordatorioRepository.deleteById(id);
    }
}
