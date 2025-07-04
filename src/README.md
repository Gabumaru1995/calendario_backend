# 🗕️ Calendario de Festividades — Backend

## Descripción
Este proyecto es un backend desarrollado en **Java 21** usando **Spring Boot 3.4.4**, conectado a una base de datos **PostgreSQL** y ejecutado en **Docker**.

Permite gestionar festividades por provincia y crear recordatorios para fechas específicas.

---

## 📂 Estructura del Proyecto

- `src/main/java/com/festividades/calendario`
  - `controller/` — Controladores de API REST
  - `model/` — Entidades JPA
  - `repository/` — Repositorios de acceso a datos
- `application.properties` — Configuración de la base de datos
- `Dockerfile` — Archivo para contenerizar la aplicación
- `docker-compose.yml` — Orquestador de contenedores (backend + postgres)

---

## 🛠️ Tecnologías utilizadas

- Java 21
- Spring Boot 3.4.4
- PostgreSQL 15
- Hibernate JPA
- Docker
- Docker Compose

---

## 🚀 Instrucciones para levantar el backend

### 1. Clonar o copiar el proyecto
Coloca el proyecto en tu entorno local o servidor.

### 2. Construir la imagen Docker

```bash
docker compose build
```

### 3. Levantar los contenedores

```bash
docker compose up -d
```

Esto iniciará:
- Base de datos `Postgres`
- API Backend `Calendario de Festividades`

---

## 📌 Endpoints principales

| Método | Ruta | Descripción |
|:------:|:----:|:-----------:|
| GET | `/festividades/provincia/{id}` | Listar festividades por provincia |
| GET | `/festividades/buscar?nombre={nombre}` | Buscar festividades por nombre |

Ejemplo de consulta de festividades:
```
http://localhost:8080/api/festividades
http://localhost:8080/api/festividades/provincia/1
http://localhost:8080/api/festividades/buscar?nombre=carnaval
```

---

## 🔒 Accesos al servidor (Práctica)

- **SSH**:
  ```bash
  ssh quintoa@161.97.140.245
  ```
- **Portainer** (Administrador de contenedores):
  - URL: `http://161.97.140.245:9000`
  - Usuario: `byron-moreno`
  - Contraseña: `Preguntar al administrador`

---

## 🐳 Variables de entorno (ejemplo `application.properties`)

```properties
spring.datasource.url=jdbc:postgresql://postgres:5432/festividades
spring.datasource.username=postgres
spring.datasource.password=postgres
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

Estas variables están sincronizadas con el `docker-compose.yml`.

---

# ✨ Autores

- Gabriel Cajas
- Anderson Iza
- Daniela Morocho

Proyecto académico para prácticas de despliegue en Docker y Portainer.
