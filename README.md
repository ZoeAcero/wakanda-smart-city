# Sistema de Gestión de Servicios en Wakanda - Smart City

## Integrantes del Grupo
1. Álvaro Martín Romero 
2. Zoe Acero Ruiz
3. Daniel González Pichu

## Resumen de la Solución
Este proyecto implementa una arquitectura de microservicios basada en Spring Boot y Spring Cloud para gestionar los servicios de la ciudad inteligente de Wakanda. El sistema utiliza un servidor de configuración centralizada, un servidor de descubrimiento (Eureka), un API Gateway para el enrutamiento y varios microservicios de negocio con patrones de resiliencia.

## Estructura del Proyecto y Archivos Relevantes

### Infraestructura
*   **wakanda-eureka-server**: Servidor de descubrimiento (Service Discovery).
    *   `WakandaEurekaServerApplication.java`: Habilita el servidor Eureka (`@EnableEurekaServer`).
    *   `application.yml`: Configuración del servidor y desactivación de la autopreservación para desarrollo.
*   **wakanda-config-server**: Servidor de configuración centralizada.
    *   `WakandaConfigServerApplication.java`: Habilita el servidor de configuración (`@EnableConfigServer`).
*   **api-gateway**: Puerta de enlace única para todos los servicios.
    *   `ApiGatewayApplication.java`: Punto de entrada y configuración de rutas.

### Microservicios de Negocio
Cada microservicio se conecta al Config Server y se registra en Eureka. Implementan Circuit Breaker para tolerancia a fallos.

*   **servicio-trafico**: Gestión de semáforos y rutas.
    *   `ServicioTraficoApplication.java`: Clase principal.
    *   `TraficoController.java`: Endpoints para gestión de tráfico.
*   **servicio-emergencia**: Gestión de alertas y respuestas rápidas.
    *   `ServicioEmergenciaApplication.java`: Clase principal.
*   **servicio-residuos**: Gestión de contenedores y reciclaje.
*   **servicio-seguridad**: Vigilancia y alertas de seguridad.
*   **servicio-salud**: Telemedicina y monitoreo.

### Tecnologías Clave
*   **Spring Cloud Netflix Eureka**: Descubrimiento de servicios.
*   **Spring Cloud Config**: Configuración externa centralizada.
*   **Spring Cloud Gateway**: Enrutamiento y filtrado.
*   **Resilience4j**: Implementación de patrones de resiliencia (Circuit Breaker) en sustitución de Hystrix (deprecated).
*   **Spring Cloud Sleuth & Zipkin**: Trazabilidad distribuida.
