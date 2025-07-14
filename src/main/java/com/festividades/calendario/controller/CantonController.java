package com.festividades.calendario.controller;

import com.festividades.calendario.model.Canton;
import com.festividades.calendario.repository.CantonRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cantones")
public class CantonController {

    private final CantonRepository cantonRepository;

    public CantonController(CantonRepository cantonRepository) {
        this.cantonRepository = cantonRepository;
    }

    @GetMapping
    public List<Canton> listarProvincias() {
        return cantonRepository.findAll();
    }
}
