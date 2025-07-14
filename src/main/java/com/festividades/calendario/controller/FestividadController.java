package com.festividades.calendario.controller;

import com.festividades.calendario.model.Festividad;
import com.festividades.calendario.repository.FestividadRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/festividades")
public class FestividadController {

    private final FestividadRepository festividadRepository;

    public FestividadController(FestividadRepository festividadRepository) {
        this.festividadRepository = festividadRepository;
    }

    @GetMapping
    public List<Festividad> todas() {
        return festividadRepository.findAll();
    }

    @GetMapping("/canton/{id}")
    public List<Festividad> festividadesPorProvincia(@PathVariable("id") Long id) {
        return festividadRepository.findByCantonId(id);
    }

    @GetMapping("/buscar")
    public List<Festividad> buscarPorNombre(@RequestParam("nombre") String nombre) {
        return festividadRepository.findByNombreContainingIgnoreCase(nombre);
    }

}
