package com.wakanda.seguridad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServicioSeguridadApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServicioSeguridadApplication.class, args);
    }

}