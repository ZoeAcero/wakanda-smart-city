package com.wakanda.emergencia.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emergencia")
public class EmergenciaController {

    @GetMapping("/alerta-geolocalizada")
    public String enviarAlerta() {
        return "Alerta de emergencia geolocalizada enviada.";
    }

    @GetMapping("/respuesta-rapida")
    public String activarRespuesta() {
        return "Servicios de emergencia activados y ruta calculada.";
    }
}