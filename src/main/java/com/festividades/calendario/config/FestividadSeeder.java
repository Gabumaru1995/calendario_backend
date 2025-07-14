package com.festividades.calendario.config;

import java.time.LocalDate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import com.festividades.calendario.repository.CantonRepository;
import com.festividades.calendario.repository.FestividadRepository;
import com.festividades.calendario.repository.ProvinciaRepository;

import com.festividades.calendario.model.Festividad;

@Component
public class FestividadSeeder implements CommandLineRunner {

        private final FestividadRepository festividadRepository;
        private final CantonRepository cantonRepository;

        public FestividadSeeder(FestividadRepository festividadRepository, CantonRepository cantonRepository) {
                this.festividadRepository = festividadRepository;
                this.cantonRepository = cantonRepository;
        }

        @Override
        public void run(String... args) throws Exception {
                long count = festividadRepository.count();
                System.out.println("FestividadSeeder ejecutado");
                if (count > 0) {
                        System.out.println("ℹ Ya existen festividades. No se insertaron nuevamente.");
                        return;
                }

                // 🎉 Festividades en la provincia de Azuay
                cantonRepository.findByNombre("Cuenca").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fundación de Cuenca",
                                        "Celebración de la fundación de Cuenca en 1557.",
                                        LocalDate.of(2025, 4, 12),
                                        canton));
                        festividadRepository.save(new Festividad(
                                        "Independencia de Cuenca",
                                        "Conmemora la gesta independentista del 3 de noviembre de 1820.",
                                        LocalDate.of(2025, 11, 3),
                                        canton));
                });

                cantonRepository.findByNombre("Gualaceo").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiesta del Señor de Gualaceo",
                                        "Celebración religiosa tradicional del cantón Gualaceo.",
                                        LocalDate.of(2025, 9, 14),
                                        canton));
                });

                cantonRepository.findByNombre("Paute").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de la Virgen de la Merced",
                                        "Fiesta religiosa y cultural celebrada en septiembre.",
                                        LocalDate.of(2025, 9, 24),
                                        canton));
                });

                cantonRepository.findByNombre("Santa Isabel").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Santa Isabel",
                                        "Fiesta de aniversario del cantón.",
                                        LocalDate.of(2025, 4, 1),
                                        canton));
                });

                cantonRepository.findByNombre("Giron").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Batalla de Tapi",
                                        "Conmemoración de la batalla del 27 de febrero de 1829.",
                                        LocalDate.of(2025, 2, 27),
                                        canton));
                });

                cantonRepository.findByNombre("Nabón").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiesta de la Virgen del Rosario",
                                        "Celebración religiosa de gran tradición en Nabón.",
                                        LocalDate.of(2025, 10, 7),
                                        canton));
                });

                cantonRepository.findByNombre("Oña").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas Patronales de San Vicente Ferrer",
                                        "Fiestas religiosas en honor al patrono del cantón.",
                                        LocalDate.of(2025, 4, 5),
                                        canton));
                });

                cantonRepository.findByNombre("Pucará").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Pucará",
                                        "Aniversario de creación del cantón Pucará.",
                                        LocalDate.of(2025, 11, 20),
                                        canton));
                });

                cantonRepository.findByNombre("San Fernando").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de la Virgen de la Nube",
                                        "Celebración religiosa en honor a la Virgen de la Nube.",
                                        LocalDate.of(2025, 1, 1),
                                        canton));
                });

                cantonRepository.findByNombre("Sigsig").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiesta de la Virgen de Guadalupe",
                                        "Celebración religiosa tradicional del Sigsig.",
                                        LocalDate.of(2025, 12, 12),
                                        canton));
                });

                cantonRepository.findByNombre("Chordeleg").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de la Joyería",
                                        "Feria y eventos en honor al arte joyero de Chordeleg.",
                                        LocalDate.of(2025, 10, 15),
                                        canton));
                });

                cantonRepository.findByNombre("Camilo Ponce Enríquez").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Aniversario de cantonización",
                                        "Fiesta por la creación del cantón.",
                                        LocalDate.of(2025, 7, 14),
                                        canton));
                });

                cantonRepository.findByNombre("El Pan").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de San Vicente",
                                        "Fiestas religiosas del cantón El Pan.",
                                        LocalDate.of(2025, 1, 22),
                                        canton));
                });

                cantonRepository.findByNombre("Sevilla de Oro").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiesta de la Virgen del Carmen",
                                        "Fiesta religiosa tradicional de Sevilla de Oro.",
                                        LocalDate.of(2025, 7, 16),
                                        canton));
                });

                // 🎉 Festividades en la provincia de Bolívar
                cantonRepository.findByNombre("Guaranda").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Carnaval de Guaranda",
                                        "Celebración popular con comparsas, coplas, comida típica y danzas. Es uno de los carnavales más representativos del país.",
                                        LocalDate.of(2025, 2, 28),
                                        canton));
                });

                cantonRepository.findByNombre("Chillanes").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Chillanes",
                                        "Fiestas cívicas y culturales por la fundación del cantón.",
                                        LocalDate.of(2025, 8, 2),
                                        canton));
                });

                cantonRepository.findByNombre("Chimbo").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de la Virgen del Carmen",
                                        "Celebraciones religiosas y culturales en honor a la Virgen del Carmen.",
                                        LocalDate.of(2025, 7, 16),
                                        canton));
                });

                cantonRepository.findByNombre("Echeandía").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas Patronales de San José",
                                        "Fiestas religiosas en honor a San José, patrono del cantón.",
                                        LocalDate.of(2025, 3, 19),
                                        canton));
                });

                cantonRepository.findByNombre("Las Naves").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Las Naves",
                                        "Fiestas cívicas y culturales celebradas en abril.",
                                        LocalDate.of(2025, 4, 1),
                                        canton));
                });

                cantonRepository.findByNombre("San Miguel").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas Patronales de San Miguel",
                                        "Fiestas religiosas en honor al patrono San Miguel.",
                                        LocalDate.of(2025, 9, 29),
                                        canton));
                });

                cantonRepository.findByNombre("Caluma").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Cantonización",
                                        "Aniversario de creación del cantón Caluma.",
                                        LocalDate.of(2025, 1, 31),
                                        canton));
                });

                // 🎉 Festividades en la provincia de Cañar
                cantonRepository.findByNombre("Azogues").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Azogues",
                                        "Conmemoración de la fundación de Azogues el 4 de octubre de 1825 con desfiles, danzas y ferias.",
                                        LocalDate.of(2025, 10, 4),
                                        canton));
                });

                cantonRepository.findByNombre("Biblián").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de la Virgen del Rocío",
                                        "Celebración religiosa en honor a la Virgen del Rocío, en el santuario sobre la colina de Zhalao.",
                                        LocalDate.of(2025, 9, 8),
                                        canton));
                });

                cantonRepository.findByNombre("Cañar").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Inti Raymi",
                                        "Celebración ancestral del solsticio de junio con música, danzas y rituales indígenas.",
                                        LocalDate.of(2025, 6, 21),
                                        canton));
                });

                cantonRepository.findByNombre("Déleg").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Déleg",
                                        "Fiestas cívicas y religiosas celebradas en honor a San Antonio de Padua.",
                                        LocalDate.of(2025, 6, 13),
                                        canton));
                });

                cantonRepository.findByNombre("El Tambo").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiesta del Señor del Buen Suceso",
                                        "Fiesta tradicional en honor al Señor del Buen Suceso, patrono del cantón.",
                                        LocalDate.of(2025, 8, 24),
                                        canton));
                });

                cantonRepository.findByNombre("La Troncal").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Cantonización de La Troncal",
                                        "Fiesta cívica y cultural celebrada el 25 de mayo por la creación del cantón.",
                                        LocalDate.of(2025, 5, 25),
                                        canton));
                });

                cantonRepository.findByNombre("Suscal").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de la Virgen de El Carmen",
                                        "Celebración religiosa con procesiones y actos culturales.",
                                        LocalDate.of(2025, 7, 16),
                                        canton));
                });

                // 🎉 Festividades en la provincia de Carchi
                cantonRepository.findByNombre("Tulcán").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Tulcán",
                                        "Celebración cívica y cultural de la fundación de Tulcán, el 11 de abril.",
                                        LocalDate.of(2025, 4, 11),
                                        canton));
                });

                cantonRepository.findByNombre("Bolívar").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas Patronales de San José",
                                        "Celebraciones religiosas y culturales en honor a San José, patrono del cantón Bolívar.",
                                        LocalDate.of(2025, 3, 19),
                                        canton));
                });

                cantonRepository.findByNombre("Espejo").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de El Ángel",
                                        "Conmemoración de la fundación de la ciudad de El Ángel, cabecera del cantón Espejo.",
                                        LocalDate.of(2025, 11, 27),
                                        canton));
                });

                cantonRepository.findByNombre("Mira").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de la Virgen de la Caridad",
                                        "Fiesta religiosa y cultural celebrada en septiembre en Mira.",
                                        LocalDate.of(2025, 9, 8),
                                        canton));
                });

                cantonRepository.findByNombre("Montúfar").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de San Gabriel",
                                        "Celebración de la fundación de la ciudad de San Gabriel, cabecera del cantón.",
                                        LocalDate.of(2025, 6, 18),
                                        canton));
                });

                cantonRepository.findByNombre("San Pedro de Huaca").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas Patronales de San Pedro",
                                        "Fiesta religiosa en honor a San Pedro, patrono del cantón Huaca.",
                                        LocalDate.of(2025, 6, 29),
                                        canton));
                });

                // 🎉 Festividades en la provincia de Chimborazo
                cantonRepository.findByNombre("Riobamba").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Riobamba",
                                        "Celebración de la fundación española de Riobamba el 15 de agosto de 1534.",
                                        LocalDate.of(2025, 8, 15),
                                        canton));
                        festividadRepository.save(new Festividad(
                                        "Independencia de Riobamba",
                                        "Conmemoración del 21 de abril de 1822, día de la independencia de Riobamba.",
                                        LocalDate.of(2025, 4, 21),
                                        canton));
                });

                cantonRepository.findByNombre("Alausí").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de San Pedro",
                                        "Tradicional fiesta religiosa y cultural celebrada a finales de junio.",
                                        LocalDate.of(2025, 6, 29),
                                        canton));
                });

                cantonRepository.findByNombre("Chambo").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiesta de San Sebastián",
                                        "Fiesta patronal del cantón Chambo en honor a San Sebastián.",
                                        LocalDate.of(2025, 1, 20),
                                        canton));
                });

                cantonRepository.findByNombre("Chunchi").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Cantonización de Chunchi",
                                        "Celebración por el aniversario del cantón, con eventos cívicos y culturales.",
                                        LocalDate.of(2025, 6, 1),
                                        canton));
                });

                cantonRepository.findByNombre("Colta").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de la Virgen de las Nieves",
                                        "Celebraciones religiosas tradicionales en agosto.",
                                        LocalDate.of(2025, 8, 5),
                                        canton));
                });

                cantonRepository.findByNombre("Cumandá").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Cumandá",
                                        "Eventos culturales, deportivos y sociales en conmemoración de la fundación.",
                                        LocalDate.of(2025, 10, 20),
                                        canton));
                });

                cantonRepository.findByNombre("Guamote").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Inti Raymi",
                                        "Fiesta del Sol celebrada en las comunidades indígenas del cantón Guamote.",
                                        LocalDate.of(2025, 6, 21),
                                        canton));
                });

                cantonRepository.findByNombre("Pallatanga").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de la Virgen del Rosario",
                                        "Fiestas religiosas tradicionales en honor a la Virgen del Rosario.",
                                        LocalDate.of(2025, 10, 7),
                                        canton));
                });

                cantonRepository.findByNombre("Penipe").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas Patronales de San Francisco",
                                        "Celebraciones patronales en honor a San Francisco de Asís.",
                                        LocalDate.of(2025, 10, 4),
                                        canton));
                });

                // 🎉 Festividades en la provincia de Cotopaxi
                cantonRepository.findByNombre("Latacunga").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Mama Negra",
                                        "Fiesta popular religiosa que mezcla tradiciones indígenas, españolas y africanas, celebrada en honor a la Virgen de la Merced.",
                                        LocalDate.of(2025, 11, 11),
                                        canton));
                });

                cantonRepository.findByNombre("La Maná").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de La Maná",
                                        "Conmemoración de la fundación del cantón con desfiles, ferias y eventos deportivos.",
                                        LocalDate.of(2025, 5, 19),
                                        canton));
                });

                cantonRepository.findByNombre("Pangua").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de la Virgen del Rosario",
                                        "Fiesta religiosa principal del cantón Pangua.",
                                        LocalDate.of(2025, 10, 7),
                                        canton));
                });

                cantonRepository.findByNombre("Pujilí").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "El Danzante",
                                        "Fiesta ancestral de agradecimiento por las cosechas. Declarada Patrimonio Cultural Intangible del Ecuador.",
                                        LocalDate.of(2025, 6, 29),
                                        canton));
                });

                cantonRepository.findByNombre("Salcedo").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Salcedo",
                                        "Fiesta cívica celebrada con ferias y eventos artísticos en septiembre.",
                                        LocalDate.of(2025, 9, 19),
                                        canton));
                });

                cantonRepository.findByNombre("Saquisilí").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiesta del Señor del Árbol",
                                        "Celebración religiosa tradicional con procesiones, danzas y gastronomía.",
                                        LocalDate.of(2025, 5, 15),
                                        canton));
                });

                cantonRepository.findByNombre("Sigchos").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Sigchos",
                                        "Conmemoración de la cantonización de Sigchos con eventos culturales y deportivos.",
                                        LocalDate.of(2025, 9, 23),
                                        canton));
                });

                // 🎉 Festividades en la provincia de El Oro
                cantonRepository.findByNombre("Machala").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Machala",
                                        "Celebración de la fundación de la ciudad, conocida como la capital bananera del mundo.",
                                        LocalDate.of(2025, 6, 25),
                                        canton));
                        festividadRepository.save(new Festividad(
                                        "Feria Mundial del Banano",
                                        "Feria internacional que promueve el banano ecuatoriano con desfiles, ferias y eventos comerciales.",
                                        LocalDate.of(2025, 9, 23),
                                        canton));
                });

                cantonRepository.findByNombre("Arenillas").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas Patronales de San Isidro",
                                        "Celebración religiosa en honor a San Isidro Labrador, patrono de Arenillas.",
                                        LocalDate.of(2025, 5, 15),
                                        canton));
                });

                cantonRepository.findByNombre("Atahualpa").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Atahualpa",
                                        "Celebración de la fundación del cantón con actividades tradicionales y culturales.",
                                        LocalDate.of(2025, 7, 20),
                                        canton));
                });

                cantonRepository.findByNombre("Balsas").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Balsas",
                                        "Fiestas cívicas celebradas en el cantón con ferias, juegos y música.",
                                        LocalDate.of(2025, 8, 30),
                                        canton));
                });

                cantonRepository.findByNombre("Chilla").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas Patronales de la Virgen de Chilla",
                                        "Celebraciones religiosas en honor a la Virgen de Chilla, con gran afluencia de peregrinos.",
                                        LocalDate.of(2025, 9, 8),
                                        canton));
                });

                cantonRepository.findByNombre("El Guabo").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de El Guabo",
                                        "Fiesta cívica y cultural con presentaciones artísticas y gastronomía local.",
                                        LocalDate.of(2025, 9, 7),
                                        canton));
                });

                cantonRepository.findByNombre("Huaquillas").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Cantonización de Huaquillas",
                                        "Celebración de la creación del cantón fronterizo, con eventos cívicos y deportivos.",
                                        LocalDate.of(2025, 10, 6),
                                        canton));
                });

                cantonRepository.findByNombre("Las Lajas").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Las Lajas",
                                        "Eventos artísticos, ferias y procesiones por el aniversario del cantón.",
                                        LocalDate.of(2025, 4, 23),
                                        canton));
                });

                cantonRepository.findByNombre("Marcabelí").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Cantonización",
                                        "Actividades culturales, desfiles y actos solemnes en celebración de la cantonización.",
                                        LocalDate.of(2025, 5, 28),
                                        canton));
                });

                cantonRepository.findByNombre("Pasaje").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Pasaje",
                                        "Conmemoración de la fundación de Pasaje con desfiles cívicos y culturales.",
                                        LocalDate.of(2025, 4, 17),
                                        canton));
                });

                cantonRepository.findByNombre("Piñas").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas Patronales de Piñas",
                                        "Fiestas religiosas y populares del cantón Piñas, con eventos tradicionales.",
                                        LocalDate.of(2025, 8, 24),
                                        canton));
                });

                cantonRepository.findByNombre("Portovelo").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Portovelo",
                                        "Fiesta cívica de la ciudad minera, celebrada el 29 de noviembre.",
                                        LocalDate.of(2025, 11, 29),
                                        canton));
                });

                cantonRepository.findByNombre("Santa Rosa").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas Patronales de Santa Rosa",
                                        "Celebración religiosa en honor a Santa Rosa de Lima.",
                                        LocalDate.of(2025, 8, 30),
                                        canton));
                });

                cantonRepository.findByNombre("Zaruma").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de la Virgen del Carmen",
                                        "Celebración religiosa tradicional del cantón Zaruma.",
                                        LocalDate.of(2025, 7, 16),
                                        canton));
                });

                // 🎉 Festividades en la provincia de Esmeraldas
                cantonRepository.findByNombre("Esmeraldas").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Esmeraldas",
                                        "Conmemoración de la fundación del cantón con actividades afroecuatorianas, desfiles y música.",
                                        LocalDate.of(2025, 9, 21),
                                        canton));
                        festividadRepository.save(new Festividad(
                                        "Festival de Marimba",
                                        "Celebración cultural con música, danza y gastronomía afroesmeraldeña.",
                                        LocalDate.of(2025, 6, 30),
                                        canton));
                });

                cantonRepository.findByNombre("Atacames").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Carnaval de Atacames",
                                        "Una de las celebraciones más populares en la playa, con música, comparsas y turismo.",
                                        LocalDate.of(2025, 3, 2),
                                        canton));
                });

                cantonRepository.findByNombre("Eloy Alfaro").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de la Virgen del Carmen",
                                        "Fiestas religiosas en la parroquia Limones con participación de comunidades afrodescendientes.",
                                        LocalDate.of(2025, 7, 16),
                                        canton));
                });

                cantonRepository.findByNombre("Muisne").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas Patronales de Muisne",
                                        "Celebraciones religiosas, desfiles y regatas en honor a la Virgen de la Merced.",
                                        LocalDate.of(2025, 9, 24),
                                        canton));
                });

                cantonRepository.findByNombre("Quinindé").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Quinindé",
                                        "Eventos culturales y ferias por el aniversario de fundación.",
                                        LocalDate.of(2025, 7, 3),
                                        canton));
                });

                cantonRepository.findByNombre("Rioverde").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Rioverde",
                                        "Conmemoración cívica con eventos culturales, deportivos y gastronómicos.",
                                        LocalDate.of(2025, 8, 5),
                                        canton));
                });

                cantonRepository.findByNombre("San Lorenzo").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de San Lorenzo",
                                        "Fiesta afroecuatoriana con música de marimba, danzas y tradición oral.",
                                        LocalDate.of(2025, 8, 15),
                                        canton));
                });

                // 🎉 Festividades en la provincia de Galápagos
                cantonRepository.findByNombre("San Cristóbal").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiesta de San Cristóbal",
                                        "Fiesta patronal del cantón con procesiones, ferias, deportes acuáticos y celebraciones religiosas.",
                                        LocalDate.of(2025, 7, 24),
                                        canton));
                });

                cantonRepository.findByNombre("Santa Cruz").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Aniversario de Fundación de Puerto Ayora",
                                        "Celebración cívica con eventos culturales, artísticos y deportivos en la ciudad más poblada de Galápagos.",
                                        LocalDate.of(2025, 2, 12),
                                        canton));
                });

                cantonRepository.findByNombre("Isabela").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Puerto Villamil",
                                        "Aniversario de la fundación del poblado de Puerto Villamil, con actividades comunitarias.",
                                        LocalDate.of(2025, 11, 30),
                                        canton));
                });

                // 🎉 Festividades en la provincia de Guayas
                cantonRepository.findByNombre("Guayaquil").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Independencia de Guayaquil",
                                        "Celebración del 9 de octubre de 1820, con desfiles, eventos culturales, fuegos artificiales y conciertos.",
                                        LocalDate.of(2025, 10, 9),
                                        canton));
                        festividadRepository.save(new Festividad(
                                        "Fundación de Guayaquil",
                                        "Conmemoración de la fundación de Santiago de Guayaquil, el 25 de julio.",
                                        LocalDate.of(2025, 7, 25),
                                        canton));
                });

                cantonRepository.findByNombre("Alfredo Baquerizo Moreno (Jujan)").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Jujan",
                                        "Celebración cívica del cantón con eventos deportivos, culturales y desfile de comparsas.",
                                        LocalDate.of(2025, 6, 13),
                                        canton));
                });

                cantonRepository.findByNombre("Balao").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Balao",
                                        "Conmemoración con festivales gastronómicos y actividades agrícolas.",
                                        LocalDate.of(2025, 10, 2),
                                        canton));
                });

                cantonRepository.findByNombre("Balzar").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Balzar",
                                        "Festividades tradicionales con rodeos montubios y juegos populares.",
                                        LocalDate.of(2025, 9, 26),
                                        canton));
                });

                cantonRepository.findByNombre("Colimes").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas Patronales de Santa Rosa",
                                        "Celebración religiosa y cultural en honor a Santa Rosa de Lima.",
                                        LocalDate.of(2025, 8, 30),
                                        canton));
                });

                cantonRepository.findByNombre("Daule").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas Patronales de San José",
                                        "Fiesta popular del cantón Daule con desfile náutico y procesiones.",
                                        LocalDate.of(2025, 3, 19),
                                        canton));
                });

                cantonRepository.findByNombre("Durán").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Durán",
                                        "Eventos artísticos y culturales celebrando la fundación del cantón.",
                                        LocalDate.of(2025, 10, 16),
                                        canton));
                });

                cantonRepository.findByNombre("El Empalme").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de El Empalme",
                                        "Celebración cívica y cultural con participación de instituciones educativas.",
                                        LocalDate.of(2025, 7, 27),
                                        canton));
                });

                cantonRepository.findByNombre("El Triunfo").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de El Triunfo",
                                        "Fiesta montubia con ferias y rodeos en honor a la cantonización.",
                                        LocalDate.of(2025, 7, 20),
                                        canton));
                });

                cantonRepository.findByNombre("General Antonio Elizalde (Bucay)").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Bucay",
                                        "Eventos culturales y deportivos en este cantón turístico de la Sierra-Costa.",
                                        LocalDate.of(2025, 9, 2),
                                        canton));
                });

                cantonRepository.findByNombre("Isidro Ayora").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas Patronales de San Pedro",
                                        "Fiesta religiosa con procesiones y ferias en honor a San Pedro.",
                                        LocalDate.of(2025, 6, 29),
                                        canton));
                });

                cantonRepository.findByNombre("Lomas de Sargentillo").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas Patronales de la Virgen de la Merced",
                                        "Celebración católica con participación de la comunidad.",
                                        LocalDate.of(2025, 9, 24),
                                        canton));
                });

                cantonRepository.findByNombre("Marcelino Maridueña").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación",
                                        "Conmemoración de la cantonización con desfiles, concursos y música local.",
                                        LocalDate.of(2025, 11, 7),
                                        canton));
                });

                cantonRepository.findByNombre("Milagro").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Milagro",
                                        "Conmemoración de la fundación de este importante centro comercial del Guayas.",
                                        LocalDate.of(2025, 9, 17),
                                        canton));
                });

                cantonRepository.findByNombre("Naranjal").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Naranjal",
                                        "Fiesta tradicional con desfiles cívicos, bandas y presentaciones folclóricas.",
                                        LocalDate.of(2025, 10, 7),
                                        canton));
                });

                cantonRepository.findByNombre("Naranjito").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Naranjito",
                                        "Celebración con eventos deportivos, desfiles y danzas montubias.",
                                        LocalDate.of(2025, 6, 1),
                                        canton));
                });

                cantonRepository.findByNombre("Nobol").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Festividad de Narcisa de Jesús",
                                        "Celebración religiosa en honor a Santa Narcisa de Jesús, nacida en este cantón.",
                                        LocalDate.of(2025, 8, 30),
                                        canton));
                });

                cantonRepository.findByNombre("Palestina").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas Patronales de la Virgen de El Cisne",
                                        "Fiestas religiosas tradicionales celebradas en septiembre.",
                                        LocalDate.of(2025, 9, 8),
                                        canton));
                });

                cantonRepository.findByNombre("Pedro Carbo").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Pedro Carbo",
                                        "Fiestas cívicas y ferias comerciales en este cantón agrícola.",
                                        LocalDate.of(2025, 6, 24),
                                        canton));
                });

                cantonRepository.findByNombre("Playas").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Carnaval de Playas",
                                        "Fiesta playera con miles de visitantes, concursos de castillos de arena, música y baile.",
                                        LocalDate.of(2025, 3, 1),
                                        canton));
                });

                cantonRepository.findByNombre("Salitre").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de San Jacinto",
                                        "Fiesta patronal con procesiones acuáticas, eventos religiosos y rodeos.",
                                        LocalDate.of(2025, 8, 17),
                                        canton));
                });

                cantonRepository.findByNombre("Samborondón").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Samborondón",
                                        "Celebración tradicional con actividades culturales y religiosas.",
                                        LocalDate.of(2025, 5, 24),
                                        canton));
                });

                cantonRepository.findByNombre("Santa Lucía").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas Patronales de Santa Lucía",
                                        "Celebración religiosa y cultural con desfile de la comunidad y fuegos artificiales.",
                                        LocalDate.of(2025, 12, 13),
                                        canton));
                });

                cantonRepository.findByNombre("Simón Bolívar").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Simón Bolívar",
                                        "Eventos cívicos, artísticos y deportivos para conmemorar la creación del cantón.",
                                        LocalDate.of(2025, 10, 12),
                                        canton));
                });

                cantonRepository.findByNombre("Yaguachi").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de la Virgen del Carmen",
                                        "Fiesta religiosa más representativa del cantón Yaguachi.",
                                        LocalDate.of(2025, 7, 16),
                                        canton));
                });

                // 🎉 Festividades en la provincia de Imbabura
                cantonRepository.findByNombre("Ibarra").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiesta de los Lagos",
                                        "Celebración cultural y turística con actividades náuticas, ferias y música tradicional.",
                                        LocalDate.of(2025, 9, 28),
                                        canton));
                        festividadRepository.save(new Festividad(
                                        "Fundación de Ibarra",
                                        "Conmemoración de la fundación de Ibarra el 28 de septiembre de 1606.",
                                        LocalDate.of(2025, 9, 28),
                                        canton));
                });

                cantonRepository.findByNombre("Antonio Ante").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Carnaval de Atuntaqui",
                                        "Fiesta popular con comparsas, bailes y desfiles tradicionales.",
                                        LocalDate.of(2025, 3, 1),
                                        canton));
                });

                cantonRepository.findByNombre("Cotacachi").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Inti Raymi",
                                        "Fiesta del sol y agradecimiento a la Pachamama, celebrada con danzas y rituales indígenas.",
                                        LocalDate.of(2025, 6, 21),
                                        canton));
                });

                cantonRepository.findByNombre("Otavalo").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Yamor",
                                        "Fiesta tradicional en honor a la Virgen de Monserrate con música, danza y bebidas típicas.",
                                        LocalDate.of(2025, 9, 8),
                                        canton));
                });

                cantonRepository.findByNombre("Pimampiro").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Pimampiro",
                                        "Conmemoración cívica con eventos culturales y deportivos.",
                                        LocalDate.of(2025, 8, 26),
                                        canton));
                });

                cantonRepository.findByNombre("Urcuquí").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de la Chonta",
                                        "Fiesta ancestral con rituales y música autóctona, propia de la comunidad afroecuatoriana.",
                                        LocalDate.of(2025, 4, 14),
                                        canton));
                });

                // 🎉 Festividades en la provincia de Loja
                cantonRepository.findByNombre("Loja").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de la Virgen de El Cisne",
                                        "Una de las peregrinaciones religiosas más importantes del país, que culmina en la ciudad de Loja.",
                                        LocalDate.of(2025, 8, 15),
                                        canton));
                        festividadRepository.save(new Festividad(
                                        "Independencia de Loja",
                                        "Conmemoración de la gesta del 18 de noviembre de 1820, con actos cívicos y desfiles.",
                                        LocalDate.of(2025, 11, 18),
                                        canton));
                });

                cantonRepository.findByNombre("Calvas").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas Patronales de Cariamanga",
                                        "Fiestas religiosas y culturales en honor a la Virgen del Rosario.",
                                        LocalDate.of(2025, 10, 7),
                                        canton));
                });

                cantonRepository.findByNombre("Catamayo").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas Patronales de la Virgen del Carmen",
                                        "Celebración religiosa con procesiones, ferias y danzas tradicionales.",
                                        LocalDate.of(2025, 7, 16),
                                        canton));
                });

                cantonRepository.findByNombre("Celica").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Celica",
                                        "Celebración cívica con eventos deportivos y culturales.",
                                        LocalDate.of(2025, 10, 12),
                                        canton));
                });

                cantonRepository.findByNombre("Chaguarpamba").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Chaguarpamba",
                                        "Eventos con música típica, concursos y actividades tradicionales.",
                                        LocalDate.of(2025, 6, 28),
                                        canton));
                });

                cantonRepository.findByNombre("Espíndola").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas Patronales de la Virgen de la Nube",
                                        "Celebración mariana con participación de parroquias rurales y música religiosa.",
                                        LocalDate.of(2025, 6, 5),
                                        canton));
                });

                cantonRepository.findByNombre("Gonzanamá").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas Patronales de San Vicente Ferrer",
                                        "Festividades religiosas, procesiones y actos culturales.",
                                        LocalDate.of(2025, 4, 5),
                                        canton));
                });

                cantonRepository.findByNombre("Macará").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Cantonización de Macará",
                                        "Eventos culturales y deportivos que celebran la creación del cantón.",
                                        LocalDate.of(2025, 6, 22),
                                        canton));
                });

                cantonRepository.findByNombre("Olmedo").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Olmedo",
                                        "Actos cívicos, desfiles escolares y eventos deportivos.",
                                        LocalDate.of(2025, 6, 29),
                                        canton));
                });

                cantonRepository.findByNombre("Paltas").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de la Virgen del Carmen en Catacocha",
                                        "Una de las fiestas más representativas del cantón, con gran devoción popular.",
                                        LocalDate.of(2025, 7, 16),
                                        canton));
                });

                cantonRepository.findByNombre("Pindal").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas Patronales de San Vicente",
                                        "Celebración con procesiones religiosas y presentaciones artísticas.",
                                        LocalDate.of(2025, 4, 5),
                                        canton));
                });

                cantonRepository.findByNombre("Puyango").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de la Virgen del Carmen en Alamor",
                                        "Festividad religiosa con actividades culturales y devocionales.",
                                        LocalDate.of(2025, 7, 16),
                                        canton));
                });

                cantonRepository.findByNombre("Quilanga").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas Patronales de San Francisco",
                                        "Fiesta tradicional con juegos populares y misa campal.",
                                        LocalDate.of(2025, 10, 4),
                                        canton));
                });

                cantonRepository.findByNombre("Saraguro").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Kapak Raymi",
                                        "Fiesta ancestral del pueblo Saraguro que celebra el solsticio de diciembre.",
                                        LocalDate.of(2025, 12, 21),
                                        canton));
                });

                cantonRepository.findByNombre("Sozoranga").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Sozoranga",
                                        "Eventos cívicos, deportivos y culturales en el cantón.",
                                        LocalDate.of(2025, 10, 20),
                                        canton));
                });

                cantonRepository.findByNombre("Zapotillo").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de la Virgen del Tránsito",
                                        "Festividad religiosa con procesiones en la frontera sur del país.",
                                        LocalDate.of(2025, 8, 15),
                                        canton));
                });

                // 🎉 Festividades en la provincia de Los Ríos
                cantonRepository.findByNombre("Babahoyo").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Babahoyo",
                                        "Celebración cívica con desfiles, ferias y actividades culturales en la capital de la provincia.",
                                        LocalDate.of(2025, 10, 3),
                                        canton));
                });

                cantonRepository.findByNombre("Baba").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas Patronales de Baba",
                                        "Eventos religiosos y culturales en honor a su patrona.",
                                        LocalDate.of(2025, 8, 15),
                                        canton));
                });

                cantonRepository.findByNombre("Montalvo").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Montalvo",
                                        "Actividades culturales y recreativas para celebrar la cantonización.",
                                        LocalDate.of(2025, 5, 25),
                                        canton));
                });

                cantonRepository.findByNombre("Palenque").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas Patronales de Palenque",
                                        "Celebraciones religiosas y desfiles en honor a la Virgen del Carmen.",
                                        LocalDate.of(2025, 7, 16),
                                        canton));
                });

                cantonRepository.findByNombre("Puebloviejo").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Puebloviejo",
                                        "Eventos con música tradicional, ferias y actividades comunitarias.",
                                        LocalDate.of(2025, 9, 10),
                                        canton));
                });

                cantonRepository.findByNombre("Quevedo").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Quevedo",
                                        "Celebración cívica con conciertos, desfiles y actividades deportivas.",
                                        LocalDate.of(2025, 9, 3),
                                        canton));
                });

                cantonRepository.findByNombre("Ventanas").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas Patronales de Ventanas",
                                        "Actividades culturales y religiosas en honor a la Virgen de la Merced.",
                                        LocalDate.of(2025, 9, 24),
                                        canton));
                });

                cantonRepository.findByNombre("Vinces").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Vinces",
                                        "Eventos tradicionales con música y bailes folclóricos.",
                                        LocalDate.of(2025, 11, 15),
                                        canton));
                });

                // 🎉 Festividades en la provincia de Manabí
                cantonRepository.findByNombre("Portoviejo").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Portoviejo",
                                        "Celebración cívica con desfiles, ferias y eventos culturales en la capital provincial.",
                                        LocalDate.of(2025, 3, 12),
                                        canton));
                });

                cantonRepository.findByNombre("Manta").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Manta",
                                        "Eventos culturales, deportivos y ferias en honor a la cantonización.",
                                        LocalDate.of(2025, 9, 14),
                                        canton));
                });

                cantonRepository.findByNombre("Chone").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Chone",
                                        "Celebraciones con eventos tradicionales y actividades folclóricas.",
                                        LocalDate.of(2025, 10, 6),
                                        canton));
                });

                cantonRepository.findByNombre("Jipijapa").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas Patronales de Jipijapa",
                                        "Celebración religiosa y cultural con misas, procesiones y conciertos.",
                                        LocalDate.of(2025, 11, 8),
                                        canton));
                });

                cantonRepository.findByNombre("Montecristi").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Montecristi",
                                        "Eventos culturales en honor a la creación del cantón y al sombrero de paja toquilla.",
                                        LocalDate.of(2025, 9, 24),
                                        canton));
                });

                cantonRepository.findByNombre("El Carmen").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas Patronales de El Carmen",
                                        "Celebración religiosa con eventos culturales y deportivos.",
                                        LocalDate.of(2025, 11, 11),
                                        canton));
                });

                cantonRepository.findByNombre("Santa Ana").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas Patronales de Santa Ana",
                                        "Eventos religiosos y culturales en honor a su patrona.",
                                        LocalDate.of(2025, 7, 26),
                                        canton));
                });

                cantonRepository.findByNombre("Puerto López").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Puerto López",
                                        "Celebración con actividades turísticas, culturales y deportivas.",
                                        LocalDate.of(2025, 8, 16),
                                        canton));
                });

                cantonRepository.findByNombre("Jama").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas Patronales de Jama",
                                        "Eventos culturales y religiosos en honor a la Virgen del Carmen.",
                                        LocalDate.of(2025, 7, 16),
                                        canton));
                });

                cantonRepository.findByNombre("Paján").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Paján",
                                        "Celebraciones con ferias agrícolas y actividades folclóricas.",
                                        LocalDate.of(2025, 11, 15),
                                        canton));
                });

                cantonRepository.findByNombre("Jaramijó").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas Patronales de Jaramijó",
                                        "Eventos religiosos con procesiones y festivales culturales.",
                                        LocalDate.of(2025, 6, 15),
                                        canton));
                });

                cantonRepository.findByNombre("Bojayá").ifPresent(canton -> {
                        // Bojayá no pertenece a Manabí, ignóralo o corrige
                });

                cantonRepository.findByNombre("24 de Mayo").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de 24 de Mayo",
                                        "Eventos cívicos y culturales para celebrar el cantón.",
                                        LocalDate.of(2025, 9, 3),
                                        canton));
                });

                // 🎉 Festividades en la provincia de Morona Santiago
                cantonRepository.findByNombre("Macas").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Macas",
                                        "Celebración de la cantonización con eventos culturales y deportivos.",
                                        LocalDate.of(2025, 8, 22),
                                        canton));
                });

                cantonRepository.findByNombre("Gualaquiza").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas Patronales de Gualaquiza",
                                        "Eventos religiosos y culturales en honor a la Virgen de la Asunción.",
                                        LocalDate.of(2025, 8, 15),
                                        canton));
                });

                cantonRepository.findByNombre("Limón Indanza").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Limón Indanza",
                                        "Celebración con actos culturales y deportivos en la comunidad.",
                                        LocalDate.of(2025, 9, 14),
                                        canton));
                });

                cantonRepository.findByNombre("Logroño").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas Patronales de Logroño",
                                        "Festividades tradicionales con música y bailes autóctonos.",
                                        LocalDate.of(2025, 7, 20),
                                        canton));
                });

                cantonRepository.findByNombre("Morona").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Morona",
                                        "Eventos culturales y religiosos en esta zona amazónica.",
                                        LocalDate.of(2025, 9, 7),
                                        canton));
                });

                cantonRepository.findByNombre("Pablo Sexto").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas Patronales de Pablo Sexto",
                                        "Celebración religiosa con procesiones y actos culturales.",
                                        LocalDate.of(2025, 6, 29),
                                        canton));
                });

                cantonRepository.findByNombre("Palora").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Palora",
                                        "Festividades con participación de comunidades indígenas y mestizas.",
                                        LocalDate.of(2025, 8, 10),
                                        canton));
                });

                cantonRepository.findByNombre("San Juan Bosco").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas Patronales de San Juan Bosco",
                                        "Celebración religiosa y cultural en honor al santo patrono.",
                                        LocalDate.of(2025, 1, 31),
                                        canton));
                });

                cantonRepository.findByNombre("Santiago").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas Patronales de Santiago",
                                        "Eventos tradicionales con misas y actividades artísticas.",
                                        LocalDate.of(2025, 7, 25),
                                        canton));
                });

                cantonRepository.findByNombre("Sucúa").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Sucúa",
                                        "Celebración cívica con desfiles, música y eventos deportivos.",
                                        LocalDate.of(2025, 11, 12),
                                        canton));
                });

                // 🎉 Festividades en la provincia de Napo
                cantonRepository.findByNombre("Tena").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Tena",
                                        "Celebración con actividades culturales, deportivas y religiosas.",
                                        LocalDate.of(2025, 8, 15),
                                        canton));
                });

                cantonRepository.findByNombre("Archidona").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas Patronales de Archidona",
                                        "Eventos en honor a la Virgen del Carmen, con procesiones y ferias.",
                                        LocalDate.of(2025, 7, 16),
                                        canton));
                });

                cantonRepository.findByNombre("El Chaco").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de El Chaco",
                                        "Celebración local con actos culturales y deportivos.",
                                        LocalDate.of(2025, 10, 12),
                                        canton));
                });

                cantonRepository.findByNombre("Carlos Julio Arosemena Tola").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Cantonización",
                                        "Celebración con actividades comunitarias y culturales.",
                                        LocalDate.of(2025, 9, 20),
                                        canton));
                });

                // 🎉 Festividades en la provincia de Orellana
                cantonRepository.findByNombre("Loreto").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Loreto",
                                        "Celebración con eventos culturales y actividades comunitarias.",
                                        LocalDate.of(2025, 9, 15),
                                        canton));
                });

                cantonRepository.findByNombre("Aguarico").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas Patronales de Aguarico",
                                        "Celebraciones en honor a la Virgen de la Asunción con ferias y música tradicional.",
                                        LocalDate.of(2025, 8, 15),
                                        canton));
                });

                cantonRepository.findByNombre("Joya de los Sachas").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Cantonización de Joya de los Sachas",
                                        "Eventos culturales y deportivos para celebrar la creación del cantón.",
                                        LocalDate.of(2025, 7, 10),
                                        canton));
                });

                cantonRepository.findByNombre("Orellana").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Orellana",
                                        "Celebraciones cívicas y culturales en la capital provincial.",
                                        LocalDate.of(2025, 8, 22),
                                        canton));
                });

                // 🎉 Festividades en la provincia de Pastaza
                cantonRepository.findByNombre("Pastaza").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Pastaza",
                                        "Celebración cívica con eventos culturales y actividades comunitarias.",
                                        LocalDate.of(2025, 8, 15),
                                        canton));
                });

                cantonRepository.findByNombre("Mera").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas Patronales de Mera",
                                        "Celebraciones religiosas con procesiones y actividades culturales.",
                                        LocalDate.of(2025, 9, 8),
                                        canton));
                });

                cantonRepository.findByNombre("Santa Clara").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas Patronales de Santa Clara",
                                        "Eventos religiosos y festivos en honor a su patrona.",
                                        LocalDate.of(2025, 8, 15),
                                        canton));
                });

                cantonRepository.findByNombre("Arajuno").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Arajuno",
                                        "Celebración local con eventos culturales y deportivos.",
                                        LocalDate.of(2025, 7, 20),
                                        canton));
                });

                // 🎉 Festividades en la provincia de Pichincha
                cantonRepository.findByNombre("Quito").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fundación de Quito",
                                        "Conmemoración de la fundación española de Quito el 6 de diciembre de 1534, con fiestas, eventos y desfiles.",
                                        LocalDate.of(2025, 12, 6),
                                        canton));
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Quito",
                                        "Celebración anual con actividades culturales, deportivas y religiosas en la capital del país.",
                                        LocalDate.of(2025, 12, 6),
                                        canton));
                });

                cantonRepository.findByNombre("Cayambe").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de la Virgen de el Cisne",
                                        "Celebración religiosa con procesiones y actividades culturales.",
                                        LocalDate.of(2025, 8, 15),
                                        canton));
                });

                cantonRepository.findByNombre("Mejía").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Mejía",
                                        "Eventos culturales y deportivos en la parroquia de Mejía.",
                                        LocalDate.of(2025, 10, 10),
                                        canton));
                });

                cantonRepository.findByNombre("Pedro Moncayo").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas Patronales de Pedro Moncayo",
                                        "Celebraciones religiosas y culturales con actos comunitarios.",
                                        LocalDate.of(2025, 11, 20),
                                        canton));
                });

                // 🎉 Festividades en la provincia de Santa Elena
                cantonRepository.findByNombre("Santa Elena").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Santa Elena",
                                        "Celebración con desfiles, conciertos y actividades culturales en la capital provincial.",
                                        LocalDate.of(2025, 10, 7),
                                        canton));
                });

                cantonRepository.findByNombre("La Libertad").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas Patronales de La Libertad",
                                        "Celebraciones religiosas y culturales con procesiones y eventos comunitarios.",
                                        LocalDate.of(2025, 8, 15),
                                        canton));
                });

                cantonRepository.findByNombre("Salinas").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Salinas",
                                        "Eventos turísticos y culturales en esta conocida ciudad costera.",
                                        LocalDate.of(2025, 7, 14),
                                        canton));
                });

                // 🎉 Festividades en la provincia de Santo Domingo de los Tsáchilas
                cantonRepository.findByNombre("Santo Domingo").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Santo Domingo",
                                        "Celebraciones cívicas y culturales en honor a la cantonización con desfiles y eventos deportivos.",
                                        LocalDate.of(2025, 10, 1),
                                        canton));
                });

                cantonRepository.findByNombre("La Concordia").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas Patronales de La Concordia",
                                        "Eventos religiosos y culturales con actividades comunitarias y ferias.",
                                        LocalDate.of(2025, 11, 15),
                                        canton));
                });

                // 🎉 Festividades en la provincia de Sucumbíos
                cantonRepository.findByNombre("Nueva Loja").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Nueva Loja",
                                        "Celebraciones cívicas con actividades culturales, deportivas y sociales en la capital provincial.",
                                        LocalDate.of(2025, 10, 8),
                                        canton));
                });

                cantonRepository.findByNombre("González Suárez").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas Patronales de González Suárez",
                                        "Eventos religiosos y culturales en honor a la Virgen del Carmen.",
                                        LocalDate.of(2025, 7, 16),
                                        canton));
                });

                cantonRepository.findByNombre("Putumayo").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Putumayo",
                                        "Celebraciones locales con ferias y actividades culturales.",
                                        LocalDate.of(2025, 9, 22),
                                        canton));
                });

                cantonRepository.findByNombre("Shushufindi").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Shushufindi",
                                        "Actividades culturales y recreativas en la zona amazónica.",
                                        LocalDate.of(2025, 8, 30),
                                        canton));
                });

                cantonRepository.findByNombre("Sucumbíos").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas Patronales de Sucumbíos",
                                        "Celebración religiosa con eventos culturales y deportivos.",
                                        LocalDate.of(2025, 11, 20),
                                        canton));
                });

                // 🎉 Festividades en la provincia de Tungurahua
                cantonRepository.findByNombre("Ambato").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Ambato",
                                        "Celebraciones cívicas y culturales, destacando el Carnaval de las Flores y las Frutas.",
                                        LocalDate.of(2025, 2, 28),
                                        canton));
                        festividadRepository.save(new Festividad(
                                        "Carnaval de Ambato",
                                        "Fiesta tradicional con desfiles, música y eventos culturales en honor a la ciudad.",
                                        LocalDate.of(2025, 2, 28),
                                        canton));
                });

                cantonRepository.findByNombre("Baños de Agua Santa").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas Patronales de Baños",
                                        "Celebración religiosa y cultural en honor a la Virgen del Rosario.",
                                        LocalDate.of(2025, 8, 30),
                                        canton));
                });

                cantonRepository.findByNombre("Pelileo").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Pelileo",
                                        "Eventos culturales y deportivos con ferias y concursos.",
                                        LocalDate.of(2025, 11, 12),
                                        canton));
                });

                cantonRepository.findByNombre("Píllaro").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas Patronales de Píllaro",
                                        "Celebración tradicional con eventos religiosos y culturales.",
                                        LocalDate.of(2025, 9, 22),
                                        canton));
                });

                cantonRepository.findByNombre("Tisaleo").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Tisaleo",
                                        "Celebraciones con actos culturales y recreativos.",
                                        LocalDate.of(2025, 10, 10),
                                        canton));
                });

                // 🎉 Festividades en la provincia de Zamora Chinchipe
                cantonRepository.findByNombre("Zamora").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Zamora",
                                        "Celebración cívica con eventos culturales, deportivos y actividades comunitarias.",
                                        LocalDate.of(2025, 10, 12),
                                        canton));
                });

                cantonRepository.findByNombre("Yantzaza").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas Patronales de Yantzaza",
                                        "Celebraciones religiosas y culturales con ferias y actividades tradicionales.",
                                        LocalDate.of(2025, 7, 25),
                                        canton));
                });

                cantonRepository.findByNombre("Centinela del Cóndor").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Centinela del Cóndor",
                                        "Eventos culturales y recreativos en honor a la creación del cantón.",
                                        LocalDate.of(2025, 9, 15),
                                        canton));
                });

                cantonRepository.findByNombre("Chinchipe").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas Patronales de Chinchipe",
                                        "Celebración religiosa con eventos culturales y deportivos.",
                                        LocalDate.of(2025, 8, 30),
                                        canton));
                });

                cantonRepository.findByNombre("Nangaritza").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas Patronales de Nangaritza",
                                        "Actividades religiosas y culturales en la comunidad.",
                                        LocalDate.of(2025, 9, 5),
                                        canton));
                });

                cantonRepository.findByNombre("Palanda").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas de Fundación de Palanda",
                                        "Celebración con eventos culturales y ferias tradicionales.",
                                        LocalDate.of(2025, 11, 10),
                                        canton));
                });

                cantonRepository.findByNombre("Paquisha").ifPresent(canton -> {
                        festividadRepository.save(new Festividad(
                                        "Fiestas Patronales de Paquisha",
                                        "Eventos religiosos y actividades comunitarias.",
                                        LocalDate.of(2025, 8, 12),
                                        canton));
                });

                System.out.println("✔ Festividades por cantón insertadas correctamente.");
        }
}