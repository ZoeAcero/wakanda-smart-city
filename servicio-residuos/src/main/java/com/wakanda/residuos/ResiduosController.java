package com.wakanda.residuos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/residuos")
public class ResiduosController {

    @GetMapping("/estado")
    public String obtenerEstado() {
        return "El servicio de gestión de residuos está operativo.";
    }
}