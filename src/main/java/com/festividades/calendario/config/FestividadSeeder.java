package com.festividades.calendario.config;

import java.time.LocalDate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import com.festividades.calendario.repository.FestividadRepository;
import com.festividades.calendario.repository.ProvinciaRepository;

import com.festividades.calendario.model.Festividad;

@Component
public class FestividadSeeder implements CommandLineRunner {

    @Autowired
    private ProvinciaRepository provinciaRepository;

    @Autowired
    private FestividadRepository festividadRepository;

    @Override
    public void run(String... args) throws Exception {
        // Azuay
        provinciaRepository.findByNombre("Azuay").ifPresent(provincia -> {
            festividadRepository.save(new Festividad(
                    "Fundación de Cuenca",
                    "Celebración de la fundación de Santa Ana de los Ríos de Cuenca en 1557, con desfiles cívicos y eventos culturales.",
                    LocalDate.of(2025, 4, 12),
                    provincia));
            festividadRepository.save(new Festividad(
                    "Independencia de Cuenca",
                    "Conmemora la gesta independentista de Cuenca del 3 de noviembre de 1820, con actos cívicos y festividades locales.",
                    LocalDate.of(2025, 11, 3),
                    provincia));
        });

        // Bolívar
        provinciaRepository.findByNombre("Bolívar").ifPresent(provincia -> {
            festividadRepository.save(new Festividad(
                    "Carnaval de Guaranda",
                    "Fiesta de Carnaval en Guaranda, famosa por sus comparsas, música folclórica y la tradicional bebida \"pájaro azul\".",
                    LocalDate.of(2025, 3, 3),
                    provincia));
            festividadRepository.save(new Festividad(
                    "Independencia de Guaranda",
                    "Conmemora la independencia de Guaranda del 10 de noviembre de 1820, celebrada con desfiles y actos culturales en la capital provincial.",
                    LocalDate.of(2025, 11, 10),
                    provincia));
        });

        // Cañar
        provinciaRepository.findByNombre("Cañar").ifPresent(provincia -> {
            festividadRepository.save(new Festividad(
                    "Cantonización de Azogues",
                    "Aniversario de la cantonización de Azogues, capital provincial, ocurrido el 16 de abril de 1825, celebrado con desfiles y eventos cívicos.",
                    LocalDate.of(2025, 4, 16),
                    provincia));
            festividadRepository.save(new Festividad(
                    "Independencia de Azogues",
                    "Conmemora el levantamiento independentista de Azogues del 4 de noviembre de 1820, con actos cívicos y festivales locales.",
                    LocalDate.of(2025, 11, 4),
                    provincia));
        });

        // Carchi
        provinciaRepository.findByNombre("Carchi").ifPresent(provincia -> {
            festividadRepository.save(new Festividad(
                    "Provincialización del Carchi",
                    "Recuerda la creación de la provincia del Carchi el 19 de noviembre de 1880, celebrada con desfiles cívicos en Tulcán y demás cantones.",
                    LocalDate.of(2025, 11, 19),
                    provincia));
        });

        // Chimborazo
        provinciaRepository.findByNombre("Chimborazo").ifPresent(provincia -> {
            festividadRepository.save(new Festividad(
                    "Independencia de Riobamba",
                    "Conmemora la independencia de Riobamba del 21 de abril de 1822, primera ciudad liberada antes de la Batalla de Pichincha.",
                    LocalDate.of(2025, 4, 21),
                    provincia));
            festividadRepository.save(new Festividad(
                    "Fundación de Riobamba",
                    "Celebra la fundación de la ciudad de Riobamba (primera en el territorio ecuatoriano) en época colonial, con eventos culturales y cívicos.",
                    LocalDate.of(2025, 11, 11),
                    provincia));
        });

        // Cotopaxi
        provinciaRepository.findByNombre("Cotopaxi").ifPresent(provincia -> {
            festividadRepository.save(new Festividad(
                    "Provincialización de Cotopaxi",
                    "Aniversario de la provincialización de Cotopaxi (1 de abril de 1851), conmemorando la creación de la provincia con eventos cívicos.",
                    LocalDate.of(2025, 4, 1),
                    provincia));
            festividadRepository.save(new Festividad(
                    "Independencia de Latacunga",
                    "Conmemora la independencia de Latacunga del 11 de noviembre de 1820, celebrada con desfiles y la tradicional Fiesta de la Mama Negra en honor a la Virgen de La Merced.",
                    LocalDate.of(2025, 11, 11),
                    provincia));
        });

        // El Oro
        provinciaRepository.findByNombre("El Oro").ifPresent(provincia -> {
            festividadRepository.save(new Festividad(
                    "Provincialización de El Oro",
                    "Celebra la creación de la provincia de El Oro el 23 de abril de 1884, con actos cívicos en Machala y demás cantones orenses.",
                    LocalDate.of(2025, 4, 23),
                    provincia));
            festividadRepository.save(new Festividad(
                    "Cantonización de Machala",
                    "Aniversario de la cantonización de Machala (25 de junio de 1824), recordando el establecimiento de la ciudad como cantón y capital provincial.",
                    LocalDate.of(2025, 6, 25),
                    provincia));
        });

        // Esmeraldas
        provinciaRepository.findByNombre("Esmeraldas").ifPresent(provincia -> {
            festividadRepository.save(new Festividad(
                    "Independencia de Esmeraldas",
                    "Recuerda el 5 de agosto de 1820, cuando patriotas en la provincia de Esmeraldas proclamaron su emancipación de España; se realizan desfiles y eventos cívicos.",
                    LocalDate.of(2025, 8, 5),
                    provincia));
            festividadRepository.save(new Festividad(
                    "Provincialización de Esmeraldas",
                    "Conmemora la creación de la provincia de Esmeraldas el 20 de noviembre de 1847, celebrada con eventos cívicos y culturales en la ciudad de Esmeraldas.",
                    LocalDate.of(2025, 11, 21),
                    provincia));
        });

        // Galápagos
        provinciaRepository.findByNombre("Galápagos").ifPresent(provincia -> {
            festividadRepository.save(new Festividad(
                    "Provincialización de Galápagos",
                    "Conmemora la conversión del archipiélago de Galápagos en la 20ª provincia del Ecuador, el 18 de febrero de 1973; se realizan actos cívicos en Puerto Baquerizo Moreno.",
                    LocalDate.of(2025, 2, 18),
                    provincia));
        });

        // Guayas
        provinciaRepository.findByNombre("Guayas").ifPresent(provincia -> {
            festividadRepository.save(new Festividad(
                    "Fundación de Guayaquil",
                    "Fiesta cívica en conmemoración de la fundación de Santiago de Guayaquil (25 de julio de 1538), celebrada con desfiles náuticos, eventos culturales y artísticos.",
                    LocalDate.of(2025, 7, 25),
                    provincia));
            festividadRepository.save(new Festividad(
                    "Independencia de Guayaquil",
                    "Celebración de la independencia de Guayaquil del 9 de octubre de 1820, con desfiles estudiantiles, eventos cívicos y verbenas populares en la ciudad porteña.",
                    LocalDate.of(2025, 10, 9),
                    provincia));
        });

        // Imbabura
        provinciaRepository.findByNombre("Imbabura").ifPresent(provincia -> {
            festividadRepository.save(new Festividad(
                    "Provincialización de Imbabura",
                    "Celebra el aniversario de la provincialización de Imbabura (25 de junio de 1824), con actos cívicos que recuerdan la creación de la provincia.",
                    LocalDate.of(2025, 6, 25),
                    provincia));
            festividadRepository.save(new Festividad(
                    "Fundación de Ibarra",
                    "Recuerda la fundación de la ciudad de Ibarra el 28 de septiembre de 1606, realizada por los colonizadores españoles; se celebran desfiles y actividades culturales.",
                    LocalDate.of(2025, 9, 28),
                    provincia));
            festividadRepository.save(new Festividad(
                    "Fiesta del Yamor",
                    "Festival tradicional en Otavalo, a inicios de septiembre, en agradecimiento a la cosecha; incluye desfiles, música, danza y la degustación del Yamor (bebida de maíz).",
                    LocalDate.of(2025, 9, 6),
                    provincia));
        });

        // Loja
        provinciaRepository.findByNombre("Loja").ifPresent(provincia -> {
            festividadRepository.save(new Festividad(
                    "Independencia de Loja",
                    "Conmemora la independencia de Loja del 18 de noviembre de 1820, con desfiles cívicos, sesión solemne y eventos artísticos en la ciudad de Loja.",
                    LocalDate.of(2025, 11, 18),
                    provincia));
            festividadRepository.save(new Festividad(
                    "Fundación de Loja",
                    "Celebra la fundación de la ciudad de Loja (8 de diciembre de 1548) por Alonso de Mercadillo; se realizan eventos culturales y festivales tradicionales en diciembre.",
                    LocalDate.of(2025, 12, 8),
                    provincia));
        });

        // Los Ríos
        provinciaRepository.findByNombre("Los Ríos").ifPresent(provincia -> {
            festividadRepository.save(new Festividad(
                    "Fundación de Babahoyo",
                    "Conmemora la fundación de Babahoyo, capital de Los Ríos, el 27 de mayo de 1869; se realizan desfiles fluviales en el río Babahoyo y actos culturales.",
                    LocalDate.of(2025, 5, 27),
                    provincia));
            festividadRepository.save(new Festividad(
                    "Provincialización de Los Ríos",
                    "Celebra la creación de la provincia de Los Ríos el 6 de octubre de 1860, decretada por Gabriel García Moreno; incluye desfiles y eventos cívicos en Babahoyo y Quevedo.",
                    LocalDate.of(2025, 10, 6),
                    provincia));
        });

        // Manabí
        provinciaRepository.findByNombre("Manabí").ifPresent(provincia -> {
            festividadRepository.save(new Festividad(
                    "Fundación de Portoviejo",
                    "Fiesta provincial que celebra la fundación de Portoviejo, capital de Manabí, el 12 de marzo de 1535; se realizan desfiles, ferias y eventos culturales en la ciudad.",
                    LocalDate.of(2025, 3, 12),
                    provincia));
            festividadRepository.save(new Festividad(
                    "Independencia de Portoviejo",
                    "Recuerda la proclamación de independencia de Portoviejo del 18 de octubre de 1820, con actos cívicos, desfiles estudiantiles y festividades en toda la provincia.",
                    LocalDate.of(2025, 10, 18),
                    provincia));
        });

        // Morona Santiago
        provinciaRepository.findByNombre("Morona Santiago").ifPresent(provincia -> {
            festividadRepository.save(new Festividad(
                    "Cantonización de Macas",
                    "Aniversario de la cantonización de Macas, actual capital de Morona Santiago; se conmemora cada 29 de mayo con desfiles, actos cívicos y eventos culturales locales.",
                    LocalDate.of(2025, 5, 29),
                    provincia));
            festividadRepository.save(new Festividad(
                    "Provincialización de Morona Santiago",
                    "Conmemora la creación de la provincia de Morona Santiago el 10 de noviembre de 1953, tras su separación de la antigua provincia de Santiago-Zamora; se realizan actos cívicos en Macas.",
                    LocalDate.of(2025, 11, 10),
                    provincia));
        });

        // Napo
        provinciaRepository.findByNombre("Napo").ifPresent(provincia -> {
            festividadRepository.save(new Festividad(
                    "Provincialización de Napo",
                    "Recuerda la creación de la provincia de Napo el 10 de noviembre de 1959, luego de la reorganización de la Región Amazónica; se celebra con eventos cívicos en Tena.",
                    LocalDate.of(2025, 2, 11),
                    provincia));
            festividadRepository.save(new Festividad(
                    "Fundación de Tena",
                    "Conmemora la fundación de San Juan de los Dos Ríos de Tena el 15 de noviembre de 1560, conocida hoy simplemente como Tena, con festividades culturales y exposiciones locales.",
                    LocalDate.of(2025, 11, 15),
                    provincia));
        });

        // Orellana
        provinciaRepository.findByNombre("Orellana").ifPresent(provincia -> {
            festividadRepository.save(new Festividad(
                    "Cantonización de Puerto Francisco de Orellana (Coca)",
                    "Aniversario de la cantonización de la ciudad de Coca, actual Puerto Francisco de Orellana, celebrado el 20 de abril con desfiles cívicos y eventos culturales amazónicos.",
                    LocalDate.of(2025, 4, 20),
                    provincia));
            festividadRepository.save(new Festividad(
                    "Provincialización de Orellana",
                    "Celebra la creación de la provincia de Orellana el 30 de julio de 1998; se realizan actos cívicos en la ciudad de Coca y otras localidades en conmemoración del aniversario provincial.",
                    LocalDate.of(2025, 7, 30),
                    provincia));
        });

        // Pastaza
        provinciaRepository.findByNombre("Pastaza").ifPresent(provincia -> {
            festividadRepository.save(new Festividad(
                    "Fundación de Puyo",
                    "Celebra la fundación de la ciudad de Puyo, capital de Pastaza, el 12 de mayo de 1899 por misioneros dominicos; incluye desfiles, ferias y exposiciones de la cultura amazónica.",
                    LocalDate.of(2025, 5, 12),
                    provincia));
            festividadRepository.save(new Festividad(
                    "Provincialización de Pastaza",
                    "Conmemora la creación de la provincia de Pastaza el 10 de noviembre de 1959, tras separarse de Napo-Pastaza; se realizan eventos cívicos y desfiles en Puyo y sus alrededores.",
                    LocalDate.of(2025, 11, 10),
                    provincia));
        });

        // Pichincha
        provinciaRepository.findByNombre("Pichincha").ifPresent(provincia -> {
            festividadRepository.save(new Festividad(
                    "Fundación de Quito (Fiestas de Quito)",
                    "Fiestas de Quito en conmemoración de la fundación de San Francisco de Quito el 6 de diciembre de 1534; la capital se engalana con desfiles, conciertos, bailes populares y eventos culturales.",
                    LocalDate.of(2025, 12, 6),
                    provincia));
            festividadRepository.save(new Festividad(
                    "Fiesta de la Virgen de El Quinche",
                    "Fiesta religiosa tradicional en la parroquia de El Quinche (Pichincha), con peregrinaciones multitudinarias cada 21 de noviembre para venerar a la Virgen de El Quinche, acompañadas de misas y celebraciones populares.",
                    LocalDate.of(2025, 11, 21),
                    provincia));
        });

        // Santa Elena
        provinciaRepository.findByNombre("Santa Elena").ifPresent(provincia -> {
            festividadRepository.save(new Festividad(
                    "Cantonización de Santa Elena",
                    "Conmemora la cantonización de Santa Elena el 22 de enero de 1839 durante el gobierno de Vicente Rocafuerte; se celebra con desfiles cívicos, eventos folclóricos y feria gastronómica en la cabecera cantonal.",
                    LocalDate.of(2025, 1, 21),
                    provincia));
            festividadRepository.save(new Festividad(
                    "Provincialización de Santa Elena",
                    "Celebra la creación de la provincia de Santa Elena el 7 de noviembre de 2007, cuando se separó de la provincia del Guayas; se realizan desfiles estudiantiles, actos cívicos y eventos culturales en toda la península.",
                    LocalDate.of(2025, 11, 7),
                    provincia));
        });

        // Santo Domingo de los Tsáchilas
        provinciaRepository.findByNombre("Santo Domingo de los Tsáchilas").ifPresent(provincia -> {
            festividadRepository.save(new Festividad(
                    "Cantonización de Santo Domingo",
                    "Fiesta cantonal que recuerda la cantonización de Santo Domingo de los Colorados el 3 de julio de 1967, cuando pasó a ser cantón de Pichincha; se celebra con desfiles interculturales y exposiciones de la cultura Tsáchila.",
                    LocalDate.of(2025, 7, 3),
                    provincia));
            festividadRepository.save(new Festividad(
                    "Provincialización de Santo Domingo",
                    "Conmemora la creación de la provincia de Santo Domingo de los Tsáchilas el 6 de noviembre de 2007 (separación de Pichincha); se llevan a cabo sesiones solemnes, desfiles y festivales que resaltan la cultura Tsáchila.",
                    LocalDate.of(2025, 11, 6),
                    provincia));
        });

        // Sucumbíos
        provinciaRepository.findByNombre("Sucumbíos").ifPresent(provincia -> {
            festividadRepository.save(new Festividad(
                    "Provincialización de Sucumbíos",
                    "Conmemora la creación de la provincia de Sucumbíos el 13 de febrero de 1989, cuando se separó de Napo; se celebran actos cívicos y desfiles en Nueva Loja (Lago Agrio) y otros cantones.",
                    LocalDate.of(2025, 2, 13),
                    provincia));
            festividadRepository.save(new Festividad(
                    "Fundación de Nueva Loja (Lago Agrio)",
                    "Recuerda la fundación de Nueva Loja (Lago Agrio), capital de Sucumbíos, el 5 de mayo de 1971 como asentamiento petrolero; se realizan eventos culturales y ferias gastronómicas para celebrar su aniversario.",
                    LocalDate.of(2025, 5, 5),
                    provincia));
        });

        // Tungurahua
        provinciaRepository.findByNombre("Tungurahua").ifPresent(provincia -> {
            festividadRepository.save(new Festividad(
                    "Fiesta de la Fruta y de las Flores (Carnaval de Ambato)",
                    "Tradicional carnaval de Ambato celebrado el lunes y martes de Carnaval, con el famoso desfile de la Fiesta de la Fruta y de las Flores donde recorren carrozas adornadas con flores, frutas y pan, acompañadas de comparsas y música.",
                    LocalDate.of(2025, 3, 2),
                    provincia));
            festividadRepository.save(new Festividad(
                    "Independencia de Ambato",
                    "Conmemora la independencia de Ambato del 12 de noviembre de 1820; se celebra con desfiles cívicos, sesión solemne y festivales artísticos en la ciudad de Ambato.",
                    LocalDate.of(2025, 11, 12),
                    provincia));
        });

        // Zamora Chinchipe
        provinciaRepository.findByNombre("Zamora Chinchipe").ifPresent(provincia -> {
            festividadRepository.save(new Festividad(
                    "Fundación de Zamora",
                    "Conmemora la fundación de la ciudad de Zamora el 6 de octubre de 1549 por Hernando de Barahona; se celebran actos cívicos, desfiles y eventos culturales que resaltan la historia de la ciudad.",
                    LocalDate.of(2025, 10, 6),
                    provincia));
            festividadRepository.save(new Festividad(
                    "Provincialización de Zamora Chinchipe",
                    "Celebra la creación de la provincia de Zamora Chinchipe el 10 de noviembre de 1953, cuando se dividió la antigua provincia de Santiago-Zamora; incluye desfiles, eventos culturales y una sesión solemne en la ciudad de Zamora.",
                    LocalDate.of(2025, 11, 10),
                    provincia));

        });
        // FERIADOS NACIONALES (para todas las provincias)
        provinciaRepository.findAll().forEach(provincia -> {
            festividadRepository.save(new Festividad(
                    "Año Nuevo",
                    "Celebración del inicio del nuevo año en todo el país",
                    LocalDate.of(2025, 1, 1),
                    provincia));
            festividadRepository.save(new Festividad(
                    "Carnaval (Lunes)",
                    "Primera jornada del Carnaval en Ecuador",
                    LocalDate.of(2025, 3, 3),
                    provincia));
            festividadRepository.save(new Festividad(
                    "Carnaval (Martes)",
                    "Segunda jornada del Carnaval en Ecuador",
                    LocalDate.of(2025, 3, 4),
                    provincia));
            festividadRepository.save(new Festividad(
                    "Viernes Santo",
                    "Conmemoración religiosa cristiana",
                    LocalDate.of(2025, 4, 18),
                    provincia));
            festividadRepository.save(new Festividad(
                    "Día del Trabajo",
                    "Celebración del Día Internacional del Trabajador",
                    LocalDate.of(2025, 5, 1),
                    provincia));
            festividadRepository.save(new Festividad(
                    "Batalla de Pichincha",
                    "Conmemoración de la batalla que consolidó la independencia del Ecuador",
                    LocalDate.of(2025, 5, 24),
                    provincia));
            festividadRepository.save(new Festividad(
                    "Primer Grito de Independencia",
                    "Conmemoración del 10 de agosto de 1809",
                    LocalDate.of(2025, 8, 10),
                    provincia));
            festividadRepository.save(new Festividad(
                    "Independencia de Guayaquil",
                    "Conmemoración de la independencia de Guayaquil",
                    LocalDate.of(2025, 10, 9),
                    provincia));
            festividadRepository.save(new Festividad(
                    "Día de los Difuntos",
                    "Día dedicado a honrar a los fallecidos",
                    LocalDate.of(2025, 11, 2),
                    provincia));
            festividadRepository.save(new Festividad(
                    "Navidad",
                    "Celebración del nacimiento de Jesucristo",
                    LocalDate.of(2025, 12, 25),
                    provincia));
        });

    }
}
