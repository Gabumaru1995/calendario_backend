package com.festividades.calendario.controller;

import com.festividades.calendario.model.Recordatorio;
import com.festividades.calendario.repository.RecordatorioRepository;
import com.festividades.calendario.service.RecordatorioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/recordatorios")
public class RecordatorioController {

    private final RecordatorioService recordatorioService;
    private final RecordatorioRepository recordatorioRepository;

    public RecordatorioController(RecordatorioRepository recordatorioRepository, RecordatorioService recordatorioService) {
        this.recordatorioRepository = recordatorioRepository;
        this.recordatorioService = recordatorioService;
    }

    @GetMapping
    public List<Recordatorio> listarRecordatorios() {
        return recordatorioRepository.findAll();
    }

    @PostMapping
    public Recordatorio crear(@RequestBody Recordatorio recordatorio) {
        recordatorio.setCreadoEn(LocalDateTime.now());
        recordatorio.setActualizadoEn(LocalDateTime.now());
        return recordatorioRepository.save(recordatorio);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> actualizarRecordatorio(@PathVariable("id") Long id, @RequestBody Recordatorio recordatorioActualizado) {
        return recordatorioService.actualizar(id, recordatorioActualizado);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable("id") Long id) {
        recordatorioService.eliminar(id);
        return ResponseEntity.noContent().build();
    }
    
}
