package com.festividades.calendario.config;

import com.festividades.calendario.model.Provincia;
import com.festividades.calendario.repository.ProvinciaRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DataSeeder implements CommandLineRunner {

    private final ProvinciaRepository provinciaRepository;

    public DataSeeder(ProvinciaRepository provinciaRepository) {
        this.provinciaRepository = provinciaRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (provinciaRepository.count() == 0) {
            List<Provincia> provincias = Arrays.asList(
                    new Provincia(null, "Azuay", null),
                    new Provincia(null, "Bolívar", null),
                    new Provincia(null, "Cañar", null),
                    new Provincia(null, "Carchi", null),
                    new Provincia(null, "Chimborazo", null),
                    new Provincia(null, "Cotopaxi", null),
                    new Provincia(null, "El Oro", null),
                    new Provincia(null, "Esmeraldas", null),
                    new Provincia(null, "Galápagos", null),
                    new Provincia(null, "Guayas", null),
                    new Provincia(null, "Imbabura", null),
                    new Provincia(null, "Loja", null),
                    new Provincia(null, "Los Ríos", null),
                    new Provincia(null, "Manabí", null),
                    new Provincia(null, "Morona Santiago", null),
                    new Provincia(null, "Napo", null),
                    new Provincia(null, "Orellana", null),
                    new Provincia(null, "Pastaza", null),
                    new Provincia(null, "Pichincha", null),
                    new Provincia(null, "Santa Elena", null),
                    new Provincia(null, "Santo Domingo de los Tsáchilas", null),
                    new Provincia(null, "Sucumbíos", null),
                    new Provincia(null, "Tungurahua", null),
                    new Provincia(null, "Zamora Chinchipe", null)
            );

            provinciaRepository.saveAll(provincias);
            System.out.println("✔ Provincias insertadas correctamente.");
        } else {
            System.out.println("ℹ Provincias ya existen. No se insertaron nuevamente.");
        }
    }
}
