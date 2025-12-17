package com.wakanda.salud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServicioSaludApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServicioSaludApplication.class, args);
    }

}