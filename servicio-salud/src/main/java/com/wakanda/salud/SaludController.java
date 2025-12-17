package com.wakanda.salud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/salud")
public class SaludController {

    @GetMapping("/estado")
    public String obtenerEstado() {
        return "El servicio de salud y bienestar está operativo.";
    }
}