package com.wakanda.emergencia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient // CLAVE: Registra este servicio en el Servidor Eureka
public class ServicioEmergenciaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServicioEmergenciaApplication.class, args);
    }
}