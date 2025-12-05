package com.wakanda.trafico.controlador;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trafico")
public class TraficoController {

    // Bandera para simular un fallo en el servicio
    private boolean servicioActivo = true;

    @GetMapping("/semaforos")
    // CLAVE: Aplica el Circuit Breaker. Si falla, llama a fallbackSemaforos
    @CircuitBreaker(name = "semaforosCB", fallbackMethod = "fallbackSemaforos")
    public String gestionarSemaforos() {
        if (!servicioActivo) {
            // Simulación de fallo para probar el Circuit Breaker
            throw new RuntimeException("Fallo crítico: El sensor de tráfico ha dejado de funcionar.");
        }
        return "Semáforos ajustados en tiempo real (OK). Flujo optimizado.";
    }

    @GetMapping("/sensores")
    public String monitorearSensores() {
        return "Sensores reportando datos de congestión en el 15%.";
    }

    // Método de Fallback (Resiliencia)
    // Se ejecuta automáticamente si gestionarSemaforos lanza una excepción o agota el tiempo
    public String fallbackSemaforos(Throwable t) {
        // En un escenario real, esto enviaría un modo de operación seguro (ej: semáforos fijos)
        return "Sistema de semáforos caído. Usando modo de operación manual (FALLBACK). Causa: " + t.getMessage();
    }

    // Endpoint para activar/desactivar la simulación de fallo (útil para pruebas)
    @GetMapping("/toggle-fallo")
    public String toggleFallo() {
        servicioActivo = !servicioActivo;
        return "Simulación de fallo para /semaforos cambiada a: " + (servicioActivo ? "ACTIVO (OK)" : "INACTIVO (FALLARÁ)");
    }
}