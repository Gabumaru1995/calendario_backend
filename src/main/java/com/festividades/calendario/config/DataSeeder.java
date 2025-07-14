package com.festividades.calendario.config;

import com.festividades.calendario.model.Canton;
import com.festividades.calendario.model.Provincia;
import com.festividades.calendario.repository.CantonRepository;
import com.festividades.calendario.repository.ProvinciaRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Component
public class DataSeeder implements CommandLineRunner {

    private final ProvinciaRepository provinciaRepository;
    private final CantonRepository cantonRepository;

    public DataSeeder(ProvinciaRepository provinciaRepository, CantonRepository cantonRepository) {
        this.provinciaRepository = provinciaRepository;
        this.cantonRepository = cantonRepository;
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
                    new Provincia(null, "Zamora Chinchipe", null));

            provinciaRepository.saveAll(provincias);
            System.out.println("✔ Provincias insertadas correctamente.");
        } else {
            System.out.println("ℹ Provincias ya existen. No se insertaron nuevamente.");
        }

        if (cantonRepository.count() == 0) {
            Map<String, List<String>> cantonesPorProvincia = new HashMap<>();

            cantonesPorProvincia.put("Azuay", Arrays.asList(
                    "Cuenca", "Giron", "Gualaceo", "Nabón", "Oña", "Paute",
                    "Pucará", "San Fernando", "Santa Isabel", "Sigsig",
                    "Chordeleg", "Camilo Ponce Enríquez", "El Pan", "Sevilla de Oro"));

            cantonesPorProvincia.put("Bolívar", Arrays.asList(
                    "Caluma", "Chillanes", "Chimbo", "Echeandía",
                    "Guaranda", "Las Naves", "San Miguel"));

            cantonesPorProvincia.put("Cañar", Arrays.asList(
                    "Azogues", "Biblián", "Cañar", "Déleg",
                    "El Tambo", "La Troncal", "Suscal"));

            cantonesPorProvincia.put("Carchi", Arrays.asList(
                    "Tulcán", "Bolívar", "Espejo", "Mira",
                    "Montúfar", "San Pedro de Huaca"));

            cantonesPorProvincia.put("Chimborazo", Arrays.asList(
                    "Riobamba", "Alausí", "Colta", "Chambo", "Chunchi",
                    "Guamote", "Guano", "Pallatanga", "Penipe", "Cumandá"));

            cantonesPorProvincia.put("Cotopaxi", Arrays.asList(
                    "Latacunga", "La Maná", "Pangua", "Pujilí",
                    "Salcedo", "Saquisilí", "Sigchos"));

            cantonesPorProvincia.put("El Oro", Arrays.asList(
                    "Machala", "Arenillas", "Atahualpa", "Balsas", "Chilla",
                    "El Guabo", "Huaquillas", "Las Lajas", "Marcabelí",
                    "Pasaje", "Piñas", "Portovelo", "Santa Rosa", "Zaruma"));

            cantonesPorProvincia.put("Esmeraldas", Arrays.asList(
                    "Esmeraldas", "Atacames", "Eloy Alfaro", "Muisne",
                    "Quinindé", "Rioverde", "San Lorenzo"));

            cantonesPorProvincia.put("Galápagos", Arrays.asList(
                    "San Cristóbal", "Santa Cruz", "Isabela"));

            cantonesPorProvincia.put("Guayas", Arrays.asList(
                    "Guayaquil", "Alfredo Baquerizo Moreno", "Balao",
                    "Balzar", "Colimes", "Coronel Marcelino Maridueña",
                    "Daule", "Durán", "El Empalme", "El Triunfo",
                    "General Antonio Elizalde", "Isidro Ayora",
                    "Lomas de Sargentillo", "Milagro", "Naranjal",
                    "Naranjito", "Nobol", "Palestina", "Pedro Carbo",
                    "Playas", "Salitre", "Samborondón", "Santa Lucía",
                    "Simón Bolívar", "Yaguachi"));

            cantonesPorProvincia.put("Imbabura", Arrays.asList(
                    "Ibarra", "Antonio Ante", "Cotacachi", "Otavalo",
                    "Pimampiro", "San Miguel de Urcuquí"));

            cantonesPorProvincia.put("Loja", Arrays.asList(
                    "Loja", "Calvas", "Catamayo", "Chaguarpamba", "Celica",
                    "Chilcaymarca", "Espíndola", "Gonzanamá", "La"));

            cantonesPorProvincia.put("Los Ríos", Arrays.asList(
                    "Babahoyo", "Baba", "Montalvo", "Puebloviejo",
                    "Quevedo", "Ventanas", "Vinces", "Buena Fe",
                    "Valencia", "Mocache", "Balerio Estacio", "Quinsaloma"));

            cantonesPorProvincia.put("Manabí", Arrays.asList(
                    "Portoviejo", "Jipijapa", "Montecristi", "Chone",
                    "Santa Ana", "Sucre", "El Carmen", "Flavio Alfaro",
                    "Jama", "Jaramijó", "Junín", "Manta", "Olmedo",
                    "Paján", "Pedernales", "Pichincha", "Pto. López",
                    "Rocafuerte", "San Vicente", "Tosagua", "24 de Mayo"));

            cantonesPorProvincia.put("Morona Santiago", Arrays.asList(
                    "Macas", "Gualaquiza", "Logroño", "Limón Indanza",
                    "Palora", "Santiago", "Sucúa", "Huamboya",
                    "San Juan Bosco", "Pablo Sexto", "Taisha"));

            cantonesPorProvincia.put("Napo", Arrays.asList(
                    "Tena", "Archidona", "Carlos Julio Arosemena Tola",
                    "El Chaco", "Quijos"));

            cantonesPorProvincia.put("Orellana", Arrays.asList(
                    "Loreto", "Aguarico", "Joya de los Sachas",
                    "Orellana"));

            cantonesPorProvincia.put("Pastaza", Arrays.asList(
                    "Puyo", "Mera", "Santa Clara", "Arajuno"));

            cantonesPorProvincia.put("Pichincha", Arrays.asList(
                    "Quito", "Cayambe", "Mejía", "Pedro Moncayo",
                    "Pedro Vicente Maldonado", "Puerto Quito", "Rumiñahui",
                    "San Miguel de Los Bancos"));

            cantonesPorProvincia.put("Santa Elena", Arrays.asList(
                    "Santa Elena", "La Libertad", "Salinas"));

            cantonesPorProvincia.put("Santo Domingo de los Tsáchilas", Arrays.asList(
                    "Santo Domingo", "La Concordia"));

            cantonesPorProvincia.put("Sucumbíos", Arrays.asList(
                    "Lago Agrio", "Gonzalo Pizarro", "Putumayo",
                    "Shushufindi", "Sucumbíos", "Cascales", "Cuyabeno"));

            cantonesPorProvincia.put("Tungurahua", Arrays.asList(
                    "Ambato", "Baños", "Cevallos", "Mocha", "Patate",
                    "Quero", "San Pedro de Pelileo", "Tisaleo", "Pelileo"));

            cantonesPorProvincia.put("Zamora Chinchipe", Arrays.asList(
                    "Zamora", "Chinchipe", "Nangaritza", "Yacuambi",
                    "Yantzaza", "El Pangui", "Centinela del Cóndor", "Palanda", "Paquisha"));

            List<Canton> cantones = new ArrayList<>();

            for (Map.Entry<String, List<String>> entry : cantonesPorProvincia.entrySet()) {
                String nombreProvincia = entry.getKey();
                List<String> nombresCantones = entry.getValue();

                Optional<Provincia> optionalProvincia = provinciaRepository.findByNombre(nombreProvincia);
                if (optionalProvincia.isPresent()) {
                    Provincia provincia = optionalProvincia.get();
                    for (String nombreCanton : nombresCantones) {
                        cantones.add(new Canton(null, nombreCanton, provincia, null));
                    }
                } else {
                    System.out.println("⚠ Provincia no encontrada: " + nombreProvincia);
                }

            }

            cantonRepository.saveAll(cantones);
            System.out.println("✔ Cantones insertados correctamente.");
        } else {
            System.out.println("ℹ Cantones ya existen. No se insertaron nuevamente.");
        }
    }
}
