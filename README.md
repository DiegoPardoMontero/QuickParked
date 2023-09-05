# QuickParked⚡🚗🏍🚌
![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.13-brightgreen)
![Maven](https://img.shields.io/badge/Maven-3.8.1-blue)
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-3.0-green)
![H2](https://img.shields.io/badge/H2-1.4.200-blue)

Este proyecto es un sistema de información para gestionar un parqueadero que tiene varios pisos, cada uno destinado a un tipo específico de vehículo: automóviles, buses y motos. El sistema permite al administrador revisar y reorganizar los pisos según la ocupación y demanda.

## Características 🌟

- **Gestión de Pisos**: Cada piso puede ser designado para un tipo específico de vehículo. Los pisos pueden ser reorganizados según la demanda.
  
- **Gestión de Vehículos**: Registra y gestiona vehículos en el parqueadero.
  
- **Informes de Ocupación**: El administrador puede revisar el porcentaje de ocupación de cada piso y tomar decisiones basadas en estos informes.

- **Base de Datos H2**: Utiliza una base de datos en memoria H2 para almacenar y gestionar la información.

## Tecnologías Utilizadas 🛠

- **Spring Boot**: Framework principal para el desarrollo del backend.
  
- **Spring Web**: Para exponer endpoints y construir la API.
  
- **Spring Data JPA**: Para la persistencia y gestión de la base de datos.
  
- **Thymeleaf**: Motor de plantillas para la construcción de vistas.
  
- **H2 Database**: Base de datos en memoria para almacenamiento y pruebas.

## Estructura del Proyecto 📂

- **Model**: Contiene las entidades principales: `Vehiculo`, `Piso` y `Parqueadero`.
  
- **Service**: Lógica de negocio y operaciones principales del sistema.
  
- **Repository**: Interfaces para interactuar con la base de datos.
  
- **Controller**: Controladores para gestionar las solicitudes HTTP y la interacción con las vistas.
  
- **Init**: Scripts y lógica para inicializar la base de datos con datos predeterminados.

## Cómo Empezar 🚀

1. **Clonar el Repositorio**:
´´´
git clone [URL-del-repositorio]
´´´

2. **Navegar al Directorio del Proyecto**:

´´´
cd [nombre-del-proyecto]
´´´

3. **Ejecutar la Aplicación con Spring Boot**:
´´´
./mvnw spring-boot:run

4. **Acceder a la Aplicación**:
Abre tu navegador y visita `http://localhost:8080`.

5. **Consola H2**:
Para acceder a la consola de la base de datos H2, visita `http://localhost:8080/h2`.

## Contribuciones 🤝

Las contribuciones son bienvenidas. Por favor, abre un issue para discutir lo que te gustaría cambiar o añadir.

## Licencia 📄

Este proyecto está bajo la licencia MIT. Consulta el archivo [LICENSE](LICENSE) para obtener más detalles.

## Desarrolladores 💻

- Sara Valentina Sierra Escobar
- Diego Alejandro Pardo Montero





