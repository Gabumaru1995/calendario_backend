package com.festividades.calendario.controller;

import com.festividades.calendario.model.Provincia;
import com.festividades.calendario.repository.ProvinciaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/provincias")
public class ProvinciaController {

    private final ProvinciaRepository provinciaRepository;

    public ProvinciaController(ProvinciaRepository provinciaRepository) {
        this.provinciaRepository = provinciaRepository;
    }

    @GetMapping
    public List<Provincia> listarProvincias() {
        return provinciaRepository.findAll();
    }
}
