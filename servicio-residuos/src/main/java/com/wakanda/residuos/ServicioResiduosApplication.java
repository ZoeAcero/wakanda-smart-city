package com.wakanda.residuos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServicioResiduosApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServicioResiduosApplication.class, args);
    }

}