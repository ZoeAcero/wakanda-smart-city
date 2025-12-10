package com.wakanda.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer // CLAVE: Activa el Servidor de Descubrimiento
public class WakandaEurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(WakandaEurekaServerApplication.class, args);
    }
}