package com.wakanda.seguridad;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/seguridad")
public class SeguridadController {

    @GetMapping("/estado")
    public String obtenerEstado() {
        return "El servicio de seguridad y vigilancia está operativo.";
    }
}